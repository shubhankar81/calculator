package calculator;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class calculatorTest {

	calculator c= new calculator();
	
	@Test
	public void testAdd() throws Exception {
		assertEquals(0, c.add(""));
	}
	
	@Test
	public void singleDigitCheck() throws Exception {
		assertEquals(3, c.add("3"));
	}
	
	@Test
	public void testSumWithCommas() throws Exception {
		assertEquals(4, c.add("1,3"));
	}
	
	@Test
	public void testWithMultipleCommas() throws Exception {
		assertEquals(60, c.add("1,4,5,6,7,3,2,3,5,7,8,9"));
	}
	
	@Test
	public void testWithNewLines() throws Exception {
		assertEquals(10, c.add("1,2,3\n4"));
	}
	
	@Test
	public void testwithDelimeters() throws Exception {
		assertEquals(30, c.add("//;\\n10;20"));
	}
	@Test
	public void testWithMinus() {
		Throwable e = null;
		try {
			c.add("1,-2,3\n4");
		}catch(Throwable ex) {
			e = ex;
		}
		assertTrue(e instanceof Exception);
		
	}
}
