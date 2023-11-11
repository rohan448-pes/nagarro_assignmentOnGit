package com.company.calculator.calculators;

public abstract class InsCalculator {
	
	public abstract double basicInsurance(double price);
	
	
	public double premiumInsurance(double price)
	{
		double amount;
		double base = basicInsurance(price);
		amount = (base + 0.2*base);

		return amount;
	};

       }
