

package com.universidad.recursos;

import com.universidad.excepciones.CategoriaInvalidaException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Luciano Miralles
 */
public class Articulo extends RecursoAcademico{
    
    private List<String> palabrasClave = new ArrayList<String>();
    private String revista;
    private String categoria;

    public Articulo(List<String> palabrasClave, String revista, String identificador, String titulo, LocalDate fechaCreacion, String autor) {
        super(identificador, titulo, fechaCreacion, autor);
        this.palabrasClave = palabrasClave;
        this.revista = revista;
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
        sb.append("|           ARTICULO              |").append("\n");
        sb.append("|¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯|").append("\n");
        sb.append(String.format("|TITULO:                     %-20s|", this.titulo)).append("\n");
        sb.append(String.format("|AUTOR:                      %-20s|",this.autor)).append("\n");
        sb.append(String.format("|REVISTA:                    %-20s|",this.revista)).append("\n");
        sb.append(String.format("|PUBLICACION:                %-20s|",this.fechaCreacion)).append("\n");
        sb.append(String.format("|INDENTIFICADOR:             %-20s|",this.identificador)).append("\n");
        sb.append(" ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯ ").append("\n");
    }              
    
    
    public int contarPalabrasClave()
    {
        return this.palabrasClave.size();
    }
    
    
    @Override
    public String[] obtenerCategoriasClasificacion()
    {
        String[] categorias = new String[3];
        categorias[0] = "Divulgatorios";
        categorias[1] = "Periodisticos";
        categorias[2] = "Cientificos";
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
        return calcularRelevancia()* 2;
    }
    
    
    @Override
    public void realizarEvaluacion(Evaluador evaluador)
    {

    }

}
