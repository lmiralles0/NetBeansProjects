
package com.universidad.excepciones;

/**
 *
 * @author Luciano Miralles
 */
public class LimiteRecursosException extends Exception{

    /**
     * Creates a new instance of <code>LimiteRecursosException</code> without
     * detail message.
     */
    public LimiteRecursosException() {
    }

    /**
     * Constructs an instance of <code>LimiteRecursosException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public LimiteRecursosException(String msg) {
        super(msg);
    }
}
