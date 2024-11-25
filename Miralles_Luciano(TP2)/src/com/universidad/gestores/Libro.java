

package com.universidad.gestores;
import com.universidad.recursos.RecursoAcademico;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Random;

/**
 *
 * @author Luciano Miralles
 */

public class Libro extends RecursoAcademico implements Serializable{
    public enum Formato{DIGITAL, IMPRESO};
    private int numeroPaginas;
    private String editorial;
    private Formato formato;
    
    
    public Libro(String identificador, String titulo, LocalDate fechaCreacion, String autor, int numeroPaginas, String editorial, Formato formato) {
        super(identificador, titulo, fechaCreacion, autor);
        this.numeroPaginas = numeroPaginas;
        this.editorial = editorial;
        this.formato = formato;
    }
    

    @Override
    public double calcularRelevancia() {
        Random rd = new Random();
        return rd.nextDouble(1,10);
    }

    @Override
    public void mostrarDetalles() {
        StringBuilder sb = new StringBuilder();
        sb.append("     Libro     ").append("\n");
        sb.append("Identificador: ").append(this.identificador).append("\n");
        sb.append("Titulo: ").append(this.titulo).append("\n");
        sb.append("Autor: ").append(this.autor).append("\n");
        sb.append("Editorial: ").append(this.editorial).append("\n");
        sb.append("Fecha: ").append(this.fechaCreacion).append("\n");
        sb.append("Formato: ").append(this.formato).append("\n");     
        sb.append("Numero de paginas: ").append(this.numeroPaginas).append("\n");
        System.out.print(sb.toString());
    }
    
    public boolean esLibroDigital()
    {
        return this.formato == Formato.DIGITAL;
    }
    
}
