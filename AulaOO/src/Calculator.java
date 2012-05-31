
public class Calculator {
	
	private int a, b;
	
	public Calculator(int a, int b){
		this.a = a;
		this.b = b;				
	}
	
	public Calculator(int a){
		this.a = a;
	}	
	
	public Calculator(){
	}
	
	public double add()
	{
		return a+b;
	}

	public double sub() {		
		return a - b;
	}

	public double mult() {
		return a * b;
	}
	
	public double div() {
		return a / b;
	}

	public int fat() {		
		
		if ( a == 1 ){
			return  1;
		}
		else
		{
			return a * fat(a-1);			
		}
	}
	
	public int fat( int a) {		
		
		if ( a == 1 ){
			return  1;
		}
		else
		{
			return a * fat(a-1);			
		}
	}

	
	
}
