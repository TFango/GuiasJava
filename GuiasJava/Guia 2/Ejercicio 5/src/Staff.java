public class Staff extends Persona{
    private double salario;
    private String turno;

    public Staff(String nombre, String apellido, String correo, String direccion, double salario, String turno) {
        super(nombre, apellido, correo, direccion);
        this.salario = salario;
        this.turno = turno;
    }

    public double getSalario() {
        return salario;
    }

    public String getTurno() {
        return turno;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "Staff{" +
                "salario=" + salario +
                ", turno='" + turno + '\'' +
                "} ";
    }
}
