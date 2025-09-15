public class ReemplazarSubcadenas {
    public static void main(String[] args) {
        //Reemplazar subcademas
        var cadena1 = "Hola Mundo";
        System.out.println("cadena1 = " + cadena1);
        
        // Reemplazar "Mundo" a "a todos"
        var nuevaCadena = cadena1.replace("Mundo", "a todos");
        System.out.println("nuevaCadena = " + nuevaCadena);

        nuevaCadena = cadena1.replace("Hola", "Adios");
        System.out.println("otraCadena = " + nuevaCadena);
    }
}
