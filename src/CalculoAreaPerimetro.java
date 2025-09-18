import java.sql.SQLOutput;
import java.util.Scanner;

public class CalculoAreaPerimetro {
    public static void main(String[] args) {
        System.out.println("** Cálculo de Área y Perímetro de un Rectángulo **");
        var scanner = new Scanner(System.in);

        double base, altura, perimetro, area;
        System.out.print("Ingresa la base del rectangulo: ");
        base = Double.parseDouble(scanner.nextLine());
        System.out.print("Ingresa la altura del rectangulo: ");
        altura = Double.parseDouble(scanner.nextLine());

        //Calculos
        area = base * altura;
        perimetro = 2 * (base + altura);

        System.out.printf("""
                Área del Rectangulo: %.2f
                Perímetro del Rectangulo: %.2f
                """, area, perimetro);
    }
}
