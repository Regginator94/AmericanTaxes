package com.beliebers.americantaxes.state;

public class State {
	
	private String name;
	private double baseTax;
	private double maxTax;
	private double totalTax;
	
	public State(String name, double baseTax, double maxTax, double totalTax) {
		this.name = name;
		this.baseTax = baseTax;
		this.maxTax = maxTax;
		this.totalTax = totalTax;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getBaseTax() {
		return baseTax;
	}
	
	public void setBaseTax(double baseTax) {
		this.baseTax = baseTax;
	}
	
	public double getMaxTax() {
		return maxTax;
	}
	
	public void setMaxTax(double maxTax) {
		this.maxTax = maxTax;
	}
	
	public double getTotalTax() {
		return totalTax;
	}
	
	public void setTotalTax(double totalTax) {
		this.totalTax = totalTax;
	}
}
