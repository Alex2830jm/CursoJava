import java.util.Scanner;

public class CasaEspejos {
    public static void main(String[] args) {
        System.out.println("** Casa de los Espejos **");
        var scanner = new Scanner(System.in);
        System.out.print("¿Cuál es tu edad? ");
        int edad = Integer.parseInt(scanner.nextLine());
        System.out.print("¿Tienes miedo a la osucuridad? (true/false) ");
        boolean tienesMiedo = Boolean.parseBoolean(scanner.nextLine());

        if(edad >= 10 && !tienesMiedo) {
            System.out.println("Bienvenido a la casa de los espejos");
        } else {
            System.out.println("No puedes ingresar a la casa de los espejos");
        }
    }
}
