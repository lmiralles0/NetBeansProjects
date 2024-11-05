
package datos.com;
import modelo.Libro;
import modelo.Autor;
/**
 *
 * @author Luciano Miralles
 */
public class Manual extends Libro{
    
    public enum Tipo{ESCOLAR, FINANZAS, TECNICO};
    private Tipo _tipo;
    
    
    public Manual(String titulo, float precio, Autor autor, Tipo tipo)
    {
        super(titulo, precio, autor);
        _tipo = tipo;
    }
    
    
    public Manual(String titulo, float precio, String nombre, String apellido,Tipo tipo){
        super(titulo, precio, nombre, apellido);
        _tipo = tipo;
    }
    
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("TIPO: ") .append(_tipo) .append("\n");
        sb.append("\n");
        return sb.toString();
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof Manual)
        {
            Manual man = (Manual)obj;
            return super.equals(man) && this._tipo == man._tipo;
        }
        return false;
    }
    
    
    

}
