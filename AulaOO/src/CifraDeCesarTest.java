import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CifraDeCesarTest {

	private CifraDeCesar cifraDeCesar;

	@Before
	public void initialize() {
		cifraDeCesar = new CifraDeCesar();
	}

	@Test
	public void testarCriptografia() {
		assertEquals("ymj gttp nx ts ymj yfgqj", cifraDeCesar.criptografar("THE BOOK IS ON THE TABLE", 5));
	}

	@Test
	public void testarCriptografiaInicioAlfabeto() {
		assertEquals("h i j", cifraDeCesar.criptografar("a b c", 7));
	}
	
	@Test
	public void testarCriptografiaFimAlfabeto() {
		assertEquals("c b a", cifraDeCesar.criptografar("z y x", 3));		
	}	
	
	@Test
	public void testarCriptografiaFimAlfabetoMaiusculo() {
		assertEquals("c b a", cifraDeCesar.criptografar("Z Y X", 3));		
	}
	
	@Test
	public void testarCriptografiaFim() {
		assertEquals("b g", cifraDeCesar.criptografar("z e", 2));		
	}
	
}