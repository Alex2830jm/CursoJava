import java.util.Scanner;

public class ReservaHotel {
    public static void main(String[] args) {
        System.out.println("*** Aplicación de Reserva de Hotel ***");
        var scanner = new Scanner(System.in);

        final double CUARTO_CON_VISTA_MAR = 190.50;
        final double CUARTO_SIN_VISTA_MAR = 150.50;

        System.out.print("Nombre del Cliente: ");
        String nombreCliente = scanner.nextLine();
        System.out.print("Días de estadía en el hotel: ");
        Integer diasEstadia = Integer.parseInt(scanner.nextLine());
        System.out.print("El cuarto será con vista al mar? (true/false)");
        Boolean vistaMar = Boolean.parseBoolean(scanner.nextLine());

        //var costoTotalEstadia = vistaMar ? diasEstadia * CUARTO_CON_VISTA_MAR : diasEstadia * CUARTO_SIN_VISTA_MAR;
        double costoTotalEstadia = 0.0;
        if(vistaMar) {
            costoTotalEstadia = diasEstadia * CUARTO_CON_VISTA_MAR;
        } else {
            costoTotalEstadia = diasEstadia * CUARTO_SIN_VISTA_MAR;
        }

        var habitacion = vistaMar ? "Si :D" : "No :c";
        System.out.printf("""
                %n
                ------- Detalles de la Reservacion --------
                Cliente: %s
                Días de estadía: %dn 
                Costo Total: %.2f
                Habitación con vista al mar: %s
                """, nombreCliente, diasEstadia, costoTotalEstadia, /*habitacion*/ vistaMar ? "Si :D" : "No :c");
    }
}
