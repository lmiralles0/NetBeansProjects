
package Objetos.com;
import Excepciones.InvalidSalaryException;
import Objetos.Empleado;

/**
 *
 * @author Luciano Miralles
 */
public class Temporal extends Empleado {
    
    private int horasPorSemana;
    
    public Temporal(String nombre, double salario, int horasPorSemana) throws InvalidSalaryException {
        super(nombre, salario);
        this.horasPorSemana = horasPorSemana;
    }

    public int getHorasPorSemana() {
        return horasPorSemana;
    }
    
    @Override
     public void trabajar(){
        try 
        {
            System.out.println(getNombre() + " está trabajando a tiempo parcial por " 
                + this.horasPorSemana + " horas a la semana");
        }catch(Exception e) {
            System.err.println("Error en el trabajo del empleado temporal " + e.getMessage());
        }finally {
            System.out.println("Trabajo del temporal procesado...");
        }
      
    }

}
