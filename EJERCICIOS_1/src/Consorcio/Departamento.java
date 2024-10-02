
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
    
    public Departamento(int _unidadFuncional, String _nombrePropietario, String _dniPropietario)
    {
        setUnidadFuncional(_unidadFuncional);
        setNombrePropietario(_nombrePropietario);
        setDniPropietario(_dniPropietario);
        _voto = null;
    }

    public int getUnidadFuncional() {
        return _unidadFuncional;
    }

    private void setUnidadFuncional(int _unidadFuncional) {
        this._unidadFuncional = _unidadFuncional;
    }

    public String getNombrePropietario() {
        return _nombrePropietario;
    }

    private void setNombrePropietario(String _nombrePropietario) {
        this._nombrePropietario = _nombrePropietario;
    }

    public String getDniPropietario() {
        return _dniPropietario;
    }

    private void setDniPropietario(String _dniPropietario) {
        this._dniPropietario = _dniPropietario;
    }
    
    public Voto getVoto(){
        return this._voto;
    }
    
    public void setVoto(Voto voto){
        _voto = voto;
    }
    

}
