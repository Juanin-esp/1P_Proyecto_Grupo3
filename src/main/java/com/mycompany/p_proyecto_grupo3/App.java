package com.mycompany.p_proyecto_grupo3;

import Modelo.*;
import Controlador.Controlador;
import Vista.PanelPrincipal;
import javafx.embed.swing.JFXPanel;
public class App {
    public static void main(String[] args) {
        new JFXPanel();
        // 1. Crear modelo
        Playlist<Cancion> playlist = new Playlist<>();

        playlist.insertar(new Cancion(
            "Tilin", "XD",
            "/Musica/ya_llego_tilin_letra.mp3",
            3.0
        ));

        playlist.insertar(new Cancion(
            "Otra", "Artista",
            "/Musica/Cancion_de_el_fin_se_acerca.mp3",
            4.0
        ));
        
        playlist.insertar(new Cancion(
            "HOLA", "Artista",
            "/Musica/Facil_de_Engañar.mp3",
            4.0
        ));

        // 2. Crear controlador
        Controlador controlador = new Controlador(playlist);

        // 3. Crear vista
        PanelPrincipal vista = new PanelPrincipal();

        // 4. Conectar
        vista.setControlador(controlador);

        // 5. Mostrar
        vista.setVisible(true);
    }
}