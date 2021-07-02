package programmer.zaman.now.unit.test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;

public class MockTest {

	@Test
	public void testMock() {
		
//		List<String> list = new ArrayList<>();
		List<String> list = mock(List.class);
		
		//Menambahkan behavior
		when(list.get(0)).thenReturn("Andres");
		when(list.get(100)).thenReturn("Nodas");
		
		System.out.println(list.get(0)); //Andres
		System.out.println(list.get(100)); //Nodas
		
		verify(list, times(1)).get(0);
	}
	
}
