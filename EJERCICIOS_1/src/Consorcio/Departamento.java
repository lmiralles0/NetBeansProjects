
package Consorcio;

/**
 *
 * @author Luciano Miralles
 */
public class Departamento {
    private int _unidadFuncional;
    private String _nombrePropietario;
    private String _dniPropietario;
    private Voto _voto;
    
    public Departamento(int unidadFuncional, String nombrePropietario, String dniPropietario)
    {
        setUnidadFuncional(unidadFuncional);
        setNombrePropietario(nombrePropietario);
        setDniPropietario(dniPropietario);
        _voto = null;
    }

    public int getUnidadFuncional() {
        return _unidadFuncional;
    }

    private void setUnidadFuncional(int unidadFuncional) {
        this._unidadFuncional = unidadFuncional;
    }

    public String getNombrePropietario() {
        return _nombrePropietario;
    }

    private void setNombrePropietario(String nombrePropietario) {
        this._nombrePropietario = nombrePropietario;
    }

    public String getDniPropietario() {
        return _dniPropietario;
    }

    private void setDniPropietario(String dniPropietario) {
        this._dniPropietario = dniPropietario;
    }
    
    public Voto getVoto(){
        return this._voto;
    }
    
    public void setVoto(Voto voto){
        _voto = voto;
    }
    

}
