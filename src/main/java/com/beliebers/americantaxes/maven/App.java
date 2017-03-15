package com.beliebers.americantaxes.maven;

import java.util.ArrayList;
import com.beliebers.americantaxes.state.State;
import java.util.List;
import com.beliebers.americantaxes.maven.product.model.Product;

public class App 
{
	private static List<Product> productList = new ArrayList<Product>();
  	private static ArrayList<State> statesList = new ArrayList<State>();
  
    public static void main( String[] args )
    {
        productList.add(new Product("Gruszki", 4.5));
        productList.add(new Product("Grzyby", 40));
        productList.add(new Product("Pizza z kurczakiem", 12.40));
        productList.add(new Product("Kiełbasa", 14.90));
        productList.add(new Product("Chleb", 2.70));
      
       statesList.add(new State("Alabama",0.04,0.135,0.135));
    	statesList.add(new State("Alaska",0,0.07,0.07));
    	statesList.add(new State("Arizona",0.056,0.10725,0.10725));
    	statesList.add(new State("Arkansas",0.065,0.11625,0.11625));
    	statesList.add(new State("California",0.0725,0.0975,0.0975));
        System.out.println( "Hello World!" );
    }
}
