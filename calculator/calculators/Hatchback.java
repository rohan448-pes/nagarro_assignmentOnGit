package com.company.calculator.calculators;
import com.company.calculator.constants.Constants;

public class Hatchback extends InsCalculator {
	double interest = Constants.HATCHBACK_INTEREST_VALUE / 100;

	@Override
	public double basicInsurance(double price) {
		double amount;
		amount = (int) (price * interest);

		return amount;
	};


}
	
	