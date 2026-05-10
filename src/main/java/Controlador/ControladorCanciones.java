package Controlador;

import Modelo.Cancion;
import Modelo.Playlist;

import Vista.FrmCanciones;
import Vista.FrmPrincipal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorCanciones implements ActionListener {

    private FrmCanciones vista;
    private Playlist<Cancion> playlist;
    private Controlador controlador;
    private VolumeManager volumeManager;
    private ProgressManager progressManager;

    public ControladorCanciones(FrmCanciones vista,Playlist<Cancion> playlist,Controlador controlador) {
        this.vista = vista;
        this.playlist = playlist;
        this.controlador = controlador;
        volumeManager =new VolumeManager(vista, controlador);
        progressManager =new ProgressManager(vista, controlador);
        progressManager.initSliderGUI();
        progressManager.initSlider();
        progressManager.initTimeline();
        volumeManager.init();
        volumeManager.sincronizarUI();
        controlador.addOnCancionCambiada(this::actualizarUI);
        controlador.sincronizarVistaActual();
        initEventos();
    }

    private void initEventos() {
        vista.btnMiMusica.addActionListener(this);
        vista.getBtnTogPlayPause().addActionListener(this);
        vista.getBtnNext().addActionListener(this);
        vista.getBtnPrev().addActionListener(this);
        vista.getBtnTogMute().addActionListener(this);
        vista.getBtnTogSongFav().addActionListener(this);
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
    }
}