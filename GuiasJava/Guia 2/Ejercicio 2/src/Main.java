public class Main {
    public static void main(String[] args) {

        Autor autor1 = new Autor("Joshua", "Bloch", "joshua@email.com", 'M');

        System.out.println(autor1);

        Libro libro1 = new Libro("Effective Java", 450, autor1, 150);

        System.out.println(libro1);

        libro1.aumentarPrecio(500);

        libro1.aumentarStock(50);

        System.out.println(libro1);

        System.out.println("Autor del libro: " + libro1.getAutor());

        libro1.imprimirMensaje();







    }
}