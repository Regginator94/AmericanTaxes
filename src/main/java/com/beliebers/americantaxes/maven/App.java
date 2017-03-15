package com.beliebers.americantaxes.maven;

import java.util.ArrayList;

import com.beliebers.americantaxes.state.State;

/**
 * Hello world!
 *
 */
public class App 
{	
	private static ArrayList<State> statesList;
	
	
    public static void main( String[] args )
    {	
    	statesList.add(new State("Alabama",0.04,0.135,0.135));
    	statesList.add(new State("Alaska",0,0.07,0.07));
    	statesList.add(new State("Arizona",0.056,0.10725,0.10725));
    	statesList.add(new State("Arkansas",0.065,0.11625,0.11625));
    	statesList.add(new State("California",0.0725,0.0975,0.0975));
        System.out.println( "Hello World!" );
    }
}
