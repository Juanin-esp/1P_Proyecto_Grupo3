package Controlador;

import Modelo.Cancion;
import Modelo.CancionDAO;
import Modelo.MusicLoader;
import Modelo.Playlist;

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

public class UploadSongManager {

    private FrmCanciones vista;

    private Playlist<Cancion> playlist;

    private PlaylistUIManager playlistUI;

    private CancionDAO dao;

    public UploadSongManager(
            FrmCanciones vista,
            Playlist<Cancion> playlist,
            PlaylistUIManager playlistUI
    ) {

        this.vista = vista;

        this.playlist = playlist;

        this.playlistUI = playlistUI;

        dao = new CancionDAO();
    }

    // =====================================================
    // SUBIR CANCION
    // =====================================================

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

            // =================================================
            // ARCHIVO ORIGINAL
            // =================================================

            File archivoOriginal =
                    chooser.getSelectedFile();

            // =================================================
            // CARPETA MUSIC
            // =================================================

            File carpetaMusic =
                    MusicLoader.obtenerCarpetaMusica();

            // =================================================
            // EVITAR DUPLICADOS
            // =================================================

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

            // =================================================
            // COPIAR ARCHIVO
            // =================================================

            Files.copy(
                    archivoOriginal.toPath(),
                    archivoDestino.toPath(),
                    StandardCopyOption.REPLACE_EXISTING
            );

            // =================================================
            // LEER METADATA
            // =================================================

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

            // =================================================
            // RUTA RELATIVA
            // =================================================

            String ruta =
                    "music/" + nombreArchivo;

            // =================================================
            // CREAR CANCION
            // =================================================

            Cancion cancion =
                    new Cancion(
                            titulo,
                            artista,
                            ruta,
                            duracion,
                            false
                    );

            // =================================================
            // GUARDAR EN MONGODB
            // =================================================

            boolean guardado =
                    dao.guardarCancion(cancion);

            if (!guardado) {

                JOptionPane.showMessageDialog(
                        vista,
                        "Error guardando canción"
                );

                return;
            }

            // =================================================
            // INSERTAR PLAYLIST
            // =================================================

            playlist.insertar(cancion);

            // =================================================
            // ACTUALIZAR TABLA
            // =================================================

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

            // =================================================
            // ACTUALIZAR JLIST
            // =================================================

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