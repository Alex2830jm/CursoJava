import java.util.Scanner;

public class EjerciciosOperadores {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        /**System.out.println("** Valor Dentro del Rango");
        final int VALOR_INICIO = 0;
        final int VALOR_FIN = 5;
        int valor;
        System.out.print("Proporciona un número: ");
        var scanner = Integer.parseInt(new Scanner(System.in).nextLine());
        var isRango = scanner >= VALOR_INICIO && scanner <= VALOR_FIN;

        System.out.println("El valor propocionado esta dentro del rango? " + isRango);**/

        /**System.out.println("*** Sistema de Descuentos VIP ***");
        final int NO_PRODUCTOS_DESCUENTO = 10;
        int articulosComprados;
        boolean isMiembro;
        System.out.print("¿Cuantos articulos de la tiendas adquiriste? ");
        articulosComprados = Integer.parseInt(scanner.nextLine());

        System.out.print("¿Eres mienbro de de la tienda? ");
        isMiembro = Boolean.parseBoolean(scanner.nextLine());

        var resultado = articulosComprados >= NO_PRODUCTOS_DESCUENTO && isMiembro;
        System.out.println("El cliente cuenta con descuento: " + resultado);**/

       /** System.out.println("** Prestamo de Libros ***");
        final double KM_REDONDA = 3.0;
        boolean hasCredencial;
        double km;
        System.out.print("¿Cuentas con credencial de estudiante? (true/false) ");
        hasCredencial = Boolean.parseBoolean(scanner.nextLine());

        System.out.print("¿A cuantos kilometros a la redonda vives? ");
        km = Double.parseDouble(scanner.nextLine());

        var prestamoLibros = hasCredencial || km <= KM_REDONDA;
        System.out.println("Se te pueden prestar libros: "+ prestamoLibros);**/

        /**System.out.print("Proporciona un dato entero: ");
        var dato = Integer.parseInt(scanner.nextLine());

        var isDentroRango = dato >= 1 && dato <= 10;
        System.out.println("Variable dentro de rango (1 y 10): " + isDentroRango);

        //Revisar la logica inversa, si esta fuera de rango
        var isFueraRango = !(isDentroRango);
        System.out.println("Variable fuera de rango (1 y 10): " + isFueraRango);**/

        System.out.println("** Ticket de Venta **");
        System.out.print("Precio leche: ");
        var precioLeche = Double.parseDouble(scanner.nextLine());
        System.out.print("Precio pan: ");
        var precioPan = Double.parseDouble(scanner.nextLine());
        System.out.print("Precio Lechuga ");
        var precioLechuga = Double.parseDouble(scanner.nextLine());
        System.out.print("Precio platanos: ");
        var precioPlatanos = Double.parseDouble(scanner.nextLine());
        System.out.print("Aplicar algún descuento (%): ");
        var porcentajeDescuento = Integer.parseInt(scanner.nextLine());

        var subTotal = precioLeche + precioPan + precioLechuga + precioPlatanos;
        var descuento = subTotal * (porcentajeDescuento / 100.0);
        var subTotalDescuento = subTotal - descuento;
        var impuestos = subTotalDescuento * 0.16;

        var totalCompra = subTotalDescuento + impuestos;
        System.out.printf("""
                    %nTicket de Venta
                    %n -----------------
                    Subtotal: $%.2f
                    Descuento: $%.2f (%d%%)
                    Impuesto (16%%): $%.2f
                    Total: $%.2f
                """, subTotal, descuento, porcentajeDescuento, impuestos, totalCompra);
    }
}
