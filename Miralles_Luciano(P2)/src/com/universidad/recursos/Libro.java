

package com.universidad.recursos;

import com.universidad.excepciones.CategoriaInvalidaException;
import com.universidad.interfaces.Evaluador;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Random;

/**
 *
 * @author Luciano Miralles
 */
public class Libro extends RecursoAcademico implements Serializable{
    
    public enum Formato{DIGITAL, IMPRESO, AMBOS};
    private int numeroPaginas;
    private String editorial;
    private Formato formato;
    private String categoria;
    private double puntaje;
    
    public Libro(int numeroPaginas, String editorial, Formato formato, String identificador, String titulo, LocalDate fechaCreacion, String autor){
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
        sb.append(" ______________________________________").append("\n");
        sb.append("|                LIBRO                 |").append("\n");
        sb.append(String.format("|TITULO:                     %-10s|", this.titulo)).append("\n");
        sb.append(String.format("|AUTOR:                      %-10s|",this.autor)).append("\n");
        sb.append(String.format("|EDITORIAL:                  %-10s|",this.editorial)).append("\n");
        sb.append(String.format("|PUBLICACION:                %-10s|",this.fechaCreacion)).append("\n");
        sb.append(String.format("|FORMATO:                    %-10s|",this.formato)).append("\n");
        sb.append(String.format("|INDENTIFICADOR:             %-10s|",this.identificador)).append("\n");
        sb.append(" ______________________________________").append("\n");
        System.out.println(sb.toString());
    }
    
    public boolean esLibroDigital()
    {
        return this.formato == Formato.DIGITAL;
    }
    
    
    @Override
    public String[] obtenerCategoriasClasificacion()
    {
        String[] categorias = new String[3];
        categorias[0] = "Ficcion literaria";
        categorias[1] = "No ficcion";
        categorias[2] = "Academicos";
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
