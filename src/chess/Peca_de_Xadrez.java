package chess;

import boardgame.Pecas;
import boardgame.Tabuleiro;

public abstract class Peca_de_Xadrez extends Pecas {

	private Cores cor;

	public Peca_de_Xadrez(Tabuleiro tabuleiro, Cores cor) {
		super(tabuleiro);
		this.cor = cor;
	}

	public Cores getCor() {
		return cor;
	}

}
