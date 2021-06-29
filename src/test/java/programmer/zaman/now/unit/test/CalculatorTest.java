package programmer.zaman.now.unit.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;

import programmer.zaman.now.unit.test.generator.SimpleDisplayNameGenerator;

//@DisplayName("Test Calculator")
@DisplayNameGeneration(value = SimpleDisplayNameGenerator.class)
public class CalculatorTest {

	private Calculator calculator = new Calculator();
	
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
	
}
