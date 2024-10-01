public class EmpleadoContratista extends Empleado {
    private int horasTrabajadas;
    private double tarifaPorProyecto;

    public EmpleadoContratista(String nombre, double tarifaPorProyecto, int horasTrabajadas) {
        super(nombre, tarifaPorProyecto * horasTrabajadas);
        this.tarifaPorProyecto = tarifaPorProyecto;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularPago() {
        return tarifaPorProyecto * horasTrabajadas;
    }
}
