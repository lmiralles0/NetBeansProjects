
package modelo;
import exception.OutOfRangeRuedasException;
import exception.OutOfRangePuertasException;
/**
 *
 * @author Luciano Miralles
 */
public class VehiculoTerrestre {
    
    private short _cantidadDeRuedas;
    private short _cantidadDePuertas;
    private Colores color;

    public VehiculoTerrestre(short cantidadDeRuedas, short cantidadDePuertas, Colores color)throws OutOfRangeRuedasException, OutOfRangePuertasException{
        setCantidadDePuertas(cantidadDePuertas);
        setCatidadDeRuedas(cantidadDeRuedas);
        setColor(color);
    }

    public short getCantidadDeRuedas() {
        return _cantidadDeRuedas;
    }

    private void setCatidadDeRuedas(short cantidadDeRuedas) throws OutOfRangeRuedasException {
        if(cantidadDeRuedas != 2 || cantidadDeRuedas != 4 || cantidadDeRuedas != 6)
        {
            throw new OutOfRangeRuedasException("Numero de ruedas incompatible.");
        }
        this._cantidadDeRuedas = cantidadDeRuedas;
    }

    public short getCantidadDePuertas() {
        return _cantidadDePuertas;
    }

    private void setCantidadDePuertas(short cantidadDePuertas)throws OutOfRangePuertasException {
        if(cantidadDePuertas != 4 || cantidadDePuertas != 2 || cantidadDePuertas != 0)
        {
            throw new OutOfRangePuertasException("Numero de puerta incompatible");
        }
        this._cantidadDePuertas = cantidadDePuertas;
    }

    public Colores getColor(){
        return color;
    }

    private void setColor(Colores color) {
        this.color = color;
    }
    
    
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Vehiculo terrestre no especificado.\n");
        sb.append("Ruedas: ").append(getCantidadDeRuedas()).append("\n");
        sb.append("Puerta: ").append(getCantidadDePuertas()).append("\n");
        sb.append("Color: ").append(getColor()).append("\n");
        return sb.toString();
    }

}
