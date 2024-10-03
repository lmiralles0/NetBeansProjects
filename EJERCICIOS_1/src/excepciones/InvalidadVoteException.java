

package excepciones;

/**
 *
 * @author Luciano Miralles
 */
public class InvalidadVoteException extends Exception{

    /**
     * Creates a new instance of <code>InvalidadVoteException</code> without detail message.
     */
    public InvalidadVoteException() {
    }


    /**
     * Constructs an instance of <code>InvalidadVoteException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public InvalidadVoteException(String msg) {
        super(msg);
    }
}
