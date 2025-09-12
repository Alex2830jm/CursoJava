public class TipoVar {
    public static void main(String[] args) {
        System.out.println("*** Uso de variable var en Java ***");

        //Sin el uso de variable var
        String nombre1 = "Marilu";
        System.out.println("nombre1 = " + nombre1);

        //Con el uso de variable var
        var nombre2 = "Sara";
        System.out.println("nombre2 = " + nombre2);

        var edad = 24;
        System.out.println("edad = " + edad);

        var sueldo = 1500.50;
        System.out.println("sueldo = " + sueldo);

        var isCasado = false;
        System.out.println("isCasado = " + isCasado);

        isCasado = true;
        System.out.println("isCasado = " + isCasado);
    }
}
