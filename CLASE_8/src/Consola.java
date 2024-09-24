 import java.text.MessageFormat;
 import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Luciano Miralles
 */
public class Consola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona per1 = new Persona("LUCIANO", "MIRALLES", new Domicilio("Junin", 684, "Ciudad Autonoma de Buenos Aires", "Buenos Aires", "1050"), "1160369016", TipoContacto.LABORAL, "lucianomiralles96@gmail.com");
        Persona per2 = new Persona("HORACIO", "MIRALLES", new Domicilio("Humboldt", 455, "Ciudad Autonoma de Buenos Aires", "Buenos Aires", "1114"), "1140503690", TipoContacto.PERSONAL, "hormiralles@gmail.com");
        Persona per3 = new Persona("LUCIANO", "MIRALLES", new Domicilio("Junin", 684, "Ciudad Autonoma de Buenos Aires", "Buenos Aires", "1050"), "1160369016", TipoContacto.LABORAL, "lucianomiralles96@gmail.com");
        Agenda agenda1 = new Agenda("Margarita Recalde");
        System.out.println(per1.getMail());
        //agenda1.agregarPersona(agenda1.getPersonas(), per1);
        System.out.println(MessageFormat.format("La persona {0}", (agenda1.agregarPersona(agenda1.getPersonas(), per1)) ? "fue agregada" : "no fue agregada"));
        System.out.printf("Nombre %s%n", agenda1.getPersonas().getFirst().getNombre());
        System.out.println(MessageFormat.format("La persona {0}", (agenda1.agregarPersona(agenda1.getPersonas(), per2)) ? "fue agregada" : "no fue agregada"));    
        System.out.printf("Nombre %s%n", agenda1.getPersonas().get(1).getNombre());
    
    }
    

}
