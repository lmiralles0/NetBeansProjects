
package modelo;
import java.util.Random;

/**
 *
 * @author Luciano Miralles
 */
public abstract class Libro {

    protected Autor autor;
    protected int cantidadDePaginas;
    protected String titulo;
    protected float precio;
    protected static Random generadorDePaginas;
    
    public Libro()
    {
        generadorDePaginas = new Random();
    }

    public Libro(String titulo, float precio, Autor autor) {
        this();
        this.autor = autor;
        this.titulo = titulo;
        this.precio = precio;
        cantidadDePaginas = 0;
    }
    
    public Libro(String titulo, float precio, String nombre, String apellido) {
        this(titulo, precio, new Autor(nombre, apellido));
    }
    
    
    public int getCantidadDePaginas()
    {
        if(cantidadDePaginas == 0)
        {
            cantidadDePaginas = generadorDePaginas.nextInt(31, 912);
        }
        return cantidadDePaginas;
    }
    
    
    public float getPrecio(){
        return precio;
    }
    
    
    private String mostrar(Libro lb){
        StringBuilder sb = new StringBuilder();
        sb.append("AUTOR: ").append(lb.autor.getNombreApellido()) .append("\n");
        sb.append("TITULO: ").append(lb.titulo) .append("\n");
        sb.append("CANT. PAGINAS: ").append(lb.getCantidadDePaginas()) .append("\n");
        sb.append("PRECIO: ").append(lb.precio) .append("\n");
        return sb.toString();
    }
    
    
    public boolean sonIguales(Libro lb1, Libro lb2){
        return lb1.autor == lb2.autor && lb1.titulo == lb2.titulo;
    }
    
    
    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof Libro lb)
        {
            return sonIguales(this, lb);
        }
        return false;
    }
    
    
    @Override
    public String toString()
    {
        return mostrar(this);
    }
    
}
