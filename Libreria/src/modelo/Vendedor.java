

package modelo;
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

    public boolean agregarPublicacion(Vendedor vendedor, Publicacion publicacion)
    {
        if(publicacion.hayStock())
        {
            _ventas.add(publicacion);
            publicacion._stock = (publicacion.getStock() - 1);
            return true;
        }
        return false;
    }
    
    
    public String obtenerInformacionDeVentas(Vendedor vendedor)
    {
        StringBuilder sb = new StringBuilder();
        if(vendedor != null && !vendedor._ventas.isEmpty())
        {
            sb.append("Nombre: ") .append(vendedor.getNombre()) .append("\n");
            sb.append("------------------------------------") .append("\n");
            for(Publicacion pb : vendedor._ventas)
            {
                sb.append(pb.obtenerInformacion()) . append("\n");
            }
        }
        return sb.toString();
    }
    
}
