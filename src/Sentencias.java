public class Sentencias {
    public static void main(String[] args) {

         int edad = 30;
        // Uso de la sentencia if
        /**if(edad >= 18) {
            System.out.println("Eres mayor de edad");
        }***/
        //Uso de la sentencia if else
        /**  if(edad >= 18 ) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        } **/

        //Uso de sentencua if elseif else
        if( edad >= 18 ) {
            System.out.println("Eres mayor de edad");
        } else if (edad >= 13 && edad < 18) {
            System.out.println("Eres un adolescente");
        } else {
            System.out.println("Eres un niño");
        }
    }
}
