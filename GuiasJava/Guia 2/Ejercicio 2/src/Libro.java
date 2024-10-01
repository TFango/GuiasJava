public class Libro {
    private String titulo;
    private double precio;
    private int stock;
    private Autor autor;

    public Libro(String titulo, double precio, Autor autor, int stock) {
        this.titulo = titulo;
        this.precio = precio;
        this.autor = autor;
        this.stock = stock;
    }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public double getPrecio(){ return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }

    public Autor getAutor() { return autor; }

    public void aumentarPrecio(double p){
        this.precio = p;
    }

    public void aumentarStock(int s){
        if(stock < 0){
            System.out.println("ERROR: Se debe ingresar un stock positivo.");
        }else {
            this.stock += s;
        }
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                ", autor=" + autor +
                '}';
    }

    public void imprimirMensaje(){
        System.out.println("El libro: " + titulo + " de: " + autor.getName() + " se vende a: " + precio + " pesos.");
    }
}
