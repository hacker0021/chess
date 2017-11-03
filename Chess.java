package chess;
import chess.ModelDir.*;
public class Chess{
	public static void main(String [] args){
		ChessView chessview = new ChessView();
		ChessModel chessmodel = new ChessModel();
		ChessController chesscontroller = new ChessController();
		Board board=chessmodel.getBoard();
		chessview.printBoard(board);
		while(true){
			Square moveFrom = chesscontroller.moveFrom();
			Square moveTo = chesscontroller.moveTo();
			board=chessmodel.getBoard();
			moveFrom=board.getCell(moveFrom.getX(),moveFrom.getY());
			moveTo=board.getCell(moveTo.getX(),moveTo.getY());
			moveTo.setPiece(moveFrom.getPiece());
			moveFrom.clear();


			chessview.printBoard(board);
		}

	}
}