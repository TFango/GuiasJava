import java.util.StringJoiner;

public class Autobus implements Transporte{
    private int numeroLinea;
    private int capacidad;
    private TipoTransporte tipo;

    public Autobus(int numeroLinea, int capacidad) {
        this.numeroLinea = numeroLinea;
        this.capacidad = capacidad;
        this.tipo = TipoTransporte.AUTOBUS;
    }

    public int getNumeroLinea() {
        return numeroLinea;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public TipoTransporte getTipo() {
        return tipo;
    }

    @Override
    public void arrancar() {
        System.out.println("El autobus de la linea " + numeroLinea + " ha sido arrancado.");
    }

    @Override
    public void detener() {
        System.out.println("El autobus de la linea " + numeroLinea + " ha sido detenido.");
    }

    @Override
    public int obtenerCapacidad() {
        return capacidad;
    }

    public void anunciarParada( String parada ){
        System.out.println("La proxima para es: " + parada);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Autobus.class.getSimpleName() + "[", "]")
                .add("numeroLinea=" + numeroLinea)
                .add("capacidad=" + capacidad)
                .add("tipo=" + tipo)
                .toString();
    }
}
