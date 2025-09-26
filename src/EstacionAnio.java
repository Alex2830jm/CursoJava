import java.util.Scanner;

public class EstacionAnio {
    public static void main(String[] args){
        System.out.println("*** Estación del a{o ***");
        var scaner = new Scanner(System.in);

        System.out.print("Ingresa el valor númerico del mes: ");
        Integer mes = Integer.parseInt(scaner.nextLine());

        String estacionAnio;
        //Identificacion con if
        /*if(mes == 1 || mes == 2 || mes == 12) {
            estacionAnio = "Invierno";
        } else if (mes == 3 || mes == 4 || mes <= 5) {
            estacionAnio = "Primavera";
        } else if (mes == 6 || mes == 7 || mes <= 8) {
            estacionAnio = "Verano";
        } else if (mes == 9 || mes == 10 || mes <= 11) {
            estacionAnio = "Otoño";
        } else {
            estacionAnio = "Estación Desconocida";
        }*/

        //Identificacion con switch mejorado
        estacionAnio = switch (mes) {
            case 1, 2, 12 -> "Invierno";
            case 3, 4, 5 -> "Primavera";
            case 6, 7, 8 -> "Verano";
            case 9, 10, 11 -> "Otoño";
            default -> "Estación Desconocida";
        };

        System.out.println("La estación correspondiente es: " + estacionAnio);
    }
}
