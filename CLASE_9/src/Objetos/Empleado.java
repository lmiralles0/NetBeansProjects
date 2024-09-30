
package Objetos;
import Excepciones.InvalidSalaryException;

/**
 *
 * @author Luciano Miralles
 */
public class Empleado {
    
    private String nombre;
    private double salario;

    public Empleado(String nombre, double salario) throws InvalidSalaryException{
        this.nombre = nombre;
        
        if(salario < 0) {
            throw new InvalidSalaryException("El salario no puede ser negativo");
        }
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }
    
    protected void mostrarDetalles(){
        System.out.println("Nombre: " + nombre + " Salario: " + salario);
    }
    
    public void trabajar(){
        System.out.println(this.nombre + " está trabajando");
    }

}
