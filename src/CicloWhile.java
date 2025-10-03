import java.sql.SQLOutput;

public class CicloWhile {
    public static void main(String[] args) {
        System.out.println("*** Ciclo While ***");
        /*int i = 1;
        while(i <= 5) {
            System.out.println("Número: " + i++);
        }

        System.out.println("** Números pares del 1 al 20 **");
        while(i <= 20){
            if (i%2 == 0)  System.out.print(i + " ");

            i++;
        }*/

        System.out.println("** Suma acumulativa **");
        final int MAXIMO = 5;
        int suma = 0;
        int i = 1;
        while(i <= MAXIMO) {
            //Suma acumulativa
            //suma = suma + i;
            System.out.printf("Acumulador suma: %d + %d  \n", suma, i);
            suma += i;
            System.out.println("Suma: " + suma);
            i++;
        }

        System.out.printf("La suma de los primeros %d números es %d", MAXIMO, suma);
    }

}
