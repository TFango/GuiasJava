import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion=0;
        itemVenta item = null;

        do{
            System.out.println("-----MENU-----");
            System.out.println("Seleccione una opcion a realizar: ");
            System.out.println("1. Agregar un item a la venta.");
            System.out.println("2. Imprimer el objeto a la venta.");
            System.out.println("3. Actualizar la cantidad del objeto a la venta.");
            System.out.println("4. Actualizar precio unitario del objeto a la venta.");
            System.out.println("5. Imprimir precio total del objeto.");
            opcion=sc.nextInt();
            sc.nextLine();

            switch (opcion)
            {
                case 1:
                    System.out.println("Ingrese el identificador: ");
                    int identificador = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingrese la descripcion: ");
                    String descripcion= sc.nextLine();

                    System.out.println("Ingrese la cantidad del nuevo producto: ");
                    int cantidad= sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingrese el valor unitario del producto: ");
                    double pUnitario = sc.nextDouble();
                    sc.nextLine();
                    item = new itemVenta(identificador,descripcion,cantidad,pUnitario);
                    break;
                case 2:
                    if (item != null) {
                        System.out.println(item);
                    } else {
                        System.out.println("No se ha creado ningún ítem.");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese la nueva cantidad del producto");
                    int nuevaCantidad = sc.nextInt();
                    sc.nextLine();
                    cantidad = nuevaCantidad;
                    System.out.println("La nueva cantidad del prodcuto es: "+ cantidad);
                    break;
                case 4:
                    System.out.println("Ingrese el nuevo precio unitario");
                    double nuevoPUnitario = sc.nextDouble();
                    sc.nextLine();
                    pUnitario = nuevoPUnitario;
                    System.out.println("El nuevo precio unitario es: "+ pUnitario);
                    break;
                case 5:
                    double preciototal= item.calcularPrecioTotal();
                    System.out.println("Precio total: " + preciototal);
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("ERROR: Opcion no valida.");
                    break;

            }

        }while (opcion!=6);

    }
}