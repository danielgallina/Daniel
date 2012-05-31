
public class Artista {
		private String nome;
		private String nacionalidade;		
		private Ritmo estilo;
		
		public Artista(String nome, String nacionalidade){
			this.nome = nome;
			this.nacionalidade = nacionalidade;
		}
		
		private String getNome() {
			return nome;
		}
		
		private void setNome(String nome) {
			this.nome = nome;
		}
		
		private String getNacionalidade() {
			return nacionalidade;
		}
		
		private void setNacionalidade(String nacionalidade) {
			this.nacionalidade = nacionalidade;
		}

		public Ritmo getEstilo() {
			return estilo;
		}
		
		public void setEstilo(Ritmo estilo) {
			this.estilo = estilo;
		}
		
		
}
