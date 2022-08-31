import java.util.Scanner;

public class RaizCuadrada {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Introduzca un valor numerico");
        int numero = leer.nextInt();

        try {
            CalcularRaiz(numero);
        }catch (NumeroNegativoException ex){
            System.out.println(ex);
        }
    }

    public static void CalcularRaiz(int numero) throws NumeroNegativoException{
       Double res;
        if (!(numero <0)){
           res = Math.sqrt(numero);
            System.out.println("El valor de la raiz de " + numero+ " es: " + res);
        }else {
            throw new NumeroNegativoException("El numero tiene un valor negativo",
                    new Throwable("Numero: " + numero));

        }


    }
}
