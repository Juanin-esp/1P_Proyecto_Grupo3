package Controlador;

import Modelo.Cancion;
import Modelo.Playlist;
import Modelo.Validaciones;
import java.util.ArrayList;
import java.util.List;

import javafx.application.Platform;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import java.util.function.Consumer;   // ← nuevo import

public class Controlador {

    private Playlist<Cancion> playlist;
    private MediaPlayer player;
    private boolean mute = false;
    private double volumenAntesMute = 0.5;
    private double volumenActual = 0.5;

    // ── NUEVO: callback que avisa a la UI qué canción suena ──
    private List<Consumer<Cancion>>listenersCancion =new ArrayList<>();

    public Controlador(Playlist<Cancion> playlist) {
        this.playlist = playlist;
    }
    
    public void addOnCancionCambiada(Consumer<Cancion> listener) {
        listenersCancion.add(listener);
    }
    public void sincronizarVistaActual() {
        Cancion actual = getCancionActual();
        if (actual == null) return;
        for (Consumer<Cancion> listener : listenersCancion) {
            listener.accept(actual);
        }
    }
    public MediaPlayer getPlayer() { return player; }
    public Cancion getCancionActual() { return playlist.getActual(); }

    public void playActual() {
        Cancion actual = playlist.getActual();
        if (Validaciones.playlistVacia(actual)) return;
        reproducir(actual);
    }

    public void siguiente() {
        Cancion c = playlist.siguiente();
        if (c != null) reproducir(c);
    }

    public void anterior() {
        Cancion c = playlist.anterior();
        if (c != null) reproducir(c);
    }

    private void reproducir(Cancion cancion) {
        Platform.runLater(() -> {
            for (Consumer<Cancion> listener : listenersCancion) {
                listener.accept(cancion);
            }
        });
        Platform.runLater(() -> {
            try {
                if (Validaciones.playerValido(player)) {
                    player.stop();
                    player.dispose();
                }

                String recurso = cancion.getRuta();
                var url = getClass().getResource(recurso);

                if (!Validaciones.recursoValido(url)) {
                    System.out.println("Archivo no encontrado: " + recurso);
                    return;
                }

                Media media = new Media(url.toExternalForm());
                MediaPlayer nuevoPlayer = new MediaPlayer(media);
                nuevoPlayer.setVolume(volumenActual);
                nuevoPlayer.setOnEndOfMedia(this::siguiente);
                nuevoPlayer.setOnReady(() -> {
                    double duracion =nuevoPlayer.getMedia().getDuration().toSeconds();
                    System.out.println("Duracion: " + duracion);
                    nuevoPlayer.setVolume(volumenActual);
                });
                player = nuevoPlayer;
                player.play();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public void reproducirDirecto(Cancion cancion) {
        // Buscar el nodo de esta canción y mover actual ahí
        var nodo = playlist.buscar(c -> c == cancion); // comparación por referencia
        if (nodo != null) {
            playlist.setActual(nodo);
        }
        reproducir(cancion);
    }

    public void pause() {
        if (!Validaciones.playerValido(player)) return;
        player.pause();
    }

    public void playOrResumeActual() {
        Cancion actual = playlist.getActual();
        if (Validaciones.playlistVacia(actual)) return;

        if (Validaciones.playerValido(player) &&
            player.getStatus() == MediaPlayer.Status.PAUSED) {
            player.play();
        } else {
            reproducir(actual);
        }
    }

    public void setVolumen(double volumen) {
        volumenActual = volumen;
        if (!Validaciones.playerValido(player)) return;
        player.setVolume(volumenActual);
    }

    public double getVolumenActual() { return volumenActual; }
    public boolean isMute()          { return mute; }

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

    public void desmutearDirecto(double volumen) {
        mute = false;
        volumenActual = volumen;
        if (Validaciones.playerValido(player)) player.setVolume(volumen);
    }

    public void shuffle() { }

    public void buscarYReproducir(String titulo) {
        var nodo = playlist.buscar(c -> c.getTitulo().equalsIgnoreCase(titulo));
        if (nodo != null) {
            playlist.setActual(nodo);
            reproducir(nodo.getDato());
        } else {
            System.out.println("Cancion no encontrada");
        }
    }
}