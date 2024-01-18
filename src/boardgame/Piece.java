package boardgame;

public class Piece {
	
	protected Position position;
	/*
	 * Essa posição ainda não é a posição do xadrez
	 * ela é uma posição simples de uma matriz
	 * para não ser visivel na camada de xadrez, colocamos como protected
	 */
	
	private Board board;
	public Piece(Board board) {
		this.board = board;
		/*
		 * Construtor apenas com board
		 * para informar que a piece não foi colcada ainda (position = null;)
		 */
	}
	
	protected Board getBoard() {
		return board;
	}
	
	
	
}
