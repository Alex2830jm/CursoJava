import java.util.Scanner;

public class SistemaCalificaciones {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Calificaciones ***");
        var scanner = new Scanner(System.in);
        String calificacion;

        System.out.print("¿Cual es tu promedio escolar?: ");
        double promedio = Double.parseDouble(scanner.nextLine());


        if(promedio >= 9.0 && promedio <= 10.0) calificacion = "A";
        else if(promedio >= 8 && promedio < 9) calificacion = "B";
        else if(promedio >= 7 && promedio < 8) calificacion = "C";
        else if(promedio >= 6 && promedio < 7) calificacion = "D";
        else if(promedio >= 0 && promedio < 6) calificacion = "F";
        else calificacion = "Valor Desconocido";

        System.out.println("Tienes: " + calificacion);
    }
}
