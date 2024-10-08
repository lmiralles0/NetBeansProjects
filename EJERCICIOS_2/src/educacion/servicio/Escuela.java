

package educacion.servicio;
import educacion.items.Alumno;
import educacion.items.Curso;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Luciano Miralles
 */
public class Escuela {
    
    private List<Alumno> _alumnos;
    private static List<Curso> _cursos = new ArrayList<Curso>();
    private Legajo _legajo;
    private String _nombreEscuela;
    
    public Escuela(String nombreEscuela)
    {
        _alumnos = new ArrayList<Alumno>();
        _legajo = new Legajo();
        cursosPorDefecto();
    }
    

    public List<Alumno> getAlumnos() {
        return _alumnos;
    }

    public List<Curso> getCursos() {
        return _cursos;
    }

    public Legajo getLegajo() {
        return _legajo;
    }
    
    public Alumno buscarAlumno(String dni)
    {
        for(Alumno alm : _alumnos)
        {
            if(alm.getDni() == dni)
            {
                return alm;
            }
        }
        return null;
    }
    
    public boolean altaAlumno(String nombre, String apellido, int legajo, String dni)
    {
        if(buscarAlumno(dni) == null)
        {
            _alumnos.add(new Alumno(nombre, apellido, legajo, dni));
            return true;
        }
        return false;
    }
    
    public static void cursosPorDefecto()
    {
        _cursos.add(new Curso("primero", 'A'));
        _cursos.add(new Curso("primero", 'B'));
        _cursos.add(new Curso("segundo", 'A'));
        _cursos.add(new Curso("tercero", 'A'));
        _cursos.add(new Curso("cuarto", 'A'));
        _cursos.add(new Curso("quinto", 'A'));
        _cursos.add(new Curso("quinto", 'B'));
        _cursos.add(new Curso("quinto", 'C'));
        _cursos.add(new Curso("sexto", 'A'));
        _cursos.add(new Curso("septimo", 'A'));
    }
    
    private Curso buscarCurso(String grado, char division)
    {
        for(Curso cro : _cursos)
        {
            if(cro.getGrado() == grado && cro.getDivision() == division)
            {
                return cro;
            }
        }
        return null;
    }
    
    public boolean altaCurso(String grado, char division)
    {
        if(buscarCurso(grado, division) == null)
        {
            _cursos.add(new Curso(grado, division));
            return true;
        }
        return false;
    }
    
}
