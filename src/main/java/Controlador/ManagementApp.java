package Controlador;

import Modelo.Cancion;
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

        playlist.insertar(new Cancion(
            "Tilin", "XD",
            "/Musica/ya_llego_tilin_letra.mp3",
            180.0
        ));

        playlist.insertar(new Cancion(
            "Otra", "Artista",
            "/Musica/Cancion_de_el_fin_se_acerca.mp3",
            200.0
        ));

        playlist.insertar(new Cancion(
            "Hola", "Artista",
            "/Musica/Facil_de_Engañar.mp3",
            210.0
        ));
    }

    private void initControladores() {
        playerManager = new ManagementPlayer(vista, playlist);
    }
}