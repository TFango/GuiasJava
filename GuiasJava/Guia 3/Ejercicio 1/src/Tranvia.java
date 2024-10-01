import java.util.StringJoiner;

public class Tranvia implements Transporte{
    private String ruta;
    private int capacidad;
    private TipoTransporte tipo;

    public Tranvia(String ruta, int capacidad) {
        this.ruta = ruta;
        this.capacidad = capacidad;
        this.tipo = TipoTransporte.TRANVIA;
    }

    public String getRuta() {
        return ruta;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public TipoTransporte getTipo() {
        return tipo;
    }

    @Override
    public void arrancar() {
        System.out.println("El tranvia de la ruta " + ruta + " ha sido arrancado.");
    }

    @Override
    public void detener() {
        System.out.println("El tranvia de la ruta " + ruta + " ha detenido.");
    }

    @Override
    public int obtenerCapacidad() {
        return capacidad;
    }

    public void cambiarVia( int nuevaVia){
        System.out.println("La nueva via de la ruta " + ruta + " es " + nuevaVia);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Tranvia.class.getSimpleName() + "[", "]")
                .add("ruta='" + ruta + "'")
                .add("capacidad=" + capacidad)
                .add("tipo=" + tipo)
                .toString();
    }
}
