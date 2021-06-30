package programmer.zaman.now.unit.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledForJreRange;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.DisabledIfSystemProperty;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfSystemProperties;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

public class ConditionTest {

	@Test
	public void testSystemProperties() {
		
		System.getProperties().forEach((key, value) -> {
			System.out.println(key + " : " + value);
		});
		
	}
	
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
	
	@Test
	@EnabledIfSystemProperties({
		@EnabledIfSystemProperty(named = "java.vendor", matches = "Oracle Corporation")
	})
	public void enabledOnOracle() {
		System.out.println("Enabled on oracle");
	}
	
	@Test
	@DisabledIfSystemProperty(named = "java.vendor", matches = "Oracle Corporation")
	public void disabledOnOracle() {
		System.out.println("Disabled on oracle");
	}
	
	@Test
	@EnabledIfEnvironmentVariable(named = "PROFILE", matches = "DEV")
	public void enabledOnProfileDev() {
		System.out.println("Enabled on profile dev");
	}

	@Test
	@DisabledIfEnvironmentVariable(named = "PROFILE", matches = "DEV")
	public void disabledOnProfileDev() {
		System.out.println("Disabled on profile dev");
	}
}
