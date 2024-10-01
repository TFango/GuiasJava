import java.util.ArrayList;

public class Libreria {
    private ArrayList<Libro> libreria;

    public Libreria() {
        this.libreria = new ArrayList<>();
    }

    public void agregarLibro(Libro libro){
        libreria.add(libro);
    }

    public void eliminarLibro(String titulo){
        libreria.removeIf(libro -> titulo.equalsIgnoreCase(libro.getTitulo()));
    }

    public void mostrarLibros(){
        if(libreria.isEmpty()){
            System.out.println("La libreria se encuentra vacia.");
        }else{
            for(Libro libro : libreria){
                System.out.println(libro);
            }
        }
    }

    public void buscarLibro(String titulo){
        for(Libro libro : libreria){
            if(titulo.equalsIgnoreCase(libro.getTitulo())){
                System.out.println(libro);
            }
        }
    }

    public void actualizarPrecio(String titulo, double precio){
        for(Libro libro : libreria){
            if(titulo.equalsIgnoreCase(libro.getTitulo())){
                libro.setPrecio(precio);
            }
        }
    }

    public double calcularPrecioTotal(){
        double precioTotal = 0;
        for(Libro libro : libreria){
            precioTotal += libro.getPrecio();
        }
        return precioTotal;
    }

    public int contarLibros(){
        return libreria.size();
    }


}
