

package datos;

import modelo.Publicacion;

/**
 *
 * @author Luciano Miralles
 */
public class Biografia extends Publicacion{
    
    public Biografia(String nombre)
    {
        _nombre= nombre;
    }
    
    public Biografia(String nombre, int stock)
    {
        this(nombre);
        _stock = stock;
    }
    
    public Biografia(String nombre, int stock, float valor)
    {
        this(nombre, stock);
        _importe = valor;
    }
    
    
    @Override
    public boolean esColor()
    {
        return false;
    }
    
     public boolean hayStock()
    {
        return getStock() > 0;
    }
    
        
    
}
