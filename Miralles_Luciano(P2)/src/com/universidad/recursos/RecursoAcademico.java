

package com.universidad.recursos;

import java.time.LocalDate;
import com.universidad.interfaces.Clasificable;
import com.universidad.interfaces.Evaluable;

/**
 *
 * @author Luciano Miralles
 */
public abstract class RecursoAcademico implements Clasificable, Evaluable{

    protected String identificador;
    protected String titulo;
    protected LocalDate fechaCreacion;
    protected String autor;

    public RecursoAcademico(String identificador, String titulo, LocalDate fechaCreacion, String autor) {
        this.identificador = identificador;
        this.titulo = titulo;
        this.fechaCreacion = fechaCreacion;
        this.autor = autor;
    }
    
    
    public String getIdentificador(){
        return this.identificador;
    }
    
    
    public String getTitulo(){
        return this.titulo;
    }
    
    
    public abstract double calcularRelevancia();
    public abstract void mostrarDetalles();
}
