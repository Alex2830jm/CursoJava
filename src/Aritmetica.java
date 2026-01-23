public class Aritmetica {
    int operando1;
    int operando2;

    //Constructores
    public Aritmetica(int op1, int op2){
        System.out.println("Ejecutando constructor");
        operando1 = op1;
        operando2 = op2;
    }

    void sumar() {
        int resultado = operando1 + operando2;
        System.out.println("Resultado suma: " + resultado);
    }

    void restar() {
        int resultado = operando1 - operando2;
        System.out.println("Resultado resta: " + resultado);
    }

    public static void main(String[] args) {
        System.out.println("*** Ejemplo Aritmetica ***");
        var arit1 = new Aritmetica(5,7);
        //arit1.operando1 = 200;
        //arit1.operando2 = 100;
        arit1.sumar();
        arit1.restar();
    }
}
