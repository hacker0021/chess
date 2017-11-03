package chess;
import chess.ModelDir.*;
import java.util.Scanner;
public class ChessController{
	Scanner scanner = new Scanner(System.in);

	public Square moveFrom(){
		int X = scanner.nextInt();
		int Y = scanner.nextInt();
		return new Square(X,Y);
	}
	public Square moveTo(){
		int X = scanner.nextInt();
		int Y = scanner.nextInt();
		return new Square(X,Y);
	}


}
