
package com.universidad.interfaces;

import com.universidad.recursos.RecursoAcademico;

/**
 *
 * @author Luciano Miralles
 */
public interface Evaluable {
    
    double obtenerPuntaje();
    void realizarEvaluacion(Evaluador evaluador);
    interface Evaluador{
        double evaluacion(RecursoAcademico ra);
    }
}
