public class GenerarEmail {
    public static void main(String[] args) {
        var nombreUsuario = "  Marilu Sanchez Garcia  ";
        var empresa = "Curso Java";
        var extensionDominio = ".com.mx";

        System.out.println("Nombre del usuario: " + nombreUsuario);
        
        var username = nombreUsuario.strip().replace(" ", ".").toLowerCase();
        System.out.println("Username: " + username);

        var dominioEmail = "@".concat(empresa.replace(" ", "").toLowerCase()).concat(extensionDominio);
        System.out.println("dominioEmail = " + dominioEmail);
        
        var email = username.concat(dominioEmail);
        System.out.println("email = " + email);
    }
}
