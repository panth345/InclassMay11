package calc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.Assert; 
import org.junit.Before;
class calculatorTest {
	private calculator objCalcUnderTest;

	@Before
	public void setUp() {
	//Arrange
	objCalcUnderTest = new calculator();
	}
	@Test
	void should_add() {
		int a = 15; int b = 20; 
		int expectedResult = 35;
		//Act 
		long result =  (long) objCalcUnderTest.addition(a,b);
		//Assert
		Assert.assertEquals(expectedResult, result);
		
	}
	@Test
	void should_subtract() {
		int a = 25; int b = 20; 
		int expectedResult = 5; 
		long result = (long)objCalcUnderTest.subtraction(a, b);
		Assert.assertEquals(expectedResult, result);
	}
	@Test
	void should_multiple() {
		int a = 10; int b = 25;
		long expectedResult = 250;
		long result = (long)objCalcUnderTest.multyplyng(a, b);
		Assert.assertEquals(expectedResult, result);
		
	}
	@Test
	void should_divide() {
		int a = 56; int b = 10; 
		double expectedResult = 5.6; 
		double result = objCalcUnderTest.division(a, b);
		Assert.assertEquals(expectedResult, result,0.00005);
	}
	@Test
	void should_provide_exponent() {
		int a = 2; int b = 3; 
		long expectedResult = 8; 
		long result = (long)objCalcUnderTest.exponentCal(a, b);
		Assert.assertEquals(expectedResult, result);
		assertTrue(true);
	}
}
