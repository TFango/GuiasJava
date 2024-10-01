public class Libro {
    private String titulo;
    private String autor;
    private double precio;
    private int añoDePublicacion;

    public Libro(String titulo, String autor, double precio, int añoDePublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.añoDePublicacion = añoDePublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getPrecio() {
        return precio;
    }

    public int getAñoDePublicacion() {
        return añoDePublicacion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", precio=" + precio +
                ", añoDePublicacion=" + añoDePublicacion +
                '}';
    }
}
