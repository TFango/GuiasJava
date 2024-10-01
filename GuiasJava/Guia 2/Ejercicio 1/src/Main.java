import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        int contadorEmpleados = 0;
        Empleado[] empleados = new Empleado[10];

        do{
            System.out.println("-----MENU------");
            System.out.println("Seleccione una opcion: ");
            System.out.println("1. Agregar empleado a tiempo completo.");
            System.out.println("2. Agregar empleado por horas.");
            System.out.println("3. Agregar empleado contratista.");
            System.out.println("4. Calcular pago.");
            System.out.println("5. Salir.");
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    if(contadorEmpleados < empleados.length){
                        System.out.println("Ingrese nombre: ");
                        String nombreTC = sc.next();
                        System.out.printf("Ingrese salario mensual: ");
                        double salarioTC = sc.nextDouble();
                        empleados[contadorEmpleados] = new EmpleadoTiempoCompleto(nombreTC, salarioTC);
                        contadorEmpleados++;
                    }else {
                        System.out.println("No se pueden agregar mas empleados.");
                    }
                    break;
                    case 2:
                        if(contadorEmpleados < empleados.length){
                            System.out.println("Ingrese nombre: ");
                            String nombrePH = sc.next();
                            System.out.println("Ingrese tarifa por hora: ");
                            double tarifaPH = sc.nextDouble();
                            System.out.println("Ingrese horas trabajadas: ");
                            int horasPH = sc.nextInt();
                            empleados[contadorEmpleados] = new EmpleadoPorHoras(nombrePH, tarifaPH, horasPH);
                            contadorEmpleados++;
                        }else{
                            System.out.println("No se pueden agregar mas empleados.");
                        }
                        break;
                        case 3:
                            if(contadorEmpleados < empleados.length){
                                System.out.println("Ingrese nombre: ");
                                String nombreC = sc.next();
                                System.out.println("Ingrese tarifa por proyecto: ");
                                double tarifaC = sc.nextDouble();
                                System.out.println("Ingrese horas trabajadas: ");
                                int horasC = sc.nextInt();
                                empleados[contadorEmpleados] = new EmpleadoContratista(nombreC, tarifaC, horasC);
                                contadorEmpleados++;
                            }else {
                                System.out.println("No se pueden agregar mas empleados.");
                            }
                            break;
                            case 4:
                                for(int i = 0; i < contadorEmpleados; i++){
                                    System.out.println("Empleado: " + empleados[i].getNombre() + " - Pago: $" + empleados[i].calcularPago());
                                }
                                break;
                                case 5:
                                    System.out.println("Saliendo...");
                                    break;
                                    default:
                                        System.out.println("Opcion no valida.");
                                        break;


            }
        }while(opcion != 5);



    }
}