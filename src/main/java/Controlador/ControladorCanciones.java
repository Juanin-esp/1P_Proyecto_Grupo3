package Controlador;

import Modelo.servicios.FavoritoService;
import Modelo.servicios.EliminacionCancionService;
import Modelo.servicios.ReproductorService;
import Modelo.servicios.SubidaCancionService;
import Controlador.reproductor.GestorProgreso;
import Controlador.reproductor.GestorVolumen;
import Controlador.reproductor.GestorReproductor;
import Controlador.reproductor.GestorUIPlaylist;
import Modelo.dominio.Cancion;
import Modelo.persistencia.CancionDAO;
import Modelo.dominio.ListaReproduccion;

import Vista.FrmCanciones;
import Vista.FrmPrincipal;

import org.bson.Document;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorCanciones implements ActionListener {

    private FrmCanciones vista;
    private ListaReproduccion<Cancion> playlist;
    private ReproductorService controlador;
    private GestorVolumen volumeManager;
    private GestorProgreso progressManager;
    private EliminacionCancionService deleteSongManager;
    private SubidaCancionService uploadManager;
    private FavoritoService favoritoManager;

    public ControladorCanciones(FrmCanciones vista,ListaReproduccion<Cancion> playlist,ReproductorService controlador,GestorUIPlaylist playlistUI) {
        this.vista = vista;
        this.playlist = playlist;
        this.controlador = controlador;
        volumeManager =new GestorVolumen(vista, controlador);
        progressManager =new GestorProgreso(vista, controlador);
        deleteSongManager =new EliminacionCancionService(vista,playlist,playlistUI,controlador);
        uploadManager = new SubidaCancionService(vista,playlist,playlistUI);
        favoritoManager = new FavoritoService(playlist);
        progressManager.initSliderGUI();
        progressManager.initSlider();
        progressManager.initTimeline();
        volumeManager.init();
        volumeManager.sincronizarUI();
        controlador.addOnCancionCambiada(this::actualizarUI);
        controlador.sincronizarVistaActual();
        sincronizarToggles();
        cargarTablaCanciones();
        initEventos();
    }

    private void initEventos() {
        vista.btnMiMusica.addActionListener(this);
        vista.btnEliminarCancion.addActionListener(this);
        vista.btnSubirCancion.addActionListener(this);
        vista.getBtnTogPlayPause().addActionListener(this);
        vista.getBtnNext().addActionListener(this);
        vista.getBtnPrev().addActionListener(this);
        vista.getBtnTogMute().addActionListener(this);
        vista.getBtnTogSongFav().addActionListener(this);
        vista.btnTogShuffle.addActionListener(this);
        vista.btnTogRepeat.addActionListener(this);
    }
    
    private void cargarTablaCanciones() {
        
        DefaultTableModel modelo = (DefaultTableModel) vista.tblCanciones.getModel();
        modelo.setRowCount(0);
        CancionDAO dao = new CancionDAO();
        List<Document> canciones = dao.listarDocumentos();
        for (Document d : canciones) {
            modelo.addRow(new Object[]{
                    d.getObjectId("_id").toHexString(),
                    d.getString("titulo"),
                    d.getString("artista"),
                    d.getString("ruta"),
                    d.get("duracion"),
                    d.getBoolean("cancionFav")
            });
        }

        ocultarColumnaID();
    }
    private void ocultarColumnaID() {
        TableColumn columna = vista.tblCanciones.getColumnModel().getColumn(0);
        columna.setMinWidth(0);
        columna.setMaxWidth(0);
        columna.setPreferredWidth(0);
    }
    private void volverPrincipal() {
        FrmPrincipal frm = new FrmPrincipal();
        new GestorReproductor(frm,playlist,controlador);
        frm.setVisible(true);
        vista.dispose();
    }
    
    private void actualizarUI(Cancion cancion) {
        if (cancion == null) return;
        vista.getLblSongTitle().setText(cancion.getTitulo());
        vista.getLblArtist().setText(cancion.getArtista());
        vista.getBtnTogPlayPause().setSelected(true);
        vista.getBtnTogPlayPause().setText("⏸");
        boolean fav =cancion.isCancionFav();
        vista.getBtnTogSongFav().setSelected(fav);
        vista.getBtnTogSongFav().setText(fav ? "❤️" : "💔");
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnMiMusica) {
            volverPrincipal();
        }
        if (e.getSource() == vista.getBtnTogPlayPause()) {
            if (vista.getBtnTogPlayPause().isSelected()) {
                controlador.playOrResumeActual();
                vista.getBtnTogPlayPause().setText("⏸");
            } else {
                controlador.pause();
                vista.getBtnTogPlayPause().setText("▶");
            }
        }
        if (e.getSource() == vista.getBtnNext()) {
            controlador.siguiente();
        }
        if (e.getSource() == vista.getBtnPrev()) {
            controlador.anterior();
        }
        if (e.getSource() == vista.getBtnTogMute()) {
            volumeManager.toggleMute();
        }
        if (e.getSource() == vista.btnEliminarCancion) {
            deleteSongManager.eliminarCancion();
        }
        if (e.getSource() == vista.btnSubirCancion) {
            uploadManager.subirCancion();
        }
        if (e.getSource() == vista.btnTogShuffle) {
            controlador.toggleShuffle();
        }
        if (e.getSource() == vista.btnTogRepeat) {
            controlador.toggleRepeat();
        }
        if (e.getSource() == vista.getBtnTogSongFav()) {

            Cancion actual =
                    controlador.getCancionActual();

            if (actual != null) {

                favoritoManager.toggleFavorito(actual);

                vista.getBtnTogSongFav().setSelected(
                        actual.isCancionFav()
                );

                vista.getBtnTogSongFav().setText(
                        actual.isCancionFav()
                                ? "❤️"
                                : "🤍"
                );
            }
        }
    }
    private void sincronizarToggles() {
        vista.btnTogShuffle.setSelected(
                controlador.isShuffle()
        );
        vista.btnTogRepeat.setSelected(
                controlador.isRepeat()
        );
    }
}