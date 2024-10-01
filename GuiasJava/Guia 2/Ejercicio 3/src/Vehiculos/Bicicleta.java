package Vehiculos;

import Acciones.Basico;
import Acciones.VehiculoDePasajeros;

public class Bicicleta implements Basico{

    private String marca;
    private String modelo;
    private int velocidadMaxima;

    public Bicicleta(String marca, String modelo, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
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
