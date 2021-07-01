package programmer.zaman.now.unit.test;

import org.junit.jupiter.api.Test;

public class LifecycleTest {

	private String temp;
	
	@Test
	public void testA() {
		
		//Cara JUnit menjalankan test
		/*LifecycleTest lifecycleTest1 = new LifecycleTest();
		lifecycleTest1.testA();
		
		LifecycleTest lifecycleTest2 = new LifecycleTest();
		lifecycleTest2.testB();*/
		
		temp = "Andres Nodas";
	}
	
	@Test
	public void testB() {
		
		System.out.println(temp); //null
		
	}
	
}
