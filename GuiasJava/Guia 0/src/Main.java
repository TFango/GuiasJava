import javax.sound.midi.Soundbank;
import javax.swing.plaf.synth.SynthTextAreaUI;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /**
         * ---------------------------------------------------------------------
         * Inicio
         * Ejercicio 1
         */

        /*
        int numN=5;
        double numA = 10.50;
        char numC = 'c';

        System.out.println("El numero entero ingresado es: "+ numN);
        System.out.println("El numero decimal ingresado es: "+ numA);
        System.out.println("El caracter ingresado es: "+ numC);

        double suma = numN + numA;

        System.out.println("La suma de los numero es: "+ suma);

        double resta = numA - numN;

        System.out.println("La resta de los numeros es: "+ resta);

        int cr = numC;

        System.out.println("El valor numero del caracter es: "+ cr);
        */


        /**
         * ---------------------------------------------------------------------
         * Inicio
         * Ejercicio 2
         */

        /*
        int numX= 25;
        int numY= 30;
        double numM = 20.50;
        double numN= 15.15;

        int sumaYX= numY + numX;
        double restaMN= numM - numN;

        System.out.println("La suma entre Y y X es: " + sumaYX);
        System.out.println("La resta entre m y n es: "+ restaMN);
        */


        /**
         * ---------------------------------------------------------------------
         * Inicio
         * Ejercicio 3
         */

        /*
        int numero;
        System.out.println("INgrese un valor para el numN: ");
        numero= sc.nextInt();
        sc.nextLine();

        numero= numero + 77;
        System.out.println("Numero incrementando 77= "+ numero);
        int numaux= numero - 3;
        numero= numero - numaux;
        System.out.println("Numero disminuido a 3: " + numero);
        numero = numero * 2;
        System.out.println("Numero multiplicado por 2:"+ numero);
         */


        /**
         * ---------------------------------------------------------------------
         * Inicio
         * Ejercicio 4
         */

        /*
        int A = 1;
        int B = 2;
        int C = 3;
        int D = 4;

        System.out.println("Valores Originales...");
        System.out.println("A= " + A);
        System.out.println("B= "+ B);
        System.out.println("C= "+ C);
        System.out.println("D= "+ D);

        int aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;

        System.out.println("Valores despues del cambio...");
        System.out.println("A= "+ A);
        System.out.println("B= "+ B);
        System.out.println("C= "+ C);
        System.out.println("D= "+ D);
         */


        /**
         * ---------------------------------------------------------------------
         * Inicio
         * Ejercicio 5
         */


        /*
        System.out.println("Ingrese un numero entero: ");
        int A =sc.nextInt();
        sc.nextLine();

        if(A % 2 == 0){
            System.out.println("El numero ingresado es par");
        }else{
            System.out.println("El numero ingresado es impar");
        }
         */


        /**
         * ---------------------------------------------------------------------
         * Inicio
         * Ejercicio 6
         */

        /*
        System.out.println("Ingrese un valor: ");
        int numero6= sc.nextInt();
        sc.nextLine();

        if(numero6 > 0){
            System.out.println("EL numero es positivo");
        }
        else if(numero6<0) {
            System.out.println("EL numero es negativo");
        }
        else{
            System.out.println("El numero es 0");
        }

         */


        /**
         * ---------------------------------------------------------------------
         * Inicio
         * Ejercicio 7
         */


        /*
        System.out.println("Ingrese una palabra: ");
        char caracter = sc.next().charAt(0);
        int ascii = caracter;

        System.out.println("El primer caracter de la palabra ingresa es: "+ ascii);

         */


        /**
         * ---------------------------------------------------------------------
         * Inicio
         * Ejercicio 8
         */


        /*
        System.out.println("Ingrese un valor: ");
        int C= sc.nextInt();
        sc.nextLine();

        if(C>0){
            System.out.println("EL numero es positivo");
        }
        else{
            System.out.println("EL numero es negativo");
        }

        if(C % 2 == 0){
            System.out.println("EL numero es par");
        }
        else{
            System.out.println("EL numero es impar");
        }

        if(C % 5 == 0){
            System.out.println("EL numero es multiplo de 5");
        }
        else{
            System.out.println("EL numero no es multiplo de 5");
        }
        if(C % 10 == 0){
            System.out.println("EL numero es multiplo de 10");
        }
        else{
            System.out.println("EL numero no es multiplo de 10");
        }

        if(C > 100){
            System.out.println("EL numero es mayor a 100");
        }
        else if(C<100){
            System.out.println("EL numero es menor que 100");
        }
        else{
            System.out.println("El numero es igual a 100");
        }
         */


        /**
         * ---------------------------------------------------------------------
         * Inicio
         * Ejercicio 9
         */

        /*
        System.out.printf("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Buenos dias," + nombre);
         */


        /**
         * ---------------------------------------------------------------------
         * Inicio
         * Ejercicio 14
         */


        /*
        int numero;

        do{
            System.out.println("Ingrese un numero de 3 digitos: ");
            numero = sc.nextInt();
        }while (numero < 100 || numero > 999);

        int centenas= numero / 100;
        int decenas= (numero % 100) / 10;
        int unidades= numero % 10;

        System.out.println("Centenas: "+ centenas);
        System.out.println("Decenas: "+ decenas);
        System.out.println("Unidades: "+ unidades);
         */


        /**
         * ---------------------------------------------------------------------
         * Inicio
         * Ejercicio 15
         */

        /*
        int numero;

        do{
            System.out.println("Digite um numero de 5 caracteres: ");
            numero = sc.nextInt();
        }while(numero < 10000|| numero > 99999);

        int cifra1 = numero / 10000;          // Primera cifra (posición 1)
        int cifra2 = (numero / 1000) % 10;    // Segunda cifra (posición 2)
        int cifra3 = (numero / 100) % 10;     // Tercera cifra (posición 3)
        int cifra4 = (numero / 10) % 10;      // Cuarta cifra (posición 4)
        int cifra5 = numero % 10;

        System.out.println("Cifra en la posición 1: " + cifra1);
        System.out.println("Cifra en la posición 3: " + cifra3);
        System.out.println("Cifra en la posición 5: " + cifra5);
         */


        /**
         * ---------------------------------------------------------------------
         * Inicio
         * Ejercicio 16
         */


        /*
        System.out.println("Ingrese un valor para una hora: ");
        int H = sc.nextInt();
        sc.nextLine();
        if (0 < H && H < 25) {
            System.out.println("Ingrese un valor para los minutos");
            int M = sc.nextInt();
            sc.nextLine();
            if (-1 < M && M < 61) {
                System.out.println("Ingrese un valor para los segundos: ");
                int S = sc.nextInt();
                sc.nextLine();
                if (-1 < S && S < 61) {
                    System.out.printf("Los valores ingresados son correctos");
                } else {
                    System.out.printf("Los segundos no son validos");
                }
            } else {
                System.out.println("Los minutos no son validos");
            }
        } else {
            System.out.printf("La hora no es valida");
        }
         */


        /**
         * ---------------------------------------------------------------------
         * Inicio
         * Ejercicio 17
         */


        /*
        double salario;
        double salario2;

        System.out.println("Ingrese se nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Ingrese la edad: ");
        int edad = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingrese el salario: ");
        salario = sc.nextDouble();
        sc.nextLine();


        if(edad < 16){
            System.out.println("No tiene edad para trabajar");
        }

        if(18>=edad && edad<=50)
        {
            salario2 = salario * 0.5;
            salario = salario + salario2;
            System.out.println("El nuevo salario es: "+ salario);
        } else if (50>edad && edad<61) {

            salario2 = salario * 0.10;
            salario = salario + salario2;
            System.out.println("El nuevo salario es: "+ salario);
        }else{
            salario2 = salario * 0.15;
            salario = salario + salario2;
            System.out.println("El nuevo salario es: "+ salario);
        }
         */


        /**
         * ---------------------------------------------------------------------
         * Inicio
         * Ejercicio 18
         */

        /*
        String categoria;

        System.out.println("Ingrese su altura: ");
        double altura = sc.nextDouble();
        System.out.println("Ingrese su peso: ");
        double peso = sc.nextDouble();

        double imc = peso / (altura * altura);

        if (imc < 18.5) {
            categoria = "bajo peso";
        } else if (imc < 24.9) {
            categoria = "normal (saludable)";
        } else if (imc < 29.9) {
            categoria = "sobrepeso";
        } else {
            categoria = "obesidad";
        }

        System.out.printf("Tu índice de masa corporal (IMC) es: %.2f%n", imc);
        System.out.println("Categoría: " + categoria);
         */


        /**
         * ---------------------------------------------------------------------
         * Inicio
         * Ejercicio 19
         */

        int suma = 0;

        System.out.println("Ingrese el tamaño del arreglo: ");
        int tam = sc.nextInt();

        int[] numeros = new int[tam];

        System.out.println("Ingrese los numeros en el arreglo: ");
        for (int i = 0; i < tam; i++){
            System.out.println("Numero "+(i+1)+": ");
            numeros[i] = sc.nextInt();
            suma += numeros[i];
        }

        double promedio = (double) suma / tam;
        System.out.printf("El promedio de los numeros ingresados en el arreglos es: %.2f%n", promedio);




    }
}
