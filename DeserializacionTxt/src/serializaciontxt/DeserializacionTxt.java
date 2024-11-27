
package serializaciontxt;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author Luciano Miralles
 */
public class DeserializacionTxt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona = null;
        File file = new File("C:\\Users\\MCvitani\\Desktop\\Pro\\NetBeansProjects\\SerializacionTxt\\persona.ser");
        try{
            FileInputStream fileOut = new FileInputStream(file);
            ObjectInputStream objectOut = new ObjectInputStream(fileOut);
            persona = (Persona)objectOut.readObject();
            
        }catch(IOException  e)
        {
            System.err.print("No 1\n");
        }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
            System.err.print("No 2\n");
        }
        if(persona != null)
        {
            System.out.println(persona.toString());
        }
    }

}
