
package servicio;
import datos.TiendaMusica;
import modelo.Artista;
import datos.com.CD;
import datos.com.Vinilo;
import datos.com.Formato;
import datos.com.Velocidad;



/**
 *
 * @author Luciano Miralles
 */
public class pruebaTiendaDeMusica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        TiendaMusica miTienda = new TiendaMusica(7);
        Artista a = new Artista("The Beatles", "Rock");
        Artista b = new Artista("Michael Jackson", "Pop");
        Vinilo v1 = new Vinilo("Abbey Road", 50f, "The Beatles", "Rock", Velocidad.RPM_33);
        CD c1 = new CD("Thriller", 30f, b, Formato.ESTANDAR);
        Vinilo v2 = new Vinilo("Let It Be", 45f, "The Beatles", "Rock", Velocidad.RPM_45);
        CD c2 = new CD("Bad", 28f, b, Formato.REMASTERIZADO);
        CD c3 = new CD("Dangerous", 32f, b, Formato.DOBLE);
        CD c4 = new CD("Off The Wall", 25f, "Michael Jackson", "Pop", Formato.ESTANDAR);
        miTienda.agregar(v1);
        //YA INGRESADO
        miTienda.agregar(v1);
        miTienda.agregar(c1);
        miTienda.agregar(v2);
        miTienda.agregar(c2);
        miTienda.agregar(c3);
        //SIN LUGAR
        miTienda.agregar(c4);
        System.out.println("");
        //TRUE
        System.out.println(v1.equals(v1));
        //FALSE
        System.out.println(v1.equals("The Beatles"));
        //FALSE
        System.out.println(v1.equals(v2));
        //TRUE
        System.out.println(c1.equals(c1));
        //FALSE
        System.out.println(c1.equals(c2));
        //FALSE
        System.out.println(c1.equals(c4));
        System.out.println("");
        System.out.println(TiendaMusica.mostrar(miTienda));
        
        System.out.println("Precio total de vinilos: " + miTienda.getPrecioDeVinilos());
        System.out.println("Precio total de CDS: " + miTienda.getPrecioDeCDs());
        System.out.println("Precio total de la tienda: " +miTienda.getPrecioTotal());
        
    }

}
