package Controlador;

import Modelo.Cancion;
import Modelo.Playlist;
import Vista.FrmCanciones;
import Vista.FrmPrincipal;

public class NavigationManager {

    private FrmPrincipal vista;
    private Playlist<Cancion> playlist;
    private Controlador controlador;
    private PlaylistUIManager playlistUI;

    public NavigationManager(FrmPrincipal vista,Playlist<Cancion> playlist,Controlador controlador,PlaylistUIManager playlistUI) {
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