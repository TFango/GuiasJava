public class Main {
    public static void main(String[] args) {

        Autobus autobus = new Autobus(511, 60);
        Tranvia tranvia = new Tranvia("Wilde 1529", 50);
        Bicicleta bicicleta = new Bicicleta("3424");

        System.out.println("===Prueba autobus===");
        System.out.println("Tipo de transporte: " + autobus.getTipo());
        autobus.arrancar();
        System.out.println("Capacidad: " + autobus.obtenerCapacidad());
        autobus.anunciarParada("Plaza Central");
        autobus.detener();

        System.out.println("---------------------");

        System.out.println("===Tranvia===");
        System.out.println("Tipo de transporte: " + tranvia.getTipo());
        tranvia.arrancar();
        System.out.println("Capacidad: " + tranvia.obtenerCapacidad());
        tranvia.cambiarVia(2);
        tranvia.detener();

        System.out.println("---------------------");

        System.out.println("===Bicicleta===");
        System.out.println("Tipo de transporte: " + bicicleta.getTipo());
        bicicleta.arrancar();
        System.out.println("Capacidad: " + bicicleta.obtenerCapacidad());
        bicicleta.ajustarAsiento(5);
        bicicleta.detener();




    }
}