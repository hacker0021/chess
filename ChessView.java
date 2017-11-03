package chess;
import chess.ModelDir.*;
public class ChessView{
	
	
	public void printBoard(Board  board){
		
		for(int i=0; i<49+16+8; i++){
			System.out.print("*");
		}
		System.out.println();
		for(int o=0; o<8; o++){
			System.out.print("*");
			for(int i=0; i<8; i++){
				System.out.print("        *");
			}
			System.out.println();
			System.out.print("*");
			for(int i=0; i<8; i++){
				System.out.print("  ");
				
				if(board.getCell(7-o,i).isEmpty()==true){
					System.out.print("    ");
				}
				else{
					Piece Th=board.getCell(7-o,i).getPiece();
					if(Th instanceof Queen){
						System.out.print("Q");
					}
					if(Th instanceof Knight){
						System.out.print("N");
					}
					if(Th instanceof Bishop){
						System.out.print("B");
					}
					if(Th instanceof Rook){
						System.out.print("R");
					}
					if(Th instanceof King){
						System.out.print("K");
					}
					if(Th instanceof Pawn){
						System.out.print("P");
					}
					if(Th.getColor()==false){
						System.out.print("(W)");
					}
					else{
						System.out.print("(B)");
					}
				}
				
				System.out.print("  *");

			}
			System.out.println();
			System.out.print("*");
			for(int i=0; i<8; i++){
				System.out.print("        *");
			}
			System.out.println();
			System.out.print("*");
			for(int i=0; i<8; i++){
				System.out.print("*********");
			}
			System.out.println();
		}
	}



	

	
}