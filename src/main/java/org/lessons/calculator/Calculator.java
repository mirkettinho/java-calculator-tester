package org.lessons.calculator;

public class Calculator {
	
	///METHODS
	
	public float add(float num1, float num2) {
		
		return num1 + num2;
	}
	
	public float subtract(float num1, float num2) {
		
		return num1 - num2;
	}
	
	public float divide(float num1, float num2) throws Exception {
		
		if (num2 == 0) {
			throw new Exception("Error, can't be divided by zero");
		}
		return num1 / num2;
	}
	
	public float multiply(float num1, float num2) {
		
		return num1 * num2;
	}

}
