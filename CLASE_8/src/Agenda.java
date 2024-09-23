import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Luciano Miralles
 */
public class Agenda {
    private String propietario;
    private List<Persona> personas;
    
    public Agenda(String propietario)
    {
        List personas = new ArrayList<Persona>();
        setPropietario(propietario);
    }

    public String getPropietario() {
        return propietario;
    }

    private void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public List<Persona> getPersonas() {
        return personas;
    }


    
    
    
    public boolean agregarPersona(List<Persona> personas, String mail)
    {
        boolean retorno = true;
        if(buscarPersona(personas, mail) == null)
        {
            retorno = false;
        }
        return retorno;
    }
    
    protected Persona buscarPersona(List<Persona> personas, String mail)
    {
        Persona aux = null;
        if(!(mail.isEmpty()) && personas != null)
        {
            for(Persona pers : personas)
            {
                if(pers.getMail().equals(mail))
                {
                    aux = pers;
                    break;
                }
            }
        }
        return aux;
    }
    

}
