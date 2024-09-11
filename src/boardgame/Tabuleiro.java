package boardgame;

public class Tabuleiro {

	private int linha;
	private int coluna;
	private Pecas[][] pecas;
	
	public Tabuleiro(int linha, int coluna) {
		if (linha < 1 || coluna < 1) {
			throw new BoardException("ERROR criando o tabuleiro: é necessário que acha 1 linha ou uma coluna!!" );
		}
		this.linha = linha;
		this.coluna = coluna;
		pecas = new Pecas[linha][coluna];
	}
	public int getLinha() {
		return linha;
	}
	public int getColuna() {
		return coluna;
	}
	

	//Criando o tabuleiro
	public Pecas pecas(int linha, int coluna) {
		if (!posicaoExists(linha, coluna)) {
			throw new BoardException("Posição não está no tabuleiro!");
		}
		return pecas[linha][coluna];
	}
	
	public Pecas pecas(Position position){
		if(!posicaoExists(position)) {
			throw new BoardException("Posição não está no tabuleiro!");
		}
			return pecas[position.getLinha()][position.getColuna()];
	}
	
	//Metodo responsavel por colocar a peça no tabuleiro
	public void LugarPeca(Pecas peca, Position position) {
		if(PecaAqui(position)){
			throw new BoardException("Já há uma peça na posição " + position);
		}
		pecas[position.getLinha()][position.getColuna()] = peca;
		peca.posicao = position;
	}
	
	public Pecas removepeca(Position position) {
		//caso a posição não exista
		if (!posicaoExists(position)) {
			throw new BoardException("Posição não está no tabuleiro");
		}
		if (pecas(position) == null) {
			return null;
		}
		//Quando a peça for pega, ela não tem mais posição no tabuleiro (retirada)
		Pecas aux = pecas(position);
		aux.posicao = null;
		//Devolve o valor nulo para o local que a peça foi pega
		pecas[position.getLinha()][position.getColuna()] = null;
		return aux;
	}
	
	private boolean posicaoExists(int linha, int coluna) {
	    return linha >= 0 && linha < this.linha && coluna >= 0 && coluna < this.coluna;
	}
	
	public boolean posicaoExists(Position posicao) {
		return posicaoExists(posicao.getLinha(), posicao.getColuna());
	}
	
	public boolean PecaAqui(Position posicao) {
		if(!posicaoExists(posicao)) {
			throw new BoardException("Posição não está no tabuleiro!");
		}
		return pecas(posicao) != null;
	}
	
	
}
