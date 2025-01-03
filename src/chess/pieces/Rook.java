package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {

	public Rook(Board board, Color color) {
		super(board, color);

	}

	@Override
	public String toString() {
		return "R";
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

		Position p = new Position(0, 0);

		// above
		p.setValues(position.getRow() - 1, position.getColumn());// aqui esta validando a lina vertical da peça para
																	// cima
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {// aqui est sendo testado se a posição
																				// esta vaga ou não
			mat[p.getRow()][p.getColumn()] = true;
			p.setRow(p.getRow() - 1);
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {// aqui esta verificando se há uma peça do
																		// hopoente n posição
		}

		// left
		p.setValues(position.getRow(), position.getColumn() - 1);// aqui esta validando a lina horizontal da peça para
																	// esquerda
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {// aqui est sendo testado se a posição
																				// esta vaga ou não
			mat[p.getRow()][p.getColumn()] = true;
			p.setColumn(p.getColumn() - 1);
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {// aqui esta verificando se há uma peça do
																		// hopoente n posição
		}
		// right
		p.setValues(position.getRow(), position.getColumn() + 1);// aqui esta validando a lina horizontal da peça para
																	// direita
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {// aqui est sendo testado se a posição
																				// esta vaga ou não
			mat[p.getRow()][p.getColumn()] = true;
			p.setColumn(p.getColumn() + 1);
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {// aqui esta verificando se há uma peça do
																		// hopoente n posição
		}
		// below
		p.setValues(position.getRow() + 1, position.getColumn());// aqui esta validando a lina vertical da peça para
																	// baixo
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {// aqui est sendo testado se a posição
																				// esta vaga ou não
			mat[p.getRow()][p.getColumn()] = true;
			p.setRow(p.getRow() + 1);
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {// aqui esta verificando se há uma peça do
																		// hopoente n posição
		}
		return mat;
	}
}
