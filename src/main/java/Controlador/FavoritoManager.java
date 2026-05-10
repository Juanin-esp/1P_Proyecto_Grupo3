package Controlador;

import Vista.FrmPrincipal;
import Modelo.Cancion;
import Modelo.CancionDAO;
import Modelo.Playlist;

import javax.swing.DefaultListModel;

public class FavoritoManager {

    private FrmPrincipal vista;
    private Playlist<Cancion> playlist;
    private final CancionDAO dao = new CancionDAO();
    
    public FavoritoManager(FrmPrincipal vista, Playlist<Cancion> playlist) {
        this.vista = vista;
        this.playlist = playlist;
    }

    // Llamar al seleccionar una canción
    public void sincronizarBoton(Cancion cancion) {
        if (cancion == null) return;

        boolean fav = cancion.isCancionFav();
        vista.btnTogSongFav.setSelected(fav);
        vista.btnTogSongFav.setText(fav ? "❤️" : "💔");
    }

    // Llamar cuando el usuario presiona btnTogSongFav
    public void toggleFavorito(Cancion cancion) {
        if (cancion == null) return;

        boolean nuevoEstado = vista.btnTogSongFav.isSelected();
        cancion.setCancionFav(nuevoEstado);
        sincronizarBoton(cancion);

        dao.actualizarFavorito(cancion); // ← persiste el cambio en MongoDB

        System.out.println(cancion.getTitulo() + " favorita: " + nuevoEstado);
    }

    // Llamar cuando el usuario presiona btnFav (sidebar)
    public void mostrarSoloFavoritas() {
        DefaultListModel<Cancion> modelo = new DefaultListModel<>();

        var nodo = playlist.buscar(c -> true);
        if (nodo == null) return;

        var inicio = nodo;
        var aux    = nodo;

        do {
            if (aux.getDato().isCancionFav()) {
                modelo.addElement(aux.getDato());
            }
            aux = aux.getSig();
        } while (aux != inicio);

        vista.listPlaylists.setModel(modelo);

        if (modelo.isEmpty()) {
            vista.lblSongTitle.setText("No hay favoritas aun ❤");
        }
    }
}