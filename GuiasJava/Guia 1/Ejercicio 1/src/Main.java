public class Main {
    public static void main(String[] args) {

        // Inciso A
        Empleados empleado1 = new Empleados("Carlos","Gutierrez","23456345", 2500);

        // Inciso B
        Empleados empleado2 = new Empleados("Ana", "Sanchez", "34234123", 2750);

        // Inciso C
        System.out.println(empleado1.mostrarInfo());
        System.out.println(empleado2.mostrarInfo());

        //Inciso D
        empleado1.aumentarSalario(15);

        double salarioAnual = empleado1.SalarioAnual();
        System.out.println("El salario anual de "+ empleado1.getNombre() + " es de: " + salarioAnual);

    }
}