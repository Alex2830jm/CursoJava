import java.util.Scanner;

public class SistemaEmpleados {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Empleados ***");
        var scanner = new Scanner(System.in);

        //Nombre del Empleado
        System.out.print("Ingresa el nombre del empleado: ");
        var nombreEmpleado = scanner.nextLine();

        //Edad del empleado
        System.out.print("Ingresa la edad del empleado: ");
        var edadEmpleado = Integer.parseInt(scanner.nextLine());

        //Salario del Empleado
        System.out.print("Salario del empleado: ");
        var salarioEmpleado = Double.parseDouble(scanner.nextLine());

        //¿Es jefe?
        System.out.print("¿Es jefe de departamento? (true/false): ");
        var isJefeDepartamento = Boolean.parseBoolean(scanner.nextLine());

        System.out.println("*** Datos del Empleado ***");
        System.out.println("\tNombre del Empleado: " + nombreEmpleado);
        System.out.println("\tEdad del empleado: " + edadEmpleado);
        //System.out.println("\tSalario del empleado: " + salarioEmpleado);
        System.out.printf("\tSalario del empleado: $%.2f%n", salarioEmpleado); // printf es para dar formato
        System.out.println("\t¿Es jefe de departamento? " + isJefeDepartamento);
    }
}
