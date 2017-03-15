package com.beliebers.americantaxes.maven.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.beliebers.americantaxes.maven.product.model.Product;
import com.beliebers.americantaxes.state.State;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class AppMain extends Application {
	private static List<Product> productList = new ArrayList<Product>();
	private static ArrayList<State> statesList = new ArrayList<State>();
	private Stage primaryStage;
	private AnchorPane rootLayout;
	
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

    		statesList.add(new State("Alabama", 0.04, 0.135, 0.135));
    		statesList.add(new State("Alaska", 0, 0.07, 0.07));
    		statesList.add(new State("Arizona", 0.056, 0.10725, 0.10725));
    		statesList.add(new State("Arkansas", 0.065, 0.11625, 0.11625));
    		statesList.add(new State("California", 0.0725, 0.0975, 0.0975));
            // Load root layout from fxml file.
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

	public static void main(String[] args) {
		
		launch(args);
	}
}
