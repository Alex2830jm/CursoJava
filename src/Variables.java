public class Variables {
    //El código se ejecuta de manera de cascada
    public static void main(String[] args) {
        //Variables
        int edad = 24;
        double precio = 300.40;
        boolean disponible = true;
        char genero;
        genero = 'M';

        //Aceder a las variables
        System.out.println(edad);
        System.out.println(precio);
        System.out.println(disponible);
        System.out.println(genero);

        //Modificar el valor
        edad = 28;
        precio = 1500;
        disponible = false;
        genero = 'F';
        System.out.println(edad);
        System.out.println("El precio es: " +  precio);
        System.out.println(disponible);
        System.out.println(genero);
    }
}
