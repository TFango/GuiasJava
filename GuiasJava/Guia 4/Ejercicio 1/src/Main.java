import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static Libreria inventario = new Libreria();

    public static void main(String[] args) {
        while (true) {
            mostrarMenu();
            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    agregarLibro();
                    break;
                case 2:
                    eliminarLibro();
                    break;
                case 3:
                    mostrarLibros();
                    break;
                case 4:
                    buscarLibro();
                    break;
                case 5:
                    actulizarPrecio();
                    break;
                case 6:
                    calcularPrecioTotal();
                    break;
                case 7:
                    contarLibros();
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        }
    }

    /**
     *---------------------------------------------------------------------------------------
     */

    private static void mostrarMenu() {
        System.out.println("====== GESTION DE LIBROS =====");
        System.out.println("1. Agregar libro.");
        System.out.println("2. Eliminar libro.");
        System.out.println("3. Mostrar libros.");
        System.out.println("4. Buscar libro.");
        System.out.println("5. Actualizar precio.");
        System.out.println("6. Calcular precio total.");
        System.out.println("7. Contar libros.");
        System.out.println("8. Libro mas caro.");
        System.out.println("9. Libro mas barato.");
        System.out.println("0. Salir.");
        System.out.println("Elija una opcion: ");
    }

    private static void agregarLibro() {
        System.out.println("Ingrese titulo: ");
        String titulo = sc.nextLine();

        System.out.println("Ingrese autor: ");
        String autor = sc.nextLine();

        System.out.println("Ingrese precio: ");
        double precio = sc.nextDouble();
        sc.nextLine();

        System.out.println("Ingrese año de publicidad: ");
        int año = sc.nextInt();
        sc.nextLine();

        if(precio > 0 && año < 2025){
            inventario.agregarLibro(new Libro(titulo,autor,precio,año));
        }else{
            System.out.println("Datos invalidos. Precio o Año errados");
        }
    }

    private static void eliminarLibro() {
        System.out.println("Ingrese titulo: ");
        String titulo = sc.nextLine();
        inventario.eliminarLibro(titulo);
    }

    private static void mostrarLibros() {
        inventario.mostrarLibros();
    }

    private static void buscarLibro() {
        System.out.println("Ingrese titulo: ");
        String titulo = sc.nextLine();
        inventario.buscarLibro(titulo);
    }

    private static void actulizarPrecio(){
        System.out.println("Ingrese el titulo del libro: ");
        String titulo = sc.nextLine();
        System.out.println("Ingrese el nuevo precio: ");
        double precio = sc.nextDouble();

        if(precio > 0){
            inventario.actualizarPrecio(titulo,precio);
        }else{
            System.out.println("Precio invalido");
        }

    }

    private static void calcularPrecioTotal(){
        double total = inventario.calcularPrecioTotal();
        System.out.println("El precio total de todos los libros es: " + total);
    }

    private static void contarLibros(){
        int cantidad = inventario.contarLibros();
        System.out.println("Hay " + cantidad + " libros.");
    }

}