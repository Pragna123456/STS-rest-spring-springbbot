package com.even;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.test.EvenOdd;

public class Testeven {

	
	
	@ParameterizedTest
	@ValueSource(ints = {2,4,8,6,14,10})
	public void  testEvenodd(int n)
	{
	EvenOdd e=new EvenOdd();
	boolean a=e.evenodd(n);
	assertTrue(a);
	}
}
