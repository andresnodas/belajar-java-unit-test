package programmer.zaman.now.unit.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterCalculatorTest {

	private Calculator calculator = new Calculator();
	
	@DisplayName("Test Calculator with Parameter")
	@ParameterizedTest(name = "{displayName} with data {0}")
	@ValueSource(ints = {1,2,3,4,5})
	public void testWithParameter(int value) {
		int result = value + value;
		assertEquals(result, calculator.add(value, value));
	}	
	
	@DisplayName("Test Calculator with Parameter Method")
	@ParameterizedTest(name = "{displayName} with data {0}")
	@MethodSource(value = {"parameterSource"})
	public void testWithMethodSource(Integer value) {
		int result = value + value;
		assertEquals(result, calculator.add(value, value));
	}	
	
	public static List<Integer> parameterSource() {
		return List.of(1, 2, 3, 4, 5);
	}
	
}
