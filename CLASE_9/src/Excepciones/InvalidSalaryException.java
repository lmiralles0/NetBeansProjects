
package Excepciones;

/**
 *
 * @author Luciano Miralles
 */
public class InvalidSalaryException extends Exception{

    /**
     * Creates a new instance of <code>InvalidSalaryException</code> without
     * detail message.
     */
    public InvalidSalaryException() {
    }

    /**
     * Constructs an instance of <code>InvalidSalaryException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public InvalidSalaryException(String msg) {
        super(msg);
    }
}
