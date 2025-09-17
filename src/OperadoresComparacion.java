public class OperadoresComparacion {
    public static void main(String [] args) {
        System.out.println("*** Operadores de Comparación ***");
        int a = 3, b = 3;
        
        //==
        var resultado = a == b;
        System.out.println("A == B: " + resultado);
        
        //!=
        resultado = a != b;
        System.out.println("A != B: " + resultado);

        //>
        resultado = a > b;
        System.out.println("A > B: " + resultado);

        //>=
        resultado = a >= b;
        System.out.println("A >= B: " + resultado);

        // <
        resultado = a < b;
        System.out.println("A < B: " + resultado);

        // <=
        resultado = a <= b;
        System.out.println("A <= B: " + resultado);
    }
}
