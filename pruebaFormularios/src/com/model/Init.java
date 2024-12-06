/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package com.model;

import com.datos.Persona;
import java.awt.TextField;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 *
 * @author Luciano Miralles
 */
public class Init extends Application {
    
    
    public List<Persona> personas;
    
    @Override
    public void start(Stage primaryStage) {
        try {
            Parent load = FXMLLoader.load((getClass().getResource("/com/model/Ventana1.fxml")));
            Scene scene = new Scene(load);
            
            primaryStage.setScene(scene);
            primaryStage.setTitle("Entrada");
            primaryStage.show();
        } catch (IOException ex) {
            
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    //Persona p1 = new Persona("Luciano", "Miralles", 30);
    //Persona p2 = new Persona("Horacio", "Miralles", 27);
    //Persona p3 = new Persona("Maximo", "Miralles", 25);

    public Init() {
        //personas.add(p1);
        //personas.add(p2);
        //personas.add(p3);
        
    }
    
}
