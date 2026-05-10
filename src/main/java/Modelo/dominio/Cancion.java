package Modelo.dominio;

public class Cancion {
    private String titulo;
    private String artista;
    private String ruta;
    private double duracion;
    private boolean cancionFav;

    public Cancion(String titulo, String artista, String ruta, double duracion, boolean cancionFav) {
        this.titulo = titulo;
        this.artista = artista;
        this.ruta = ruta;
        this.duracion = duracion;
        this.cancionFav = cancionFav;
    }

    public Cancion(String titulo, String artista, String ruta, double duracion) {
        this(titulo, artista, ruta, duracion, false);
    }

    // Getters y Setters
    public String getTitulo()       { return titulo; }
    public String getArtista()      { return artista; }
    public String getRuta()         { return ruta; }
    public double getDuracion()     { return duracion; }
    public boolean isCancionFav()   { return cancionFav; }

    public void setTitulo(String titulo)        { this.titulo = titulo; }
    public void setArtista(String artista)      { this.artista = artista; }
    public void setRuta(String ruta)            { this.ruta = ruta; }
    public void setDuracion(double duracion)    { this.duracion = duracion; }
    public void setCancionFav(boolean cancionFav) { this.cancionFav = cancionFav; }

    @Override
    public String toString() {
        return titulo + " - " + artista;
    }
}