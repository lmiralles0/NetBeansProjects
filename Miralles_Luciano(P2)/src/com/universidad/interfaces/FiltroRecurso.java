
package com.universidad.interfaces;

import com.universidad.recursos.RecursoAcademico;

/**
 *
 * @author Luciano Miralles
 */
@FunctionalInterface
public interface FiltroRecurso {
    boolean evaluar(RecursoAcademico recurso);
}
