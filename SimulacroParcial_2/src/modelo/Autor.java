
package modelo;

/**
 *
 * @author Luciano Miralles
 */
public class Autor {
    
    private String nombre;
    private String apellido;

    public Autor(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    public static boolean sonIguales(Autor a1, Autor a2)
    {
        return a1.nombre == a2.nombre && a1.apellido == a2.apellido;
    }
    
    public String getNombreApellido()
    {
        StringBuilder sb = new StringBuilder();
        if(this != null)
        {
            sb.append(this.nombre) .append(this.apellido) .append("\n");
        }
        return sb.toString();
    }

}
