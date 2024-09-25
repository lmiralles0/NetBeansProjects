package Objetos;
import Excepciones.ContacNotFoundException;
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
        personas = new ArrayList<Persona>();
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

    
    public boolean agregarPersona(List<Persona> personas, Persona pers) 
    {
        boolean retorno = true;
        Persona aux = buscarPersona(personas, pers.getMail());
        if(personas != null && !(personas.isEmpty()))
        {
            if(aux == null)
            {
                personas.add(pers);
            }
            else
            {
                retorno = false;
            }
        }
        else
        {
            personas.add(pers);
        }
        return retorno;
    }
    
    protected Persona buscarPersona(List<Persona> personas, String mail) 
    {
        Persona aux = null;
        if(!(mail.isEmpty()) && personas != null && !(personas.isEmpty()))
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
