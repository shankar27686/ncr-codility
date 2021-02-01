package com.ncr.chess;

public class ChessBoard {

	public static int MAX_BOARD_WIDTH = 7;
	public static int MAX_BOARD_HEIGHT = 7;

	private Pawn[][] pieces;

	public ChessBoard() {
		pieces = new Pawn[MAX_BOARD_WIDTH][MAX_BOARD_HEIGHT];
	}

	public void addPiece(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor) {
		if (isLegalBoardPosition(xCoordinate, yCoordinate) && pieces[xCoordinate][yCoordinate] == null) {
				pieces[xCoordinate][yCoordinate] = pawn;
				pawn.setXCoordinate(xCoordinate);
				pawn.setYCoordinate(yCoordinate);
		} else {
			pawn.setXCoordinate(-1);
			pawn.setYCoordinate(-1);
		}
		
	}

	public boolean isLegalBoardPosition(int xCoordinate, int yCoordinate) {
		if (xCoordinate < pieces[0].length && xCoordinate >= 0 && yCoordinate < pieces.length && yCoordinate >= 0)
			return true;
		return false;
	}
}
