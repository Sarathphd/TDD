package com.sarath.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StringCalculatorTests {
	
	private final StringCalculator stringCalculator = new StringCalculator();
	
	// String is empty will return 0
	@Test
	public final void whenEmptyStringIsUsedThenReturnValueIs0() {
	   assertEquals(0, StringCalculator.add(""));
	}
	
	// The input value is one value getting return also same value
	@Test
	public final void whenOneNumberIsUsedThenReturnValueIsSameNumber() {
	    assertEquals(1, StringCalculator.add("1"));
	}
	
	
	// input is two value then return to sum of two value's 
	@Test
	public final void whenTwoNumbersAreUsedThenReturnValueIsTheirSum() {
	    assertEquals(1+2, StringCalculator.add("1,2"));
	}

}
