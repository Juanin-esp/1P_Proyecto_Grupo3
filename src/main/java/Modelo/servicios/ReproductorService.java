package Modelo.servicios;

import Modelo.dominio.Cancion;
import Modelo.dominio.Nodo;
import Modelo.dominio.ListaReproduccion;
import Modelo.Validaciones;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javafx.application.Platform;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import java.util.function.Consumer;

public class ReproductorService {

    private ListaReproduccion<Cancion> playlist;
    private MediaPlayer player;
    private boolean mute = false;
    private double volumenAntesMute = 0.5;
    private double volumenActual = 0.5;
    private boolean shuffle = false;
    private boolean repeat = false;

    // ── NUEVO: callback que avisa a la UI qué canción suena ──
    private List<Consumer<Cancion>>listenersCancion =new ArrayList<>();
    
    public boolean isShuffle() {
        return shuffle;
    }

    public boolean isRepeat() {
        return repeat;
    }
    
    public ReproductorService(ListaReproduccion<Cancion> playlist) {
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
        if (shuffle) {
            reproducirAleatoria();
            return;
        }
        Cancion c = playlist.siguiente();
        if (c != null) {
            reproducir(c);
        }
    }

    public void anterior() {
        if (shuffle) {
            reproducirAleatoria();
            return;
        }
        Cancion c = playlist.anterior();
        if (c != null) {
            reproducir(c);
        }
    }

    private void reproducir(Cancion cancion) {
        Platform.runLater(() -> {
            try {
                for (Consumer<Cancion> listener : listenersCancion) {
                    listener.accept(cancion);
                }
                if (Validaciones.playerValido(player)) {
                    player.stop();
                    player.dispose();
                }
                File archivo = new File(cancion.getRuta());
                if (!archivo.exists()) {
                    System.out.println("Archivo no encontrado: "+ archivo.getAbsolutePath());
                    return;
                }
                Media media = new Media(archivo.toURI().toString());
                MediaPlayer nuevoPlayer = new MediaPlayer(media);
                nuevoPlayer.setVolume(volumenActual);
                nuevoPlayer.setOnEndOfMedia(() -> {
                    if (repeat) {
                        player.seek(javafx.util.Duration.ZERO);
                        player.play();
                        return;
                    }
                    siguiente();
                });
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
    
    public void reproducirAleatoria() {
       if (playlist.getSize() == 0) {
           return;
       }
       int total = playlist.getSize();
       int indice;
       do {
           indice = (int) (Math.random() * total);
       } while (
               total > 1 &&
               obtenerNodoPorIndice(indice).getDato() == playlist.getActual()
       );
       var nodo = obtenerNodoPorIndice(indice);
       playlist.setActual(nodo);
       reproducir(nodo.getDato());
   }
    
    private Nodo<Cancion> obtenerNodoPorIndice(int indice) {
        var nodo = playlist.getCabeza();
        for (int i = 0; i < indice; i++) {
            nodo = nodo.getSig();
        }
        return nodo;
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
    
    public void toggleShuffle() {
        shuffle = !shuffle;
        System.out.println("Shuffle: " + shuffle
        );
    }

    public void toggleRepeat() {
        repeat = !repeat;
        System.out.println("Repeat: " + repeat);
    }
    public void buscarYReproducir(String titulo) {
        var nodo = playlist.buscar(c -> c.getTitulo().equalsIgnoreCase(titulo));
        if (nodo != null) {
            playlist.setActual(nodo);
            reproducir(nodo.getDato());
        } else {
            System.out.println("Cancion no encontrada");
        }
    }
    
    public void detenerYLiberar() {
        try {
            if (player != null) {
                player.stop();
                player.dispose();
                player = null;
            }

        } catch (Exception e) {

            System.out.println("Error liberando MediaPlayer: "+ e.getMessage());
        }
    }
}