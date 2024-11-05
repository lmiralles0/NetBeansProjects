

package datos;
import datos.com.Manual;
import datos.com.Novela;
import modelo.Libro;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Luciano Miralles
 */
public class Biblioteca {
    
    public enum PrecioLibro {MANUALES,NOVELAS, TODAS};
    private int capacidad;
    private List<Libro> libros;
    
    public Biblioteca()
    {
        libros = new ArrayList<Libro>(3);
    }
    
    public Biblioteca(int capacidad)
    {
        this();
        this.capacidad = capacidad;
        libros = new ArrayList<Libro>(capacidad);
    }
    
    public boolean sonIguales(Libro lb1)
    {
        for(Libro lib : libros)
        {
            if(lib.equals(lb1))
            {
                return true;
            }
        }
        return false;
    }
    
    public void agregar(Libro lb)
    {
        if(libros.size() < capacidad)
        {
            if(!sonIguales(lb))
            {
                libros.add(lb);
            }
            else
            {
                System.out.println("El libro ya esta en la biblioteca!!!");
            }
        }
        else
        {
            System.out.println("No hay mas lugar en la biblioteca!!!");
        }
    }
            
    
    private double getPrecio(PrecioLibro precioLibro){
        double precio = 0;
        for(Libro lb : this.libros)
        {
            if((precioLibro == PrecioLibro.MANUALES && lb instanceof Manual) || (precioLibro == PrecioLibro.NOVELAS && lb instanceof Novela)|| (precioLibro == PrecioLibro.TODAS))
            {
                precio += lb.getPrecio();
            }
        }
        return precio;
    }
    
    
    public double getPrecioDeNovelas()
    {
        return getPrecio(PrecioLibro.NOVELAS);
    }
    
    
    public double getPrecioDeManual()
    {
        return getPrecio(PrecioLibro.MANUALES);
    }
    
    
    public double getPrecioTotal()
    {
        return getPrecio(PrecioLibro.TODAS);
    }    
    
    public static String mostrar(Biblioteca b)
    {
        StringBuilder sb = new StringBuilder();
        sb.append("**********************************") .append("\n");
        sb.append("Listado de libros") .append("\n");
        sb.append("**********************************") .append("\n");
        for(Libro lib : b.libros)
        {
            sb.append(lib.toString());
        }
        return sb.toString();
    }
    
}
