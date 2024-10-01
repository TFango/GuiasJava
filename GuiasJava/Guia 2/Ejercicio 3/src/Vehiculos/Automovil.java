package Vehiculos;

import Acciones.Basico;
import Acciones.VehiculoDePasajeros;

public class Automovil implements VehiculoDePasajeros {

    private String marca;
    private String modelo;
    private int velocidadMaxima;
    private int capacidadDePasajeros;

    public Automovil(String marca, String modelo, int velocidadMaxima, int capacidadDePasajeros) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
        this.capacidadDePasajeros = capacidadDePasajeros;
    }

    @Override
    public int getCapacidadDePasajeros() {
        return capacidadDePasajeros;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }
}
