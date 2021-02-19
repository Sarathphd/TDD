package com.sarath.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StringCalculatorTests {

	private final StringCalculator stringCalculator = new StringCalculator();

	// input value is empty will return 0
	@Test
	public final void whenEmptyStringIsUsedThenReturnValueIs0() {
		Assertions.assertEquals(0, stringCalculator.add(""));
	}

	// input value is one value getting return also same value
	@Test
	public final void whenOneNumberIsUsedThenReturnValueIsSameNumber() {
		Assertions.assertEquals(1, stringCalculator.add("1"));
	}


	// input is two value then return to sum of two value's 
	@Test
	public final void whenTwoNumbersAreUsedThenReturnValueIsTheirSum() {
		Assertions.assertEquals(1+2, stringCalculator.add("1,2"));
	}

	// input is more then two value it's throwing runtime expection
	//	@Test
	//	public final void whenMoreThan2NumbersAreUsedThenExceptionIsThrown() {
	//		Assertions.assertThrows(RuntimeException.class, () -> {
	//			stringCalculator.add("1,2,3");
	//		});
	//	}


	//Allow the Add method to handle an unknown amount of numbers
	@Test
	public final void whenAddMethodToHandleAnUnknownAmountOfNumbers() {
		Assertions.assertEquals(1+2+3+4+5+6, stringCalculator.add("1,2,3,4,5,6"));
	}

	
	//Add method to handle new lines between numbers (instead of commas)
	@Test
	public final void whenAddMethodToHandleNewLinesBetweenNumbersInsteadOfCommas() {
		Assertions.assertEquals(1+2+3, stringCalculator.add("1\n2,3"));
	}
}
