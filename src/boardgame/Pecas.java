  package boardgame;

public abstract class Pecas {

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
	//Não tera set, pois não queremos que o tabuleiro seja alterado.
	
	public abstract boolean[][] possibleMoves();
	
	//Ancora com o metodo abstrato
	public boolean possibleMoves(Position position) {
		return possibleMoves()[position.getLinha()][position.getLinha()];
	}
	
	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for (int i = 0; i< mat.length; i++) {
			for(int j = 0; j < mat.length; j++) {
				if (mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
	
}
