package com.beliebers.americantaxes.category;

import java.util.Map;

public class Category {
	
	private String name;
	private Map<String,Double> typeAndTax;
	
	public Category(String name) {
		this.name = name;
	}
	
	public Category(String name, Map<String, Double> typeAndTax) {
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

	public Map<String, Double> getTypeAndTax() {
		return typeAndTax;
	}

	public void setTypeAndTax(Map<String, Double> typeAndTax) {
		this.typeAndTax = typeAndTax;
	}
	
}
