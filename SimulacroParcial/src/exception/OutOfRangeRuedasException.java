

package exception;

/**
 *
 * @author Luciano Miralles
 */
public class OutOfRangeRuedasException extends Exception{

    /**
     * Creates a new instance of <code>OutOfRangeException</code> without detail message.
     */
    public OutOfRangeRuedasException() {
    }


    /**
     * Constructs an instance of <code>OutOfRangeException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public OutOfRangeRuedasException(String msg) {
        super(msg);
    }
}
