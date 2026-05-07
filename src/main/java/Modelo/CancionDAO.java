package Modelo;

import org.bson.Document;
import java.util.ArrayList;
import java.util.List;

public class CancionDAO {

    private final Crud crud = new Crud();
    private static final String COLLECTION = "canciones";

    // ── Convertir Cancion → Document ────────────────────────────────────────
    private Document toDocument(Cancion c) {
        return new Document()
                .append("titulo",     c.getTitulo())
                .append("artista",    c.getArtista())
                .append("ruta",       c.getRuta())
                .append("duracion",   c.getDuracion())
                .append("cancionFav", c.isCancionFav());
    }

    // ── Convertir Document → Cancion ────────────────────────────────────────
    private Cancion toCancion(Document d) {
        String  titulo     = d.getString("titulo");
        String  artista    = d.getString("artista");
        String  ruta       = d.getString("ruta");
        double  duracion   = d.getDouble("duracion") != null ? d.getDouble("duracion") : 0;
        boolean cancionFav = d.getBoolean("cancionFav", false);

        return new Cancion(titulo, artista, ruta, duracion, cancionFav);
    }

    // ── CREATE ──────────────────────────────────────────────────────────────
    public boolean guardarCancion(Cancion c) {
        // Evitar duplicados por ruta
        if (existePorRuta(c.getRuta())) return false;
        return crud.create(COLLECTION, toDocument(c));
    }

    // ── READ ALL ────────────────────────────────────────────────────────────
    public List<Cancion> listarTodas() {
        List<Cancion> lista = new ArrayList<>();
        for (Document d : crud.readAll(COLLECTION)) {
            lista.add(toCancion(d));
        }
        return lista;
    }

    // ── READ por título ─────────────────────────────────────────────────────
    public List<Cancion> buscarPorTitulo(String titulo) {
        List<Cancion> lista = new ArrayList<>();
        for (Document d : crud.readByField(COLLECTION, "titulo", titulo)) {
            lista.add(toCancion(d));
        }
        return lista;
    }

    // ── READ por ruta (única) ───────────────────────────────────────────────
    public Cancion buscarPorRuta(String ruta) {
        Document d = crud.readOne(COLLECTION, "ruta", ruta);
        return d != null ? toCancion(d) : null;
    }

    // ── READ solo favoritas ─────────────────────────────────────────────────
    public List<Cancion> listarFavoritas() {
        List<Cancion> lista = new ArrayList<>();
        for (Document d : crud.readByField(COLLECTION, "cancionFav", true)) {
            lista.add(toCancion(d));
        }
        return lista;
    }

    // ── UPDATE favorito ─────────────────────────────────────────────────────
    public boolean actualizarFavorito(Cancion c) {
        Document filtro  = new Document("ruta", c.getRuta());
        Document cambios = new Document("cancionFav", c.isCancionFav());
        return crud.update(COLLECTION, filtro, cambios);
    }

    // ── DELETE por ruta ─────────────────────────────────────────────────────
    public boolean eliminarPorRuta(String ruta) {
        return crud.delete(COLLECTION, new Document("ruta", ruta));
    }

    // ── UTIL: verificar existencia ──────────────────────────────────────────
    public boolean existePorRuta(String ruta) {
        return crud.readOne(COLLECTION, "ruta", ruta) != null;
    }
}