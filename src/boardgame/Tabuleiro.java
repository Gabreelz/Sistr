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
	public int getLinha() {
		return linha;
	}
	public void setLinha(int linha) {
		this.linha = linha;
	}
	public int getColuna() {
		return coluna;
	}
	public void setColuna(int coluna) {
		this.coluna = coluna;
	}
	

	//Criando o tabuleiro
	public Pecas pecas(int linha, int coluna) {
		return pecas[linha][coluna];
	}
	
	public Pecas pecas(Position position){
		return pecas[position.getLinha()][position.getColuna()];
	}
	
}
