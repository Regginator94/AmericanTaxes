package com.beliebers.americantaxes.maven.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.beliebers.americantaxes.category.Category;
import com.beliebers.americantaxes.maven.product.model.Product;
import com.beliebers.americantaxes.state.State;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class AppMain extends Application {

	private Stage primaryStage;
	private AnchorPane rootLayout;
	private MainWindowController mainController = new MainWindowController();

	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
        this.primaryStage.setTitle("American Taxes");
        
        
        initRootLayout();
	}
	
	public void initRootLayout() {
        try {
     	
     	
    		mainController.setMainApp(this);
        	FXMLLoader loader = new FXMLLoader();
            loader.setLocation(AppMain.class.getResource("MainWindow.fxml"));
            rootLayout = (AnchorPane) loader.load();
          
           
           
           mainController.setMainApp(this);
            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            
            
    		
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



	public static void main(String[] args) {
		
		launch(args);
	}
}
