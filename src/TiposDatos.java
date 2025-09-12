public class TiposDatos {
    public static void main(String[] args) {
        //Tipos de Datos
        //Enteros
        // El valor por default de los datos tipos enteros es 0
        byte typoByte = 127;
        System.out.println("typoByte = " + typoByte);
        short tipoShort = 32000;
        System.out.println("tipoShort = " + tipoShort);
        int tipoInt = 2147483647;
        System.out.println("tipoInt = " + tipoInt);
        long tipoLong = 987654321098765432L; // L o l para indicar variable de tipo long
        System.out.println("tipoLong = " + tipoLong);

        //Punto Flotante
        // El valor por default es de 0.0
        float tipoFloat = 3.14F; // F o F para indicar variable de tipo float
        System.out.println("tipoFloat = " + tipoFloat);
        double tipoDouble = 3.1315D; // D o d para inficar vairable de tipo double (opcional)
        System.out.println("tipoDouble = " + tipoDouble);
        
        //Caracter
        // El valor por default es ('\u0000')
        char tipoChar = 'A'; // Caracteres del juego unicode
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = 77;
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = '@';
        System.out.println("tipoChar = " + tipoChar);

        //Boolano
        // el valor por default es falso
        boolean tipoBoolean = true;
        System.out.println("tipoBoolean = " + tipoBoolean);
        tipoBoolean = false;
        System.out.println("tipoBoolean = " + tipoBoolean);
    }
}
