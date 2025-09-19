import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {
        System.out.println("** Sistema Bancario **");
        var scanner = new Scanner(System.in);

        System.out.print("¿Deseas salir del sitema? (true/false) ");
        boolean salirSistema = Boolean.parseBoolean(scanner.nextLine());

        //Verificación aplicando lógica inversa
        if(!salirSistema) {
            System.out.println("Continuamos en el sistema... ");
        } else {
            System.out.println("Saliendo del sistema...");
        }
    }

}
