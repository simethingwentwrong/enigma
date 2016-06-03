
/**
 * Write a description of class MecanismoSumatorioParcial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MecanismoSumatorioParcial extends Mecanismo
{
   

    /**
     * Constructor for objects of class MecanismoSumatorioParcial
     */
    public MecanismoSumatorioParcial(int clave)
    {
       super(clave);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int encripta(int mensage)
    {
        int cont  = mensage;
        while (cont > getClave()){
            cont = cont - 1;
            mensage = mensage + cont;
        }
        return mensage;
    }
    
    public int desencripta(int mensage)
    {
        int cont = getClave();
        boolean para = false;
        while (cont != mensage && !para)
        {
           mensage = mensage - cont;
            cont=  +1 ;
            if(mensage <= 10)
            {
                mensage = -1;
                para  = true;
            }
        }
        return mensage;
    }
}
