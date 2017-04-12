package com.beliebers.americantaxes.category;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.beliebers.americantaxes.maven.product.model.Product;

public class Category {
	private String name;
	private Map<Integer,Double> typeAndTax;
	private List<Product> productList = new ArrayList<Product>();
	
	public List<Product> getProductList() {
		return productList;
	}



	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}



	@Override
	public String toString() {
		return name;
	}


	
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
