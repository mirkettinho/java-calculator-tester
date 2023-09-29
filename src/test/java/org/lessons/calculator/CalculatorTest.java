package org.lessons.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

	private Calculator calculator;
	
	
	@BeforeEach
	void init() {
		
		calculator = new Calculator();
	}
	
	///ADDITION
	@Test
	@DisplayName("Add")
	void add() {
		
		float result = calculator.add(10, 10);
		Assertions.assertEquals(20, result);
	}
	
	///SUBTRACTION
	@Test
	@DisplayName("Subtraction")
	void subtract() {
		
		float result = calculator.subtract(10, 8);
		Assertions.assertEquals(2, result);
	}
	
	///DIVISION
	@Test
	@DisplayName("Division")
	void divide() throws Exception {
		
		float result = calculator.divide(10, 2);
		Assertions.assertEquals(5, result);
	}
	
	@Test
	@DisplayName("Division By Zero")
	void divideByZero() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			calculator.divide(10, 0);
		});
	}
	
	///MULTIPLICATION
	@Test
	@DisplayName("multiplication")
	void multiply() {
		
		float result = calculator.multiply(10, 10);
		Assertions.assertEquals(100, result);
	}
}
