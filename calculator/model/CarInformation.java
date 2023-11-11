package com.company.calculator.model;

public class CarInformation {
	private String model;
	private String type;
	private double price;
	private String insType;
	
	public CarInformation(String model, String type, double price, String insType) {
		super();
		this.model = model;
		this.type = type;
		this.price = price;
		this.insType = insType;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getInsType() {
		return insType;
	}

	public void setInsType(String insType) {
		this.insType = insType;
	}
	
	
}
