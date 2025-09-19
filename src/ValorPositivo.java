import java.util.Scanner;

public class ValorPositivo {
    public static void main(String[] args) {
        System.out.println("** Valor Positivo **");
        var scanner = new Scanner(System.in);

        System.out.print("Proporciona un numero: ");
        int numero = Integer.parseInt(scanner.nextLine());

        if(numero > 0) {
            System.out.printf("El número %d es positivo", numero);
        } else if (numero < 0) {
            System.out.printf("El número %d es negativo", numero);
        } else {
            System.out.printf("El número %d es 0", numero);
        }
    }
}
