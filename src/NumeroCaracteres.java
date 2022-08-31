import java.util.Scanner;

public class NumeroCaracteres {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Inserte Palabra");
        String lectTeclado = leer.next();
        System.out.println("Inserte posicion");
        int pos = leer.nextInt();

        try {
            caracterEn(lectTeclado, pos);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void caracterEn (String texto, int pos)throws Exception{
        char c;
        if (!(pos >texto.length())){
           c = texto.charAt(pos-1);
            System.out.println("El Caracter es: "+c);
        }else {
            throw new Exception("Has intentado recuperar una posición de la cadena de caracteres que no existe;");
        }


    }
}

