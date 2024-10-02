
package Excepciones;

/**
 *
 * @author Luciano Miralles
 */
public class ContacNotFoundException extends RuntimeException{

    /**
     * Creates a new instance of <code>ContacNoFoundException</code> without
     * detail message.
     */
    public ContacNotFoundException() {
    }

    /**
     * Constructs an instance of <code>ContacNoFoundException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public ContacNotFoundException(String msg) {
        super(msg);
    }
}
