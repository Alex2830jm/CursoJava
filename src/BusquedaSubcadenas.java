public class BusquedaSubcadenas {
    public static void main(String[] args) {
        //Buscar subcadenas
        // indexOf - Devuelve el indice de la primer aparición de la subcadena

        var cadena1 = "Hola Mundo Mundo";
        // buscar la subcadena "Hola"
        var indice1 = cadena1.indexOf("Hola");
        System.out.println("indice = " + indice1);

        //lastIndexOf - devuelve el indice de la última aparición de la subcadena
        //subcadena de "Mundo"
        var indice2 = cadena1.lastIndexOf("Mundo");
        System.out.println("indice2 = " + indice2);

        //Subcadena no encontrada
        var indice3 = cadena1.lastIndexOf("Java");
        System.out.println("indice3 = " + indice3);
    }
}
