package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class calculatorTest {

	calculator c= new calculator();
	
	@Test
	public void testAdd() {
		assertEquals(0, c.add(""));
	}
	
	@Test
	public void singleDigitCheck() {
		assertEquals(3, c.add("3"));
	}
	
	@Test
	public void testSumWithCommas() {
		assertEquals(4, c.add("1,3"));
	}
}
