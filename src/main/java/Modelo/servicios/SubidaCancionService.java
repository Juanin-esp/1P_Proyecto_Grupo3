package Modelo.servicios;

import Controlador.reproductor.GestorUIPlaylist;
import Modelo.dominio.Cancion;
import Modelo.persistencia.CancionDAO;
import Modelo.servicios.SincronizacionService;
import Modelo.dominio.ListaReproduccion;

import Vista.FrmCanciones;

import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.AudioFileIO;
import org.jaudiotagger.tag.FieldKey;
import org.jaudiotagger.tag.Tag;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class SubidaCancionService {

    private FrmCanciones vista;

    private ListaReproduccion<Cancion> playlist;

    private GestorUIPlaylist playlistUI;

    private CancionDAO dao;

    public SubidaCancionService(FrmCanciones vista,ListaReproduccion<Cancion> playlist,GestorUIPlaylist playlistUI
    ) {

        this.vista = vista;

        this.playlist = playlist;

        this.playlistUI = playlistUI;

        dao = new CancionDAO();
    }


    public void subirCancion() {

        try {

            JFileChooser chooser =
                    new JFileChooser();

            chooser.setDialogTitle(
                    "Seleccionar canción"
            );

            chooser.setFileFilter(
                    new FileNameExtensionFilter(
                            "Archivos MP3",
                            "mp3"
                    )
            );

            int resultado =
                    chooser.showOpenDialog(vista);

            if (resultado != JFileChooser.APPROVE_OPTION) {
                return;
            }

            File archivoOriginal = chooser.getSelectedFile();

            File carpetaMusic = SincronizacionService.obtenerCarpetaMusica();

            String nombreArchivo =
                    archivoOriginal.getName();

            File archivoDestino =
                    new File(
                            carpetaMusic,
                            nombreArchivo
                    );

            if (archivoDestino.exists()) {

                JOptionPane.showMessageDialog(
                        vista,
                        "La canción ya existe"
                );

                return;
            }

            Files.copy(archivoOriginal.toPath(),archivoDestino.toPath(),StandardCopyOption.REPLACE_EXISTING);

            String titulo = "Sin título";

            String artista = "Desconocido";

            double duracion = 0;

            try {

                AudioFile audioFile =
                        AudioFileIO.read(archivoDestino);

                duracion =
                        audioFile
                                .getAudioHeader()
                                .getTrackLength();

                Tag tag =
                        audioFile.getTag();

                if (tag != null) {

                    String t =
                            tag.getFirst(FieldKey.TITLE);

                    String a =
                            tag.getFirst(FieldKey.ARTIST);

                    if (t != null && !t.isBlank()) {
                        titulo = t;
                    }

                    if (a != null && !a.isBlank()) {
                        artista = a;
                    }
                }

            } catch (Exception ex) {

                System.out.println(
                        "Error leyendo metadata"
                );
            }

            String ruta =
                    "music/" + nombreArchivo;

            Cancion cancion =
                    new Cancion(
                            titulo,
                            artista,
                            ruta,
                            duracion,
                            false
                    );

            boolean guardado =
                    dao.guardarCancion(cancion);

            if (!guardado) {

                JOptionPane.showMessageDialog(
                        vista,
                        "Error guardando canción"
                );

                return;
            }

            playlist.insertar(cancion);

            DefaultTableModel modelo =
                    (DefaultTableModel)
                            vista.tblCanciones.getModel();

            modelo.addRow(new Object[] {
                    "",
                    titulo,
                    artista,
                    ruta,
                    duracion,
                    false
            });

            if (playlistUI != null) {
                playlistUI.cargarLista();
            }

            JOptionPane.showMessageDialog(
                    vista,
                    "Canción subida correctamente"
            );

        } catch (Exception e) {

            e.printStackTrace();

            JOptionPane.showMessageDialog(
                    vista,
                    "Error subiendo canción"
            );
        }
    }
}