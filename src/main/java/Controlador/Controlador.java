package Controlador;

import Modelo.Cancion;
import Modelo.Playlist;
import Modelo.Validaciones;
import javafx.application.Platform;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class Controlador {

    private Playlist<Cancion> playlist;
    private MediaPlayer player;
    private boolean mute = false;
    private double volumenAntesMute = 0.5;
    private double volumenActual = 0.5; // valor inicial (50%)
    public Controlador(Playlist<Cancion> playlist) {
        this.playlist = playlist;
    }
    public MediaPlayer getPlayer() {
        return player;
    }
    
    public void playActual() {
        Cancion actual = playlist.getActual();

        if (Validaciones.playlistVacia(actual)) return;

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
                if (Validaciones.playerValido(player)) {
                    player.stop();
                }

                String recurso = cancion.getRuta();
                var url = getClass().getResource(recurso);

                if (!Validaciones.recursoValido(url)) {
                    System.out.println("Archivo no encontrado: " + recurso);
                    return;
                }

                String ruta = url.toExternalForm();

                Media media = new Media(ruta);
                player = new MediaPlayer(media);
                
                player.setVolume(volumenActual);

                player.setOnEndOfMedia(this::siguiente);

                player.setOnReady(() -> {
                    player.setVolume(volumenActual);
                    System.out.println("Duración: " + player.getTotalDuration().toSeconds());
                });

                player.play();

            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
    
    public void reproducirDirecto(Cancion cancion) {
        reproducir(cancion);
    }
    
    public void pause() {
        if (!Validaciones.playerValido(player)) return;
        player.pause();
    }

    public void stop() {
        if (!Validaciones.playerValido(player)) return;
        player.stop();
    }
    
    public void setVolumen(double volumen) {
        volumenActual = volumen;
        if (!Validaciones.playerValido(player)) return;
        player.setVolume(volumenActual);
    }
    
    public double getVolumenActual() {
        return volumenActual;
    }
    
    public void toggleMute() {
        if (!Validaciones.playerValido(player)) return;

        if (!mute) {
            volumenAntesMute = volumenActual;
            volumenActual = 0;
            player.setVolume(0);
            mute = true;
        } else {
            volumenActual = volumenAntesMute;
            player.setVolume(volumenActual);
            mute = false;
        }
    }
    
    public boolean isMute() {
        return mute;
    }
    
    public void desmutearDirecto(double volumen) {
        mute = false;
        volumenActual = volumen;
        if (Validaciones.playerValido(player)) {
            player.setVolume(volumen);
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