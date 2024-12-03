
package com.universidad.gestores;

import com.universidad.recursos.RecursoAcademico;
import java.util.ArrayList;
import java.util.List;
import com.universidad.excepciones.LimiteRecursosException;
import com.universidad.excepciones.RecursoNoEncontradoException;
import com.universidad.interfaces.FiltroRecurso;
import java.util.Comparator;
import java.util.stream.Collectors;

/**
 *
 * @author Luciano Miralles
 */
public class GestorRecurso {
    
    private List<RecursoAcademico> recursos;
    private int limiteRecursos;
    
    
    public GestorRecurso()
    {
        recursos = new ArrayList<RecursoAcademico>();
    }
            
    public GestorRecurso(int limiteRecursos) 
    {
        this();
        this.limiteRecursos = limiteRecursos;
        recursos = new ArrayList<RecursoAcademico>(limiteRecursos);
    }
    
    
    public String agregarRecursos(RecursoAcademico recurso) throws LimiteRecursosException, RecursoNoEncontradoException
    {
        try{
            if(recursos.size() >= limiteRecursos && (buscarRecurso(recurso.getIdentificador(), recurso.getTitulo()) != null))
            {
                throw new LimiteRecursosException("Error se alcanzo el limite de recursos.\n");
            }
            recursos.add(recurso);
            return "Recurso cargado con exito";
        }catch(LimiteRecursosException e)
        {
            return e.getMessage();
        }
    }
    
    
    public RecursoAcademico buscarRecurso(String identificador, String titulo) throws RecursoNoEncontradoException
    {
        try{
            for(int i = 0; i < recursos.size(); i++){
                if(recursos.get(i).getIdentificador().equals(identificador) && recursos.get(i).getTitulo().equals(titulo))
                {
                    return recursos.get(i);
                }
            }
            throw new RecursoNoEncontradoException("Recurso no encontrado.\n");
        }catch(RecursoNoEncontradoException e){
                e.getMessage();
        }
        return null;
    }
    
    
    public List<RecursoAcademico> filtrar(FiltroRecurso filtro)
    {
        return recursos.stream().filter(filtro::evaluar).collect(Collectors.toList());
    }
    
    
    public List<RecursoAcademico> ordenar(Comparator<RecursoAcademico> comparador)
    {
        return recursos.stream().sorted(comparador).collect(Collectors.toList());
    }
    
    
    
}
