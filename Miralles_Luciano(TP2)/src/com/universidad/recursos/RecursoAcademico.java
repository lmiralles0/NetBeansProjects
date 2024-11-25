

package com.universidad.recursos;
import java.time.LocalDate;

/**
 *
 * @author Luciano Miralles
 */
public abstract class RecursoAcademico {

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
    
    public abstract double calcularRelevancia();
    public abstract void mostrarDetalles();
    
}
