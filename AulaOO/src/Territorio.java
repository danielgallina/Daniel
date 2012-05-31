import java.util.ArrayList;
import java.util.List;


public class Territorio {
	
	private int coordenadaX;
	private int coordenadaY;
	private int largura;
	private int altura;
	private Territorio cidade;
	private List<Meteoro> listaMeteoro;
	
	
	public Territorio(int coordenadaX, int coordenadaY, int largura, int altura, Territorio cidade) {
		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;
		this.largura = largura;
		this.altura = altura;
		this.cidade = cidade;
		this.listaMeteoro = new ArrayList<Meteoro>();
	}
	
	public Boolean validarEspacoTerritorio(Territorio cidade, Territorio fazenda)
	{
		return ( ( fazenda.coordenadaX < cidade.largura ) &&
			( fazenda.coordenadaY < cidade.altura ) &&
			( fazenda.coordenadaX + fazenda.largura <= cidade.largura ) &&
			( fazenda.coordenadaY + fazenda.altura <= cidade.altura ) );
	}
	
	public List<Meteoro> getListaMeteoro()
	{
		return listaMeteoro;
	}

	public int CalculaMeteoros(Territorio cidade) {
		int qtde = 0;
		for (Meteoro meteoro : cidade.getListaMeteoro()) {
			
			if ( ( meteoro.getCoordenadaX() >= this.coordenadaX ) &&
			     ( meteoro.getCoordenadaX() <= this.coordenadaX + this.largura ) &&
			     ( meteoro.getCoordenadaY() >= this.coordenadaY ) &&
			     ( meteoro.getCoordenadaY() <= this.coordenadaY + this.altura ) )
			{
				qtde++;				
			}			
		}
		return qtde;
		
	}	

}
