import java.util.Scanner;

public class SistemaEnvios {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Envíos ***");
        var scanner = new Scanner(System.in);

        final var COSTO_TARIFA_NACIONAL = 10.0;
        final var COSTO_TARIFA_INTERNACIONAL = 20.0;
        String tipoEnvio;
        double pesoEnvio;
        double costoEnvio;

        System.out.print("¿Qué tipo de envio será? (nacional/internacional): ");
        tipoEnvio = scanner.nextLine().strip().toLowerCase();
        System.out.print("¿Cuanto pesa el paquete?: ");
        pesoEnvio = Double.parseDouble(scanner.nextLine());

        switch (tipoEnvio) {
            case "nacional":
                costoEnvio = pesoEnvio * COSTO_TARIFA_NACIONAL;
                System.out.printf("El costo del envío %s será de %.2f", tipoEnvio, costoEnvio);
                break;
            case "internacional":
                costoEnvio = pesoEnvio * COSTO_TARIFA_INTERNACIONAL;
                System.out.printf("El costo del envío %s será de %.2f", tipoEnvio, costoEnvio);
                break;
            default:
                System.out.println("Opción de envio no valida");
        }
    }
}
