public class OperadoresAsignacion {
    public static void main(String[] args) {
        System.out.println("*** Operadores de Asignacion ***");
        //Asignacion Simple (=)
        var miNumero = 10;
        System.out.println("miNumero = " + miNumero);

        int miNumero2;
        miNumero2 = 15;

        //Asignacio +=
        miNumero += 5; // miNumero = miNumero + 5;
        System.out.println("miNumero += " + miNumero);

        //Asignacion -=, *=, /=, %=
        miNumero *= 2; // miNumero = miNumero * 2
        System.out.println("miNumero *= " + miNumero);


        // Asignacion de variables multiples
        //Se pueden declarar variables una misma linea,
        //pero todas las varibles tienen que se de un mismo tipo
        int a = 10, b = 15, c = 20;
        System.out.printf("a = %d, b = %d, c = %d", a, b, c);
    }
}
