public class Estudiante extends Persona {
    private int añoDeIngreso;
    private double cuota;
    private String carrera;

    public Estudiante(String nombre, String apellido, String correo, String direccion, int añoDeIngreso, double cuota, String carrera) {
        super(nombre, apellido, correo, direccion);
        this.añoDeIngreso = añoDeIngreso;
        this.cuota = cuota;
        this.carrera = carrera;
    }

    public int getAñoDeIngreso() {
        return añoDeIngreso;
    }

    public double getCuota() {
        return cuota;
    }

    public String getCarrera() {
        return carrera;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "Estudiante{" +
                "cuota=" + cuota +
                ", carrera='" + carrera + '\'' +
                ", añoDeIngreso=" + añoDeIngreso +
                "} ";
    }




}
