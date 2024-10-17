
package datos.com;
import modelo.Artista;
import modelo.Disco;

/**
 *
 * @author Luciano Miralles
 */
public class CD extends Disco{
    
    private Formato formato;

    public CD(String titulo, float precio, Artista artista, Formato formato) {
        super(titulo, precio, artista);
        this.formato = formato;
    }

    public CD(String titulo, float precio, String nombre, String generoMusical, Formato formato) {
        super(titulo, precio, new Artista(nombre, generoMusical));
        this.formato = formato;
    }
    
    
    @Override
    public String toString() {
        return super.toString() + "Formato: " + formato + " |";
    }

    
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof CD) 
        {
            CD c = (CD) obj;
            return super.equals(obj) && this.formato == c.formato;
        }
        return false;
    }
    
    
    

}
