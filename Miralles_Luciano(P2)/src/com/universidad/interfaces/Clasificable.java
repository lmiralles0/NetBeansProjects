
package com.universidad.interfaces;

import com.universidad.excepciones.CategoriaInvalidaException;

/**
 *
 * @author Luciano Miralles
 */
public interface Clasificable {
    
    String[] obtenerCategoriasClasificacion();
    void asignarCategoria(String categoria) throws CategoriaInvalidaException;
    
}
