package com.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.Timeout;

import com.t.Calculator;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestingJava {

	
    static Calculator obj = null;
	
    @BeforeEach
    public  void init() {
        obj = new Calculator();
    }

    @AfterEach
    public void destroy() {
        obj = null;
    }
    
	@Test
	@Timeout(2)
	@DisplayName("Addition format")
    @Order(2)
	@RepeatedTest(2)

	public void testAdd()
	{
		Calculator c=new Calculator();
		Integer a =c.add(20, 30);
		Integer e=50;
		assertEquals(a, e);
	}
	  
		@Test
	    @Order(1)

		public void testMul()
		{
			Calculator c=new Calculator();
			Integer a=c.mul(30, 30);
			Integer e=900;
			assertEquals(a, e);
		}
	
	@Disabled
    @Nested
    @Order(1)

	public class subTest	
	{

		@Test
		@Tag("test formal")
		public void testMull()
		{
			Calculator c=new Calculator();
			Integer a=c.mul(40, 30);
			Integer e=1200;
			assertEquals(a, e);
		}
			
	}
		
@Nested
@Order(3)

public class CalculatorTest1 {

    @TestFactory
    public Stream<DynamicTest> testAdd() {
        Calculator c = new Calculator();

        Object[][] testCases = {
                {20, 30, 50},      
                };
        return Stream.of(testCases)
                .map(testCase ->
                        DynamicTest.dynamicTest("Add: " + testCase[0] + " + " + testCase[1],
                                () -> {
                                    Integer actualResult = c.add((int) testCase[0], (int) testCase[1]);
                                    Integer expectedResult = (int) testCase[2];
                                    assertEquals(expectedResult, actualResult);
                                }));
    }
}
}
	    




