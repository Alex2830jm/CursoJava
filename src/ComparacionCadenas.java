public class ComparacionCadenas {
    public static void main(String[] args) {
        //Comparación de Cadenas (pool de cadenas)
        var cadena1 = "Java";
        var cadena2 = "Java";

        var cadena3 = new String("Java"); //Esto crea un nuevo espacio de la memoria

        System.out.println("cadena1 = " + cadena1);
        System.out.println("cadena2 = " + cadena2);

        //Comparación de cadenas (==) - comparando la referencia
        System.out.print("¿Ambas cadenas son iguales? ");
        System.out.println(cadena1 == cadena2); //Compará el mismo valor del objeto en memoria,

        System.out.printf("¿La cadena 1 es igual en referencia a la cadena 3? ");
        System.out.println(cadena1 == cadena3);

        // Comparación de cadenas (equals) - contenido de cadenas (caracteres)
        System.out.printf("¿La cadena 1 es igual en contenido a la cadena 3? ");
        System.out.println(cadena1.equals(cadena3));
    }
}
