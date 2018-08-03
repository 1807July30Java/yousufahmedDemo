package com.revature.hw;

public class Calculator <F extends Number, S extends Number> {
	
	public Calculator() {
		// TODO Auto-generated constructor stub
	}
	
	public double add(F first, S second)
	{
		
		return first.doubleValue() + second.doubleValue();
	}
	
	public double subtract(F first, S second)
	{
		
		return first.doubleValue() - second.doubleValue();
	}
	
	public double muliply(F first, S second)
	{
		
		return first.doubleValue() * second.doubleValue();
	}
	
	public double divide(F first, S second)
	{
		
		return first.doubleValue() / second.doubleValue();
	}

}
