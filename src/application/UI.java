package application;

import chess.ChessPiece;

public class UI {

	/*aqui esta imprimindo o layout do tabuleiro
	 * 
	 */
	public static void printBoard(ChessPiece[][] pieces){
		for(int i=0; i<pieces.length; i++) {
			System.out.print((8 - i) + " ");
			for(int j=0; j<pieces.length; j++) {
				printPiece(pieces[i][j]);
			}
			System.out.println();
		}
		System.out.println("  a b c d e f h");
	}
	/*aqui ele esta imprimindo uma peça do tabuleiro
	 * 
	 */
	private static void printPiece(ChessPiece piece) {
		if (piece == null) {
			System.out.print("-");
		}else {
			System.out.print(piece);
		}
		System.out.print(" ");
	}
}
