package Vehiculos;

import Acciones.Basico;
import Acciones.VehiculoDeCarga;

public class Camion implements VehiculoDeCarga {
    private String marca;
    private String modelo;
    private int velocidadMaxima;
    private int capacidadDeCarga;

    public Camion(String marca, String modelo, int velocidadMaxima, int capacidadDeCarga) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
        this.capacidadDeCarga = capacidadDeCarga;
    }

    @Override
    public double getCapacidadDeCarga() {
        return capacidadDeCarga;
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
