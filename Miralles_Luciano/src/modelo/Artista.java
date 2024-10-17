
package modelo;

/**
 *
 * @author Luciano Miralles
 */
public class Artista {
    
    private String nombre;
    private String generoMusical;

    public Artista(String nombre, String generoMusical) {
        this.nombre = nombre;
        this.generoMusical = generoMusical;
    }

    public static boolean sonIguales(Artista art1, Artista art2)
    {
        return ((art1.nombre == art2.nombre) && (art1.generoMusical == art2.generoMusical));
    }

    public String getNombreGenero() {
        return nombre + ":" + generoMusical;
    }

   
    
    

}
