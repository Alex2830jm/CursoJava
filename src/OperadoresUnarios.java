public class OperadoresUnarios {
    public static void main(String[] args) {
        System.out.println("*** Operadores Unarios ***");
        int a = 3, b = -2, resultado;
        var c = true;
        //Operador unario +
        resultado = +a;
        System.out.println("Unario +a: " + resultado);

        //Operadio unario -
        resultado = -a;
        System.out.println("Unario -a: " + resultado);

        //Operador unarios inc/dec
        //Pre-increment
        a = 3;
        resultado = ++a; //pre-incremento -> primerio se incrementa su valor
        System.out.println("Preincremento ++a: " + resultado);
        System.out.println("Valor de a despues del preincremento: " + a);
        //Post-increment
        a = 3;
        resultado = a++;
        System.out.println("Post-incremento: " +resultado);
        System.out.println("Valor a despues del postincremento " + a);

        //Pre-decremento
        b = -2;
        resultado = --b;
        System.out.println("Pre decremento: " + resultado);
        System.out.println("Valor de b despies del PreD: " + b);

        //Post-decremento
        b = -2;
        resultado = b--; //primero se usa el valor y despues se incrementa
        System.out.println("Resulta post-decremento: " + resultado);
        System.out.println("Valor de b despues del PostD: " + b);
    }
}
