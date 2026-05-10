package Controlador;

import Modelo.Cancion;
import Modelo.CancionDAO;
import Modelo.Playlist;

import Vista.FrmCanciones;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import java.io.File;

public class DeleteSongManager {
    private FrmCanciones vista;
    private Playlist<Cancion> playlist;
    private PlaylistUIManager playlistUI;
    private Controlador controlador;
    private CancionDAO dao;
    
    public DeleteSongManager(FrmCanciones vista,Playlist<Cancion> playlist,PlaylistUIManager playlistUI,
            Controlador controlador
    ) {

        this.vista = vista;

        this.playlist = playlist;

        this.playlistUI = playlistUI;

        this.controlador = controlador;

        dao = new CancionDAO();
    }

    public void eliminarCancion() {

        int fila =
                vista.tblCanciones.getSelectedRow();

        if (fila < 0) {

            JOptionPane.showMessageDialog(
                    vista,
                    "Seleccione una canción"
            );

            return;
        }

        int confirmacion =
                JOptionPane.showConfirmDialog(
                        vista,
                        "¿Eliminar canción?",
                        "Confirmar",
                        JOptionPane.YES_NO_OPTION
                );

        if (confirmacion != JOptionPane.YES_OPTION) {
            return;
        }

        String id = vista.tblCanciones.getValueAt(fila, 0).toString();

        String ruta = vista.tblCanciones.getValueAt(fila, 3).toString();

        boolean eliminadoBD =dao.eliminarPorId(id);

        if (!eliminadoBD) {

            JOptionPane.showMessageDialog(
                    vista,
                    "Error eliminando en BD"
            );

            return;
        }

        controlador.detenerYLiberar();
        eliminarArchivo(ruta);

        playlist.eliminar(
                c -> c.getRuta().equals(ruta)
        );


        DefaultTableModel modelo = (DefaultTableModel) vista.tblCanciones.getModel();

        modelo.removeRow(fila);



        if (playlistUI != null) {
            playlistUI.cargarLista();
        }

        JOptionPane.showMessageDialog(
                vista,
                "Canción eliminada correctamente"
        );
    }

    private void eliminarArchivo(String ruta) {
        try {
            File archivo = new File(ruta);
            if (!archivo.exists()) {
                System.out.println("No existe: " + archivo.getAbsolutePath());
                return;
            }
            boolean eliminado = archivo.delete();
            if (eliminado) {
                System.out.println("Eliminado: "+ archivo.getAbsolutePath());
            } else {
                System.out.println("No se pudo eliminar");
            }

        } catch (Exception e) {
            System.out.println("Error eliminando archivo: "+ e.getMessage());
        }
    }
}