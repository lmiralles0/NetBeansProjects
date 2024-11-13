

package com.mycompany.serializacionjson;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mycompany.serializacionjson.model.Persona;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author Luciano Miralles
 */
public class SerializacionJson {

    public static void main(String[] args) {
        
        Persona persona = new Persona("javier", 30);
        ObjectMapper objectMapper = new ObjectMapper();
        try{
            objectMapper.writeValue(new File("persona.json"), persona);
            
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
