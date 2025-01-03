package boardgame;

/*essa classe é uma classe interna do tabuleiro onde apenas classes e subclasses dentro do mesmo pacote irão poder acessar
 * 
 */
public abstract class Piece {

	protected Position position;
	private Board board;

	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() {
		return board;
	}

	public abstract boolean[][] possibleMoves();

	public boolean possibleMove(Position position) {// ess função esta retornando a posição das peças chamado de rock
													// methods, esse metodo é concreto
		return possibleMoves()[position.getRow()][position.getColumn()];// aqui esta dependendo do metodo abstrato acima
	}

	public boolean isThereanypossibleMoves() {//aqui esta chamando o metodo abstrado possiblemoves, onde ira retornar a matriz boleano.
		boolean[][] mat = possibleMoves();//variavel auxiliar que ira receber as possiveis posições verdadeiras
		for (int i=0; i<mat.length; i++) {
			for(int j=0; j<mat.length; j++) {
				if(mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
}
