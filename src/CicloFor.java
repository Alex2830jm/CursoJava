public class CicloFor {
    public static void main(String[] args) {
        System.out.println("*** Ciclo For *** ");
        /*for(int i = 0; i <= 20; i++){
            if(i %2 == 0)
                System.out.print(i + " ");
        }*/
        int suma = 0;
        for(int i = 1; i <= 5; i++) {
            System.out.printf("Acomulador de Suma: %d + %d \n", suma, i);
            suma += i;
            System.out.println("Suma: " +  suma);
        }
    }
}
