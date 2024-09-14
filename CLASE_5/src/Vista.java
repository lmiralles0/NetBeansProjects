/**
 *
 * @author Luciano Miralles
 */
public class Vista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // creacion de un domicilio
        Domicilio domicilio1 = new Domicilio("Calle Falsa", 123, 1, "A");
        Domicilio domicilio2 = new Domicilio("Mitre", 750, 1, "A");
        // creacion de la persona con el domicilio
        Persona persona1 = new Persona("Ana", "Gomez",domicilio1);
        persona1.mostrarDomicilio();
        // creacion de una 2da persona con el mismo domicilio      
        Persona persona2 = new Persona("Ana", "Gomez",domicilio2);
        persona2.mostrarNombreApellido();
        persona2.mostrarDomicilio();
       
        // Modificacion del domicilio
        Profesor profesor1 = new Profesor("Carlos Andres", "Arroyo Diaz", domicilio2, "Programacion II");
        profesor1.mostrarMatricula();
        profesor1.mostrarNombreApellido();
    }

}
