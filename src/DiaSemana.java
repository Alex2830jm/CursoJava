public class DiaSemana {
    public static void main(String[] args) {
        System.out.println("** Día de la semana con switch");
        var dia = 3;

        //Sentencia switch a tradicional
        /*switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("No existe el día en la semana");
        }*/

        //Sentencia switch a mejorada
        switch (dia) {
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miércoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sábado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("Día de la semana invalido");
        }
    }
}
