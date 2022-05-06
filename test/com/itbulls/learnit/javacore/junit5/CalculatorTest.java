package com.itbulls.learnit.javacore.junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void test() {
		var calculator = new Calculator();
		int actual = calculator.add(2, 3);
		assertEquals(5, actual);
		assertEquals(10, new Calculator().add(7, 3));
		
		
		
		
	}

}
