
package consorcio.servicio;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Luciano Miralles
 */
public class Edificio {
    
    private String _direccion;
    private int _cantidadDeDepartamentos;
    private List<Departamento> _departamentos;
    
    public Edificio(String direccion, int cantidadDeDepartamentos)
    {
        _departamentos = new ArrayList<>(cantidadDeDepartamentos);
        setCantidadDeDepartamentos(cantidadDeDepartamentos);
        setDireccion(direccion);
    }

    public String getDireccion() {
        return _direccion;
    }

    private void setDireccion(String direccion) {
        this._direccion = direccion;
    }

    public int getCantidadDeDepartamentos() {
        return _cantidadDeDepartamentos;
    }

    private void setCantidadDeDepartamentos(int cantidadDeDepartamentos) {
        this._cantidadDeDepartamentos = cantidadDeDepartamentos;
    }

    public List<Departamento> getDepartamentos() {
        return _departamentos;
    }

    public Departamento buscarDepartamento(int unidadFuncional){
        for(Departamento depto : _departamentos)
        {
            if(depto.getUnidadFuncional() == unidadFuncional)
            {
                return depto;
            }
            
        }
        return null;
    }
    
    public boolean agregarDepartamento(int unidadFuncional, String nombrePropietario, String dniPropietario)
    {
        if(_departamentos.size() < _cantidadDeDepartamentos)
        {
            Departamento depto = new Departamento(unidadFuncional, nombrePropietario, dniPropietario);
            if(buscarDepartamento(unidadFuncional) == null)
            {
                _departamentos.add(depto);
                return true;
            }
        }
        return false;
    }
    
    
    public boolean actualizarVoto(int numeroUnidad, Voto voto)
    {
        Departamento depto = buscarDepartamento(numeroUnidad);
        if(depto != null && depto.getVoto() != null)
        {
            depto.setVoto(voto);
            return true;
        }
        return false;
    }
    
    
    public void listarVotosNegativos()
    {
        for(Departamento depto : _departamentos)
        {
            if(depto.getVoto() == Voto.NEGATIVO)
            {
                System.out.println(depto);
            }
            
        }
    }
    
    
    public void mostrarPorcentajeParticipacion()
    {
        int participacion = 0;
        for(Departamento depto : _departamentos)
        {
            if(depto.getVoto() != null)
            {
                participacion ++;
            }
        }
        double porcentaje = (double) participacion / _departamentos.size() * 100;
        System.out.println("Porcentaje participacion\n" +  porcentaje);
    }

}
