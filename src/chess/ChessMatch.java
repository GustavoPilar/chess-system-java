package chess;

import boardgame.Board;

public class ChessMatch {
	
	private Board board;
	
	public ChessMatch() {
		board = new Board(8, 8);
		/*
		 * A partida devera saber o tamanho do tabuleiro
		 */
	}
	
	public ChessPiece[][] getPieces() {
		/*
		 * Retorna uma matriz de peças de xadrez
		 * correspondente a essa partida
		 */
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumns(); j++) {
				mat[i][j] = (ChessPiece)board.piece(i, j);
			}
		}
		return mat;
	}
}
