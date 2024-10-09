package consola;
import data.SuperHeroe;

/**
 *
 * @author Luciano Miralles
 */
public class PruebaLiga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SuperHeroe superHeroe1 = new SuperHeroe("Batman", 90, 70, 0);
        SuperHeroe superHeroe2 = new SuperHeroe("Superman", 95, 60,70);
        SuperHeroe superHeroe3 = new SuperHeroe("Flash", 65, 70, 40);
        
        System.out.println(superHeroe1.competir(superHeroe2));
        System.out.println(superHeroe2.competir(superHeroe1));
        System.out.println(superHeroe3.competir(superHeroe1));
        System.out.println(superHeroe1.competir(superHeroe3));
        
        System.out.println(superHeroe1);
        System.out.println(superHeroe2);
        System.out.println(superHeroe3);
        
        
        
        
    }

}
