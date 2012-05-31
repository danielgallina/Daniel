import static org.junit.Assert.*;

import org.junit.Test;


public class ContaTest {

	/*@Test
	 * public void testConta() {
				
		Conta conta = new Conta(1);
		Conta conta2 = new Conta(2);
		
		assertEquals(conta.retornaNumeroConta(),1,0.01);
		
		conta.deposita(100);
		assertEquals(conta.verSaldo(),100,0.01);
		
		conta.saca(40);
		assertEquals(conta.verSaldo(),60,0.01);
		
		assertEquals(conta2.retornaNumeroConta(),2,0.01);
		
		conta2.deposita(200);
		assertEquals(conta2.verSaldo(),200,0.01);
		
		conta2.saca(500);
		assertEquals(conta2.verSaldo(),200,0.01);
		
		conta2.saca(10);
		assertEquals(conta2.verSaldo(),190,0.01);
						
	}*/
	
	@Test
	public void testTipoContaPoupanca() {
		
		Poupanca poupanca;
		
		poupanca = new Poupanca(1);
		assertEquals(poupanca.verSaldo(),100,0.01);	
		
		poupanca.saca(40);
		assertEquals(poupanca.verSaldo(),60,0.01);
		
		poupanca.deposita(60);
		assertEquals(poupanca.verSaldo(),120,0.01);
		
	}
	
	@Test
	public void testTipoContaCorrente() {
		Corrente corrente = new Corrente(2,500);
		assertEquals(corrente.verSaldo(),500,0.01);
		
		corrente.saca(200);
		assertEquals(corrente.verSaldo(),300,0.01);
		
		corrente.deposita(100);
		assertEquals(corrente.verSaldo(),400,0.01);
	}
	

}
