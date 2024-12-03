

package com.universidad.recursos;

import com.universidad.excepciones.CategoriaInvalidaException;
import com.universidad.interfaces.Evaluador;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Luciano Miralles
 */
public class TrabajoInvestigacion extends RecursoAcademico implements Serializable{
    
    private List<String> autores = new ArrayList<String>();
    private String lineaInvestigacion;
    private boolean financiamiento;
    private String categoria;
    private double puntaje;

    public TrabajoInvestigacion(List<String> autores, String lineaInvestigacion, boolean financiamiento, String identificador, String titulo, LocalDate fechaCreacion, String autor){
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
        sb.append(" ______________________________________").append("\n");
        sb.append("|         TRABAJO INVESTIGACION        |").append("\n");
        sb.append(String.format("|TITULO:                     %-10s|", this.titulo)).append("\n");
        sb.append(String.format("|AUTOR:                      %-10s|",this.autor)).append("\n");
        sb.append(String.format("|INVESTIGACION:              %-10s|",this.lineaInvestigacion)).append("\n");
        sb.append(String.format("|COLABORADORES:       %-10s|",this.autores)).append("\n");
        sb.append(String.format("|PUBLICACION:                %-10s|",this.fechaCreacion)).append("\n");
        sb.append(String.format("|INDENTIFICADOR:             %-10s|",this.identificador)).append("\n");
        sb.append(" ______________________________________").append("\n");
        System.out.println(sb.toString());
    }
    
    
    public boolean tieneFinanciamiento()
    {
        return this.financiamiento;
    }
    
    
    @Override
    public String[] obtenerCategoriasClasificacion()
    {
        String[] categorias = new String[3];
        categorias[0] = "Experimental";
        categorias[1] = "Teorico";
        categorias[2] = "Aplicado";
        return categorias;
    }
    
    
    @Override
    public void asignarCategoria(String categoria) throws CategoriaInvalidaException
    {
        if(this.categoria == null)
        {
            for(int i = 0; i < obtenerCategoriasClasificacion().length; i++)
            {
                try{
                    if(obtenerCategoriasClasificacion()[i] == categoria)
                    {
                        this.categoria = categoria;
                        break;
                    }
                    else if( i == 2)
                    {
                        throw new CategoriaInvalidaException("Error categoria, invalida.\n");
                    }
                }catch(CategoriaInvalidaException e) {
                    e.getMessage();
                }
            }
        }
    }
    
    
    @Override
    public double obtenerPuntaje()
    {
        return calcularRelevancia() * this.puntaje* 2;
    }
    
    
    @Override
    public void realizarEvaluacion(Evaluador evaluador) {
        this.puntaje = evaluador.evaluar(this);
    }
}
