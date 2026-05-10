package Controlador;

import Modelo.Cancion;
import Modelo.CancionDAO;
import Modelo.Playlist;

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
    private Playlist<Cancion> playlist;
    private Controlador controlador;
    private VolumeManager volumeManager;
    private ProgressManager progressManager;
    private DeleteSongManager deleteSongManager;
    private UploadSongManager uploadManager;

    public ControladorCanciones(FrmCanciones vista,Playlist<Cancion> playlist,Controlador controlador,PlaylistUIManager playlistUI) {
        this.vista = vista;
        this.playlist = playlist;
        this.controlador = controlador;
        volumeManager =new VolumeManager(vista, controlador);
        progressManager =new ProgressManager(vista, controlador);
        deleteSongManager =new DeleteSongManager(vista,playlist,playlistUI,controlador);
        uploadManager = new UploadSongManager(vista,playlist,playlistUI);
        progressManager.initSliderGUI();
        progressManager.initSlider();
        progressManager.initTimeline();
        volumeManager.init();
        volumeManager.sincronizarUI();
        controlador.addOnCancionCambiada(this::actualizarUI);
        controlador.sincronizarVistaActual();
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
        new ManagementPlayer(frm,playlist,controlador);
        frm.setVisible(true);
        vista.dispose();
    }
    
    private void actualizarUI(Cancion cancion) {
        if (cancion == null) return;
        vista.getLblSongTitle().setText(cancion.getTitulo());
        vista.getLblArtist().setText(cancion.getArtista());
        vista.getBtnTogPlayPause().setSelected(true);
        vista.getBtnTogPlayPause()
                .setText("⏸");
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnMiMusica) {
            volverPrincipal();
        }
        if (e.getSource() == vista.getBtnTogPlayPause()) {
            if (vista.getBtnTogPlayPause().isSelected()) {
                controlador.playOrResumeActual();
                vista.getBtnTogPlayPause()
                        .setText("⏸");
            } else {
                controlador.pause();
                vista.getBtnTogPlayPause()
                        .setText("▶");
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
    }
}