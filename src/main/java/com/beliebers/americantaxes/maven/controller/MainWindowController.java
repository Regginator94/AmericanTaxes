package com.beliebers.americantaxes.maven.controller;


import java.util.ArrayList;
import java.util.List;

import com.beliebers.americantaxes.category.Category;
import com.beliebers.americantaxes.maven.product.model.Product;
import com.beliebers.americantaxes.state.State;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.text.Text;

public class MainWindowController {
	@FXML 
	private ComboBox<State> state = new ComboBox<State>();
	@FXML 
	private ComboBox<State> state2 = new ComboBox<State>();
	@FXML 
	private ComboBox<Category> category = new ComboBox<Category>();
	@FXML 
	private ComboBox<Product> product = new ComboBox<Product>();
	@FXML
	private Text price = new Text();
	private Text tax = new Text();
	private Text finalPrice = new Text();
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
        
        // wszystkie stany + niestandardowe podatki
        State stateAlabama = new State("Alabama", 0.04);
        statesList.add(stateAlabama);
        State stateArizona = new State("Arizona", 0.056);
        stateArizona.setGroceriesTax(0);
        stateArizona.setPrescriptionDrugTax(0);
        statesList.add(stateArizona);
        State stateArkansas = new State("Arkansas", 0.065);
        stateArkansas.setPrescriptionDrugTax(0);
        statesList.add(stateArkansas);
        State stateCalifornia = new State("California", 0.0725);
        stateCalifornia.setGroceriesTax(0);
        stateCalifornia.setPrescriptionDrugTax(0);
        statesList.add(stateCalifornia);
        State stateColorado = new State("Colorado", 0.029);
        stateColorado.setGroceriesTax(0);
        stateColorado.setPrescriptionDrugTax(0);
        statesList.add(stateColorado);
        State stateConnecticut = new State("Connecticut", 0.0635);
        stateConnecticut.setGroceriesTax(0);
        stateConnecticut.setPrescriptionDrugTax(0);
        stateConnecticut.setNonPrescriptionDrugTax(0);
        statesList.add(stateConnecticut);
        State stateColumbia = new State("District of Columbia", 0.0575);
        stateColumbia.setGroceriesTax(0);
        stateColumbia.setPrescriptionDrugTax(0);
        stateColumbia.setNonPrescriptionDrugTax(0);
        statesList.add(stateColumbia);
        State stateFlorida = new State("Florida", 0.06);
        stateFlorida.setGroceriesTax(0);
        stateFlorida.setPrescriptionDrugTax(0);
        statesList.add(stateFlorida);
        State stateGeorgia = new State("Georgia", 0.04);
        stateGeorgia.setPrescriptionDrugTax(0);
        statesList.add(stateGeorgia);
        State stateGuam = new State("Guam", 0.04);
        statesList.add(stateGuam);
        State stateHawaii = new State("Hawaii", 0.04166);
        statesList.add(stateHawaii);
        State stateIdaho = new State("Idaho", 0.06);
        stateIdaho.setPrescriptionDrugTax(0);
        statesList.add(stateIdaho);
        State stateIllinois = new State("Illinois", 0.0625);
        statesList.add(stateIllinois);
        State stateIndiana = new State("Indiana", 0.07);
        stateIndiana.setGroceriesTax(0);
        stateIndiana.setPrescriptionDrugTax(0);
        statesList.add(stateIndiana);
        State stateIowa = new State("Iowa", 0.06);
        stateIowa.setGroceriesTax(0);
        stateIowa.setPrescriptionDrugTax(0);
        statesList.add(stateIowa);
        State stateKansas = new State("Kansas", 0.065);
        statesList.add(stateKansas);
        State stateKentucky = new State("Kentucky", 0.06);
        stateKentucky.setGroceriesTax(0);
        stateKentucky.setPreparedFoodTax(0);
        statesList.add(stateKentucky);
        State stateLouisiana = new State("Louisiana", 0.05);
        statesList.add(stateLouisiana);
        State stateMaine = new State("Maine", 0.055);
        stateMaine.setGroceriesTax(0);
        stateMaine.setPrescriptionDrugTax(0);
        statesList.add(stateMaine);
        State stateMaryland = new State("Maryland", 0.06);
        stateMaryland.setGroceriesTax(0);
        stateMaryland.setPrescriptionDrugTax(0);
        statesList.add(stateMaryland);
        State stateMassachusetts = new State("Massachusetts", 0.0625);
        stateMassachusetts.setGroceriesTax(0);
        stateMassachusetts.setPrescriptionDrugTax(0);
        statesList.add(stateMassachusetts);
        State stateMichigan = new State("Michigan", 0.06);
        stateMichigan.setGroceriesTax(0);
        stateMichigan.setPrescriptionDrugTax(0);
        statesList.add(stateMichigan);
        State stateMinnesota = new State("Minnesota", 0.06875);
        stateMinnesota.setGroceriesTax(0);
        stateMinnesota.setPrescriptionDrugTax(0);
        statesList.add(stateMinnesota);
        State stateMississippi = new State("Mississippi", 0.07);
        statesList.add(stateMississippi);
        State stateMissouri = new State("Missouri", 0.04225);
        statesList.add(stateMissouri);
        State stateNebraska = new State("Nebraska", 0.055);
        stateNebraska.setGroceriesTax(0);
        statesList.add(stateNebraska);
        State stateNevada = new State("Nevada", 0.0685);
        stateNevada.setGroceriesTax(0);
        stateNevada.setPrescriptionDrugTax(0);
        statesList.add(stateNevada);
        State stateJersey = new State("New Jersey", 0.06875);
        stateJersey.setGroceriesTax(0);
        stateJersey.setPrescriptionDrugTax(0);
        statesList.add(stateJersey);
        State stateMexico = new State("New Mexico", 0.05125);
        stateMexico.setGroceriesTax(0);
        statesList.add(stateMexico);
        State stateYork = new State("New York", 0.04);
        stateYork.setGroceriesTax(0);
        stateYork.setPrescriptionDrugTax(0);
        statesList.add(stateYork);
        State stateNCarolina = new State("North Carolina", 0.0475);
        stateNCarolina.setPrescriptionDrugTax(0);
        statesList.add(stateNCarolina);
        State stateNDakota = new State("North Dakota", 0.05);
        stateNDakota.setGroceriesTax(0);
        statesList.add(stateNDakota);
        State stateOhio = new State("Ohio", 0.0575);
        stateOhio.setGroceriesTax(0);
        statesList.add(stateOhio);
        State stateOklahoma = new State("Oklahoma", 0.045);
        statesList.add(stateOklahoma);
        State statePennsylvania = new State("Pennsylvania", 0.06);
        statePennsylvania.setGroceriesTax(0);
        statePennsylvania.setPrescriptionDrugTax(0);
        statesList.add(statePennsylvania);
        State statePuerto = new State("Puerto Rico", 0.105);
        statePuerto.setPrescriptionDrugTax(0);
        statesList.add(statePuerto);
        State stateRhode = new State("Rhode Island", 0.07);
        stateRhode.setGroceriesTax(0);
        stateRhode.setPrescriptionDrugTax(0);
        statesList.add(stateRhode);
        State stateSCarolina = new State("South Carolina", 0.06);
        stateSCarolina.setGroceriesTax(0);
        stateSCarolina.setPrescriptionDrugTax(0);
        statesList.add(stateSCarolina);
        State stateSDakota = new State("South Dakota", 0.04);
        statesList.add(stateSDakota);
        State stateTennessee = new State("Tennessee", 0.07);
        statesList.add(stateTennessee);
        State stateTexas = new State("Texas", 0.0625);
        stateTexas.setGroceriesTax(0);
        stateTexas.setPrescriptionDrugTax(0);
        stateTexas.setNonPrescriptionDrugTax(0);
        statesList.add(stateTexas);
        State stateUtah = new State("Utah", 0.0595);
        stateUtah.setPrescriptionDrugTax(0);
        statesList.add(stateUtah);
        State stateVermont = new State("Vermont", 0.06);
        stateVermont.setGroceriesTax(0);
        stateVermont.setPrescriptionDrugTax(0);
        stateVermont.setNonPrescriptionDrugTax(0);
        statesList.add(stateVermont);
        State stateVirginia = new State("Virginia", 0.053);
        stateVirginia.setPrescriptionDrugTax(0);
        statesList.add(stateVirginia);
        State stateWashington = new State("Washington", 0.065);
        stateWashington.setGroceriesTax(0);
        stateWashington.setPrescriptionDrugTax(0);
        statesList.add(stateWashington);
        State stateWVirginia = new State("West Virginia", 0.06);
        stateWVirginia.setGroceriesTax(0);
        stateWVirginia.setPrescriptionDrugTax(0);
        statesList.add(stateWVirginia);
        State stateWisconsin = new State("Wisconsin", 0.05);
        stateWisconsin.setGroceriesTax(0);
        stateWisconsin.setPrescriptionDrugTax(0);
        statesList.add(stateWisconsin);
        State stateWyoming = new State("Wyoming", 0.04);
        stateWyoming.setGroceriesTax(0);
        stateWyoming.setPrescriptionDrugTax(0);
        statesList.add(stateWyoming);
        
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
 		categoriesList.get(2).setProductList(precriptionDrugList);
 		List<Product> nonPrecriptionDrugList = new ArrayList<Product>();
 		nonPrecriptionDrugList.add(new Product("LSD", 1.2));
 		nonPrecriptionDrugList.add(new Product("Aspiryna", 5.3));
 		categoriesList.get(3).setProductList(nonPrecriptionDrugList);
 		List<Product> clothingList = new ArrayList<Product>();
 		clothingList.add(new Product("T-shirt", 1.2));
 		clothingList.add(new Product("Slips", 5.3));
 		categoriesList.get(4).setProductList(clothingList);
 		List<Product> intangiblesList = new ArrayList<Product>();
 		intangiblesList.add(new Product("dunno", 1.2));
 		intangiblesList.add(new Product("dunno", 5.3));
 		categoriesList.get(5).setProductList(intangiblesList);
		state.getItems().addAll(statesList);
		state2.getItems().addAll(statesList);
		product.getItems().addAll(productList);
		category.getItems().addAll(categoriesList);
		
		category.valueProperty().addListener(new ChangeListener<Category>() {

			public void changed(ObservableValue<? extends Category> observable, Category oldValue, Category newValue) {
				Category cat = category.getValue();
				ObservableList<Product> catObList = FXCollections.observableArrayList(cat.getProductList());
				product.setItems(catObList);
				
			}    
	      });
		
		product.valueProperty().addListener(new ChangeListener<Product>() {

			public void changed(ObservableValue<? extends Product> observable, Product oldValue, Product newValue) {
		
			if(newValue == null) {
				price.setText("");
				tax.setText("");
				finalPrice.setText("");
			}
			else
				price.setText(String.valueOf(newValue.getPrice()));
				tax.setText("");
				finalPrice.setText("");
			}    
	      });
		

	}

	

    
}
