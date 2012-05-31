import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TerritorioTest {

	Territorio cidade;
	Territorio fazenda;
	Meteoro meteoro;
	int quantidadeMetoro;
	Boolean territorioOk;

	@Test
	public void test() {
		cidade = new Territorio(0,0,10,20,null);
		fazenda = new Territorio(4,5,7,15,cidade);
		
		meteoro = new Meteoro(1,5);
		cidade.getListaMeteoro().add(meteoro);
		
		meteoro = new Meteoro(2,1);
		cidade.getListaMeteoro().add(meteoro);
		
		meteoro = new Meteoro(3,7);
		cidade.getListaMeteoro().add(meteoro);

		meteoro = new Meteoro(6,6);
		cidade.getListaMeteoro().add(meteoro);

		meteoro = new Meteoro(7,7);
		cidade.getListaMeteoro().add(meteoro);	
				
		territorioOk = fazenda.validarEspacoTerritorio(cidade, fazenda);
		assertEquals(true,territorioOk);
		if ( territorioOk )
		{
		    quantidadeMetoro = fazenda.CalculaMeteoros(cidade);
		    assertEquals(2,quantidadeMetoro);
		    System.out.println("Quantidade de meteoros que cairam na fazenda do Gallina: " + quantidadeMetoro );
		}
		else
		{
			System.out.println("Fazenda maior que o territorio!");
			
		}
	}

}
