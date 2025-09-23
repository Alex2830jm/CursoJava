import java.util.Scanner;

public class MayorNumeros {
    public static void main(String[] args) {
        System.out.println("*** El mayor de dos números ***");
        var scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        Double primeNumero = Double.parseDouble(scanner.nextLine());
        System.out.print("El el segundo número ");
        Double segundoNumero = Double.parseDouble(scanner.nextLine());

        var numeroMayor = primeNumero > segundoNumero ? primeNumero : segundoNumero;

        System.out.printf("El número mayor es: %.2f", numeroMayor);
    }
}
