package programmer.zaman.now.unit.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledForJreRange;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

public class ConditionTest {

	@Test
	@EnabledOnOs(value = {OS.WINDOWS, OS.LINUX})
	public void enabledOs() {
		System.out.println("Enabled Os test");
	}
	
	@Test
	@DisabledOnOs(value = {OS.WINDOWS})
	public void disabledOs() {
		System.out.println("Disabled Os test");
	}
	
	@Test
	@EnabledOnJre(value = {JRE.JAVA_8})
	public void onlyRunOnJava8() {
		System.out.println("Run in java 8");
	}
	
	@Test
	@DisabledOnJre(value = {JRE.JAVA_8})
	public void disabledOnJava8() {
		System.out.println("Disabled in java 8");
	}
	
	@Test
	@EnabledForJreRange(min = JRE.JAVA_8, max = JRE.JAVA_15)
	public void onlyRunOnJava8to15() {
		System.out.println("Run in java 8");
	}
	
	@Test
	@DisabledForJreRange(min = JRE.JAVA_8, max = JRE.JAVA_15)
	public void disabledOnJava8to15() {
		System.out.println("Disabled in java 8");
	}
	
}
