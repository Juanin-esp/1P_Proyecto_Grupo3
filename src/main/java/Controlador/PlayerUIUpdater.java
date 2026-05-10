package Controlador;

import Modelo.Cancion;
import Vista.FrmPrincipal;

import javax.swing.SwingUtilities;

public class PlayerUIUpdater {

    private FrmPrincipal vista;
    private FavoritoManager favoritoManager;
    private PlaylistUIManager playlistUI;

    public PlayerUIUpdater(
            FrmPrincipal vista,
            FavoritoManager favoritoManager,
            PlaylistUIManager playlistUI
    ) {
        this.vista = vista;
        this.favoritoManager = favoritoManager;
        this.playlistUI = playlistUI;
    }

    public void actualizar(Cancion cancion) {

        if (cancion == null) {
            return;
        }

        SwingUtilities.invokeLater(() -> {

            vista.lblSongTitle.setText(cancion.getTitulo());

            vista.lblArtist.setText(cancion.getArtista());

            vista.btnTogPlayPause.setSelected(true);

            vista.btnTogPlayPause.setText("⏸");

            favoritoManager.sincronizarBoton(cancion);

            playlistUI.seleccionarCancion(cancion);
        });
    }
}