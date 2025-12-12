import java.util.Objects;
import java.util.Scanner;

public class Funciones {
    //Para las funciones que no retornan valores, se les coloca el void
    static void saludarDesdeJava(String mensaje) {
        //A las funciones se le asignan parametros
        System.out.println("Mensaje: " + mensaje);
    }

    //Para las funciones que retornar valor, se les coloca el tipo de valor que retornará
    static int sumar(int a, int b) {
        int resultado = a + b;
        return  resultado;
    }

    static boolean esPar(int numero) {
        /*if(numero % 2 == 0) return true;
        else return  false;*/
        return ( numero % 2 == 0 ) ? true : false;
    }

    public static void main(String[] args) {
        //Se llama la función mandando los argumentos
        //saludarDesdeJava("Hola Mundo con Funciones en Java");

        /*int arg1 = 3, arg2 = 8;
        int resultado_funcion = sumar(arg1, arg2);
        System.out.println("EL resultado de la suma con función es: " + resultado_funcion);
        resultado_funcion = sumar(30, 20);
        System.out.println("resultado_funcion = " + resultado_funcion);*/

        var scanner = new Scanner(System.in);
        System.out.print("Proporciona un número: ");
        int numero = scanner.nextInt();
        System.out.println("¿El número es par? " + esPar(numero));
    }
}
