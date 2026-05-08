package Modelo;

import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.AudioFileIO;
import org.jaudiotagger.tag.FieldKey;
import org.jaudiotagger.tag.Tag;

import java.io.File;
import java.net.URL;
import java.util.List;

public class MusicLoader {

    // =========================================================
    // SINCRONIZA LA CARPETA /Musica CON MONGODB
    // =========================================================
    public static void sincronizarConCarpeta() {

        try {

            URL url = MusicLoader.class.getResource("/Musica");

            if (url == null) {
                System.out.println("Carpeta /Musica no encontrada");
                return;
            }

            File carpeta = new File(url.toURI());
            File[] archivos = carpeta.listFiles();

            if (archivos == null) {
                System.out.println("No hay archivos en la carpeta");
                return;
            }

            CancionDAO dao = new CancionDAO();

            for (File archivo : archivos) {

                if (!archivo.getName().endsWith(".mp3")) {
                    continue;
                }

                String ruta = "/Musica/" + archivo.getName();

                // Evita duplicados
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

            } catch (Exception metaEx) {

                System.out.println(
                        "No se pudieron leer metadatos de: "
                        + archivo.getName()
                );
            }
            
            Cancion c = new Cancion(
                    titulo,
                    artista,
                    ruta,
                    duracion,
                    false
            );

                dao.guardarCancion(c);

                System.out.println("Canción agregada: " + titulo);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // =========================================================
    // CARGA LA PLAYLIST DESDE MONGODB
    // =========================================================
    public static void cargarDesdeBD(Playlist<Cancion> playlist) {

        try {

            CancionDAO dao = new CancionDAO();

            List<Cancion> canciones = dao.listarTodas();

            for (Cancion c : canciones) {
                playlist.insertar(c);
            }

            System.out.println("Canciones cargadas desde MongoDB");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}