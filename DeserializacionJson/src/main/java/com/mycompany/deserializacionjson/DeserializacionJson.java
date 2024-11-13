

package com.mycompany.deserializacionjson;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mycompany.deserializacionjson.model.Persona;
import java.io.File;
import java.io.IOException;
/**
 *
 * @author Luciano Miralles
 */
public class DeserializacionJson {

    public static void main(String[] args) {
        
        ObjectMapper objectMapper = new ObjectMapper();
        try{
            File f = new File("/home/lmiralles/NetBeansProjects/SerializacionJson/persona.json");
            Persona persona = objectMapper.readValue(f, Persona.class);
            System.out.println(persona);
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
