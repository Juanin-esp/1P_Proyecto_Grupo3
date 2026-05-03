package Modelo;
import Modelo.Cancion;
import Modelo.Playlist;
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
            System.out.println("musica.txt generado automáticamente");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void cargarDesdeTxt(Playlist<Cancion> playlist) {
        try {
            InputStream is = MusicLoader.class.getResourceAsStream("/musica.txt");
            if (is == null) {
                System.out.println("No se encontro musica.txt");
                return;
            }
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String linea;
            while ((linea = br.readLine()) != null) {
                linea = linea.trim();
                // Ignorar líneas vacías
                if (linea.isEmpty()) continue;
                // Validar que el recurso exista
                var url = MusicLoader.class.getResource(linea);
                if (url == null) {
                    System.out.println("Archivo no encontrado: " + linea);
                    continue;
                }
                // Generar título automáticamente desde el nombre
                String nombre = linea.substring(linea.lastIndexOf("/") + 1);
                String titulo = nombre
                        .replace(".mp3", "")
                        .replace("_", " ");
                playlist.insertar(new Cancion(
                        titulo,
                        "Desconocido",
                        linea,
                        0 // duración real se obtiene luego con MediaPlayer
                ));
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}