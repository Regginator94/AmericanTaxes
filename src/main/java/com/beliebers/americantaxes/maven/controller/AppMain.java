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
	private static List<Product> productList = new ArrayList<Product>();
	private static ArrayList<State> statesList = new ArrayList<State>();
	private static ArrayList<Category> categoriesList = new ArrayList<Category>();
	private Stage primaryStage;
	private AnchorPane rootLayout;
	private MainWindowController mainController = new MainWindowController();
	private ObservableList<State> observableStatesList;
	private ObservableList<Product> observableProductsList;
	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
        this.primaryStage.setTitle("American Taxes");
        
        
        initRootLayout();
	}
	
	public void initRootLayout() {
        try {
        	
        	productList.add(new Product("Gruszki", 4.5));
    		productList.add(new Product("Grzyby", 40));
    		productList.add(new Product("Pizza z kurczakiem", 12.40));
    		productList.add(new Product("Kiełbasa", 14.90));
    		productList.add(new Product("Chleb", 2.70));
    		statesList.add(new State("Alabama", 0.04));
    		statesList.add(new State("Arizona", 0.056));
     		statesList.add(new State("Arkansas", 0.065));
     		statesList.add(new State("California", 0.0725));
     		statesList.add(new State("Colorado", 0.029));
     		statesList.add(new State("Connecticut", 0.0635));
     		statesList.add(new State("District of Columbia", 0.0575));
     		statesList.add(new State("Florida", 0.06));
     		statesList.add(new State("Georgia", 0.04));
     		statesList.add(new State("Guam", 0.04));
     		statesList.add(new State("Hawaii", 0.04166));
     		statesList.add(new State("Idaho", 0.06));
     		statesList.add(new State("Illinois", 0.0625));
     		statesList.add(new State("Indiana", 0.07));
     		statesList.add(new State("Iowa", 0.06));
     		statesList.add(new State("Kansas", 0.065));
     		statesList.add(new State("Kentucky", 0.06));
     		statesList.add(new State("Louisiana", 0.05));
     		statesList.add(new State("Maine", 0.055));
     		statesList.add(new State("Maryland", 0.06));
     		statesList.add(new State("Massachusetts", 0.0625));
     		statesList.add(new State("Michigan", 0.06));
     		statesList.add(new State("Minnesota", 0.06875));
     		statesList.add(new State("Mississippi", 0.07));
     		statesList.add(new State("Missouri", 0.04225));
     		statesList.add(new State("Nebraska", 0.055));
     		statesList.add(new State("Nevada", 0.0685));
     		statesList.add(new State("New Jersey", 0.06875));
     		statesList.add(new State("New Mexico", 0.05125));
     		statesList.add(new State("New York", 0.04));
     		statesList.add(new State("North Carolina", 0.0475));
     		statesList.add(new State("North Dakota", 0.05));
     		statesList.add(new State("Ohio", 0.0575));
     		statesList.add(new State("Oklahoma", 0.045));
     		statesList.add(new State("Pennsylvania", 0.06));
     		statesList.add(new State("Puerto Rico", 0.105));
     		statesList.add(new State("Rhode Island", 0.07));
     		statesList.add(new State("South Carolina", 0.06));
     		statesList.add(new State("South Dakota", 0.04));
     		statesList.add(new State("Tennessee", 0.07));
     		statesList.add(new State("Texas", 0.0625));
     		statesList.add(new State("Utah", 0.0595));
     		statesList.add(new State("Vermont", 0.06));
     		statesList.add(new State("Virginia", 0.053));
     		statesList.add(new State("Washington", 0.065));
     		statesList.add(new State("West Virginia", 0.06));
     		statesList.add(new State("Wisconsin", 0.05));
     		statesList.add(new State("Wyoming", 0.04));
     		observableStatesList = FXCollections.observableList(statesList);
     		observableProductsList = FXCollections.observableList(productList);
    		mainController.setMainApp(this);
        	FXMLLoader loader = new FXMLLoader();
            loader.setLocation(AppMain.class.getResource("MainWindow.fxml"));
            rootLayout = (AnchorPane) loader.load();
          
           

            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
    
            
    		
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

	public ObservableList<State> getObservableStatesList() {
		return observableStatesList;
	}



	public ObservableList<Product> getObservableProductsList() {
		return observableProductsList;
	}



	public static void main(String[] args) {
		
		launch(args);
	}
}
