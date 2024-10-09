

package educacion.items;

/**
 *
 * @author Luciano Miralles
 */
public class Alumno {

    private String _nombre;
    private String _apellido;
    private int _legajo;
    private String _grado;
    private char _division;
    private String _dni;
    
    public Alumno(String nombre, String apellido, int legajo, String dni)
    {
        setNombre(nombre);
        setApellido(apellido);
        setLegajo(legajo);
        setDni(dni);
        setGrado(null); 
        setDivision('\0');
    }

    public String getNombre() {
        return _nombre;
    }

    private void setNombre(String _nombre) {
        this._nombre = _nombre;
    }

    public String getApellido() {
        return _apellido;
    }

    private void setApellido(String _apellido) {
        this._apellido = _apellido;
    }

    public int getLegajo() {
        return _legajo;
    }

    private void setLegajo(int _legajo) {
        this._legajo = _legajo;
    }

    public String getGrado() {
        return _grado;
    }

    public void setGrado(String _grado) {
        this._grado = _grado;
    }

    public char getDivision() {
        return _division;
    }

    public void setDivision(char _division) {
        this._division = _division;
    }
    
    public String getDni(){
        return this._dni; 
    }
    
    private void setDni(String dni){
        this._dni = dni;
    }
    
    
    @Override  
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Grado: ").append(getGrado()).append("\n");
        sb.append("Division: ").append(getDivision()).append("\n");
        sb.append(getApellido()).append(" ").append(getNombre()).append("\n");
        sb.append("DNI: ").append(getDni()).append("\n");
        sb.append("Nº Legajo: ").append(getLegajo()).append("\n");
        return sb.toString();
    }
}
