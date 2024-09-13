package chess.piece;

import boardgame.Tabuleiro;
import chess.Cores;
import chess.Peca_de_Xadrez;

public class Rei extends Peca_de_Xadrez {

	public Rei(Tabuleiro tabuleiro, Cores cor) {
		super(tabuleiro, cor);
	}
	
	public String toString() {
		return "R";
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getTabuleiro().getLinha()][getTabuleiro().getColuna()];
		return mat;
	}

}
