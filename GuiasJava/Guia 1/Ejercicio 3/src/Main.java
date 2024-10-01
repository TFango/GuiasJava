public class Main {
    public static void main(String[] args) {

        //Inciso 1
        Libro libro1 = new Libro("El quijote", "Miguel de Cervantes", 500, 10);

        //Inciso 2
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel Garcia Marquez", 700, 5);

        System.out.println("Detalles del primero libro....");
        libro1.imprimirLibro();

        System.out.println("Detalles del segundo libro....");
        libro2.imprimirLibro();

        libro1.venderCopias(3);

        System.out.println("Post Venta del libro 1...");
        libro1.imprimirLibro();

        libro2.venderCopias(8);

        libro2.incrementarCopias(5);

        System.out.println("Detalles del segundo libro....");
        libro2.imprimirLibro();

    }
}