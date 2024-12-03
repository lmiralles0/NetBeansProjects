
package com.controller;

import com.universidad.gestores.GestorRecurso;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
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

    private GestorRecurso gestor = new GestorRecurso(50);
    @FXML
    private Label miLabel;
    
    @FXML 
    private Button buttonVentanaRecursos;
    
    public VentanaRecursosController formSecundario() throws IOException
    {
        Stage stage2 = new Stage();
        FXMLLoader loader = new FXMLLoader();
        AnchorPane root1 = (AnchorPane) loader.load(getClass().getResource("/com/modelo/VentanaRecursos.fxml").openStream());
        VentanaRecursosController controller = (VentanaRecursosController) loader.getController();
        return controller;
    }
    
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
            stage.showAndWait();
            stage.getUserData();
            ventanaPrincipal.show();
            
        }catch(IOException e)
        {
            e.printStackTrace();
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
        try {
            VentanaRecursosController v = formSecundario();
            v.gestor.informe();
        } catch (IOException ex) {
            
        }
        
        
        
        
    }    
    
}
