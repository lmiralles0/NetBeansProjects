
package com.controller;

import com.datos.Persona;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Luciano Miralles
 */
public class Ventana1Controller implements Initializable {
    
    @FXML
    private AnchorPane raiz; 
    
    //public List<Persona> personas = new ArrayList<>();
    public Persona personas;
    
    @FXML
    private TextField nombreV1, apellidoV1, edadV1;
    
    @FXML
    private void enviarDato(MouseEvent e)
    {
        Persona persona = new Persona(nombreV1.getText(), apellidoV1.getText(), Integer.parseInt(edadV1.getText()));
        //personas.add(persona);
        messages();
        verificarControls();
        
        Node node = (Node) e.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.close();
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/com/model/Ventana2.fxml"));
            stage.setUserData(persona);
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("Salida");

            /*Stage ventanaPrincipal = (Stage) ((javafx.scene.Node) e.getSource()).getScene().getWindow();
            ventanaPrincipal.hide();*/
            stage.show();
            //stage.setOnCloseRequest(eh -> ventanaPrincipal.show());
            
            
            
        } catch (IOException ex) {
            
        }
        
    }
    
    
    private void verificarControls() 
    {
        for(Node node : raiz.getChildren())
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
        alert.showAndWait();
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
