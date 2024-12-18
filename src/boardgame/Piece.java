package boardgame;

/*essa classe é uma classe interna do taubeilro onde apenas classes e subclasses dentro do mesmo pacote irão poder acessar
 * 
 */
public class Piece {

	protected Position position;
	private Board board;

	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() {
		return board;
	}

}
