

package com.universidad.recursos;

import java.time.LocalDate;
import java.util.Random;

/**
 *
 * @author Luciano Miralles
 */
public class Libro extends RecursoAcademico{
    
    public enum Formato{DIGITAL, IMPRESO, AMBOS};
    private int numeroPaginas;
    private String editorial;
    private Formato formato;

    public Libro(int numeroPaginas, String editorial, Formato formato, String identificador, String titulo, LocalDate fechaCreacion, String autor) {
        super(identificador, titulo, fechaCreacion, autor);
        this.numeroPaginas = numeroPaginas;
        this.editorial = editorial;
        this.formato = formato;
    }

    
    @Override
    public double calcularRelevancia()
    {
        Random rm = new Random();
        return rm.nextDouble(1, 10);
    }
    
    
    @Override
    public void mostrarDetalles(){
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append(" _________________________________").append("\n");
        sb.append("|              LIBRO              |").append("\n");
        sb.append("|¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯|").append("\n");
        sb.append(String.format("|TITULO:                     %-20s|", this.titulo)).append("\n");
        sb.append(String.format("|AUTOR:                      %-20s|",this.autor)).append("\n");
        sb.append(String.format("|EDITORIAL:                  %-20s|",this.editorial)).append("\n");
        sb.append(String.format("|PUBLICACION:                %-20s|",this.fechaCreacion)).append("\n");
        sb.append(String.format("|FORMATO:                    %-20s|",this.formato)).append("\n");
        sb.append(String.format("|INDENTIFICADOR:             %-20s|",this.identificador)).append("\n");
        sb.append(" ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯ ").append("\n");
    }
    
    public boolean esLibroDigital()
    {
        return this.formato == Formato.DIGITAL;
    }
    

}
