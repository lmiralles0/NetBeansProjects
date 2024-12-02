
import com.universidad.interfaces.Evaluable;
import com.universidad.interfaces.Evaluador;
import com.universidad.recursos.Libro;
import java.time.LocalDate;



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
        Libro ra = new Libro(500, "Atlantida", Libro.Formato.IMPRESO, "AB001", "La Rayuela", LocalDate.now(), "Cortaza");
        ra.realizarEvaluacion((Evaluable evaluado) -> {
            Libro r = (Libro) evaluado;
            return r.calcularRelevancia() * 0.8 + r.obtenerPuntaje();
        });
        System.out.println(ra.obtenerPuntaje());
    }

}
