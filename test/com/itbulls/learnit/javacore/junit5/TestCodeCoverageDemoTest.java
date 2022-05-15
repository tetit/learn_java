package com.itbulls.learnit.javacore.junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCodeCoverageDemoTest {
	
	private TestCodeCoverageDemo testInstance = new TestCodeCoverageDemo();

	@Test
	void testStringNull() {
		testInstance.testCodeCoverage(null);
	}

}
