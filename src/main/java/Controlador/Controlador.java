package Controlador;

import Modelo.Cancion;
import Modelo.Playlist;
import javafx.application.Platform;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class Controlador {

    private Playlist<Cancion> playlist;
    private MediaPlayer player;

    public Controlador(Playlist<Cancion> playlist) {
        this.playlist = playlist;
    }
    
    public void playActual() {
        Cancion actual = playlist.getActual();

        if (actual == null) {
            System.out.println("Playlist vacia");
            return;
        }

        reproducir(actual);
    }

    public void siguiente() {
        Cancion c = playlist.siguiente();

        if (c != null) {
            reproducir(c);
        }
    }
    
    public void anterior() {
        Cancion c = playlist.anterior();

        if (c != null) {
            reproducir(c);
        }
    }
    
    /*Método central de reproducción (CLAVE)
    Aquí está lo importante: controlar el ciclo de vida del MediaPlayer*/
    private void reproducir(Cancion cancion) {

        Platform.runLater(() -> {
            try {
                // Detener reproducción actual
                if (player != null) {
                    player.stop();
                }

                String recurso = cancion.getRuta();
                var url = getClass().getResource(recurso);

                // Validación crítica
                if (url == null) {
                    System.out.println("No se encontro el archivo: " + recurso);
                    return;
                }

                String ruta = url.toExternalForm();

                Media media = new Media(ruta);
                player = new MediaPlayer(media);

                // Auto siguiente
                player.setOnEndOfMedia(() -> siguiente());

                player.play();

            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
    
    public void pause() {
        if (player != null) {
            player.pause();
        }
    }

    public void stop() {
        if (player != null) {
            player.stop();
        }
    }
    
    public void setVolumen(double volumen) {
        if (player != null) {
            player.setVolume(volumen); // rango 0.0 a 1.0
        }
    }
    
    //Preparado para despues
    public void shuffle() {
        // luego conectas con playlist.mezclar()
    }
    
    public void buscarYReproducir(String titulo) {
        var nodo = playlist.buscar(c ->
            c.getTitulo().equalsIgnoreCase(titulo)
        );

        if (nodo != null) {
            playlist.setActual(nodo);
            reproducir(nodo.getDato());
        } else {
            System.out.println("Canción no encontrada");
        }

    }
    
    
}