
package Objetos.com;
import Excepciones.InvalidSalaryException;
import Objetos.Empleado;

/**
 *
 * @author Luciano Miralles
 */
public class Pasante extends Empleado{
    
    private int duracionEnMeses;
    
    public Pasante(String nombre, double salario, int duracionEnMeses) throws InvalidSalaryException{
        super(nombre, salario);
        this.duracionEnMeses = duracionEnMeses;
    }

    public int getDuracionEnMeses() {
        return duracionEnMeses;
    }
    
    @Override
     public void trabajar(){
         try {
             System.out.println(getNombre() + " está trabajando como pasante por " 
                + this.duracionEnMeses + " meses");
         } catch(Exception e) {
             System.err.println("Error en el trabajo del pasante " + e.getMessage());
         } finally {
             System.out.println("Trabajo del pasante procesado...");
         }
        
    }
    
    

}
