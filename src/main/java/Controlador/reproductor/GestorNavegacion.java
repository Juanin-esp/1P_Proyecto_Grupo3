package Controlador.reproductor;

import Controlador.ControladorCanciones;
import Modelo.servicios.ReproductorService;
import Modelo.dominio.Cancion;
import Modelo.dominio.ListaReproduccion;
import Vista.FrmCanciones;
import Vista.FrmPrincipal;

public class GestorNavegacion {

    private FrmPrincipal vista;
    private ListaReproduccion<Cancion> playlist;
    private ReproductorService controlador;
    private GestorUIPlaylist playlistUI;

    public GestorNavegacion(FrmPrincipal vista,ListaReproduccion<Cancion> playlist,ReproductorService controlador,GestorUIPlaylist playlistUI) {
            this.vista = vista;
            this.playlist = playlist;
            this.controlador = controlador;
            this.playlistUI = playlistUI;
        }

    public void abrirFrmCanciones() {

        FrmCanciones frm = new FrmCanciones();

        new ControladorCanciones(
                frm,
                playlist,
                controlador,
                playlistUI
        );

        frm.setVisible(true);

        vista.dispose();
    }
}