public class FomateoCadenas {
    public static void main(String[] args) {
        System.out.println("*** Formateo de Cadenas ***");
        var nombre = "Marilu";
        var edad = 23;
        var salario = 21000.50;

        // String.format
        var mensaje = String.format("Nombre: %s, \nEdad: %d, \nSalario: %.2f",
                nombre, edad, salario);
        System.out.println(mensaje);

        //Metodo printf
        System.out.printf("\n \nNombre: %s\nEdad: %d,\nSalario: %.2f%n", nombre, edad, salario);

        var numeroEmpleado = 12;
        // Formateo con text block
        mensaje = """
                %nDetalle Persona:\s
                -----------------------
                \tNombre: %s,
                \tNo. Empleado: %04d,
                \tEdad: %d años,
                \tSalario: $%.2f
                """.formatted(nombre, numeroEmpleado, edad, salario);
        System.out.println(mensaje);
            //%04 Formato de número de 4 digitos, completando con 0

        //Formateo con text block y printf
        System.out.printf("""
                %nDetalle Persona:\s
                -----------------------
                \tNombre: %s,
                \tNo. Empleado: %04d,
                \tEdad: %d años,
                \tSalario: $%.2f
                """, nombre, numeroEmpleado, edad, salario);
    }
}
