import Canciones.Album;
import Canciones.Artista;
import Canciones.Cancion;
import Canciones.Generos;
import Canciones.Reproducciones.ListaBasica;
import Canciones.Reproducciones.ListaPremiun;
import Canciones.Reproducciones.Reproducion;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Reproducion miLista;

        System.out.println("Bienvenido a Spotify. ¿Deseas usar una cuenta basica o premium? (b/p)");
        String opcion = sc.nextLine();
        if (opcion.equalsIgnoreCase("b")) {
            miLista = new ListaBasica("Mi lista basica");
        } else {
            miLista = new ListaPremiun("Mi lista premiun");
        }

        boolean continuar = true;
        while (continuar) {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Reproducir");
            System.out.println("2. Añadir canción");
            System.out.println("3. Eliminar canción");
            System.out.println("4. Ver mi lista");
            System.out.println("5. Salir");
            System.out.println("Elige una opción:");

            int eleccion = sc.nextInt();
            sc.nextLine();

            switch (eleccion) {
                case 1:
                    miLista.reproducir();
                    break;
                case 2:
                    Cancion nuevaCancion = crearCancion(sc);
                    miLista.añadirCancion(nuevaCancion);
                    break;
                case 3:
                    miLista.eliminarCancion();
                    break;
                case 4:
                    miLista.verMiLista();
                    break;
                case 5:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
        System.out.println("Gracias por usar Spotify.");
    }

    public static Cancion crearCancion(Scanner scanner) {
        try {
            System.out.println("=== Agregar Nueva Cancion ===");

            // Datos del Artista
            System.out.println("Nombre del artista: ");
            String nombreArtista = scanner.nextLine();

            System.out.println("Edad del artista: ");
            int edadArtista = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Nacionalidad del artista: ");
            String nacionalidadArtista = scanner.nextLine();

            Artista artista = new Artista(nacionalidadArtista, edadArtista, nombreArtista);

            // Datos del Album

            System.out.println("Nombre del album: ");
            String nombreAlbum = scanner.nextLine();

            System.out.println("Año de publicacion del album: ");
            int anioPublicacion = scanner.nextInt();
            scanner.nextLine();

            Album album = new Album(anioPublicacion, nombreAlbum, artista);

            //Datos de la cancion

            System.out.println("Nombre de la cancion: ");
            String nombreCancion = scanner.nextLine();

            System.out.println("Duracion de la cancion (en segundos): ");
            int duracionCancion = scanner.nextInt();
            scanner.nextLine();

            Generos genero = null;
            while (genero == null) {
                System.out.println("Seleccione un genero: ");
                for (Generos g : Generos.values()) {
                    System.out.println("- " + g);
                }
                System.out.println("Ingresa el genero: ");
                String generoInput = scanner.nextLine();
                try {
                    genero = Generos.valueOf(generoInput);
                } catch (IllegalArgumentException e) {
                    System.out.println("El genero no es valido");
                }
            }

            System.out.println("¿Tiene artista invitado? (s/n)");
            String artistaInvitado = scanner.nextLine();

            if (artistaInvitado.equalsIgnoreCase("s")) {
                System.out.println("Nombre del artista invitado: ");
                artistaInvitado = scanner.nextLine();
            }

            return new Cancion(nombreCancion, duracionCancion, genero, album, artistaInvitado, artista);
        } catch (NumberFormatException e) {
            System.out.println("Entrada invalida. Asegurese de ingresar numeros donde lo requiera.");
            return null;
        }
    }
}








