public class Main {
    public static void main(String[] args) {

    //Cliente sofia
    Cliente Sofia = new Cliente("Sofia", "soflor51402" + "@gmail.com", 50);

    System.out.println(Sofia);

    //Factura de sofia
    Factura fac = new Factura(2500, Sofia);

    System.out.println("Monto total: " + fac.calcularDescuento());
    System.out.println(fac);


    }
}