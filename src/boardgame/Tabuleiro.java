package boardgame;

public class Tabuleiro {

	private int linha;
	private int coluna;
	private Pecas[][] pecas;
	public Tabuleiro(int linha, int coluna) {
		this.linha = linha;
		this.coluna = coluna;
		pecas = new Pecas[linha][coluna];
	}
	
	
	
}
