
package datos;
import modelo.Colores;
import modelo.VehiculoTerrestre;
import exception.OutOfRangeRuedasException;
import exception.OutOfRangePuertasException;
/**
 *
 * @author Luciano Miralles
 */
public class Camion extends VehiculoTerrestre{
    
    private short _cantidadDeMarchas;
    private int _pesoCarga;

    public Camion(short cantidadDeMarchas, int pesoCarga, short cantidadDeRuedas, short cantidadDePuertas, Colores color)throws OutOfRangeRuedasException, OutOfRangePuertasException {
        super(cantidadDeRuedas, cantidadDePuertas, color);
        setCantidadDeMarchas(cantidadDeMarchas);
        setPesoCarga(pesoCarga);
    }

    public short getCantidadDeMarchas() {
        return _cantidadDeMarchas;
    }

    private void setCantidadDeMarchas(short cantidadDeMarchas) {
        this._cantidadDeMarchas = cantidadDeMarchas;
    }

    public int getPesoCarga() {
        return _pesoCarga;
    }

    private void setPesoCarga(int pesoCarga) {
        this._pesoCarga = pesoCarga;
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
        sb.append("Peso carga: ") .append(getPesoCarga()).append("\n");
        
        return sb.toString();
    }
    
}
