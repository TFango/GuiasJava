import java.util.StringJoiner;

public class Bicicleta implements Transporte{
    private String numeroSerie;
    private TipoTransporte tipo;

    public Bicicleta(String numeroSerie) {
        this.numeroSerie = numeroSerie;
        this.tipo = TipoTransporte.BICICLETA;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public TipoTransporte getTipo() {
        return tipo;
    }

    @Override
    public void arrancar() {
        System.out.println("La bicicleta con el numero de serie " + numeroSerie + " esta arrancado.");
    }

    @Override
    public void detener() {
        System.out.println("La bicicleta con el numero de serie " + numeroSerie + " esta detenido.");
    }

    @Override
    public int obtenerCapacidad() {
        return 1;
    }

    public void ajustarAsiento ( int altura ){
        System.out.println("La nueva altura del asiento es: " + altura);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Bicicleta.class.getSimpleName() + "[", "]")
                .add("numeroSerie='" + numeroSerie + "'")
                .add("tipo=" + tipo)
                .toString();
    }
}
