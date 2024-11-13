
package com.mycompany.serializacionjson.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author Luciano Miralles
 */
public class Persona {
    
    @JsonProperty("nombre")
    private String nombre;
    
    @JsonProperty("edad")
    private int edad;
    
    public Persona(){
        
    }
    
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("nombre=").append(nombre);
        sb.append(", edad=").append(edad);
        sb.append('}');
        return sb.toString();
    }

    
    
}
