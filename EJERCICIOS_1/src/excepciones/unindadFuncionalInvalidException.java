
package excepciones;

/**
 *
 * @author Luciano Miralles
 */
public class unindadFuncionalInvalidException extends Exception {

    /**
     * Creates a new instance of <code>unindadFuncionalInvalidException</code>
     * without detail message.
     */
    public unindadFuncionalInvalidException() {
    }

    /**
     * Constructs an instance of <code>unindadFuncionalInvalidException</code>
     * with the specified detail message.
     *
     * @param msg the detail message.
     */
    public unindadFuncionalInvalidException(String msg) {
        super(msg);
    }
}
