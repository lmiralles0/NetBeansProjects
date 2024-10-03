
package excepciones;

/**
 *
 * @author Luciano Miralles
 */
public class DniInvalidException extends Exception {

    /**
     * Creates a new instance of <code>DniInvalidException</code> without detail
     * message.
     */
    public DniInvalidException() {
    }

    /**
     * Constructs an instance of <code>DniInvalidException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public DniInvalidException(String msg) {
        super(msg);
    }
}
