import Acciones.Basico;
import Acciones.VehiculoDeCarga;
import Acciones.VehiculoDePasajeros;
import Vehiculos.Autobus;
import Vehiculos.Automovil;
import Vehiculos.Bicicleta;
import Vehiculos.Camion;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Basico> flota = new ArrayList<>();

        Automovil automovil = new Automovil("Toyota", "Corolla", 180, 5);
        Camion camion = new Camion("Ford", "F-150", 120, 2);
        Autobus autobus = new Autobus("Mercedes", "Sprinter", 100, 20);
        Bicicleta bicicleta = new Bicicleta("BMX", "Pro", 30);

        flota.add(automovil);
        flota.add(camion);
        flota.add(bicicleta);
        flota.add(autobus);

        for(Basico vehiculo : flota){
            System.out.println("Marca: " + vehiculo.getMarca());
            System.out.println("Modelo: " + vehiculo.getModelo());
            System.out.println("Velocidad maxima: " + vehiculo.getVelocidadMaxima());

            if(vehiculo instanceof VehiculoDePasajeros){
                System.out.println("Capacidad de pasajeros: " + ((VehiculoDePasajeros) vehiculo).getCapacidadDePasajeros());
            }else if(vehiculo instanceof VehiculoDeCarga){
                System.out.println("Capacidad de carga: " + ((VehiculoDeCarga) vehiculo).getCapacidadDeCarga());
            }

            System.out.println();
        }





    }
}