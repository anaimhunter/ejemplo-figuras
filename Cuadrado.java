
/**
 *Esta clase representa objetos cuadrado con dos lados
 */
public class Cuadrado extends Figura
{
    private float lado;
    /**
     * Constructor 
     */
    public Cuadrado(float unLado)
    {
        lado = unLado;
    }
    
    /** 
     * metodo para calcular el area de un cuadrado
     */
    @Override //se avisa al compilador que si se escribe mal el metodo, avise
    public void calcularArea()
    {
        area= lado*lado;
    }
    
    /** 
     * metodo para calcular el perimetro de un cuadrado
     */
    @Override //se avisa al compilador que si se escribe mal el metodo, avise
    public void calcularPerimetro()
    {
        perimetro = 4*lado;
    }
}