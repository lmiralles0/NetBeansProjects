

package com.universidad.gestores;
import com.universidad.recursos.RecursoAcademico;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author Luciano Miralles
 */
public class Articulo extends RecursoAcademico implements Serializable{
    
    private List<String> palabrasClave = new ArrayList<String>();
    private String revista;

    public Articulo(List<String> palabrasClave, String revista, String identificador, String titulo, LocalDate fechaCreacion, String autor) {
        super(identificador, titulo, fechaCreacion, autor);
        this.palabrasClave = palabrasClave;
        this.revista = revista;
    }

    @Override
    public double calcularRelevancia() {
        Random rd = new Random();
        return rd.nextDouble(1,10);
    }

    @Override
    public void mostrarDetalles() {
        StringBuilder sb = new StringBuilder();
        sb.append("     Articulo     ").append("\n");
        sb.append("Identificador: ").append(this.identificador).append("\n");
        sb.append("Revista: ").append(this.revista) .append("\n");
        sb.append("Titulo: ").append(this.titulo).append("\n");
        sb.append("Autor: ").append(this.autor).append("\n");
        sb.append("Fecha: ").append(this.fechaCreacion).append("\n");
        System.out.print(sb.toString());
    }
    
    public int contarPalabrasClave() {
        return palabrasClave.size();
    }
    
    
}
