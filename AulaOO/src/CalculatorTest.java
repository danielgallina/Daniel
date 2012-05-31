import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class CalculatorTest {
	
	Calculator calc;
	
	@Before
	public void setUp() {
		calc = new Calculator(50,2);
	}	
	
	@Test
	public void testAdd() {		
		assertEquals(calc.add(),52,0.01);
	}

	@Test
	public void testSub() {		
		assertEquals(calc.sub(),48,0.01);
	}
	
	@Test
	public void testMult() {		
		assertEquals(calc.mult(),100,0.01);
	}
	
	@Test
	public void testDiv() {
		assertEquals(calc.div(),25,0.01);
	}
	
	@Test
	public void fatorialTeste() {		
		assertEquals(calc.fat(5),120,0.01);
	}
	
	@Test
	public void fatorialTesteSemConstrutor() {
		Calculator calc = new Calculator();
		double x = calc.fat(5);	
		
		assertEquals(x,120,0.01);
	}	
}
