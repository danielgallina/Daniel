
public class Conta {

	private float saldo;
	private int numero; 
	
	public Conta(int i) {
		this.saldo = 0;		
		this.numero = i;
		System.out.println("Criado Conta " + this.numero + " com saldo " + this.saldo);
	}
	
	public Conta(int i, float valorInicial) {
		this.saldo = valorInicial;		
		this.numero = i;
		System.out.println("Criado Conta " + this.numero + " com saldo " + this.saldo);
	}

	public void deposita(float quantia) {
		System.out.println("Deposita: " + quantia );
		if (quantia > 0 )
		{
			this.saldo += quantia;
		}
		else
		{
			System.out.println("Valor de deposito tem que ser maior que zero.");		
		}
	}
	
	public void saca(float quantia) {
		System.out.println("Saca: " + quantia );
		if (quantia > 0 ) {
			if ( quantia <= this.saldo ){
				this.saldo -= quantia;
			}
			else
			{
				System.out.println("Saldo Insuficiente");			
			}
		}	
		else
		{
			System.out.println("Valor de saque tem que ser maior que zero.");		
		}
			
	}

	public float verSaldo() {
		System.out.println("Saldo: " + this.saldo );
		return this.saldo;
		
	}

	public int retornaNumeroConta() {
		System.out.println("Numero Conta: " + this.numero );
		return this.numero;
	}	
	

}
