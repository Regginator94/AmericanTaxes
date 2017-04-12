package com.beliebers.americantaxes.state;

public class State {
	
	@Override
	public String toString() {
		return name;
	}

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
	
	public void setGroceriesTax(double productPrice, double overHowMuch) {
		if (productPrice > overHowMuch) {
			this.groceriesTax = baseTax;
		}
		else {
			this.groceriesTax = 0;
		}
	}

	public double getPreparedFoodTax() {
		return preparedFoodTax;
	}

	public void setPreparedFoodTax(double preparedFoodTax) {
		this.preparedFoodTax = preparedFoodTax;
	}

	public void setPreparedFoodTax(double productPrice, double overHowMuch) {
		if (productPrice > overHowMuch) {
			this.preparedFoodTax = baseTax;
		}
		else {
			this.preparedFoodTax = 0;
		}
	}
	
	public double getPrescriptionDrugTax() {
		return prescriptionDrugTax;
	}

	public void setPrescriptionDrugTax(double prescriptionDrugTax) {
		this.prescriptionDrugTax = prescriptionDrugTax;
	}
	
	public void setPrescriptionDrugTax(double productPrice, double overHowMuch) {
		if (productPrice > overHowMuch) {
			this.prescriptionDrugTax = baseTax;
		}
		else {
			this.prescriptionDrugTax = 0;
		}
	}

	public double getNonPrescriptionDrugTax() {
		return nonPrescriptionDrugTax;
	}

	public void setNonPrescriptionDrugTax(double nonPrescriptionDrugTax) {
		this.nonPrescriptionDrugTax = nonPrescriptionDrugTax;
	}
	
	public void setNonPrescriptionDrugTax(double productPrice, double overHowMuch) {
		if (productPrice > overHowMuch) {
			this.nonPrescriptionDrugTax = baseTax;
		}
		else {
			this.nonPrescriptionDrugTax = 0;
		}
	}

	public double getClothingTax() {
		return clothingTax;
	}
	
	public void setClothingTax(double clothingTax) {
		this.clothingTax = clothingTax;
	}
	
	public void setClothingTax(double productPrice, double overHowMuch) {
		if (productPrice > overHowMuch) {
			this.clothingTax = baseTax;
		}
		else {
			this.clothingTax = 0;
		}
	}

	public double getIntangiblesTax() {
		return intangiblesTax;
	}

	public void setIntangiblesTax(double intangiblesTax) {
		this.intangiblesTax = intangiblesTax;
	}

	public void setIntangiblesTax(double productPrice, double overHowMuch) {
		if (productPrice > overHowMuch) {
			this.intangiblesTax = baseTax;
		}
		else {
			this.intangiblesTax = 0;
		}
	}
	
	
}
