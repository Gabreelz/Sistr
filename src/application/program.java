package application;

import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPosition;
import chess.Peca_de_Xadrez;

public class program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();
		
		while (true) {
			UI.printBoard(chessMatch.getPecas());
			System.out.println();
			System.out.print("Origem: ");
			ChessPosition origem = UI.leituraPosition(sc);
			
			System.out.println();
			System.out.println("Posição de Mira: ");
			ChessPosition Mira = UI.leituraPosition(sc);
		
			Peca_de_Xadrez capturePiece = chessMatch.performChessMove(origem, Mira);
		}
	}

}
