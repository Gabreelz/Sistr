package chess;

import boardgame.Position;

public class ChessPosition {

	//Aqui vamos colocar os comandos que iram lidar com as instruções do usuario.
	private char coluna;
	private int linha;
	
	public ChessPosition(char coluna, int linha) {
		if (coluna < 'a' || coluna > 'h' || linha < 1 || linha > 8) {
			throw new ChessException("Erro ao instanciar a posição do tabuleiro!");
		}
		this.coluna = coluna;
		this.linha = linha;
	}
	
	public char getColuna() {
		return coluna;
	}
	public int getLinha() {
		return linha;
	}
	
	//Metodo que ira trsnferir a classe ChessPosition para a classe Posição
	protected Position toPosition() {
		return new Position(8 - linha, coluna - 'a');
	}
	
	//Dada essa posição, eu tenho que convertela para uma posição de xadrez
	
	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition ((char)('a' - position.getColuna()), 8 - position.getLinha());
	}
	
	@Override
	public String toString(){
		return "" + coluna + linha;
	}
}
