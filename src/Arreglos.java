import java.util.Scanner;

public class Arreglos {
    public static void main(String[] args) {
        System.out.println("*** Arreglos ***");

        /*//Declaración del arreglo
        int[] enteros;
        // Inicialización de un arreglo
        enteros = new int[5];
        enteros[0] = 15;
        enteros[2] = 14;
        enteros[4] = 3;

        // Declaración e inicialización de un arreglo
        int[] numeros = new int[5];
        numeros[0] = 15;
        numeros[2] = 14;
        numeros[4] = 3;

        //Declaración y asignación de valores
        int[] values = {15, 20, 14, 89, 3};*/


        //Imprimir valores del arreglo uno por uno
        /*System.out.println("Valor 1: " + values[0]);
        System.out.println("Valor 3: " + values[2]);
        System.out.println("Valor 5: " + values[4]);*/

        //Imprimir valores del arreglo con ciclo
        /*for (int i = 0; i < values.length; i++) {
            //System.out.printf("Valor %d: %d%n", i, values[i]);
            System.out.println("Valor " + i + ": " + values[i]);
        }*/

        /*int i = 0;
        while(i < values.length) {
            System.out.printf("Valor %d: %d%n", i + 1, values[i]);
            i++;
        }*/

        /*//Introducir valores a un arreglo
        var scanner = new Scanner(System.in);
        System.out.print("Proporciona el largo del arreglo: ");
        //int largoArreglo = Integer.parseInt(scanner.nextLine());
        int largoArreglo = scanner.nextInt();
        int[] enteros = new int[largoArreglo];
        for (int i = 0; i < enteros.length; i++) {
            System.out.print("Proporciona entero[" + i + "]: ");
            enteros[i] = scanner.nextInt();
        }

        for (int i = 0; i < enteros.length; i++)
            System.out.printf("El valor de enteros[%d] es: %d%n", i + 1, enteros[i]);

        */
        System.out.println("*** Promedio de Calificaciones ***");
        var scanner = new Scanner(System.in);
        System.out.print("¿Cuantas calificaciones deseas agregar? ");
        int totalCalificaciones = scanner.nextInt();
        int[] calificaciones = new int[totalCalificaciones];
        int sumaCalificacion = 0;

        for(int m = 0; m < calificaciones.length; m++) {
            System.out.print("Calificacion No. [" + m + "]: ");
            calificaciones[m] = scanner.nextInt();
            sumaCalificacion += calificaciones[m];
        }

        int promedio = sumaCalificacion / totalCalificaciones;
        System.out.println("\nEl promedio de calificaciones es: " + promedio);


    }
}
