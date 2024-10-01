package Canciones.Reproducciones;

import Canciones.Cancion;

import java.util.Stack;

public class ListaBasica implements Reproducion {
    private String nombre;
    private Stack<Cancion> miLista = new Stack<>();

    public ListaBasica(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void reproducir() {
        if (miLista.isEmpty()) {
            System.out.println("No hay canciones agregadas para reproducir.");
            return;
        }

        Cancion cancion = miLista.pop();
        System.out.println("Cancion: " + cancion);
        miLista.add(cancion);
    }

    @Override
    public void añadirCancion(Cancion cancion) {
        miLista.add(cancion);
        System.out.println("Cancion añadida con exito.");
    }

    @Override
    public void eliminarCancion() {
        System.out.println("Para acceder a esta funcion, debera pagar el premiun.");
    }

    @Override
    public void verMiLista() {
        if(miLista.isEmpty()) {
            System.out.println("La lista esta vacia.");
        }else {
            System.out.println("Canciones de la lista: ");
            for (Cancion cancion : miLista) {
                System.out.println(cancion);
            }
        }

    }
}
