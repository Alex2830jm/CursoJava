public class CicloDoWhile {
    public static void main(String[] args) {
        System.out.println("** Ciclo Do While **");
        int i = 1;
        /*do {
            System.out.println(i++);
        } while (i <= 3);*/

        /*System.out.println("*** Números Inversos ***");
        i = 10;
        do {
            System.out.println(i--);
        } while (i > 0);*/

        /*i = 0;
        do {
            if(i%2 != 0)
                System.out.print(i + " ");
            i++;
        } while (i <= 20);*/

        System.out.println("** Suma Acumulativa **");
        final int MAXIMO = 5;
        int suma = 0;
        do {
            System.out.printf("Acomulador de suma: %d + %d \n", suma, i);
            suma += i;
            System.out.println("Suma: " + suma);
            i++;
        } while (i <= MAXIMO);
    }
}
