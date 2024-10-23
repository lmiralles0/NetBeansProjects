
package modelo;

import java.util.Random;

/**
 *
 * @author Luciano Miralles
 */
public abstract class Disco {
    
    protected Artista artista;
    protected int anioLanzamiento;
    protected String titulo;
    protected float precio;
    protected static Random generadorDeAnio;
    
    
    public Disco()
    {
        generadorDeAnio = new Random();
    }
        
    public Disco(String titulo, float precio, Artista artista)
    {
        this();
        this.titulo = titulo;
        this.precio = precio;
        this.artista = artista;
        this.anioLanzamiento = 0;
    }
    
    public Disco(String titulo, float precio, String nombre, String generoMusical){
        this(titulo, precio,new Artista(nombre, generoMusical));
        this.anioLanzamiento = 0;
    }
    
    public int getAnioLazamiento()
    {
        if(anioLanzamiento == 0)
        {
            anioLanzamiento = generadorDeAnio.nextInt(1950, 2024);
            
        }
        return anioLanzamiento;
    }
    
    public float getPrecio()
    {
        return this.precio;
    }
    
    
    private String mostrar(Disco disco)
    {
        return "Titulo: " + disco.titulo + " | " 
               + "Artista/Genero: " + disco.artista.getNombreGenero() + " | " 
               + "Anio: " + disco.getAnioLazamiento() + " | " 
               + "Precio: $" + disco.precio + " | ";
    }
    
    
    public static boolean sonIguales(Disco d1, Disco d2) {
        return d1.titulo == d2.titulo && Artista.sonIguales(d1.artista, d2.artista);
    }
    
    
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Disco d) 
        {
            return sonIguales(this, d);
        }
        return false;
    }

    
    @Override
    public String toString() {
        return mostrar(this);
    }
    
    
    
    
    
    
    
    
    
    
}
