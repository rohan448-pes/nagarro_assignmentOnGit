package com.company.calculator.calculators;

public class InsCalculatorFactory {

	public InsCalculator getInsCalculator(String carType) {
		InsCalculator car = null;

		switch (carType.toLowerCase())

		{
		case "hatchback":
			car = new Hatchback();

			break;

		case "sedan":
			car = new Sedan();

			break;

		case "suv":
			car = new SUV();

			break;

		}
		return car;
	}

}
	