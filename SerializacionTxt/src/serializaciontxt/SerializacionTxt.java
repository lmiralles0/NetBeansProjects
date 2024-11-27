
package serializaciontxt;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author Luciano Miralles
 */
public class SerializacionTxt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona pers = new Persona("Luciano", 30);
        try{
            FileOutputStream fileOut = new FileOutputStream("persona.ser");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(pers);
        }catch(IOException e)
        {
            System.err.printf(e.getMessage());
        }
    }

}
