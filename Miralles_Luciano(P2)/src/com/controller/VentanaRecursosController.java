
package com.controller;

import com.universidad.excepciones.LimiteRecursosException;
import com.universidad.excepciones.RecursoNoEncontradoException;
import com.universidad.gestores.GestorRecurso;
import com.universidad.recursos.Libro;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Luciano Miralles
 */
public class VentanaRecursosController implements Initializable {
    
    public GestorRecurso gestor = new GestorRecurso(50);
    //LIBRO
    @FXML
    private ComboBox<Libro.Formato> comboBoxFormato;
    
    
    @FXML
    private TextField textFieldIdentificadorLibro, textFieldTituloLibro,textFieldEditorial,textFieldNumeroPaginas, textFieldAutorLibro;
    
    
    @FXML
    private DatePicker datePickerFechaLibro;
      
  
    //LIBRO
    
    
    //ARTICULO
    
    //ARTICULO
    @FXML
    private AnchorPane anchorPaneLibro;


    @FXML
    private AnchorPane anchorPaneArticulo;
    
    
    @FXML
    private AnchorPane anchorPaneTrabajoInvestigacion;
    
    
    
    @FXML
    public void guardarRecursoLibro(MouseEvent event) throws RecursoNoEncontradoException, LimiteRecursosException
    {
        Libro aux = null;
        boolean action = verificarControls(anchorPaneLibro);
        if(action)
        {
            aux = new Libro(Integer.parseInt(textFieldNumeroPaginas.getText()), textFieldEditorial.getText(), Libro.Formato.valueOf(comboBoxFormato.getPromptText()), "AB"+textFieldIdentificadorLibro.getText(),textFieldTituloLibro.getText(),datePickerFechaLibro.getValue(),textFieldAutorLibro.getText());
            gestor.agregarRecursos(aux);
        }
        messageAlert(action);
        resetControls(anchorPaneLibro);
    }
    
    
    @FXML
    private void guardarRecursoArticulo(MouseEvent event)
    {
        messageAlert(verificarControls(anchorPaneArticulo));
        resetControls(anchorPaneArticulo);
    }
    
    
    @FXML
    private void guardarRecursoTrabajoInvestigacion(MouseEvent event)
    {
        messageAlert(verificarControls(anchorPaneTrabajoInvestigacion));
        resetControls(anchorPaneTrabajoInvestigacion);
    }
    
        
    
    private void messageAlert(boolean resultado)
    {
        if(resultado == true)
        {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Informacion");  
            alert.setContentText("Se agrego correctamente");
            alert.showAndWait();
        }
        else
        {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setContentText("Error al agregar recuros");
            alert.showAndWait();
        }
        
    }
    
    
    
    private void resetControls(AnchorPane anchorPane) {
        anchorPane.getChildren().forEach(node -> {
            if (node instanceof TextField textField) {
                textField.clear(); 
            } else if (node instanceof ComboBox) {
                ((ComboBox<Libro.Formato>) node).getSelectionModel().clearSelection(); 
            } else if (node instanceof  DatePicker datePicker){
                datePicker.setValue(null);
            }
        });
    }
    
    private boolean verificarControls(AnchorPane anchorPane) {
        for (javafx.scene.Node node : anchorPane.getChildren())
        {
            if(node instanceof TextField textField) 
            {
                if (textField.getText() == null || textField.getText().isEmpty()) 
                {
                    return false;
                }
            }
            else if (node instanceof ComboBox) 
            {
                ComboBox<Libro.Formato> comboBox = (ComboBox<Libro.Formato>) node;
                if (comboBox.getItems().isEmpty()) 
                {
                    return false;
                }
            }
            else if (node instanceof DatePicker datePicker) 
            {
                if (datePicker.getValue() == null) 
                {
                    return false;
                }
            }
        }
        return true;
    }
    
    
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        comboBoxFormato.getItems().addAll(Libro.Formato.values());
    }    
    
}
