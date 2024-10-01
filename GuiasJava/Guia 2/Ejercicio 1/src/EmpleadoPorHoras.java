public class EmpleadoPorHoras extends Empleado{
    private int horasTrabajadas;
    private double tarifaPorHoras;

    public EmpleadoPorHoras(String nombre, double tarifaPorHoras, int horasTrabajadas) {
        super(nombre, tarifaPorHoras * horasTrabajadas);
        this.tarifaPorHoras = tarifaPorHoras;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularPago() {
        return  tarifaPorHoras * horasTrabajadas;
    }
}
