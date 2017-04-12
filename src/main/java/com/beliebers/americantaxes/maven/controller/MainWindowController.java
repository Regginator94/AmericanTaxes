package com.beliebers.americantaxes.maven.controller;


import com.beliebers.americantaxes.category.Category;
import com.beliebers.americantaxes.maven.product.model.Product;
import com.beliebers.americantaxes.state.State;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;

public class MainWindowController {
	@FXML 
	private ComboBox<State> state = new ComboBox<State>();;
	@FXML 
	private ComboBox<Category> category = new ComboBox<Category>();
	@FXML 
	private ComboBox<Product> product = new ComboBox<Product>();;
	
	ObservableList<State> observableStatesList = null;
	ObservableList<Product> observableProductsList = null;
	private AppMain mainApp = null;
	@FXML
    public void setMainApp(AppMain mainApp) {
        this.mainApp = mainApp;
        // Add observable list data to the table
        observableStatesList = mainApp.getObservableStatesList();
        observableProductsList = mainApp.getObservableProductsList();
    }
	
	@FXML
	public void initialize() {
		state.getItems().addAll(new State("Arizona", 0.4), new State("Arkansas", 0.065), new State("California", 0.0725), new State("California", 0.0725));
		product.getItems().addAll(new Product("Gruszki", 4.5),new Product("Grzyby", 40),new Product("Pizza z kurczakiem", 12.40),new Product("Kiełbasa", 14.90),new Product("Chleb", 2.70));
		category.getItems().addAll(new Category("Groceries"), new Category("Groceries"), new Category("Prepared Food"), new Category("Prescription drug"),  new Category("Non-prescription drug"),  new Category("Clothing"), new Category("Intangibles"));
	  // System.out.println(observableStatesList.get(0).toString());
	}

	

    
}
