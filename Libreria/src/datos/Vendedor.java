

package datos;
import modelo.Publicacion;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Luciano Miralles
 */
public class Vendedor {
    private String _nombre;
    private List<Publicacion> _ventas; 
    
    private Vendedor()
    {
        _ventas = new ArrayList<Publicacion>();
    }
    
    public Vendedor(String nombre)
    {
        this();
        setNombre(nombre);
    }

    public String getNombre() {
        return _nombre;
    }

    private void setNombre(String nombre) {
        this._nombre = nombre;
    }

    public String obtenerInformacionDeVentas(Vendedor vendedor)
    {
        StringBuilder sb = new StringBuilde
        if(vendedor )
        
    }
    
    
    private boolean agregarPublicacion(Vendedor vendedor, Publicacion publicacion)
    {
        if(publicacion.hayStock())
        {
            _ventas.add(publicacion);
            publicacion.setStock(publicacion.getStock() - 1);
            return true;
        }
        return false;
    }
    
}
