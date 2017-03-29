package com.beliebers.americantaxes.maven.controller;

import java.util.ArrayList;
import java.util.List;

import com.beliebers.americantaxes.maven.product.model.Product;
import com.beliebers.americantaxes.state.State;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;

public class MainWindowController {
	@FXML 
	private ChoiceBox<State> state = new ChoiceBox<State>();
	@FXML 
	private ChoiceBox<String> category;
	@FXML 
	private ChoiceBox<Product> product =  new ChoiceBox<Product>();
	ObservableList<State> observableStatesList;
	ObservableList<Product> observableProductsList;
	private AppMain mainApp;
	
    public void setMainApp(AppMain mainApp) {
        this.mainApp = mainApp;
        System.out.println("test");
        // Add observable list data to the table
        observableStatesList = mainApp.getObservableStatesList();
        state.setItems(observableStatesList);
        observableProductsList = mainApp.getObservableProductsList();
        product.setItems(observableProductsList);
        System.out.println(observableProductsList);
    }
	@FXML
	public void initialize() {
		System.out.println("test");
		state.setItems(observableStatesList);
	    product.setItems(observableProductsList);
	    System.out.println(observableStatesList.get(0).toString());
	}
	

    
}
