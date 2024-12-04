
import com.universidad.excepciones.CategoriaInvalidaException;
import com.universidad.excepciones.LimiteRecursosException;
import com.universidad.excepciones.RecursoNoEncontradoException;
import com.universidad.gestores.GestorRecurso;
import com.universidad.interfaces.Evaluable;
import com.universidad.recursos.Articulo;
import com.universidad.recursos.Libro;
import java.time.LocalDate;
import com.universidad.recursos.RecursoAcademico;
import com.universidad.recursos.TrabajoInvestigacion;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



/**
 *
 * @author Luciano Miralles
 */
public class NewMain {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        GestorRecurso recurso = new GestorRecurso(50);
        Libro ra = new Libro(500, "Atlantida", Libro.Formato.IMPRESO, "AB1001", "La Rayuela", LocalDate.now(), "Cortaza");
        Libro ra1 = new Libro(600, "Hernandez", Libro.Formato.AMBOS, "AB1002", "Main", LocalDate.now(), "Poe");
        TrabajoInvestigacion tb = new TrabajoInvestigacion(Arrays.asList("Garcia", "Marquez"), "Psicologia", true,"EF1003" , "Las epocas", LocalDate.now(), "Mirallas");
        Articulo ar = new Articulo(Arrays.asList("Hegel", "Newton"),"Ciencia Hoy", "CD1004", "La teoria del todo", LocalDate.of(1890, Month.MARCH, 30),"ISaac Flening" );
        
        ra.realizarEvaluacion((Evaluable evaluado) -> {
            Libro r = (Libro) evaluado;
            return r.calcularRelevancia() * 0.8 + r.obtenerPuntaje();
        });
        try {
            ar.asignarCategoria("Divulgatorio");
            ra1.asignarCategoria("Academicos");
            tb.asignarCategoria("Experiental");  
        } catch (CategoriaInvalidaException e) {
            System.out.println("Error al asignar categoría: " + e.getMessage());
        }

        
        
            recurso.agregarRecursos(ar);  
            recurso.agregarRecursos(ra1);
            recurso.agregarRecursos(tb);                


        
        /*try {
            RecursoAcademico recursoBuscado = recurso.buscarRecurso("AB1001", "El tesoro");
            if(recursoBuscado == null)
            {
                throw new RecursoNoEncontradoException();
            }
        } catch (RecursoNoEncontradoException e) {
            System.err.println(e.getMessage());
        }*/

        List<RecursoAcademico> filtrados = recurso.filtrar(recursos ->recursos.obtenerPuntaje() > 1);
        filtrados.forEach(RecursoAcademico::mostrarDetalles);

        List<RecursoAcademico> recursosOrdenados = recurso.ordenar((r1, r2) -> Double.compare(r2.calcularRelevancia(), r1.calcularRelevancia()));
        recursosOrdenados.forEach(RecursoAcademico::mostrarDetalles);
    }
       

}
