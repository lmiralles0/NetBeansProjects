
import com.sun.javafx.binding.StringFormatter;
import com.universidad.interfaces.Evaluable;
import com.universidad.interfaces.Evaluador;
import com.universidad.recursos.Libro;
import java.time.LocalDate;
import com.universidad.recursos.RecursoAcademico;
import com.universidad.recursos.TrabajoInvestigacion;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
        /*
        List<RecursoAcademico> lista = new ArrayList<>();
        Libro ra = new Libro(500, "Atlantida", Libro.Formato.IMPRESO, "AB", "La Rayuela", LocalDate.now(), "Cortaza");
        Libro ra1 = new Libro(600, "Hernandez", Libro.Formato.AMBOS, "AB", "Main", LocalDate.now(), "Poe");
        TrabajoInvestigacion tb = new TrabajoInvestigacion(Arrays.asList("Garcia", "Marquez"), "Psicologia", true,"EF"+Integer.toString((NumeroIdentificador.getNextNumeroIdentificador())) , "Las epocas", LocalDate.now(), "Mirallas");
        lista.add(ra);
        lista.add(ra1);
        lista.add(tb);
        
        try{
            FileOutputStream f = new FileOutputStream("recursos.ser");
            ObjectOutputStream f2 = new ObjectOutputStream(f);
            f2.writeObject(lista);
        }catch(IOException e)
        {
            System.err.println(e.getMessage());
        }
        */
        /*ra.realizarEvaluacion((Evaluable evaluado) -> {
            Libro r = (Libro) evaluado;
            return r.calcularRelevancia() * 0.8 + r.obtenerPuntaje();
        });*/
        /*
        try{
            FileInputStream fileIn = new FileInputStream("recursos.ser");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            lista = (List<RecursoAcademico>) objectIn.readObject();
            lista.get(0).mostrarDetalles();
            lista.get(1).mostrarDetalles();
            lista.get(2).mostrarDetalles();
            
        }catch (IOException | ClassNotFoundException e)
        {
            System.err.printf(e.getMessage());
            e.printStackTrace();
        }
        
        //System.out.println(ra.obtenerPuntaje());
        for(Integer i : NumeroIdentificador.grupoNumerosIdentificador)
        {
            System.out.println(i);
        }
        */
    }

}
