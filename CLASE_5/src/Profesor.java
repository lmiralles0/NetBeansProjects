
/**
 *
 * @author Luciano Miralles
 */
public class Profesor extends Persona{
    private String especialidad; 
    
    public Profesor(String nombre, String apellido, Domicilio domicilio, String especialidad){
        super(nombre,apellido,domicilio);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    public void mostrarMatricula(){
        System.out.printf("Especialidad: %s\n", this.especialidad);
    }
}
