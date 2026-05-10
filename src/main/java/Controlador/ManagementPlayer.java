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
    
    private boolean actualizandoLista = false;
    
    public ManagementPlayer(FrmPrincipal vista,Playlist<Cancion> playlist,Controlador controlador){
        this.vista    = vista;
        this.playlist = playlist;
        this.controlador = controlador;
        volumeManager   = new VolumeManager(vista, controlador);
        progressManager = new ProgressManager(vista, controlador);
        favoritoManager = new FavoritoManager(vista, playlist);

        // ── NUEVO: el Controlador avisa a la UI cuando cambia de canción ──
        controlador.addOnCancionCambiada(this::actualizarUI);
        initBotones();
        initLista();
        progressManager.initSliderGUI();
        progressManager.initSlider();
        progressManager.initTimeline();
        volumeManager.init();
        volumeManager.sincronizarUI();
        cargarLista();
        controlador.sincronizarVistaActual();
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
            DefaultListModel<Cancion> modelo = (DefaultListModel<Cancion>) vista.listPlaylists.getModel();
            actualizandoLista = true;
            for (int i = 0; i < modelo.getSize(); i++) {
                if (modelo.getElementAt(i).equals(cancion)) {
                    vista.listPlaylists.setSelectedIndex(i);
                    vista.listPlaylists.ensureIndexIsVisible(i);
                    break;
                }
            }

            actualizandoLista = false;

            // Botón favorito
            favoritoManager.sincronizarBoton(cancion);
            vista.btnTogPlayPause.setSelected(true);
            vista.btnTogPlayPause.setText("⏸");
        });
    }
    // ────────────────────────────────────────────────────────────────────────

    private void initBotones() {
        vista.btnTogPlayPause.addActionListener(this);
        vista.btnTogMute.addActionListener(this);
        vista.btnNext.addActionListener(this);
        vista.btnPrev.addActionListener(this);
        vista.btnTogSongFav.addActionListener(this);
        vista.btnFav.addActionListener(this);
        vista.btnRefresh.addActionListener(this);
        vista.btnBuscar.addActionListener(this);
        vista.btnMusicas.addActionListener(this);
        vista.txtBuscarCancion.addActionListener(e -> buscarCancion());
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
        if (e.getValueIsAdjusting() || actualizandoLista) {
            return;
        }
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
    
    private void buscarCancion() {
        String texto = vista.txtBuscarCancion.getText().trim();
        if (texto.isEmpty()) {
            return;
        }
        var nodoEncontrado = playlist.buscar(c ->c.getTitulo().toLowerCase().contains(texto.toLowerCase())||
            c.getArtista().toLowerCase().contains(texto.toLowerCase())
        );

        if (nodoEncontrado == null) {
            javax.swing.JOptionPane.showMessageDialog(
                    vista,
                    "Cancion no encontrada"
            );

            return;
        }

        Cancion cancion = nodoEncontrado.getDato();
        controlador.reproducirDirecto(cancion);
        seleccionarCancionLista(cancion);
    }
    private void seleccionarCancionLista(Cancion cancion) {
        DefaultListModel<Cancion> modelo =(DefaultListModel<Cancion>)vista.listPlaylists.getModel();
        for (int i = 0; i < modelo.size(); i++) {
            if (modelo.getElementAt(i).equals(cancion)) {
                vista.listPlaylists.setSelectedIndex(i);
                vista.listPlaylists.ensureIndexIsVisible(i);
                break;
            }
        }
    }
    private void abrirFrmCanciones() {
        Vista.FrmCanciones frm =new Vista.FrmCanciones();
        new ControladorCanciones(frm,playlist,controlador);
        frm.setVisible(true);
        vista.dispose();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnTogPlayPause) {
        if (vista.btnTogPlayPause.isSelected()) {
            controlador.playOrResumeActual();
            vista.btnTogPlayPause.setText("⏸");
        } else {
            controlador.pause();
            vista.btnTogPlayPause.setText("▶");
        }
    }

        if (e.getSource() == vista.btnNext) {
            controlador.siguiente();   // el callback se encarga de la UI
        }

        if (e.getSource() == vista.btnPrev) {
            controlador.anterior();    // el callback se encarga de la UI
        }

        if (e.getSource() == vista.btnTogMute) {
            volumeManager.toggleMute();
        }

        if (e.getSource() == vista.btnTogSongFav) {
            favoritoManager.toggleFavorito(cancionSeleccionada);
        }

        if (e.getSource() == vista.btnFav) {
            favoritoManager.mostrarSoloFavoritas();
        }
        
        if (e.getSource() == vista.btnRefresh) {
            cargarLista();
        }
        if (e.getSource() == vista.btnBuscar) {
            buscarCancion();
        }
        if (e.getSource() == vista.btnMusicas) {
            abrirFrmCanciones();
        }
    }
}