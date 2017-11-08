package com.test.util;

import org.junit.Test;

import com.util.math.Adder;

import junit.framework.Assert;

public class TestAdder {

	@Test
	public void testAddValues() {
		Adder obj=new Adder(5,100);
		Assert.assertEquals(5+100, obj.addValues());
	}

}
