

package com.datos;

import java.io.Serializable;

/**
 *
 * @author Luciano Miralles
 */
public class Persona implements Serializable{
    
    private final String nombre;
    private final String apellido;
    private final int edad;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: ").append(this.nombre).append("\n");
        sb.append("Apellido: ").append(this.apellido).append("\n");
        sb.append("Edad: ").append(this.edad).append("\n");
        return sb.toString();
    }

}
