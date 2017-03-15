package com.beliebers.americantaxes.maven.product.model;

public class Product {
	private String productName;
	private double price;
	
	public Product(String productName, double price) {
		this.productName = productName;
		this.price = price;
	}
	
	//GETTERS AND SETTERS SECTION 
	public double getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	} 
}
