package Modelo;

public class Cancion {
    private String titulo;
    private String artista;
    private String ruta; // ruta del archivo mp3
    private double duracion;

    public Cancion(String titulo, String artista, String ruta, double duracion) {
        this.titulo = titulo;
        this.artista = artista;
        this.ruta = ruta;
        this.duracion = duracion;
    }

    public String getTitulo() { return titulo; }
    public String getArtista() { return artista; }
    public String getRuta() { return ruta; }
    public double getDuracion() { return duracion; }

    public void setTitulo(String titulo) { this.titulo = titulo;}
    public void setArtista(String artista) {this.artista = artista;}
    public void setRuta(String ruta) {this.ruta = ruta;}
    public void setDuracion(double duracion) {this.duracion = duracion;}

    @Override
    public String toString() {
        return titulo + " - " + artista;
    }
}