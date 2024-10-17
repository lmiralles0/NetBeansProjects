

package datos;
import modelo.Publicacion;
/**
 *
 * @author Luciano Miralles
 */
public class Comic extends Publicacion{
    
    private boolean _esColor;

    public Comic(String nombre,boolean esColor, int stock, float valor)
    {
        _nombre = nombre;
        _stock = stock;
        _importe = valor;
        _esColor = esColor;
    }
    
    
    @Override
    public boolean esColor()
    {
        return this._esColor;
    }
    
    
    
}
