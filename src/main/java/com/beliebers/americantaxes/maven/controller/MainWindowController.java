package com.beliebers.americantaxes.maven.controller;


import java.util.ArrayList;
import java.util.List;

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
	private List<Product> productList = new ArrayList<Product>();
	private static ArrayList<State> statesList = new ArrayList<State>();
	private static ArrayList<Category> categoriesList = new ArrayList<Category>();
	
	ObservableList<State> observableStatesList = null;
	ObservableList<Product> observableProductsList = null;
	private AppMain mainApp = null;
	@FXML
    public void setMainApp(AppMain mainApp) {
        this.mainApp = mainApp;
        // Add observable list data to the table
        //observableStatesList = mainApp.getObservableStatesList();
        //observableProductsList = mainApp.getObservableProductsList();
    }
	
	@FXML
	public void initialize() {
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
 		categoriesList.add(new Category("Groceries"));
 		categoriesList.add(new Category("Prepared Food"));
 		categoriesList.add(new Category("Prescription drug"));
 		categoriesList.add(new Category("Non-prescription drug"));
 		categoriesList.add(new Category("Clothing"));
 		categoriesList.add(new Category("Intangibles"));
 		List<Product> groceriesList = new ArrayList<Product>();
 		groceriesList.add(new Product("Mushrooms", 4.5));
 		groceriesList.add(new Product("Apples", 3.6));
 		categoriesList.get(0).setProductList(groceriesList);
 		List<Product> preparedFoodList = new ArrayList<Product>();
 		preparedFoodList.add(new Product("Pizza", 1.2));
 		preparedFoodList.add(new Product("Fies", 5.3));
 		categoriesList.get(1).setProductList(preparedFoodList);
 		List<Product> precriptionDrugList = new ArrayList<Product>();
 		precriptionDrugList.add(new Product("Marihuanen", 1.2));
 		precriptionDrugList.add(new Product("MDMA", 5.3));
 		categoriesList.get(1).setProductList(precriptionDrugList);
 		
		state.getItems().addAll(statesList);
		product.getItems().addAll(productList);
		category.getItems().addAll(categoriesList);
	
	}

	

    
}
