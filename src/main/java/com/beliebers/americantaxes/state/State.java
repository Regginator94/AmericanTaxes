package com.beliebers.americantaxes.state;

public class State {
	
	private String name;
	private double baseTax;
	
	private double groceriesTax;
	private double preparedFoodTax;
	private double prescriptionDrugTax;
	private double nonPrescriptionDrugTax;
	private double clothingTax;
	private double intangiblesTax;
	
	public State(String name, double baseTax) {
		this.name = name;
		this.baseTax = baseTax;
		this.groceriesTax = baseTax;
		this.preparedFoodTax = baseTax;
		this.prescriptionDrugTax = baseTax;
		this.nonPrescriptionDrugTax = baseTax;
		this.clothingTax = baseTax;
		this.intangiblesTax = baseTax;
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

	public double getGroceriesTax() {
		return groceriesTax;
	}

	public void setGroceriesTax(double groceriesTax) {
		this.groceriesTax = groceriesTax;
	}

	public double getPreparedFoodTax() {
		return preparedFoodTax;
	}

	public void setPreparedFoodTax(double preparedFoodTax) {
		this.preparedFoodTax = preparedFoodTax;
	}

	public double getPrescriptionDrugTax() {
		return prescriptionDrugTax;
	}

	public void setPrescriptionDrugTax(double prescriptionDrugTax) {
		this.prescriptionDrugTax = prescriptionDrugTax;
	}
	
	public void setPrescriptionDrugTax(String condition) {
		//jesli cena wieksza niz 50
		if (!condition.equals(""))
			this.prescriptionDrugTax = prescriptionDrugTax;
	}

	public double getNonPrescriptionDrugTax() {
		return nonPrescriptionDrugTax;
	}

	public void setNonPrescriptionDrugTax(double nonPrescriptionDrugTax) {
		this.nonPrescriptionDrugTax = nonPrescriptionDrugTax;
	}

	public double getClothingTax() {
		return clothingTax;
	}


	
}
