
package com.controller;

import com.datos.Persona;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Luciano Miralles
 */
public class Ventana1Controller implements Initializable {
    
    @FXML
    private AnchorPane anchorV1; 
    
    public List<Persona> personas = new ArrayList<>();
    
    @FXML
    private TextField nombreV1, apellidoV1, edadV1;
    
    @FXML
    private void enviarDato(MouseEvent e)
    {
        Persona persona = new Persona(nombreV1.getText(), apellidoV1.getText(), Integer.parseInt(edadV1.getText()));
        personas.add(persona);
        messages();
        verificarControls();
    }
    
    private void verificarControls() 
    {
        for(Node node : anchorV1.getChildren())
        {
            if(node instanceof TextField tx)
            {
                tx.clear();
            } 
        }
    }
    
    private void messages() 
    {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Cargado con exito");
        alert.show();
        alert.close();
    }
    /**
     * Initializes the controller cl
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
