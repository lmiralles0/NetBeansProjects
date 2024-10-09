
package data;

/**
 *
 * @author Luciano Miralles
 */
public class SuperHeroe {
    
    private String _nombre;
    private int _fuerza;
    private int _resistencia;
    private int _superPoderes;
    
    public SuperHeroe(String nombre, int fuerza, int resistencia, int superPoderes)
    {
        setNombre(nombre);
        setFuerza(fuerza);
        setResistencia(resistencia);
        setSuperPoderes(superPoderes);
    }

    public String getNombre() {
        return _nombre;
    }

    private void setNombre(String nombre) {
        this._nombre = nombre;
    }

    public int getFuerza() {
        return _fuerza;
    }

    private void setFuerza(int fuerza) {
        this._fuerza = settearRangos(fuerza);
    }

    public int getResistencia() {
        return _resistencia;
    }

    private void setResistencia(int resistencia) {
        this._resistencia = settearRangos(resistencia);
    }

    public int getSuperPoderes() {
        return _superPoderes;
    }

    private void setSuperPoderes(int superPoderes) {
        this._superPoderes = settearRangos(superPoderes);
    }
    
    
    private int settearRangos(int numero)
    {
        if(numero < 0)
        {
            return 0;
        }
        if(numero  > 99)
        {
            return 100;
        }
        return numero; 
    }
    
    private int compareItems(int num1, int num2)
    {
        if(num1 > num2)
        {
            return 1;
        }
        if(num1 < num2)
        {
            return -1;
        }
        return 0;
        
    }
    
    
    public String competir(SuperHeroe rival)
    {
        int contador  = 0;
        contador += compareItems(this.getFuerza(), rival.getFuerza()) +  compareItems(this.getResistencia(), rival.getResistencia()) + compareItems(this.getSuperPoderes(), rival.getSuperPoderes());
        if(contador < 0)
        {
            return "DERROTA";
        }
        if(contador >= 1)
        {
            return "TRIUNFO";
        }
        return "EMPATE";
    }
    
    
    
    
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: ").append(getNombre()) .append (" | ").append("Fuerza: ").append(getFuerza()) .append (" | ").append("Resistencia: ").append(getResistencia()) .append (" | ").append("SuperPoder: ").append(getSuperPoderes());
        return sb.toString();
    }
    

}
