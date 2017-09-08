public class Circulo extends Figura
{
    private float radio;
    /**
     * Constructor 
     */
    public Circulo(float unRadio)
    {
        radio=unRadio;
    }
    
    /** 
     * metodo para calcular el area de un circulo
     */
    public void calculaArea()
    {
        area= 3.14f * radio * radio;//se pone f para decirle al compilador que est float
    }
}