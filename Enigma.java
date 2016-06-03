
/**
 * Write a description of class Enigma here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enigma
{

    /**
     * Constructor for objects of class Enigma
     */
    public Enigma()
    {
        
    }

    /**
     * 
     */
    public int encripta(Mecanismo mecanismo, int mensage)
    {
        int encriptado = -1;
        if(mensage > 10){
            encriptado = mecanismo.encripta( mensage);
        }
        
        return encriptado;
    }
    
    /**
     * 
     */
    public int desencripta(Mecanismo mecanismo, int mensage)
    {
        int desencriptado = -1;
        if(mecanismo.desencripta( mensage) >10){
           desencriptado = mecanismo.desencripta( mensage);
        }
        return desencriptado;
    }
}
