package Controlador;

import Modelo.Cancion;
import Modelo.MusicLoader;
import Modelo.Playlist;
import Vista.FrmPrincipal;
import javafx.embed.swing.JFXPanel;

public class ManagementApp {

    private FrmPrincipal vista;
    private Playlist<Cancion> playlist;
    private ManagementPlayer playerManager;

    public ManagementApp(FrmPrincipal vista) {
        this.vista = vista;

        initJavaFX();
        initModelo();
        initControladores();
    }

    private void initJavaFX() {
        new JFXPanel(); // Inicializa JavaFX
    }

    private void initModelo() {
        playlist = new Playlist<>();
        // 🔥 Genera automáticamente el txt
        MusicLoader.generarTxtDesdeCarpeta();
        // Luego carga desde txt
        MusicLoader.cargarDesdeTxt(playlist);
    }

    private void initControladores() {
        playerManager = new ManagementPlayer(vista, playlist);
    }
}