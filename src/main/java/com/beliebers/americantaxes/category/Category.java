package com.beliebers.americantaxes.category;

import java.util.Map;

public class Category {
	
	private String name;
	private Map<Integer,Double> typeAndTax;
	
	public Category(String name) {
		this.name = name;
	}
	
	public Category(String name, Map<Integer, Double> typeAndTax) {
		super();
		this.name = name;
		this.typeAndTax = typeAndTax;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<Integer, Double> getTypeAndTax() {
		return typeAndTax;
	}

	public void setTypeAndTax(Map<Integer, Double> typeAndTax) {
		this.typeAndTax = typeAndTax;
	}
	
}
