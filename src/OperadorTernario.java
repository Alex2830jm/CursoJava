public class OperadorTernario {
    public static void main(String[] args) {
        System.out.println("*** Operador Ternario ***");
        // Sintaxis
        // condicion ? exp1 : exp2;

        //Determinar si un número es par o no
        var numero = 4;
        var  resultado = (numero % 2 == 0) ? "Par" : "Impar";

        System.out.println("El número " + numero + " es " + resultado);

        //Calcular si es mayor de edad
        var edad = 20;
        var mensaje = (edad >= 18) ? "Eres Mayor de Edad" : "Eres menor de edad";
        System.out.println("\nTienes " + edad + ", " + mensaje);

        //Valor positivo, negativo o cero (operador ternario anidad)
        numero = 0;
        resultado = (numero > 0) ? "Positivo" : (numero < 0) ? "Negativo" : "Zero Miedo";
        System.out.println("\n El número " + numero + " es " + resultado);
    }
}
