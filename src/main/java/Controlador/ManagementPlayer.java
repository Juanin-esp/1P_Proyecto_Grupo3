package Controlador;

import Vista.FrmPrincipal;
import Modelo.Cancion;
import Modelo.Playlist;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManagementPlayer implements ActionListener {

    private FrmPrincipal vista;
    private Controlador controlador;

    public ManagementPlayer(FrmPrincipal vista, Playlist<Cancion> playlist) {
        this.vista = vista;
        this.controlador = new Controlador(playlist);

        // 🔥 Registrar eventos
        vista.btnPlay.addActionListener(this);
        vista.btnNext.addActionListener(this);
        vista.btnPrev.addActionListener(this);

        // Opcional
        vista.btnVolume.addActionListener(this);
        vista.btnShuffle.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vista.btnPlay) {
            controlador.playActual();
        }

        if (e.getSource() == vista.btnNext) {
            controlador.siguiente();
        }

        if (e.getSource() == vista.btnPrev) {
            controlador.anterior();
        }
    }
}