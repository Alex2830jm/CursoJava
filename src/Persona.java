//POO
public class Persona {
    //Atributos
    String nombre;
    String apellido;

    //Métodos
    void mostrarPersona() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
    }

    public static void main(String[] args) {
        System.out.println("*** Creación de Clase y Objetos Persona");
        var objeto1 = new Persona();
        objeto1.nombre = "Marilu";
        objeto1.apellido = "Sanchéz";
        objeto1.mostrarPersona();

        //Segundo objeto
        var objeto2 = new Persona();
        objeto2.nombre = "Alex";
        objeto2.apellido = "Martínez";
        objeto2.mostrarPersona();
    }
}
