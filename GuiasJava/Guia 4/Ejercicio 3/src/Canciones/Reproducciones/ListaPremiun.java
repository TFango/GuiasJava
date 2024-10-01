package Canciones.Reproducciones;

import Canciones.Cancion;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Scanner;

public class ListaPremiun implements Reproducion {
    private String nombre;
    LinkedList<Cancion> miLista = new LinkedList<>();

    public ListaPremiun(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void reproducir() {
        if (miLista.isEmpty()) {
            System.out.println("No hay canciones en la lista.");
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Elije la cancion a reproducir: ");
        for (int i = 0; i < miLista.size(); i++) {
            System.out.println(i + 1 + ". " + miLista.get(i).getNombre());
        }

        int opcion = sc.nextInt();
        if (opcion > 0 && opcion <= miLista.size()) {
            System.out.println("Reproduciendo: \n" + miLista.get(opcion - 1).getNombre());
        } else {
            System.out.println("Opcion no valida.");
        }
    }

    @Override
    public void añadirCancion(Cancion cancion) {
        miLista.add(cancion);
        System.out.println("Cancion agregada.");
    }

    @Override
    public void eliminarCancion() {
        if (miLista.isEmpty()) {
            System.out.println("No hay canciones en la lista.");
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Elije la cancion a eliminar: ");
        for (int i = 0; i < miLista.size(); i++) {
            System.out.println(i + 1 + ". " + miLista.get(i).getNombre());
        }

        int opcion = sc.nextInt();
        if (opcion > 0 && opcion <= miLista.size()) {
            miLista.remove(opcion - 1);
            System.out.println("Cancion eliminada.");
        } else {
            System.out.println("Opcion no valida.");
        }
    }

    @Override
    public void verMiLista() {
        if (miLista.isEmpty()) {
            System.out.println("No hay canciones en la lista.");
        } else {
            System.out.println("Canciones de la lista: ");
            for (Cancion cancion : miLista) {
                System.out.println(cancion);
            }
        }
    }
}
