package com.test.util;

import org.junit.Ignore;
import org.junit.Test;

import com.util.math.Adder;

import junit.framework.Assert;

public class TestAdder {

	@Test
	public void testAddValues() {
		System.out.println("Inside Addddd");
		Adder obj=new Adder(5,100);
		Assert.assertEquals(5+100, 105);
		
	}
	

	public void testMinus()
	{
		//to-do 
		System.out.println("Inside Minus");
	}

}
