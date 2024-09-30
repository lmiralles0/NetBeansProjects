
package Objetos.com;
import Excepciones.InvalidSalaryException;
import Objetos.Empleado;

/**
 *
 * @author Luciano Miralles
 */
public class Gerente extends Empleado{
    
    private String departamento;
    
    public Gerente(String nombre, double salario, String departamento) throws InvalidSalaryException{
        super(nombre, salario);
        this.departamento = departamento;
    }
    
    public void mostrarInformacion(){
        mostrarDetalles();  //nombre y salario
        System.out.println("Departamento: " + departamento);
    }
    
    @Override
     public void trabajar(){
         try{
             System.out.println(getNombre() + " está gestionando el departamento de "+ this.departamento);
         } catch (Exception e){
             System.err.println("Error en el trabajo del gerente: " + e.getMessage());
         } finally {
             System.out.println("Trabajo del gerente procesado...");
         }
        
    }

}
