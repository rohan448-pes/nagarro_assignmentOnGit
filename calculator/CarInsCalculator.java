package com.company.calculator;
import java.util.Scanner;

import com.company.calculator.calculators.InsCalculator;
import com.company.calculator.calculators.InsCalculatorFactory;
import com.company.calculator.input.InputReader;
import com.company.calculator.model.CarInformation;

public class CarInsCalculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String result = "y";

		try {
			while (result.equalsIgnoreCase("y")) {
				InputReader input = new InputReader();
				CarInformation info = input.readInput();
				InsCalculator car = new InsCalculatorFactory().getInsCalculator(info.getType());

				double amount = 0;
				if (info.getInsType().equalsIgnoreCase("basic")) {
					amount = car.basicInsurance(info.getPrice());

				} else if (info.getInsType().equalsIgnoreCase("premium"))
					amount = car.premiumInsurance(info.getPrice());
				else
					System.out.println("Please enter a valid insurance type");

				System.out.println("Car Model: " + info.getType() + "\nCar Price: " + info.getPrice()
						+ "\nInsurance Amount: " + amount);

				System.out.println("Do you want to enter details of any other car (y/n):");
				result = sc.next();

			}

		}

		catch (Exception ex) {
			System.out.println(ex);
		}

	}

}
