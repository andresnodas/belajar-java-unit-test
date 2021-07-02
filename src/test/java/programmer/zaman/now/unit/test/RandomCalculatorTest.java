package programmer.zaman.now.unit.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Random;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

public class RandomCalculatorTest extends ParentCalculatorTest{

	@Test
	public void testRandom(Random random) {
		int a = random.nextInt();
		int b = random.nextInt();
		
		assertEquals(a + b, calculator.add(a, b));
	}
	
	@DisplayName("Repeated Test")
	@RepeatedTest(
		value = 10,
		name = "{displayName} ke {currentRepetition} dari {totalRepetitions}"
	)
	public void testRepeatedRandom(Random random, TestInfo testInfo, RepetitionInfo repetitionInfo) {
		
		System.out.println(testInfo.getDisplayName() + " " 
				+ repetitionInfo.getCurrentRepetition() + " " + repetitionInfo.getTotalRepetitions());
		
		int a = random.nextInt();
		int b = random.nextInt();
		
		assertEquals(a + b, calculator.add(a, b));
	}
	
}
