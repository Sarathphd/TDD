package com.sarath.calculator;

public class StringCalculator {
	
	
	public static int add(final String numbers) {
		
		// initial value is 0
	    int returnValue = 0;
	    
	    // the number split to comma's
	    String[] numbersArray = numbers.split(",");
	    
	    // if string lennght is lessthen 2 value throwing error 
	    if (numbersArray.length > 2) {
	        throw new RuntimeException("Up to 2 numbers separated by comma (,) are allowed");
	    }
	    
	    // now i am getting index of two value's    
	    for (String number : numbersArray) {
	        if (!number.trim().isEmpty()) { 
	        	// sum to index value and assign to initial value
	            returnValue += Integer.parseInt(number);
	        }
	    }
	    
	    // string is not empty return value is sum else return to 0
	    return returnValue;
	}
	
	
	public static void main(String[] args) {
		add("1,2");

	}

}
