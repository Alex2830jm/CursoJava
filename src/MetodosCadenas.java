public class MetodosCadenas {
    public static void main(String[] args) {
        //Métodos de cadenas
        var cadena1 = "Hola Mundo";
        System.out.println("Primer Cadena: " + cadena1);

        //Obtener la longitud de una cadena
        var longitud = cadena1.length();
        System.out.println("longitud = " + longitud);

        //Remplazar caracteres
        var nuevaCadena = cadena1.replace("l", "1");
        System.out.println("nuevaCadena = " + nuevaCadena);

        //Convertir a mayúsculas
        var cadenaMayusculas = cadena1.toUpperCase();
        System.out.println("cadenaMayusculas = " + cadenaMayusculas);

        //Convertir a minusculas
        System.out.println("cadenaMinusculas = " + cadena1.toLowerCase());

        
        var cadena2 = " Alex Martínez        ";
        System.out.println("Segunda Cadena = " + cadena2);

        //Eliminar espacios al inicio y al final de la cadena
        System.out.println("Cadena sin espacios = " + cadena2.trim());
        
    }
}
