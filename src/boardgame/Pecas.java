package boardgame;

public class Pecas {

	// Portected para nao aparecer no tabuleiro
	protected Position posicao;
	private Tabuleiro tabuleiro;
	public Pecas(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
		posicao = null;
		//Inicialmente a peça ira ser nula. Não havera posição.
	}
	protected Tabuleiro getTabuleiro() {
		return tabuleiro;
	}
	//Não tera ser, pois não queremos que o tabuleiro seja alterado.
	
	
}
