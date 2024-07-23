package application;

import chess.Peca_de_Xadrez;

public class UI {

	public static void printBoard(Peca_de_Xadrez[][] pecas) {
		for (int i = 0; i < pecas.length; i++) {
			System.out.print((8-i)+ " ");
			for (int j = 0; j< pecas.length; j++) {
				printPiece(pecas[i][j]);
			}
			System.out.println();
			//quebra de linha
		}
		System.out.println("  A B C D E F G H");
	}
	
	public static void printPiece(Peca_de_Xadrez peca) {
		if (peca == null) {
			System.out.print("-");
		}
		else {
			System.out.print(peca);
		}
		System.out.print(" ");
	}
	
	
}
