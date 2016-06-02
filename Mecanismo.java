
/**
 * Abstract class Mecanismo - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Mecanismo
{
    // instance variables - replace the example below with your own
    private int clave;
    

    /**
     *Constructor
     */
    public Mecanismo(int clave)
    {
        this.clave = clave;
    }
    
    public int getClave()
    {
        return clave;
    }
    
    public abstract int encripta(int mensage);
    
    public abstract int desencripta(int mensage);
}
