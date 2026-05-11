package Controlador.reproductor;

import Modelo.servicios.FavoritoService;
import Modelo.dominio.Cancion;
import Vista.FrmPrincipal;

import javax.swing.SwingUtilities;

public class ActualizadorUIReproductor {

    private FrmPrincipal vista;
    private FavoritoService favoritoManager;
    private GestorUIPlaylist playlistUI;

    public ActualizadorUIReproductor(
            FrmPrincipal vista,
            FavoritoService favoritoManager,
            GestorUIPlaylist playlistUI
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
            boolean fav = cancion.isCancionFav();
            vista.getBtnTogSongFav().setSelected(fav);
            vista.getBtnTogSongFav().setText(fav ? "❤️": "💔");
            playlistUI.seleccionarCancion(cancion);
            vista.getBtnTogSongFav().setSelected(cancion.isCancionFav());
        });
    }
}