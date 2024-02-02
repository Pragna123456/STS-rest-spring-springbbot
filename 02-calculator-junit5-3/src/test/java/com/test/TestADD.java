package com.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.t.Calculator;

public class TestADD {
     
	@Test
	public void testAdd()
	{
		Calculator c=new Calculator();
		Integer a =c.add(20, 30);
		Integer e=50;
		assertEquals(a, e);
	}
	  
		@Test
		public void testMul()
		{
			Calculator c=new Calculator();
			Integer a=c.mul(30, 30);
			Integer e=900;
			assertEquals(a, e);
		}
}
