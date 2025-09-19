import java.util.Scanner;

public class TiendaLinea {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        final double TOTAL_COMPRA = 1000.00;
        double descuento, totalDescuento;
        String mensaje;

        System.out.print("¿Cuál fue el monto de tu compra? ");
        double montoCompra = Double.parseDouble(scanner.nextLine());
        System.out.print("¿Eres miembro de la tienda? (true/false)");
        boolean isMiembro = Boolean.parseBoolean(scanner.nextLine());

        boolean validateCompra = montoCompra >= TOTAL_COMPRA;

        if(validateCompra && isMiembro) {
            descuento = montoCompra * 0.10;
            totalDescuento = montoCompra - descuento;
            mensaje = "Felicidades, has obtenido un descuento del 10%";
        } else if(isMiembro) {
            descuento = montoCompra * 0.05;
            totalDescuento = montoCompra - descuento;
            mensaje = "Felicidades, has obtenido un descuento del 5%";
        } else {
            descuento = montoCompra * 0;
            totalDescuento = montoCompra - descuento;
            mensaje = "No has obtenido ningún descuento :(";
        }

        System.out.printf("""
                %s
                Monto de la compra: %.2f
                Monto del descuento: %.2f
                Monto final de la compra: %.2f
                """, mensaje, montoCompra, descuento, totalDescuento);
    }
}
