package Canciones.Reproducciones;

import Canciones.Cancion;

public interface Reproducion {
    void reproducir();

    void añadirCancion(Cancion cancion);

    void eliminarCancion();

    void verMiLista();
}
