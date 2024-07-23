package chess;

import boardgame.Tabuleiro;

public class ChessMatch {

	private Tabuleiro tabuleiro;
	
	public ChessMatch() {
		tabuleiro = new Tabuleiro(8, 8);
	}
	
	//Para que o programa reconheça apenas a camada do xadrez e não a do tabuleiro
	public Peca_de_Xadrez[][] getPecas(){
		Peca_de_Xadrez[][] mat = new Peca_de_Xadrez[tabuleiro.getLinha()][tabuleiro.getColuna()];
		for (int i=0; i<tabuleiro.getLinha(); i++) {
			for (int j=0; j<tabuleiro.getColuna(); j++) {
				mat[i][j] = (Peca_de_Xadrez) tabuleiro.pecas(i, j);
			}
		}
		return mat;
	}

}
