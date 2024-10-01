public class Libro {
    private static int contadorID = 0;
    private int id;
    private String titulo;
    private String autor;
    private double precio;
    private int cantidadDeCopias;

    public Libro (String titulo, String autor, double precio, int cantidadDeCopias){
        this.id = ++contadorID;
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.cantidadDeCopias = cantidadDeCopias;
    }

    public int getId(){ return id; }

    public String getTitulo(){ return titulo; }
    public void setTitulo(String titulo){ this.titulo = titulo; }

    public String getAutor(){ return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    public int getCantidadDeCopias(){ return cantidadDeCopias; }

    public void setCantidadDeCopias(int cantidadDeCopias){
        this.cantidadDeCopias = cantidadDeCopias;
    }

    public void venderCopias(int cantidad){
        if(cantidad > cantidadDeCopias){
            System.out.println("ERROR: No hay suficiente copias para vender.");
        }else {
            cantidadDeCopias -= cantidad;
            System.out.println("Se vendieron: " + cantidad + " copias");
        }
    }

    public void incrementarCopias(int cantidad){
        if(cantidad > 0){
            cantidadDeCopias+=cantidad;
            System.out.println("Se han agregado" + cantidad + " copias.");
        }else {
            System.out.println("ERROR: No se puede agregar una cantidad negativa de copias.");
        }
    }

    public void imprimirLibro() {
        System.out.println("Libro[id=" + id +
                ", título=" + titulo +
                ", autor=" + autor +
                ", precio=" + precio +
                ", copias disponibles=" + cantidadDeCopias +"]");
    }
}