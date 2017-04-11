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
	private ComboBox<State> state = new ComboBox<State>();
	@FXML 
	private ComboBox<Category> category;
	@FXML 
	private ComboBox<Product> product;
	
	ObservableList<State> observableStatesList = null;
	ObservableList<Product> observableProductsList = null;
	private AppMain mainApp = null;
	
    public void setMainApp(AppMain mainApp) {
        this.mainApp = mainApp;
        // Add observable list data to the table
        observableStatesList = mainApp.getObservableStatesList();
        observableProductsList = mainApp.getObservableProductsList();
        
       ;
	   // product.setItems(observableProductsList);
       

    }
	@FXML
	public void initialize() {
		System.out.println("test");
		state.setItems(observableStatesList);
		System.out.println(observableProductsList);
		category.getItems().add(new Category("rak"));
	  // System.out.println(observableStatesList.get(0).toString());
	}

	

    
}
