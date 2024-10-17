

package servicio;
import datos.Comic;
import datos.Biografia;
import modelo.Vendedor;
/**
 *
 * @author Luciano Miralles
 */
public class pruebaLibreria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Biografia p1 = new Biografia("Life (Keith Richards)");
        Biografia p2 = new Biografia("White line fever (Lemmy)", 5);
        Biografia p3 = new Biografia("Commando (Johnny Ramone)", 2, 5000);
        Comic p4 = new Comic("La Muerte de Superman (Superman)", true, 1, 1850);
        Comic p5 = new Comic("Año Uno (Batman)", false, 3, 1270);
        
        Vendedor vd = new Vendedor("Luciano Miralles");
        System.out.println(vd.agregarPublicacion(vd, p4));
        System.out.println(vd.agregarPublicacion(vd, p4));
        System.out.println(vd.agregarPublicacion(vd, p2));
        System.out.println(vd.agregarPublicacion(vd, p5));
        System.out.println(vd.agregarPublicacion(vd, p5));
        System.out.println(vd.agregarPublicacion(vd, p2));
        
        
        System.out.println(vd.obtenerInformacionDeVentas(vd));
        
        
    }

}
