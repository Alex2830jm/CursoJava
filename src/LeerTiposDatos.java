import java.util.Scanner;

public class LeerTiposDatos {
    public static void main(String[] args) {
        //Leer distintos tipos de datos
        var consola = new Scanner(System.in);

        //Leer datos int
        System.out.printf("Ingresa tu edad: ");
        var edad = consola.nextInt();
        System.out.println("Tu edad es: " + edad);

        //Leer datos double
        System.out.printf("Ingresa tu altura: ");
        var altura = consola.nextDouble();
        System.out.println("Tu altura es: " + altura);

        //Consumir el caracter de salto de linea
        consola.nextLine();

        //Leer datos String
        System.out.printf("Ingresa tu nombre completo: ");
        var nombreCompleto = consola.nextLine();
        System.out.println("Tu nombre completo es: " + nombreCompleto);

        //Conversión de datos
        //Tipo Int
        System.out.print("Proporciona un valor entero: ");
        var enteroString = consola.nextLine();
        var entero = Integer.parseInt(enteroString);
        System.out.println("El valor es: " + entero);

        //Tipo Floar
        System.out.print("Proporciona un valor flotante: ");
        var floatante = Float.parseFloat(consola.nextLine());
        System.out.println("Dato Tipo Flotante: " + floatante);
    }
}
