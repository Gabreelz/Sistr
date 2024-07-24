package chess.piece;

import boardgame.Tabuleiro;
import chess.Cores;
import chess.Peca_de_Xadrez;

public class Torre extends Peca_de_Xadrez {

	public Torre(Tabuleiro tabuleiro, Cores cor) {
		super(tabuleiro, cor);
	}
	
	@Override
	public String toString() {
		return "♜";
	}

	
}
