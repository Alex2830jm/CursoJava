public class CaracteresEspeciales {
    public static void main(String[] args) {
        //Catacteres Especiales
        var cadena1 = "Hola Mundo";
        System.out.println("cadena1 = " + cadena1);

        //\n Imprime un salto de linea
        cadena1 = "Hola\nMundo";
        System.out.println("cadena1 = " + cadena1);

        //\t - Tabulador
        cadena1 = "\tHola\tMundo";
        System.out.println("cadena1 = " + cadena1);

        //\' agrega una comilla simple
        cadena1 = "Hola \' Mundo";
        System.out.println("cadena1 = " + cadena1);


        //\" - Agrega una comilla doble
        cadena1 = "Hola \" Mundo";
        System.out.println("cadena1 = " + cadena1);
        
        //\\ - Agrega un diagonal inversa
        cadena1 = "Hola \\ mundo";
        System.out.println("cadena1 = " + cadena1);
    }
}
