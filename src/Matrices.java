import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
        System.out.println("*** Matrices ***");
        //Manera de uso de las matrices
        //1.- Declaramos la matriz con la longitud de filas y columnas que contendra
        /* int RENGLONES = 2;
        final int COLUMNAS = 3;
        int[][] matriz = new int[RENGLONES][COLUMNAS];

        //2.-Asignamos los valor a la matriz
        matriz[0][0] = 100;
        matriz[0][1] = 200;
        matriz[0][2] = 300;

        matriz[1][0] = 400;
        matriz[1][1] = 500;
        matriz[1][2] = 600;

        //3.- Se muestran los valores
        for(int i = 0; i < RENGLONES; i++) { //Recorrer Renglones
            for(int j = 0; j < COLUMNAS; j++) { //Recorer Columnas
                System.out.println("Valor [" + i + "]["+ j + "] = " + matriz[i][j]);
            }
        }*/

        //Sintaxis simplificada para el uso de matriz
        // 1.- Se declara la matriz y se asignan los valores al mismo tiempo
        // int[][] matriz = new int[][]{{100, 200, 300}, {400, 500, 600}};
        /*int[][] matriz = new int[][]{
                {100, 200, 300}, // Corresponden a los valores de las columnas de la primer fila
                {400, 500, 600} // Corresponden a los valores de las columnas de la segunda fila
        };*/

        //2.- Se muestras los valores
        /*for(int i = 0; i < matriz.length; i++) { //Recorrer Renglones
            for(int j = 0; j < matriz[i].length; j++) { //Recorer Columnas
                System.out.println("Valor [" + i + "]["+ j + "] = " + matriz[i][j]);
            }
        }*/

        //Uso de matriz con valores asignados por el usuario
        //1.- Se defines las variables y se solicitan los valores de filas y columnas
        /*var scanner = new Scanner(System.in);
        int filas, columnas;
        System.out.print("Introduce el número de filas de la matriz: ");
        filas = scanner.nextInt();
        System.out.print("Introduce el número de columas de la matriz: ");
        columnas = scanner.nextInt();
        int[][] matriz = new int[filas][columnas];

        //2.- Se solicitan los valores de la matriz
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Introduce el valor de la matriz["+ i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        //Se iteran los valores de la matriz
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.printf("El valor de la matriz[%d][%d] es: %d%n", i, j, matriz[i][j]);
            }
        }*/

        //Ejercicio de suma diagonal de una matriz
        var scanner = new Scanner(System.in);
        int filas, columas;
        System.out.print("Introduce el número de filas: ");
        filas = scanner.nextInt();
        System.out.print("Introduce el número de columnas: ");
        columas = scanner.nextInt();

        int[][] matriz = new int[filas][columas];

        for (int i = 0; i < filas; i++) {
            for(int j = 0; j < columas; j++) {
                System.out.print("Introduce el valor de la matriz[" + i + "][" + j +"]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        int sumaDiagonal = 0;
        for (int i = 0; i < filas; i++) {
            for(int j = 0; j < columas; j++) {
                if(i == j) sumaDiagonal += matriz[i][j];
            }
        }

        System.out.println("\nLa suma en diagonal es: " + sumaDiagonal);
    }
}
