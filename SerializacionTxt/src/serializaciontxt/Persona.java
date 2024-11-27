
package serializaciontxt;
import java.io.Serializable;
/**
 *
 * @author Luciano Miralles
 */
public class Persona implements Serializable{
    private String nombre;
    private int edad;
    
    public Persona(String nombre,int edad)
    {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
    
    @Override
    public String toString()
    {
        return "Nombre " + getNombre() +" | " +"Edad " + getEdad();
    }
}
