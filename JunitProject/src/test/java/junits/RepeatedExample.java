package junits;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;


public class RepeatedExample {

	@RepeatedTest(3)
	public void addTest1() {
		
	assertEquals(10, Calculator.add(6, 4));
	
	}
	@Disabled
	@Test
	public void subTest1() {
		
		assertEquals(2, Calculator.sub(6, 4));
	}
	
}
