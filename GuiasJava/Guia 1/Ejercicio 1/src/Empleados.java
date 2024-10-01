public class Empleados {
    private String nombre;
    private String apellido;
    private String dni;
    private double salario;

    public Empleados(String nombre, String apellido, String dni, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.salario = salario;
    }

    public String getNombre() {return nombre; }
    public void setNombre(String nombre) {this.nombre = nombre; }

    public String getApellido() {return apellido; }
    public void setApellido(String apellido) {this.apellido = apellido; }

    public String getDni() {return dni; }
    public void setDni(String dni) {this.dni = dni; }

    public double getSalario() {return salario; }
    public void setSalario(double salario) {this.salario = salario; }

    public double SalarioAnual()  { return salario * 12; }

    public String aumentarSalario(double porcentaje){
        String mensaje;

        if(porcentaje > 0){
            salario += salario * (porcentaje / 100);
            mensaje = "salario actualizado correctamente.";
        }else {
            mensaje = "El porcentaje debe ser mayor a 0.";
        }
        return mensaje;
    }

    public String mostrarInfo(){
        return "Empleado{"+
                "nombre='"+ nombre + '\'' +
                ", apellido='"+ apellido + '\'' +
                ", dni= '"+ dni + '\'' +
                ", salario=" + salario +
                '}';
    }

}