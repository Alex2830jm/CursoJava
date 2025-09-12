public class IndicesCadena {
    public static void main(String[] args) {
        System.out.println("Manejo de Indices en una cadena");
        var cadena1 = "Hola Mundo";
        System.out.println("cadena1 = " + cadena1);
     
        //Recuperar caracteres
        var primerCaracter = cadena1.charAt(0);
        System.out.println("primerCaracter = " + primerCaracter);
        
        var caracter = cadena1.charAt(5);
        System.out.println("caracter = " + caracter);
    }
}
