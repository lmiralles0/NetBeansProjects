

package educacion.items;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Luciano Miralles
 */
public class Curso {
    
    private String _grado;
    private char _division;
    private List<Alumno> _alumnos;
    
    public Curso(String grado, char division)
    {
        _alumnos = new ArrayList<Alumno>();
        setGrado(grado);
        setDivision(division);
    }

    public String getGrado() {
        return _grado;
    }

    private void setGrado(String _grado) {
        this._grado = _grado;
    }

    public char getDivision() {
        return _division;
    }

    private void setDivision(char _division) {
        this._division = _division;
    }

    public List<Alumno> getAlumnos() {
        return _alumnos;
    }

    private void setAlumnos(List<Alumno> _alumnos) {
        this._alumnos = _alumnos;
    }
    
    
    private Alumno buscarAlumno(int legajo)
    {
        for(Alumno alumno : _alumnos)
        {
            if(alumno.getLegajo() == legajo)
            {
                return alumno;
            }
        }
        return null;
    }
    
    public boolean agregarAlumno(int legajo)
    {
        
    }
}
