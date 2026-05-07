package Controlador;

import Vista.FrmPrincipal;
import Vista.CancionCellRenderer;
import Modelo.Cancion;
import Modelo.Playlist;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.SwingUtilities;

public class ManagementPlayer implements ActionListener {

    private FrmPrincipal vista;
    private Playlist<Cancion> playlist;

    private Controlador     controlador;
    private VolumeManager   volumeManager;
    private ProgressManager progressManager;
    private FavoritoManager favoritoManager;
    private CancionCellRenderer renderer;
    
    private Cancion cancionSeleccionada;

    public ManagementPlayer(FrmPrincipal vista, Playlist<Cancion> playlist) {
        this.vista    = vista;
        this.playlist = playlist;

        controlador     = new Controlador(playlist);
        volumeManager   = new VolumeManager(vista, controlador);
        progressManager = new ProgressManager(vista, controlador);
        favoritoManager = new FavoritoManager(vista, playlist);

        // ── NUEVO: el Controlador avisa a la UI cuando cambia de canción ──
        controlador.setOnCancionCambiada(this::actualizarUI);

        initBotones();
        initLista();
        progressManager.initSliderGUI();
        progressManager.initSlider();
        progressManager.initTimeline();
        volumeManager.init();

        cargarLista();
    }

    // ── Punto único de sincronización de la UI ──────────────────────────────
    private void actualizarUI(Cancion cancion) {
        if (cancion == null) return;

        cancionSeleccionada = cancion;

        SwingUtilities.invokeLater(() -> {
            // Labels
            vista.lblSongTitle.setText(cancion.getTitulo());
            vista.lblArtist.setText(cancion.getArtista());

            // Resaltar en el JList
            DefaultListModel<Cancion> modelo =
                (DefaultListModel<Cancion>) vista.listPlaylists.getModel();

            for (int i = 0; i < modelo.getSize(); i++) {
                if (modelo.getElementAt(i).equals(cancion)) {
                    vista.listPlaylists.setSelectedIndex(i);
                    vista.listPlaylists.ensureIndexIsVisible(i);
                    break;
                }
            }

            // Botón favorito
            favoritoManager.sincronizarBoton(cancion);

            // Botones play/pause
            actualizarBotonesReproduccion(true);
        });
    }
    // ────────────────────────────────────────────────────────────────────────

    private void initBotones() {
        vista.btnPlay.addActionListener(this);
        vista.btnNext.addActionListener(this);
        vista.btnPrev.addActionListener(this);
        vista.btnMute.addActionListener(this);
        vista.btnPause.addActionListener(this);
        vista.btnTogSongFav.addActionListener(this);
        vista.btnFav.addActionListener(this);
        vista.btnPause.setVisible(false);
    }

    private void actualizarBotonesReproduccion(boolean reproduciendo) {
        vista.btnPlay.setVisible(!reproduciendo);
        vista.btnPause.setVisible(reproduciendo);
    }

    private void initLista() {
        vista.listPlaylists.addListSelectionListener(e -> onSeleccionCancion(e));

        // ── Hover effect ───────────────────────────────────────────────
        vista.listPlaylists.addMouseMotionListener(
            new java.awt.event.MouseMotionAdapter() {
                @Override
                public void mouseMoved(java.awt.event.MouseEvent e) {
                    int idx = vista.listPlaylists.locationToIndex(e.getPoint());
                    if (renderer != null) {
                        renderer.setHoveredIndex(idx);
                        vista.listPlaylists.repaint();
                    }
                }
            }
        );

        vista.listPlaylists.addMouseListener(
            new java.awt.event.MouseAdapter() {
                @Override
                public void mouseExited(java.awt.event.MouseEvent e) {
                    if (renderer != null) {
                        renderer.setHoveredIndex(-1);
                        vista.listPlaylists.repaint();
                    }
                }
            }
        );
    }
    
    private void onSeleccionCancion(javax.swing.event.ListSelectionEvent e) {
        if (e.getValueIsAdjusting()) return;

        Object obj = vista.listPlaylists.getSelectedValue();
        if (!(obj instanceof Cancion)) return;

        // reproducirDirecto ya dispara el callback → actualizarUI se encarga del resto
        controlador.reproducirDirecto((Cancion) obj);
    }

    private void cargarLista() {
        DefaultListModel<Cancion> modelo = new DefaultListModel<>();

        var nodo = playlist.buscar(c -> true);
        if (nodo == null) return;

        var inicio = nodo;
        var aux    = nodo;

        do {
            modelo.addElement(aux.getDato());
            aux = aux.getSig();
        } while (aux != inicio);

        vista.listPlaylists.setModel(modelo);

        // ── Aplicar renderer transparente ──────────────────────────────
        renderer = new CancionCellRenderer();
        vista.listPlaylists.setCellRenderer(renderer);
        vista.listPlaylists.setOpaque(false);
        vista.listPlaylists.setFixedCellHeight(48);

        // ScrollPane también transparente para ver el fondo
        ((javax.swing.JScrollPane) vista.listPlaylists.getParent()
            .getParent()).setOpaque(false);
        ((javax.swing.JScrollPane) vista.listPlaylists.getParent()
            .getParent()).getViewport().setOpaque(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vista.btnPlay) {
            controlador.playOrResumeActual();
            actualizarBotonesReproduccion(true);
        }

        if (e.getSource() == vista.btnPause) {
            controlador.pause();
            actualizarBotonesReproduccion(false);
        }

        if (e.getSource() == vista.btnNext) {
            controlador.siguiente();   // el callback se encarga de la UI
        }

        if (e.getSource() == vista.btnPrev) {
            controlador.anterior();    // el callback se encarga de la UI
        }

        if (e.getSource() == vista.btnMute) {
            volumeManager.toggleMute();
        }

        if (e.getSource() == vista.btnTogSongFav) {
            favoritoManager.toggleFavorito(cancionSeleccionada);
        }

        if (e.getSource() == vista.btnFav) {
            favoritoManager.mostrarSoloFavoritas();
        }
    }
}