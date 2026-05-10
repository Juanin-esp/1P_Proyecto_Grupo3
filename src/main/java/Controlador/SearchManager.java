package Controlador;

import Modelo.Cancion;
import Modelo.Playlist;
import Vista.FrmPrincipal;

import javax.swing.JOptionPane;

public class SearchManager {

    private FrmPrincipal vista;
    private Playlist<Cancion> playlist;
    private Controlador controlador;
    private PlaylistUIManager playlistUI;

    public SearchManager(
            FrmPrincipal vista,
            Playlist<Cancion> playlist,
            Controlador controlador,
            PlaylistUIManager playlistUI
    ) {
        this.vista = vista;
        this.playlist = playlist;
        this.controlador = controlador;
        this.playlistUI = playlistUI;
    }

    public void buscarCancion() {

        String texto =
                vista.txtBuscarCancion.getText().trim();

        if (texto.isEmpty()) {
            return;
        }

        var nodo =
                playlist.buscar(c ->
                        c.getTitulo().toLowerCase()
                                .contains(texto.toLowerCase())
                        ||
                        c.getArtista().toLowerCase()
                                .contains(texto.toLowerCase())
                );

        if (nodo == null) {

            JOptionPane.showMessageDialog(
                    vista,
                    "Canción no encontrada"
            );

            return;
        }

        Cancion cancion = nodo.getDato();

        controlador.reproducirDirecto(cancion);

        playlistUI.seleccionarCancion(cancion);
    }
}