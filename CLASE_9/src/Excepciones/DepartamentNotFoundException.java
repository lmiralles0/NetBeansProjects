
package Excepciones;

/**
 *
 * @author Luciano Miralles
 */
public class DepartamentNotFoundException extends Exception{

    /**
     * Creates a new instance of <code>DepartamentNotFoundException</code>
     * without detail message.
     */
    public DepartamentNotFoundException() {
    }

    /**
     * Constructs an instance of <code>DepartamentNotFoundException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public DepartamentNotFoundException(String msg) {
        super(msg);
    }
}
