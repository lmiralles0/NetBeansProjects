
package com.universidad.excepciones;

/**
 *
 * @author Luciano Miralles
 */
public class RecursoNoEncontradoException extends Exception{

    /**
     * Creates a new instance of <code>RecursoNoEncontradoException</code>
     * without detail message.
     */
    public RecursoNoEncontradoException() {
    }

    /**
     * Constructs an instance of <code>RecursoNoEncontradoException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public RecursoNoEncontradoException(String msg) {
        super(msg);
    }
}
