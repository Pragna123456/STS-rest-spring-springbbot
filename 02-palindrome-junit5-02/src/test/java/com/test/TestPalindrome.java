package com.test;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.t.PalindromeCheck;

public class TestPalindrome {
	
	@ParameterizedTest
	@ValueSource(strings={"racecar","madam"})
	public void testPalindrome(String str )
	{
		PalindromeCheck p=new PalindromeCheck();
		boolean b= p.isPalindrome(str);
		assertTrue(b);
	}

}
