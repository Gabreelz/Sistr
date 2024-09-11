package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPosition;
import chess.Peca_de_Xadrez;

public class program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();
		
		while (true) {
			try {
				UI.clearScreen();
				UI.printBoard(chessMatch.getPecas());
				System.out.println();
				System.out.print("Origem: ");
				ChessPosition origem = UI.leituraPosition(sc);
				
				System.out.println();
				System.out.println("Posição de Mira: ");
				ChessPosition Mira = UI.leituraPosition(sc);
			
				Peca_de_Xadrez capturePiece = chessMatch.performChessMove(origem, Mira);
			}
			catch (ChessException e) {
				//Para o programa aguardar o usuario apertar ENTER
				System.out.println(e.getMessage());
				sc.nextLine();
			}
			catch (InputMismatchException e) {
				//Para o programa aguardar o usuario apertar ENTER
				System.out.println(e.getMessage());
				sc.nextLine();
			}
		}
	}

}
