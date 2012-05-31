public class CifraDeCesar {
	
	private static final String alfabeto = "abcdefghijklmnopqrstuvwxyz";
	
	public String criptografar(String pTexto, int pDeslocamento) {
		
		pTexto = pTexto.toLowerCase();
		StringBuilder lRetorno = new StringBuilder();
		int lPosicaoNova = 0;
		int lCaracterTexto = 0;		 
		
		for (int i = 0 ; i < pTexto.length() ; i++) {
			
			lCaracterTexto = pTexto.charAt(i);
			lPosicaoNova = (alfabeto.indexOf(lCaracterTexto) + pDeslocamento) % 26;
			
			if (lCaracterTexto == ' ') {
				lRetorno.append(" ");
			} else {
				lRetorno.append(alfabeto.charAt(lPosicaoNova));
			}
		}
		return lRetorno.toString();
	}
}