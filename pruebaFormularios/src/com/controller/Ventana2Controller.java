
package com.controller;

import com.datos.Persona;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Luciano Miralles
 */

public class Ventana2Controller implements Initializable {

    
    @FXML
    private AnchorPane raiz;
    
    @FXML
    private TextField nombreV2, apellidoV2, edadV2;
    
    
    @FXML
    public void mostrarData(MouseEvent e)
    {
        Stage stage = (Stage) this.raiz.getScene().getWindow();
        Persona persona = (Persona) stage.getUserData();
        nombreV2.setText(persona.getNombre());
        apellidoV2.setText(persona.getApellido());
        edadV2.setText(String.valueOf(persona.getEdad()));
    }
   
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
}
