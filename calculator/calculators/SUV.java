package com.company.calculator.calculators;
import com.company.calculator.constants.Constants;

public class SUV extends InsCalculator {

	double interest = Constants.SUV_INTEREST_VALUE / 100;

	@Override
	public double basicInsurance(double price) {
		double amount;
		amount = (int) (price * interest);

		return amount;
	};
}

	