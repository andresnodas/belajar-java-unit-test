package programmer.zaman.now.unit.test;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

@Execution(ExecutionMode.CONCURRENT)
public class TimeoutTest {

	@Test
	@Timeout(value = 5, unit = TimeUnit.SECONDS)
	public void slow() throws InterruptedException {
		Thread.sleep(10_000);
	}
	
	@Test
	@Timeout(value = 4, unit = TimeUnit.SECONDS)
	public void slow2() throws InterruptedException {
		Thread.sleep(10_000);
	}
	
}
