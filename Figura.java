
/**
 * Esta clase es una super clase para representar las caracteristicas
 * comunes de muchas figuras
 * @author Ana M.Hunter
 * @version 8/09/17
 */
public class Figura
{
    protected float area;
    protected float perimetro;
    
    /**
     * Constructor de la clase figura
     */public Figura()
    {
        area =0;
        perimetro=0;
    }
    
    /**
     * Calcula el area de la figura
     */public void calcularArea()
    {
        System.out.println("No se calcular el area porque no se de que figura se trata");
    }
    
    public void imprimirArea()
    {
        System.out.println("El area de la figura es:"+area);
    }
    
    /**
     * Calcula el perimetro de la figura
     */public void calcularPerimetro()
    {
        System.out.println("No se calcular el perimetro porque no se de que figura se trata");
    }
    
    public void imprimirPerimetro()
    {
        System.out.println("El perimetro de la figura es:"+perimetro);
    }
}


