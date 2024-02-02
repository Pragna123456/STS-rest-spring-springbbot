package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.tool.Operatins;

public class Testing {
	
         static Operatins obj=null;
	
	@BeforeClass
	public static void init() {
		
		obj=new Operatins();
	}
	@AfterClass
	public static  void destroy() {
		
		obj=null;
	}
	
	@Test
	public void testAdd() {
		
		int actual=obj.add(20, 40);
		int expected=60;
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void testMul() {
		
		int actual=obj.add(10, 20);
		int expected=200;
		assertEquals(expected, actual);
		
	}
	
	

}