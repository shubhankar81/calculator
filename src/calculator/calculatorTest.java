package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class calculatorTest {

	@Test
	public void testAdd() {
		
		assertEquals(0, new calculator().add(""));
	}

}
