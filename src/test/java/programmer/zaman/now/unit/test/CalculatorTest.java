package programmer.zaman.now.unit.test;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

	private Calculator calculator = new Calculator();
	
	@Test
	public void testAddSuccess() {
		Integer result = calculator.add(10, 10);
	}
	
}
