public class Main {
    public static void main(String[] args) {

        Persona[] personas = new Persona[8];

        //1er Estudiante
        Estudiante estu1 = new Estudiante("Sofia", "Flores", "soflor51402" + "@gmail.com", "Olavarria 2268", 2024, 58000, "Programacion");

        //2do Estudiante
        Estudiante estu2 = new Estudiante("Emanuel", "Bustos", "fakuj305" + "@gmail.com", "Wilde 1529", 2023, 58000, "Programacion");

        //3er Estudiante
        Estudiante estu3 = new Estudiante("Mariano", "Jimenez", "marJim" + "@gmail.com", "Santigo del Estero 2433", 2022, 56000, "Programacion");

        //4do Estudiante
        Estudiante estu4 = new Estudiante("Marcos", "Bustos", "busmar" + "@gmail.com", "Marcos Peña 3234", 2021, 40000, "Letras");


        //1er Staff
        Staff miembro1 = new Staff("Ana", "Gomez", "anGom" + "@gmail.com", "La Roca", 7, "Noche");

        //2do Staff
        Staff miembro2 = new Staff("Luis", "Martinez", "luMar" + "@gmail.com", "Sarate 2331", 24000, "Mañana");

        //3er Staff
        Staff miembro3 = new Staff("Maria", "Rodriguez", "maRo" + "@gmail.com", "Dalte Miro", 2341, "Noche");

        //4do Staff
        Staff miembro4 = new Staff("Juan", "Perez", "juPer" + "@gmail.com", "La Peñaa", 21555, "Noche");

        personas[0] = estu1;
        personas[1] = estu2;
        personas[2] = estu3;
        personas[3] = estu4;
        personas[3] = miembro1;
        personas[4] = miembro2;
        personas[5] = miembro3;
        personas[6] = miembro4;

        for(Persona persona : personas) {
            System.out.println(persona);
            System.out.println();
        }


        double totalIngresos=0;

        for(int i=0; i<personas.length; i++) {
            totalIngresos = estu1.getCuota() + estu2.getCuota() + estu3.getCuota() + estu4.getCuota();
        }

        System.out.println("El total de los ingresos de los estudiantes es: " + totalIngresos);









    }
}