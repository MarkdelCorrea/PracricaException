public class NumeroNegativoException extends Exception  {

    public NumeroNegativoException() {
        super()    ;
    }

    public NumeroNegativoException (String mensaje)    {
        // calling the constructor of parent Exception
        super(mensaje);

    }

    public NumeroNegativoException (String mensaje,  Throwable causa )    {
        // calling the constructor of parent Exception
        super(mensaje, causa);
    }

}
