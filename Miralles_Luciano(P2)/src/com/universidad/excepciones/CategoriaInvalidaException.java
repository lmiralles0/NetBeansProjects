
package com.universidad.excepciones;

/**
 *
 * @author Luciano Miralles
 */
public class CategoriaInvalidaException extends Exception {

    /**
     * Creates a new instance of <code>CategoriaInvalidaException</code> without
     * detail message.
     */
    public CategoriaInvalidaException() {
    }

    /**
     * Constructs an instance of <code>CategoriaInvalidaException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public CategoriaInvalidaException(String msg) {
        super(msg);
    }
}
