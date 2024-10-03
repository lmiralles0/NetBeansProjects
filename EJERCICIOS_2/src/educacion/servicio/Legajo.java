

package educacion.servicio;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Luciano Miralles
 */
public class Legajo {
    private List<Integer> _legajos;
    
    Legajo()
    {
        _legajos = new ArrayList<>();
    }
    
    public int getNextLegajo()
    {
        int legajo = -1;
        Random rm = new Random(1);
        do
        {
            legajo = rm.nextInt(100, 1000);
            
        }while(!_legajos.contains(legajo));
        _legajos.add(legajo);
        return legajo;
    }

}
