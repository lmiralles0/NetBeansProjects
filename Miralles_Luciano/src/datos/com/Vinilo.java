
package datos.com;
import datos.com.Velocidad;
import modelo.Disco;
import modelo.Artista;

/**
 *
 * @author Luciano Miralles
 */
public class Vinilo extends Disco{
    
    private Velocidad velocidad;

    public Vinilo(String titulo, float precio, Artista artista, Velocidad velocidad) {
        super(titulo, precio, artista);
        this.velocidad = velocidad;
    }

    public Vinilo(String titulo, float precio, String nombre, String generoMusical, Velocidad velocidad) {
        super(titulo, precio, new Artista(nombre, generoMusical));
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return super.toString() + "Velocidad: " + velocidad + " |";
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Vinilo) 
        {
            Vinilo v = (Vinilo) obj;
            return super.equals(obj) && this.velocidad == v.velocidad;
        }
        return false;
    }


}
