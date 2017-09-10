
/**
 *Esta clase representa objetos triangulo con una base y una altura
 */
public class Triangulo extends Figura
{
    private float base;
    private float altura;
    /**
     * Constructor 
     */
    public Triangulo(float unaBase, float unaAltura)
    {
        base = unaBase;
        altura = unaAltura;
    }
    
    /** 
     * metodo para calcular el area de un triangulo
     */
    @Override //se avisa al compilador que si se escribe mal el metodo, avise
    public void calcularArea()
    {
        area= (base*altura)/2;
    }
    
    /** 
     * metodo para calcular el perimetro de un triangulo
     */
    @Override //se avisa al compilador que si se escribe mal el metodo, avise
    public void calcularPerimetro()
    {
        perimetro = (2*altura) + base;
    }
    
    
}