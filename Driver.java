package com.revature.hw;
import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args) {
	try {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
		String[] formula = name.split("\\s+");
		
		double firstNumber = Double.parseDouble(formula[0]);
		
		double secondNumber = Double.parseDouble(formula[2]);
		
		String operator = formula[1];
		
		Calculator<Double,Double> c = new Calculator<>();
		
		String add = "+";
		String subtract = "-";
		String multiply = "*";
		String divide = "/";
		
		double result = 0;
		
		
		if(operator.equals(add))
		{
			result = c.add(firstNumber, secondNumber);
		}
		else if(operator.equals(subtract))
		{
			result = c.subtract(firstNumber, secondNumber);
		}
		else if(operator.equals(multiply))
		{
			result = c.muliply(firstNumber, secondNumber);
		}
		else if(operator.equals(divide))
		{
			result = c.divide(firstNumber, secondNumber);
		}
		else
		{
			System.out.println("not a operator that matches, example 1 + 1");
		}

		System.out.println(result);
	}
	catch(NumberFormatException e)
	{
		System.out.println("not a numeric number or does not match, example 1 + 1");
	}
		
	}

}
