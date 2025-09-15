public class ConcatenacionCadenas {
    public static  void main(String[] args) {
        System.out.println("*** Concatenación de Cadenas ***");
        var nombre = "Marilu";
        var apellido = "Sanchéz";
        //Metodo simple
        var nombreCompleto = nombre + " " + apellido;
        System.out.println("Simple: " + nombreCompleto);

        //Metodo concat
        nombreCompleto = nombre.concat(" ").concat(apellido);
        System.out.println("Concat: " + nombreCompleto);

        //Metodo StringBuilder
        var stringBuilder = new StringBuilder();
        stringBuilder.append(nombre);
        stringBuilder.append(" ");
        stringBuilder.append(apellido);
        System.out.println("StringBuilder: " + stringBuilder.toString());

        //Metodo StringBuffer
        var stringBuffer = new StringBuffer();
        stringBuffer.append(nombre).append(" ").append(apellido);
        System.out.println("StringBuffer = " + stringBuffer.toString());

        //Metodo join
        nombreCompleto = String.join(" ", nombre, apellido, "Garcia");
        System.out.println("Join = " + nombreCompleto);

    }
}
