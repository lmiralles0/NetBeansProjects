
package com.universidad.gestores;

import com.universidad.recursos.RecursoAcademico;
import java.util.ArrayList;
import java.util.List;
import com.universidad.excepciones.LimiteRecursosException;
import com.universidad.excepciones.RecursoNoEncontradoException;
import com.universidad.interfaces.FiltroRecurso;
import java.io.Serializable;
import java.util.Comparator;
import java.util.stream.Collectors;

/**
 *
 * @author Luciano Miralles
 */
public class GestorRecurso implements Serializable{
    
    private List<RecursoAcademico> recursos;
    private int limiteRecursos;
    
    
    public GestorRecurso()
    {
        recursos = new ArrayList<>();
    }
            
    public GestorRecurso(int limiteRecursos) 
    {
        this();
        this.limiteRecursos = limiteRecursos;
        recursos = new ArrayList<>(limiteRecursos);
    }

    
    public void agregarRecursos(RecursoAcademico recurso) 
    {
        try {
            if (recursos.size() >= limiteRecursos) {
                throw new LimiteRecursosException("Se ha alcanzado el límite de recursos permitidos.");
            }
            recursos.add(recurso);
        } catch (LimiteRecursosException e) {
            System.out.println(e.getMessage());
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
    
    
    public void informe() {
        recursos.forEach(recursoAcademico -> recursoAcademico.mostrarDetalles());
    }
}
