package programmer.zaman.now.unit.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;

import programmer.zaman.now.unit.test.resolver.RandomParameterResolver;

@Extensions({
	@ExtendWith(RandomParameterResolver.class)
})
public class ParentCalculatorTest {

	protected Calculator calculator = new Calculator();
	
	@BeforeEach
	public void setUp() {
		System.out.println("before each");
	}
	
}
