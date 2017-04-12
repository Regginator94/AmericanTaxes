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
	//dla
	public void initRootLayout() {
        try {
        	//dodać do odrebnych 
        	productList.add(new Product("Gruszki", 4.5));
    		productList.add(new Product("Grzyby", 40));
    		productList.add(new Product("Pizza z kurczakiem", 12.40));
    		productList.add(new Product("Kiełbasa", 14.90));
    		productList.add(new Product("Chleb", 2.70));
    		State stateAlabama = new State("Alabama", 0.04);
    		statesList.add(stateAlabama);
    		State stateArizona = new State("Arizona", 0.056);
    		statesList.add(stateArizona);
    		State stateArkansas = new State("Arkansas", 0.065);
     		statesList.add(stateArkansas);
     		State stateCalifornia = new State("California", 0.0725);
     		statesList.add(stateCalifornia);
     		State stateColorado = new State("Colorado", 0.029);
     		statesList.add(stateColorado);
     		State stateConnecticut = new State("Connecticut", 0.0635);
     		statesList.add(stateConnecticut);
     		State stateColumbia = new State("District of Columbia", 0.0575);
     		statesList.add(stateColumbia);
     		State stateFlorida = new State("Florida", 0.06);
     		statesList.add(stateFlorida);
     		State stateGeorgia = new State("Georgia", 0.04);
     		statesList.add(stateGeorgia);
     		State stateGuam = new State("Guam", 0.04);
     		statesList.add(stateGuam);
     		State stateHawaii = new State("Hawaii", 0.04166);
     		statesList.add(stateHawaii);
     		State stateIdaho = new State("Idaho", 0.06);
     		statesList.add(stateIdaho);
     		State stateIllinois = new State("Illinois", 0.0625);
			statesList.add(stateIllinois);
     		State stateIndiana = new State("Indiana", 0.07);
     		statesList.add(stateIndiana);
     		State stateIowa = new State("Iowa", 0.06);
			statesList.add(stateIowa);
     		State stateKansas = new State("Kansas", 0.065);
			statesList.add(stateKansas);
     		State stateKentucky = new State("Kentucky", 0.06);
			statesList.add(stateKentucky);
     		State stateLouisiana = new State("Louisiana", 0.05);
			statesList.add(stateLouisiana);
     		State stateMaine = new State("Maine", 0.055);
			statesList.add(stateMaine);
     		State stateMaryland = new State("Maryland", 0.06);
			statesList.add(stateMaryland);
     		State stateMassachusetts = new State("Massachusetts", 0.0625);
			statesList.add(stateMassachusetts);
     		State stateMichigan = new State("Michigan", 0.06);
			statesList.add(stateMichigan);
     		State stateMinnesota = new State("Minnesota", 0.06875);
			statesList.add(stateMinnesota);
     		State stateMississippi = new State("Mississippi", 0.07);
			statesList.add(stateMississippi);
     		State stateMissouri = new State("Missouri", 0.04225);
			statesList.add(stateMissouri);
     		State stateNebraska = new State("Nebraska", 0.055);
			statesList.add(stateNebraska);
     		State stateNevada = new State("Nevada", 0.0685);
			statesList.add(stateNevada);
     		State stateJersey = new State("New Jersey", 0.06875);
			statesList.add(stateJersey);
     		State stateMexico = new State("New Mexico", 0.05125);
			statesList.add(stateMexico);
     		State stateYork = new State("New York", 0.04);
			statesList.add(stateYork);
     		State stateNCarolina = new State("North Carolina", 0.0475);
			statesList.add(stateNCarolina);
     		State stateNDakota = new State("North Dakota", 0.05);
			statesList.add(stateNDakota);
     		State stateOhio = new State("Ohio", 0.0575);
			statesList.add(stateOhio);
     		State stateOklahoma = new State("Oklahoma", 0.045);
			statesList.add(stateOklahoma);
     		State statePennsylvania = new State("Pennsylvania", 0.06);
			statesList.add(statePennsylvania);
     		State statePuerto = new State("Puerto Rico", 0.105);
			statesList.add(statePuerto);
     		State stateRhode = new State("Rhode Island", 0.07);
			statesList.add(stateRhode);
     		State stateSCarolina = new State("South Carolina", 0.06);
			statesList.add(stateSCarolina);
     		State stateSDakota = new State("South Dakota", 0.04);
			statesList.add(stateSDakota);
     		State stateTennessee = new State("Tennessee", 0.07);
			statesList.add(stateTennessee);
     		State stateTexas = new State("Texas", 0.0625);
			statesList.add(stateTexas);
     		State stateUtah = new State("Utah", 0.0595);
			statesList.add(stateUtah);
     		State stateVermont = new State("Vermont", 0.06);
			statesList.add(stateVermont);
     		State stateVirginia = new State("Virginia", 0.053);
			statesList.add(stateVirginia);
     		State stateWashington = new State("Washington", 0.065);
			statesList.add(stateWashington);
     		State stateWVirginia = new State("West Virginia", 0.06);
			statesList.add(stateWVirginia);
     		State stateWisconsin = new State("Wisconsin", 0.05);
			statesList.add(stateWisconsin);
     		State stateWyoming = new State("Wyoming", 0.04);
			statesList.add(stateWyoming);
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
