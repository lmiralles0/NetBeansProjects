
/**
 *
 * @author Luciano Miralles
 */
public class Persona {
    private String nombre;
    private String apellido;
    private Domicilio domicilio;

    public Persona(String nombre, String apellido, Domicilio domicilio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
    }
     // setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }
    
    // Metodo para mostrar nombre y apellido
    public void mostrarNombreApellido(){
        System.out.println("Nombre: " + this.nombre + " Apellido: " + this.apellido );
    }
    
    public void mostrarDomicilio(){
        this.domicilio.mostrarDomicilio();
    }
}
