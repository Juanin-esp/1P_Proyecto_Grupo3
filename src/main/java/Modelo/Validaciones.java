package Modelo;

import Modelo.dominio.Cancion;
import javafx.scene.media.MediaPlayer;

import java.net.URL;

public class Validaciones {

    public static boolean playlistVacia(Cancion c) {
        return c == null;
    }

    public static boolean recursoValido(URL url) {
        return url != null;
    }

    public static boolean playerValido(MediaPlayer player) {
        return player != null;
    }

    public static boolean duracionValida(MediaPlayer player) {
        return player != null &&
               player.getTotalDuration() != null &&
               player.getTotalDuration().toSeconds() > 0;
    }
    
    public static String formatTime(double seconds) {
        int min = (int) seconds / 60;
        int sec = (int) seconds % 60;
        return String.format("%02d:%02d", min, sec);
    }
}