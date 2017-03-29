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
	private MainWindowController mainController =  new MainWindowController();
	private ObservableList<State> observableStatesList;
	private ObservableList<Product> observableProductsList;
	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
        this.primaryStage.setTitle("AddressApp");
        
        
        initRootLayout();
	}
	
	public void initRootLayout() {
        try {
        	productList.add(new Product("Gruszki", 4.5));
    		productList.add(new Product("Grzyby", 40));
    		productList.add(new Product("Pizza z kurczakiem", 12.40));
    		productList.add(new Product("Kiełbasa", 14.90));
    		productList.add(new Product("Chleb", 2.70));


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
