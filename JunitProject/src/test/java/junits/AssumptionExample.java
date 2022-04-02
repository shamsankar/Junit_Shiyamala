package junits;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.*;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

public class AssumptionExample {
	@BeforeAll
	public static void SetUp() {
		System.setProperty("ENV", "PROD");
	}
	
	@Test
	public void test1() {
		
		assumeTrue("DEV".equals(System.getProperty("ENV")));
		
		assertTrue(StringFunctions.isPalindrome("madam"));
		assertTrue(StringFunctions.isPalindrome("racecar"));
	}

}
