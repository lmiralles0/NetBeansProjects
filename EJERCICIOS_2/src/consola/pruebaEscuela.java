package consola;
import educacion.servicio.Escuela;
/**
 *
 * @author Luciano Miralles
 */
public class pruebaEscuela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Escuela esc = new Escuela("Escuela Normal Manuel Florencio Mantilla");
        esc.altaAlumno("Horacio", "Miralles" , esc.getLegajo().getNextLegajo(), "38554230");
        esc.altaAlumno("Maximo", "Miralles" , esc.getLegajo().getNextLegajo(), "35426879");
        esc.altaAlumno("Luciano", "Miralles" , esc.getLegajo().getNextLegajo(), "37882165");
        esc.altaAlumno("Luciano", "Miralles" , esc.getLegajo().getNextLegajo(), "37882165");
        
        esc.getCursos().getFirst().agregarAlumno(esc.buscarAlumno("37882165"));
        
        esc.getCursos().get(6).agregarAlumno(esc.buscarAlumno("38554230"));
        
        
        for(int i = 0; i < esc.getAlumnos().size(); i++)
        {
            System.out.println(esc.getAlumnos().get(i));
        }
        

        
        
    }

}
