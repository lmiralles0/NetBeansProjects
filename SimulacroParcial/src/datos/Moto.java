
package datos;
import modelo.Colores;
import modelo.VehiculoTerrestre;
import exception.OutOfRangeRuedasException;
import exception.OutOfRangePuertasException;
/**
 *
 * @author Luciano Miralles
 */
public class Moto extends VehiculoTerrestre{
    
    private short _cilindrada;

    public Moto(short cilindrada, short cantidadDeRuedas, short cantidadDePuertas, Colores color) throws OutOfRangeRuedasException,OutOfRangePuertasException {
        super(cantidadDeRuedas, cantidadDePuertas, color);
        setCilindrada(cilindrada);
    }

    public short getCilindrada() {
        return _cilindrada;
    }

    private void setCilindrada(short cilindrada) {
        this._cilindrada = cilindrada;
    }
    
    
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Vehiculo: ").append(getClass()) .append("\n");
        sb.append("Ruedas: ").append(getCantidadDeRuedas()).append("\n");
        sb.append("Puerta: ").append(getCantidadDePuertas()).append("\n");
        sb.append("Color: ").append(getColor()).append("\n");
        sb.append("Cilindrada: ") .append(getCilindrada()) .append("\n");
        
        return sb.toString();
    }
    

}
