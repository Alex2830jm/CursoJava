import java.util.Random;
import java.util.Scanner;

public class GenerarIdUnico {
    public static void main(String[] args) {
        var scann = new Scanner(System.in);
        var random = new Random();

        //Ingreso de Datos
        System.out.print("Escribe tu nombre: ");
        var nombre = scann.nextLine();
        System.out.print("Escribe tu pellido: ");
        var apellido = scann.nextLine();
        System.out.print("Escribe tu año de nacimiento: ");
        var anioNacimiento = scann.nextLine();

        //Formato de cadenas
        var formattNombre = nombre.trim().toUpperCase().substring(0,2);
        var formattApellido = apellido.trim().toUpperCase().substring(0,2);
        var formattAnioNacimiento = anioNacimiento.trim().toUpperCase().substring(2);
        var numberRandom = random.nextInt(9999) + 1;

        System.out.printf("Su ID Unico es: %s%s%s%04d", formattNombre, formattApellido, formattAnioNacimiento, numberRandom);
    }
}
