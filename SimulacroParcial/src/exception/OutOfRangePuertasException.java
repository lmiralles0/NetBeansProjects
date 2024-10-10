

package exception;

/**
 *
 * @author Luciano Miralles
 */
public class OutOfRangePuertasException extends Exception{

    /**
     * Creates a new instance of <code>OutOfRangePuertasException</code> without detail message.
     */
    public OutOfRangePuertasException() {
    }


    /**
     * Constructs an instance of <code>OutOfRangePuertasException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public OutOfRangePuertasException(String msg) {
        super(msg);
    }
}
