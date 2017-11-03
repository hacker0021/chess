package chess;
import chess.ModelDir.Board;
public class Chess{
	public static void main(String [] args){
		ChessView chessview=new ChessView();
		ChessModel chessmodel=new ChessModel();
		ChessController chesscontroller=new ChessController();
		Board board=chessmodel.getBoard();
		int x=10;
		while(x>0){

			x--;
			board=chessmodel.getBoard();
			chessview.print(board);
		}

	}
}