package junits;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.testng.annotations.Test;

public class CalculatorTest {
	
	@Test
	public void addTest1() {
		assertEquals(10, Calculator.add(4, 6));
	}
	@Test
	public void subTest2() {
		assertEquals(1, Calculator.sub(5, 4));
	}
	

}
