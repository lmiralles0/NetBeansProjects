
package consola;
import consorcio.servicio.Edificio;
import consorcio.servicio.Departamento;
import consorcio.servicio.Voto;


/**
 *
 * @author Luciano Miralles
 */
public class pruebaConsorcio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Edificio edif = new Edificio("Tucuman 1452", 10);
        if(edif.agregarDepartamento(5,"Luciano Miralles", "37882165") && edif.agregarDepartamento(4,"Hector Manuel", "4267148") && edif.agregarDepartamento(10,"Margarita Recalde", "14042552"))
        {
            System.out.print("Se agrego con exito\n");
        }

        
        
        
    }

}
