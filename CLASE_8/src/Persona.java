
/**
 *
 * @author Luciano Miralles
 */
public class Persona {
    private String nombre;
    private String apellido;
    private Domicilio domicilio;
    private String telefono;
    private TipoContacto tipoContacto;
    private final String mail;
    
    public Persona(String nombre, String apellido, Domicilio domicilio, String telefono, TipoContacto tipoContacto, String mail)
    {
        setNombre(nombre);
        setApellido(apellido);
        setDomicilio(domicilio);
        setTelefono(telefono);
        setTipoContacto(tipoContacto);
        this.mail = mail;
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    private void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    private void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    private void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public TipoContacto getTipoContacto() {
        return tipoContacto;
    }

    private void setTipoContacto(TipoContacto tipoContacto) {
        this.tipoContacto = tipoContacto;
    }
    
    public String getMail()
    {
        return this.mail;
    }
    
    
    
    @Override
    public String toString()
    {
        return "";
    }

}
