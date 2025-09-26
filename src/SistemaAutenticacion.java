import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Autenticación de Usuarios **");
        var scaner = new Scanner(System.in);

        final String USER = "msanchez";
        final String PASSWORD = "1234";

        System.out.print("Ingresa el usuario: ");
        String user = scaner.nextLine();
        System.out.print("Ingresa la contraseña: ");
        String password = scaner.nextLine();

        /*var validateUser = user.equals(USER);
        var validatePass = password.equals(PASSWORD);
        var validation = validateUser && validatePass;

        System.out.println("¿Los datos son correctos?: " + validation);*/

        //Con validaciones de desicion
        if(user.equals(USER) && password.equals(PASSWORD)){
            System.out.println("Bienvenido al sistema");
        } else if(!user.equals(USER) && password.equals(PASSWORD)) {
            System.out.println("Usuario Invalido");
        } else if (!password.equals(PASSWORD) && user.equals(USER)) {
            System.out.println("Password Invalido");
        } else if (!user.equals(USER) && !password.equals(PASSWORD)) {
            System.out.println("Usuario y Password Invalidos");
        }

    }
}
