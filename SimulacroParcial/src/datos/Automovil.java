
package datos;
import modelo.Colores;
import modelo.VehiculoTerrestre;
import exception.OutOfRangeRuedasException;
import exception.OutOfRangePuertasException;
/**
 *
 * @author Luciano Miralles
 */
public class Automovil extends VehiculoTerrestre{
    
    private short _cantidadDeMarchas;
    private int _cantidadPasajeros;

    public Automovil(short cantidadDeMarchas, int cantidadPasajeros, short cantidadDeRuedas, short cantidadDePuertas, Colores color) throws OutOfRangeRuedasException, OutOfRangePuertasException{
        super(cantidadDeRuedas, cantidadDePuertas, color);
        setCantidadDeMarchas(cantidadDeMarchas);
        setCantidadPasajeros(cantidadPasajeros);
    }

    public short getCantidadDeMarchas() {
        return _cantidadDeMarchas;
    }

    private void setCantidadDeMarchas(short cantidadDeMarchas) {
        this._cantidadDeMarchas = cantidadDeMarchas;
    }

    public int getCantidadPasajeros() {
        return _cantidadPasajeros;
    }

    private void setCantidadPasajeros(int cantidadPasajeros) {
        this._cantidadPasajeros = cantidadPasajeros;
    }
    
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Vehiculo: ").append(getClass()) .append("\n");
        sb.append("Ruedas: ").append(getCantidadDeRuedas()).append("\n");
        sb.append("Puerta: ").append(getCantidadDePuertas()).append("\n");
        sb.append("Color: ").append(getColor()).append("\n");
        sb.append("Marchas: ") .append(getCantidadDeMarchas()) .append("\n");
        sb.append("Capacidad: ") .append(getCantidadPasajeros()) .append(" pasajeros").append("\n");
        
        return sb.toString();
    }

}
