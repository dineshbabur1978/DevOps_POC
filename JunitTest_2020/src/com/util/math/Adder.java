package com.util.math;

public class Adder {

	int Value1=-1;
	int Value2=-1;
	
	public Adder(int Arg1, int Arg2){
		this.Value1=Arg1;
		this.Value2=Arg2;
	}
	
	/**
	 *  Method to Add Values
	 *  
	 * @return
	 */
	public int addValues()
	{
		System.out.println("Inside AddValues Method - Made Changes - Again & Again ");
		return Value1+Value2;
	}
	
}
