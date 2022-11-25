package org.LpDql.MonProjet.mon_appli;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class CalculatorTest {
	
	Calculator c;
	Calculator service = Mockito.mock(Calculator.class);

	
	@Before
	public void setUp(){
		this.c = new Calculator();
	}	
	
	@Test
	public void test() {
		assertEquals(5, c.add(3,2));
		when(service.add(4, 8)).thenReturn(5);
		assertEquals(5, service.add(4, 8));
		verify(service).add(4, 8);
		verify(service,times(1)).add(4, 8);
	}

}
