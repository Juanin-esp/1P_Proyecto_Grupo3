package Controlador;

import Modelo.Cancion;
import Modelo.Playlist;
import Vista.CancionCellRenderer;
import Vista.FrmPrincipal;

import javax.swing.DefaultListModel;

public class PlaylistUIManager {

    private FrmPrincipal vista;
    private Playlist<Cancion> playlist;
    private Controlador controlador;

    private CancionCellRenderer renderer;

    private boolean actualizandoLista = false;

    public PlaylistUIManager(
            FrmPrincipal vista,
            Playlist<Cancion> playlist,
            Controlador controlador
    ) {
        this.vista = vista;
        this.playlist = playlist;
        this.controlador = controlador;

        initLista();
        cargarLista();
    }

    private void initLista() {

        vista.listPlaylists.addListSelectionListener(e -> {

            if (e.getValueIsAdjusting() || actualizandoLista) {
                return;
            }

            Object obj = vista.listPlaylists.getSelectedValue();

            if (!(obj instanceof Cancion)) {
                return;
            }

            controlador.reproducirDirecto((Cancion) obj);
        });

        initHover();
    }

    private void initHover() {

        vista.listPlaylists.addMouseMotionListener(
                new java.awt.event.MouseMotionAdapter() {

            @Override
            public void mouseMoved(java.awt.event.MouseEvent e) {

                int idx =
                        vista.listPlaylists.locationToIndex(e.getPoint());

                if (renderer != null) {
                    renderer.setHoveredIndex(idx);
                    vista.listPlaylists.repaint();
                }
            }
        });

        vista.listPlaylists.addMouseListener(
                new java.awt.event.MouseAdapter() {

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {

                if (renderer != null) {
                    renderer.setHoveredIndex(-1);
                    vista.listPlaylists.repaint();
                }
            }
        });
    }

    public void cargarLista() {

        DefaultListModel<Cancion> modelo =
                new DefaultListModel<>();

        var nodo = playlist.buscar(c -> true);

        if (nodo == null) {
            return;
        }

        var inicio = nodo;
        var aux = nodo;

        do {

            modelo.addElement(aux.getDato());

            aux = aux.getSig();

        } while (aux != inicio);

        vista.listPlaylists.setModel(modelo);

        renderer = new CancionCellRenderer();

        vista.listPlaylists.setCellRenderer(renderer);
    }

    public void seleccionarCancion(Cancion cancion) {

        DefaultListModel<Cancion> modelo =
                (DefaultListModel<Cancion>)
                        vista.listPlaylists.getModel();

        actualizandoLista = true;

        for (int i = 0; i < modelo.size(); i++) {

            if (modelo.getElementAt(i).equals(cancion)) {

                vista.listPlaylists.setSelectedIndex(i);

                vista.listPlaylists.ensureIndexIsVisible(i);

                break;
            }
        }

        actualizandoLista = false;
    }
}