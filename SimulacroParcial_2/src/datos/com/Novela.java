

package datos.com;
import modelo.Libro;
import modelo.Autor;

/**
 *
 * @author Luciano Miralles
 */
public class Novela extends Libro{

    public enum Genero{ACCION, ROMANTICA, CIENCIA_FICCION};
    private Genero _genero;
    
    public Novela(String titulo, float precio, Autor autor, Genero genero)
    {
        super(titulo, precio, autor);
        _genero = genero;
    }

    public Novela(String titulo, float precio, String nombre, String apellido, Genero genero)
    {
        super(titulo, precio, nombre, apellido);
        _genero = genero;
    }
    
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("GENERO: ") .append(_genero) .append("\n");
        sb.append("\n");
        return sb.toString();
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof Novela)
        {
            Novela nv = (Novela) obj;
            return super.equals(nv) && this._genero == nv._genero;
        }
        return false;
    }
}
