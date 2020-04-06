package fr.simon.chess.app.pieces;

public abstract class AbstractChessPiece {

	boolean isWhite;
	
	public AbstractChessPiece(boolean isWhite) {
		this.isWhite = isWhite;
	}

	public abstract void move();
	
	
	
	
	
}
