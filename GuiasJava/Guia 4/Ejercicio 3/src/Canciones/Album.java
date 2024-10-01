package Canciones;

public class Album {
    private int añoPublicacion;
    private String titulo;
    private Artista artista;

    public Album(int añoPublicacion, String titulo, Artista artista) {
        this.añoPublicacion = añoPublicacion;
        this.titulo = titulo;
        this.artista = artista;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public Artista getArtista() {
        return artista;
    }

    @Override
    public String toString() {
        return "Canciones.Album{" +
                "añoPublicacion=" + añoPublicacion +
                ", titulo='" + titulo + '\'' +
                ", artista=" + artista +
                '}';
    }
}
