package chess;

import boardgame.Position;
import boardgame.Tabuleiro;
import chess.piece.Rei;
import chess.piece.Torre;

public class ChessMatch {

	private Tabuleiro tabuleiro;
	
	public ChessMatch() {
		tabuleiro = new Tabuleiro(8, 8);
		SetupInicial();
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
	
	public void SetupInicial() {
		tabuleiro.LugarPeca(new Torre(tabuleiro, Cores.WHITE), new Position(1, 2));
		tabuleiro.LugarPeca(new Rei(tabuleiro, Cores.BLACK), new Position(2, 2));
	}

}
