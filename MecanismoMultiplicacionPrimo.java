

public class MecanismoMultiplicacionPrimo extends Mecanismo
{
    // instance variables - replace the example below with your own
    
    
    /**
     * Constructor for objects of class MecanismoSumatorioParcial
     */
    public MecanismoMultiplicacionPrimo(int clave)
    {
        super(clave);
    }

    /**
     * Encriptacion
     */
    public int encripta(int mensage)
    {
            return getClave()*mensage;
    }
    
    /**
     * Desencripta
     */
    public int desencripta(int mensage)
    {
            return mensage/getClave();
    }
}
