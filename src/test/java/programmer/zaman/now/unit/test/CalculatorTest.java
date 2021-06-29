package programmer.zaman.now.unit.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;
import org.opentest4j.TestAbortedException;

import programmer.zaman.now.unit.test.generator.SimpleDisplayNameGenerator;

//@DisplayName("Test Calculator")
@DisplayNameGeneration(value = SimpleDisplayNameGenerator.class)
public class CalculatorTest {

	private Calculator calculator = new Calculator();
	
	@BeforeAll
	public static void beforeAll() {
		System.out.println("Before all");
	}
	
	@AfterAll
	public static void afterAll() {
		System.out.println("After all");
	}
	
	@BeforeEach
	public void setUp() {
		System.out.println("Before each");
	}
	
	@AfterEach
	public void tearDown() {
		System.out.println("After each");
	}
	
	@Test
//	@DisplayName("Test Function Calculator.add(Integer, Integer)")
	public void testAddSuccess() {
		Integer result = calculator.add(10, 10);
		
		assertEquals(20, result);
	}
	
	@Test
	public void testDivideSuccess() {
		Integer result = calculator.divide(10, 2);
		
		assertEquals(5, result);
	}
	
	@Test
	public void testDivideThrowException() {
		
		assertThrows(IllegalArgumentException.class, () -> {
			calculator.divide(10, 0);
		});
		
	}
	
	@Test
	@Disabled
	public void testComingSoon() {
		
	}
	
	@Test
	public void testAborted() {
		
		String profile = System.getenv("PROFILE");
		if(!"DEV".equals(profile)) {
			throw new TestAbortedException("Test dibatalkan ");
		}
		
	}
	
	@Test
	public void testAssumptions() {
		
		assumeTrue("DEV".equals(System.getenv("PROFILE")));
		
		//Unit test untuk DEV
	}
	
}
