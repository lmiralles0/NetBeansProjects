
package com.controller;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Luciano Miralles
 */
public class VentanaController implements Initializable {

    @FXML
    private Label miLabel;
    
    @FXML 
    private Button buttonVentanaRecursos;

    
    @FXML
    private void abrirVentanaRecursos(MouseEvent event){
        try{
            Parent root = FXMLLoader.load(getClass().getResource("/com/modelo/VentanaRecursos.fxml"));
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Recursos Academicos");
            stage.initModality(Modality.APPLICATION_MODAL);
            Stage ventanaPrincipal = (Stage)((javafx.scene.Node)event.getSource()).getScene().getWindow();
            ventanaPrincipal.hide();
            stage.show();
            stage.setOnCloseRequest(e -> ventanaPrincipal.show());
        }catch(IOException a)
        {
            
        }
    }
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
     miLabel.setText(LocalDate.now().toString());
        
    }    
    
}
