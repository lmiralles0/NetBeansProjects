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
        
        
        System.out.println(esc.buscarAlumno("37882165"));
        System.out.println(esc.buscarAlumno("38554230").getLegajo());
        System.out.println(esc.buscarAlumno("37882165").getLegajo());
        System.out.println(esc.buscarAlumno("35426879").getLegajo());
        
        if(esc.getCursos().getFirst().agregarAlumno(esc.buscarAlumno("37882165")))
        {
            System.out.println("\n");
            System.out.println(esc.buscarAlumno("37882165"));
            System.out.println("\n");
        }
        if(esc.getCursos().get(6).agregarAlumno(esc.buscarAlumno("38554230")))
        {
            System.out.println(esc.buscarAlumno("38554230"));
        }
        
        
    }

}
