
/**
 *Esta clase representa objetos circulo con un radio 
 */
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
    @Override //se avisa al compilador que si se escribe mal el metodo, avise
    public void calcularArea()
    {
        area= 3.14f * radio * radio;//se pone f para decirle al compilador que est float
    }
    
    /** 
     * metodo para calcular el perimetro de un triangulo
     */
    @Override //se avisa al compilador que si se escribe mal el metodo, avise
    public void calcularPerimetro()
    {
        perimetro = 2 * 3.14f * radio;//se pone f para decirle al compilador que est float
    }
}