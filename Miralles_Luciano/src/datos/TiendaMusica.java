
package datos;
import java.util.List;
import java.util.ArrayList;
import modelo.Disco;
import datos.com.Vinilo;
import datos.com.CD;

/**
 *
 * @author Luciano Miralles
 */
public class TiendaMusica {

    private final int capacidad;
    private List<Disco> discos;

    public TiendaMusica() 
    {
        this.capacidad = 5;
        this.discos = new ArrayList<>();
    }

    public TiendaMusica(int capacidad) 
    {
        this.capacidad = capacidad;
        this.discos = new ArrayList<>();
    }

    public boolean sonIguales(Disco disco) 
    {
        for(Disco d : discos) 
        {
            if(d.equals(disco)) 
            {
                return true;
            }
        }
        return false;
    }

    public void agregar(Disco disco) {
        if(discos.size() < capacidad && !sonIguales(disco)) 
        {
            discos.add(disco);
        } else {
            System.out.println("El disco ya existe en la tienda");
        }
    }

    private double getPrecio(TipoDisco tipoDisco) {
        double total = 0;
        for(Disco d : discos) {
            if((tipoDisco == TipoDisco.VINILOS && d instanceof Vinilo) || 
                (tipoDisco == TipoDisco.CDS && d instanceof CD) || 
                tipoDisco == TipoDisco.TODOS) 
            {
                total += d.getPrecio();
            }
        }
        return total;
    }

    public double getPrecioDeVinilos() {
        return getPrecio(TipoDisco.VINILOS);
    }

    public double getPrecioDeCDs() {
        return getPrecio(TipoDisco.CDS);
    }

    public double getPrecioTotal() {
        return getPrecio(TipoDisco.TODOS);
    }

    public static String mostrar(TiendaMusica tienda) {
        StringBuilder sb = new StringBuilder();
        sb.append("Capacidad: ").append(tienda.capacidad).append("\n");
        for (Disco d : tienda.discos) {
            sb.append(d.toString()).append("\n");
        }
        return sb.toString();
    }
}
