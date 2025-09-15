import java.util.Scanner;

public class ManejoConsola {
    public static void main(String[] args) {
        //Introducir valores por consola
        var consola = new Scanner(System.in); // in (input) - entrada de datos
        System.out.println("*** Ingresa tus datos personales ***");

        System.out.print("Nombre Completo: ");
        var nombreCompleto = consola.nextLine();

        System.out.println("Edad: ");
        var edad = consola.nextLine();

        System.out.println("Tu nombre es: " + nombreCompleto);
        System.out.println("Tu edad es: " + edad);


    }
}
