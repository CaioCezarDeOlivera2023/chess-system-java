package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece {

	private Color color;

	// metodo das cores das peças
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	protected boolean isThereOpponentPiece(Position position) {//aqui ira verificar se há na posição uma peça adversaria.
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		return p != null && p.getColor() != color;//aqui esta verificando se a peça é da cor adversaria
	}
}
