package com.company.calculator.input;
import java.util.Scanner;

import com.company.calculator.model.CarInformation;

public class InputReader {
	
	
	public CarInformation readInput()
	{
		double carPrice = 0;
		String insuranceType;
		String carType;
		String carModel;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your car model: ");
		carModel = sc.next();
		
		System.out.println("Enter your car type (Sedan/Hatchback/SUV): ");
		carType = sc.next();
		
		boolean isValid = false;
		do {
		try {	
		System.out.println("Enter your car price: ");
		String carP = sc.next();
		carPrice = Double.parseDouble(carP);
		isValid = true;
		}
		catch(NumberFormatException ex )
		{
			System.out.println("please enter valid value");
			
		}
		}while (isValid==false);
		
		do {
		System.out.println("Enter your Insurance type: ");
		insuranceType = sc.next();
		}while(insuranceType.toLowerCase()=="premium"|| insuranceType.toLowerCase()=="basic" );
		
		return new CarInformation(carModel,carType,carPrice,insuranceType);
	};

}
