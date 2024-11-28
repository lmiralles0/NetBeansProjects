

package com.universidad.recursos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Luciano Miralles
 */
public class TrabajoInvestigacion extends RecursoAcademico{
    
    private List<String> autores = new ArrayList<String>();
    private String lineaInvestigacion;
    private boolean financiamiento;

    public TrabajoInvestigacion(List<String> autores, String lineaInvestigacion, boolean financiamiento, String identificador, String titulo, LocalDate fechaCreacion, String autor) {
        super(identificador, titulo, fechaCreacion, autor);
        this.autores = autores;
        this.lineaInvestigacion = lineaInvestigacion;
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
        sb.append("|      TRABAJO INVESTIGACION      |").append("\n");
        sb.append("|¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯|").append("\n");
        sb.append(String.format("|TITULO:                     %-20s|", this.titulo)).append("\n");
        sb.append(String.format("|AUTOR:                      %-20s|",this.autor)).append("\n");
        sb.append(String.format("|INVESTIGACION:              %-20s|",this.lineaInvestigacion)).append("\n");
        sb.append(String.format("|COLABORADORES:              %-20s|",this.autores)).append("\n");
        sb.append(String.format("|PUBLICACION:                %-20s|",this.fechaCreacion)).append("\n");
        sb.append(String.format("|INDENTIFICADOR:             %-20s|",this.identificador)).append("\n");
        sb.append(" ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯ ").append("\n");
    }
    
    
    public boolean tieneFinanciamiento()
    {
        return this.financiamiento;
    }
    
    
}
