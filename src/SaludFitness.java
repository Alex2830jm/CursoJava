import java.util.Scanner;

public class SaludFitness {
    public static void main(String[] args) {
        System.out.println("** Salud y Fitness **");
        var scanner = new Scanner(System.in);

        final var METAS_PASOS_DIARIO = 10000;
        final var CALORIAS_PASO = 0.04; //Kilocalorias

        System.out.print("¿Cual es tu nombre? ");
        var nombreUsuario = scanner.nextLine();
        System.out.print("¿Cuantos pasos has caminado hoy? ");
        var pasosCamidados = Integer.parseInt(scanner.nextLine());

        var metaAlcanzada = pasosCamidados >= METAS_PASOS_DIARIO ? "Si :D" : "Nooooooo :(";

        var caloriasQuemadas = pasosCamidados * CALORIAS_PASO;

        System.out.printf("""
                %n Usuario: %s
                Pasos caminados: %d,
                Calorias Quedamas: %.2f kcal
                Meta de pasos diarios alzanda: %s
                ---------------------------------
                La meta de pasos diarios es de: %d
                """, nombreUsuario, pasosCamidados, caloriasQuemadas, metaAlcanzada, METAS_PASOS_DIARIO);
    }
}
