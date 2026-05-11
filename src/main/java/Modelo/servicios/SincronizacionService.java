package Modelo.servicios;

import Modelo.dominio.Cancion;
import Modelo.persistencia.CancionDAO;
import Modelo.dominio.ListaReproduccion;
import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.AudioFileIO;
import org.jaudiotagger.tag.FieldKey;
import org.jaudiotagger.tag.Tag;

import java.io.File;
import java.util.List;

public class SincronizacionService {

    private static final String MUSIC_FOLDER = "music";

    public static File obtenerCarpetaMusica() {

        File carpeta = new File(MUSIC_FOLDER);

        if (!carpeta.exists()) {
            carpeta.mkdirs();
        }

        return carpeta;
    }

    public static void sincronizarConCarpeta() {

        try {

            File carpeta = obtenerCarpetaMusica();

            File[] archivos = carpeta.listFiles();

            if (archivos == null) {
                return;
            }

            CancionDAO dao = new CancionDAO();

            for (File archivo : archivos) {

                if (!archivo.getName().toLowerCase().endsWith(".mp3")) {
                    continue;
                }

                String ruta = "music/" + archivo.getName();

                if (dao.existePorRuta(ruta)) {
                    continue;
                }

                String titulo = "Sin título";
                String artista = "Desconocido";
                double duracion = 0;
                try {
                    AudioFile audioFile = AudioFileIO.read(archivo);
                    duracion = audioFile.getAudioHeader().getTrackLength();
                    Tag tag = audioFile.getTag();

                    if (tag != null) {
                        String t = tag.getFirst(FieldKey.TITLE);
                        String a = tag.getFirst(FieldKey.ARTIST);
                        if (t != null && !t.isBlank()) {
                            titulo = t;
                        }

                        if (a != null && !a.isBlank()) {
                            artista = a;
                        }
                    }

                } catch (Exception ex) {

                    System.out.println("Error leyendo metadata: "+ archivo.getName());
                }
                Cancion c = new Cancion(titulo,artista,ruta,duracion,false);
                dao.guardarCancion(c);
                System.out.println("Canción agregada: "+ titulo);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void cargarDesdeBD(ListaReproduccion<Cancion> playlist) {
        try {
            CancionDAO dao = new CancionDAO();
            List<Cancion> canciones = dao.listarTodas();

            for (Cancion c : canciones) {
                playlist.insertar(c);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}