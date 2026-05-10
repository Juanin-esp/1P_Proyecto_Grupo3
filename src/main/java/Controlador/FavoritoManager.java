package Controlador;

import Modelo.Cancion;
import Modelo.CancionDAO;
import Modelo.Playlist;

public class FavoritoManager {

    private Playlist<Cancion> playlist;

    private final CancionDAO dao =
            new CancionDAO();

    public FavoritoManager(
            Playlist<Cancion> playlist
    ) {

        this.playlist = playlist;
    }

    // =====================================================
    // TOGGLE FAVORITO
    // =====================================================

    public void toggleFavorito(Cancion cancion) {

        if (cancion == null) {
            return;
        }

        boolean nuevoEstado =
                !cancion.isCancionFav();

        cancion.setCancionFav(
                nuevoEstado
        );

        dao.actualizarFavorito(cancion);

        System.out.println(
                cancion.getTitulo()
                + " favorita: "
                + nuevoEstado
        );
    }
}