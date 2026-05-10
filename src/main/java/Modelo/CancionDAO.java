package Modelo;

import org.bson.Document;
import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.List;

public class CancionDAO {

    private final Crud crud = new Crud();

    private static final String COLLECTION = "canciones";
    
    public List<Document> listarDocumentos() {
        return crud.readAll(COLLECTION);
    }
    
    private Document toDocument(Cancion c) {

        return new Document()
                .append("titulo", c.getTitulo())
                .append("artista", c.getArtista())
                .append("ruta", c.getRuta())
                .append("duracion", c.getDuracion())
                .append("cancionFav", c.isCancionFav());
    }

    private Cancion toCancion(Document d) {

        String titulo  = d.getString("titulo");
        String artista = d.getString("artista");
        String ruta    = d.getString("ruta");

        Number duracionNumber = d.get("duracion", Number.class);

        double duracion = duracionNumber != null
                ? duracionNumber.doubleValue()
                : 0;

        boolean favorita = d.getBoolean("cancionFav", false);

        return new Cancion(
                titulo,
                artista,
                ruta,
                duracion,
                favorita
        );
    }

    public boolean guardarCancion(Cancion c) {

        // Evita duplicados
        if (existePorRuta(c.getRuta())) {
            return false;
        }

        return crud.create(COLLECTION, toDocument(c));
    }
    
    public boolean eliminarPorId(String id) {
        return crud.delete(COLLECTION,new Document("_id",new ObjectId(id)));
    }
    // =========================================================
    // READ ALL
    // =========================================================
    public List<Cancion> listarTodas() {

        List<Cancion> lista = new ArrayList<>();

        List<Document> docs = crud.readAll(COLLECTION);

        // Ordenar alfabéticamente
        docs.sort((a, b) ->
                a.getString("titulo")
                 .compareToIgnoreCase(
                         b.getString("titulo")
                 )
        );

        for (Document d : docs) {
            lista.add(toCancion(d));
        }

        return lista;
    }

    // =========================================================
    // BUSCAR POR TITULO EXACTO
    // =========================================================
    public List<Cancion> buscarPorTitulo(String titulo) {

        List<Cancion> lista = new ArrayList<>();

        for (Document d :
                crud.readByField(COLLECTION, "titulo", titulo)) {

            lista.add(toCancion(d));
        }

        return lista;
    }

    // =========================================================
    // BUSQUEDA PARCIAL
    // =========================================================
    public List<Cancion> buscarContiene(String texto) {

        List<Cancion> resultado = new ArrayList<>();

        List<Cancion> todas = listarTodas();

        texto = texto.toLowerCase();

        for (Cancion c : todas) {

            boolean coincideTitulo =
                    c.getTitulo().toLowerCase().contains(texto);

            boolean coincideArtista =
                    c.getArtista().toLowerCase().contains(texto);

            if (coincideTitulo || coincideArtista) {
                resultado.add(c);
            }
        }

        return resultado;
    }

    // =========================================================
    // READ POR RUTA
    // =========================================================
    public Cancion buscarPorRuta(String ruta) {

        Document d = crud.readOne(COLLECTION, "ruta", ruta);

        return d != null
                ? toCancion(d)
                : null;
    }

    // =========================================================
    // READ FAVORITAS
    // =========================================================
    public List<Cancion> listarFavoritas() {

        List<Cancion> lista = new ArrayList<>();

        for (Document d :
                crud.readByField(COLLECTION,
                        "cancionFav",
                        true)) {

            lista.add(toCancion(d));
        }

        return lista;
    }

    // =========================================================
    // UPDATE FAVORITO
    // =========================================================
    public boolean actualizarFavorito(Cancion c) {

        Document filtro =
                new Document("ruta", c.getRuta());

        Document cambios =
                new Document("cancionFav",
                        c.isCancionFav());

        return crud.update(
                COLLECTION,
                filtro,
                cambios
        );
    }

    // =========================================================
    // DELETE
    // =========================================================
    public boolean eliminarPorRuta(String ruta) {

        return crud.delete(
                COLLECTION,
                new Document("ruta", ruta)
        );
    }

    // =========================================================
    // EXISTE
    // =========================================================
    public boolean existePorRuta(String ruta) {

        return crud.readOne(
                COLLECTION,
                "ruta",
                ruta
        ) != null;
    }
}