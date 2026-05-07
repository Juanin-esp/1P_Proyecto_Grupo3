package Modelo;

import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.AudioFileIO;
import org.jaudiotagger.tag.FieldKey;
import org.jaudiotagger.tag.Tag;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class MusicLoader {

    public static void generarTxtDesdeCarpeta() {

        try {

            URL url = MusicLoader.class.getResource("/Musica");

            if (url == null) {
                System.out.println("Carpeta no encontrada");
                return;
            }

            File carpeta = new File(url.toURI());
            File[] archivos = carpeta.listFiles();

            FileWriter writer = new FileWriter("src/main/resources/musica.txt");

            for (File archivo : archivos) {

                if (archivo.getName().endsWith(".mp3")) {

                    String ruta = "/Musica/" + archivo.getName();

                    writer.write(ruta + "\n");
                }
            }

            writer.close();

            System.out.println("musica.txt generado automaticamente");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void cargarDesdeTxt(Playlist<Cancion> playlist) {
        try {
            InputStream is = MusicLoader.class.getResourceAsStream("/musica.txt");
            if (is == null) { System.out.println("No se encontro musica.txt"); return; }

            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            CancionDAO dao = new CancionDAO(); // ← una sola instancia fuera del while
            String linea;

            while ((linea = br.readLine()) != null) {
                linea = linea.trim();
                if (linea.isEmpty()) continue;

                URL url = MusicLoader.class.getResource(linea);
                if (url == null) { System.out.println("Archivo no encontrado: " + linea); continue; }

                File archivoMp3 = new File(url.toURI());
                String titulo  = "Sin título";
                String artista = "Desconocido";

                try {
                    AudioFile audioFile = AudioFileIO.read(archivoMp3);
                    Tag tag = audioFile.getTag();
                    if (tag != null) {
                        String t = tag.getFirst(FieldKey.TITLE);
                        String a = tag.getFirst(FieldKey.ARTIST);
                        if (t != null && !t.isBlank()) titulo  = t;
                        if (a != null && !a.isBlank()) artista = a;
                    }
                } catch (Exception metaEx) {
                    System.out.println("No se pudieron leer metadatos de: " + linea);
                }

                Cancion c = new Cancion(titulo, artista, linea, 0, false);
                playlist.insertar(c);
                dao.guardarCancion(c); // ← persiste solo si no existe ya en BD
            }

            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}