package Controlador;

import Modelo.Cancion;
import Modelo.MusicLoader;
import Modelo.Playlist;
import Vista.FrmPrincipal;
import javafx.embed.swing.JFXPanel;

public class ControladorPrincipal {
    private FrmPrincipal vista;
    private Playlist<Cancion> playlist;
    private ManagementPlayer playerManager;
    private Controlador controlador;

    public ControladorPrincipal(FrmPrincipal vista) {
        this.vista = vista;
        initJavaFX();
        initModelo();
        initControladores();
    }

    private void initJavaFX() {
        new JFXPanel();
    }

    private void initModelo() {
        playlist = new Playlist<>();
        MusicLoader.sincronizarConCarpeta();
        MusicLoader.cargarDesdeBD(playlist);
        controlador = new Controlador(playlist);
    }

    private void initControladores() {
        playerManager = new ManagementPlayer(vista,playlist,controlador);
    }
}