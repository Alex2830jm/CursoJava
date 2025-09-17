public class OperadoresLogicos {
    public static void main(String[] args) {
        System.out.println("*** Operadores Logicos *** ");
        boolean a = true, b = false;
        //and (regresa true si ambos valores son true)
        var resultado = a && b;
        System.out.println("AND (&&): " + resultado);

        //or (regresa true si alguno de los valores es true)
        resultado = a || b;
        System.out.println("OR (||): " + resultado);

        //NOT ! (invierte el valor logico )
        resultado = !a;
        System.out.println("NOT (!): " + resultado);

    }
}
