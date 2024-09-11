package chess;

import boardgame.Pecas;
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
	
	//Auxilia a movimentação da peça no tabuleiro. 
	public Peca_de_Xadrez performChessMove(ChessPosition posicaoOrigem, ChessPosition posicaoMira) {
		Position origem = posicaoOrigem.toPosition();
		Position Mira = posicaoMira.toPosition();
		//Validar se a posição de origem existe.
		validarOrigemPosicao(origem);
		Pecas capituraPeca = makeMove(origem, Mira);
		return (Peca_de_Xadrez)capituraPeca;
	}
	
	public void validarOrigemPosicao(Position position) {
		if (!tabuleiro.PecaAqui(position)) {
			throw new ChessException("Aqui não é a peça de origem");
		}
	}
	
	private Pecas makeMove(Position origem, Position mira) {
		//Removera a peça do lugar de origem
		Pecas p = tabuleiro.removepeca(origem);
		//Captura uma peça; Remove a peça do inimigo
		Pecas capituraPeca = tabuleiro.removepeca(mira);
		//Coloca a peça no novo Lugar
		tabuleiro.LugarPeca(p, mira);
		return capituraPeca;
	}
	
	private void placeNewPiece(char coluna, int linha, Peca_de_Xadrez peca) {
		tabuleiro.LugarPeca(peca, new ChessPosition(coluna, linha).toPosition());
	}
	
	public void SetupInicial() {
		placeNewPiece('a', 1, new Torre(tabuleiro, Cores.WHITE));
		placeNewPiece('h', 1, new Torre(tabuleiro, Cores.WHITE));
		placeNewPiece('e', 1, new Rei(tabuleiro, Cores.WHITE));
		
		placeNewPiece('a', 8, new Torre(tabuleiro, Cores.BLACK));
		placeNewPiece('h', 8, new Torre(tabuleiro, Cores.BLACK));
		placeNewPiece('e', 8, new Rei(tabuleiro, Cores.BLACK));
	}

}
