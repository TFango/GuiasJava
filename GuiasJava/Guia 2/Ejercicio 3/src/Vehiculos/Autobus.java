package Vehiculos;

import Acciones.Basico;
import Acciones.VehiculoDePasajeros;

public class Autobus implements VehiculoDePasajeros {
    private String marca;
    private String modelo;
    private int velocidadMaxima;
    private int cantidadDePasajeros;

    public Autobus(String marca, String modelo, int velocidadMaxima, int cantidadDePasajeros) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
        this.cantidadDePasajeros = cantidadDePasajeros;
    }

    @Override
    public int getCapacidadDePasajeros() {
        return cantidadDePasajeros;
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
