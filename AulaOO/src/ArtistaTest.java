import static org.junit.Assert.*;

import org.junit.Test;


public class ArtistaTest {

	@Test
	public void test() {
		Artista artista = new Artista("João Gaita", "Javanês");
		artista.setEstilo(Ritmo.ranchera);
		assertEquals(Ritmo.ranchera, artista.getEstilo());
		
		artista = new Artista("Gallina", "Bagual");
		artista.setEstilo(Ritmo.merengue);
		assertEquals(Ritmo.salsa, artista.getEstilo());
	}

}
