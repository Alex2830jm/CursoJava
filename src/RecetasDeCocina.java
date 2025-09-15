import java.util.Scanner;

public class RecetasDeCocina {
    public static void main(String[] args) {
        System.out.println("*** Recetas de Concina");
        var scann = new Scanner(System.in);

        System.out.print("Ingresa el nombre del platillo: ");
        var nombrePlatillo = scann.nextLine();

        System.out.print("Ingresa los ingredientes a ocupar: ");
        var ingredientes = scann.nextLine();

        System.out.print("Ingresa el tiempo de preparación (min): ");
        var tiempoPreparacion = Integer.parseInt(scann.nextLine());

        System.out.print("Ingresa la dificultad de preparación: ");
        var dificultaPreparacion = scann.nextLine();


        System.out.println("-- Receta De Cocina --");
        System.out.println("Nombre del platillo: " + nombrePlatillo);
        System.out.println("Ingredientes a ocupar: " + ingredientes);
        System.out.println("Tiempo de preparación: " + tiempoPreparacion + " min.");
        System.out.println("Dificultad de preparacón: " + dificultaPreparacion);
    }
}
