public class EmpleadoTiempoCompleto extends Empleado {

    public EmpleadoTiempoCompleto(String nombre, double salario) {
        super(nombre, salario);
    }

    @Override
    public double calcularPago() {
        return salario;
    }
}
