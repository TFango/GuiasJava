package Canciones;

public class Cancion {

    private String nombre;
    private int duracion;
    private Generos genero;
    private Album album;
    private String artista;
    private Artista artistaInvitado;

    public Cancion(String nombre, int duracion, Generos genero, Album album, String artista, Artista artistaInvitado) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.genero = genero;
        this.album = album;
        this.artista = artista;
        this.artistaInvitado = artistaInvitado;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public Generos getGenero() {
        return genero;
    }

    public Album getAlbum() {
        return album;
    }

    public String getArtista() {
        return artista;
    }

    public Artista getArtistaInvitado() {
        return artistaInvitado;
    }

    @Override
    public String toString() {
        return "Cancion{" +
                "nombre='" + nombre + '\'' +
                ", duracion=" + duracion +
                ", genero=" + genero +
                ", album=" + album.getTitulo() +
                ", artista='" + artista + '\'' +
                (artistaInvitado != null ? ", artistaInvitado= " + artistaInvitado.getNombre() : '}');
    }
}




