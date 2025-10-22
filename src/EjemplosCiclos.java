import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class EjemplosCiclos {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var salir = false;

        // Menú iterativo
        /*while (!salir) {
            System.out.println("""
                *** Sistema de Administración de Ceuntas ***
                
                1. Crear Cuenta
                2. Eliminar Cuenta
                3. Salir
                
                Escoger una opción:\s""");

            int opcion = Integer.parseInt(scanner.nextLine());
            switch (opcion) {
                case 1 -> System.out.println("Creando tu cuenta... \n");
                case 2 -> System.out.println("Eliminando tu cuenta... \n");
                case 3 -> {
                    System.out.println("Saliendo del sistema. Hasta Pronto");
                    salir = true;
                }
                default -> System.out.println("Opción Invalida");
            }
        }*/

        // Cajero Automático
        /*int saldo = 1500;
        int opcion, monto;
        while(!salir) {
            System.out.println("*** Aplicación de Cajero Automático ***");
            System.out.printf("""
                Operaciones que se pueden realizar
                1.- Consultar saldo
                2.- Retirar dinero
                3.- Depositar dinero
                4.- Salir
                Escoger una opción:\s""");

            opcion = Integer.parseInt(scanner.nextLine());
            switch (opcion) {
                case 1 -> System.out.println("Tu saldo actual es: " + saldo);
                case 2 -> {
                    System.out.print("Ingresa el monto a retirar: ");
                    monto = Integer.parseInt(scanner.nextLine());
                    if(monto > saldo) System.out.println("No cuentas con el saldo suficiente. Tu saldo actual es de: " + saldo);
                    else {
                        saldo -= monto;
                        System.out.println("Tu saldo actual es de: " + saldo);
                    }
                }
                case 3 -> {
                    System.out.print("Ingresa el monto a depositar: ");
                    monto = Integer.parseInt(scanner.nextLine());
                    saldo += monto;
                    System.out.println("Tu saldo actual es de: " + saldo);
                }
                case 4 -> {
                    System.out.println("Saliendo del sistema de cajero");
                    salir = true;
                }
                default -> System.out.println("Opción Invalida");
            }
        }*/

        //Calculadora
        /*int opcion;
        double num1, num2, res;
        while(!salir) {
            System.out.println("*** Calculadora en Java ***");
            System.out.printf("""
                Operaciones que puedes realizar:
                1.- Suma
                2.- Resta
                4.- Multiplicacion
                5.- Salir
                Escoger una opción:\s""");
            //opcion = Integer.parseInt(scanner.nextLine());
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.print("Valor 1: ");
                    num1 = Double.parseDouble(scanner.nextLine());
                    System.out.print("Valor 2: ");
                    num2 = Double.parseDouble(scanner.nextLine());
                    res = num1 + num2;
                    System.out.printf("Resultado de la suma: %.2f \n", res);
                }
                case 2 -> {
                    System.out.print("Valor 1: ");
                    num1 = Double.parseDouble(scanner.nextLine());
                    System.out.print("Valor 2: ");
                    num2 = Double.parseDouble(scanner.nextLine());
                    res = num1 - num2;
                    System.out.printf("Resultado de la resta: %.2f \n", res);
                }
                case 3 -> {
                    System.out.print("Valor 1: ");
                    num1 = Double.parseDouble(scanner.nextLine());
                    System.out.print("Valor 2: ");
                    num2 = Double.parseDouble(scanner.nextLine());
                    res = num1 * num2;
                    System.out.printf("Resultado de la multiplicacion: %.2f \n", res);
                }
                case 4 -> {
                    System.out.print("Valor 1: ");
                    num1 = Double.parseDouble(scanner.nextLine());
                    System.out.print("Valor 2: ");
                    num2 = Double.parseDouble(scanner.nextLine());
                    if(num2 == 0) System.out.println("Error!! No puedes dividir por cero");
                    else {
                        res = num1 / num2;
                        System.out.printf("Resultado de la suma: %.2f \n", res);
                    }
                }
                case 5 -> {
                    System.out.println("Saliendo del sistena...");
                    salir = true;
                }
                default -> System.out.println("Opción invalida, selecciona otra opción");
            }
        }*/

        //Valicación de Password
        /*System.out.println("*** Validación de contraseña ***");
        String password;
        while (!salir) {
            System.out.print("Escribe tu contraseña: ");
            password = scanner.nextLine();
            if(password.length() >= 6) {
                System.out.println("Contraseña validada :)");
                salir = true;
            }
        }*/

        //Adivina el número
        /*System.out.println("*** Juago de Adivinanzas ***");
        var random = new Random();

        var numeroSecreto = random.nextInt(50) + 1;
        var intentos = 0;
        var adivinanza = 0;
        final var INTENTOS_MAXIMOS = 5;
        while(adivinanza != numeroSecreto && intentos < INTENTOS_MAXIMOS) {
            System.out.print("Adivina el número secreto (1 - 50): ");
            adivinanza = scanner.nextInt();

            if(adivinanza < numeroSecreto) System.out.println("El número secreto es mayor");
            else if (adivinanza > numeroSecreto) System.out.println("El número secreto es menor");

            intentos++;
        }

        if(adivinanza == numeroSecreto) {
            System.out.printf("Felicidades!! Adviniaste el número secreto en %d intentos", intentos);
        } else {
            System.out.printf("Lo siento, has agotado tus intentos máximos: %d%n", INTENTOS_MAXIMOS);
            System.out.printf("El número secreto es: %d%n", numeroSecreto);
        }*/

        //Dibuja un triangulo
        /*System.out.println("*** Dibuja un Triángulo ***");
        System.out.print("Proporciona el número de filas: ");
        int numeroFilas = scanner.nextInt();

        for(int i = 1; i <= numeroFilas; i++) {
            String spaciosBlanco = " ".repeat(numeroFilas - i);
            String asteriscos = "*".repeat(2 * i - 1);
            System.out.println(spaciosBlanco + asteriscos);
        }*/

        System.out.println("*** Break y Continue ***");
        System.out.println("Break");
        for(int i = 1; i <= 10; i++) {
            if(i % 2 == 0) {
                System.out.print(i + " ");
                break; // Rompe con el ciclo
            }
        }

        System.out.println("\nContinue");
        for(int i = 1; i <= 9; i++){
            if(i % 2 == 1) {
                continue; // Salta las siguientes instrucciones del ciclo e inica otra cola
            }

            System.out.print(i + " ");
        }
    }
}
