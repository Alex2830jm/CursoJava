public class FuncionRecursiva {
    //Imprimir 1 al 5 con función recursiva
    static void functionRecursiva(int numero) {
        //Caso Base
        if(numero == 1)
            System.out.print(numero + " ");
        else {
            //Caso Recursivo
            functionRecursiva(numero - 1);
            System.out.print(numero + " ");
        }
    }

    public static void main(String[] args) {
        functionRecursiva(5);
    }
}
