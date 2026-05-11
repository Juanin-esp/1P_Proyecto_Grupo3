package Modelo.servicios;

import Modelo.dominio.Cancion;
import Modelo.persistencia.CancionDAO;
import Modelo.dominio.ListaReproduccion;

public class FavoritoService {

    private ListaReproduccion<Cancion> playlist;

    private final CancionDAO dao =
            new CancionDAO();

    public FavoritoService(
            ListaReproduccion<Cancion> playlist
    ) {

        this.playlist = playlist;
    }
    public void toggleFavorito(Cancion cancion) {
        if (cancion == null) {
            return;
        }
        boolean nuevoEstado = !cancion.isCancionFav();
        cancion.setCancionFav(nuevoEstado);
        dao.actualizarFavorito(cancion);
        System.out.println(cancion.getTitulo()+ " favorita: "+ nuevoEstado);
    }
}