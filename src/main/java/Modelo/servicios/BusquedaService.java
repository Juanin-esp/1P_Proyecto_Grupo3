package Modelo.servicios;

import Controlador.reproductor.GestorUIPlaylist;
import Modelo.dominio.Cancion;
import Modelo.dominio.ListaReproduccion;
import Vista.FrmPrincipal;

import javax.swing.JOptionPane;

public class BusquedaService {

    private FrmPrincipal vista;
    private ListaReproduccion<Cancion> playlist;
    private ReproductorService controlador;
    private GestorUIPlaylist playlistUI;

    public BusquedaService(
            FrmPrincipal vista,
            ListaReproduccion<Cancion> playlist,
            ReproductorService controlador,
            GestorUIPlaylist playlistUI
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