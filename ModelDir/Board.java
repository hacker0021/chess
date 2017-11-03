package chess.ModelDir;
public class Board{
	Square[][] B=new Square[8][8];

	public Board(){
		for(int i=0; i<8; i++){
			for(int o=0; o<8; o++){
				B[i][o]=new Square(i,o);
			}
		}
		B[0][0].setPiece(new Rook(false,B[0][0]));
		B[0][1].setPiece(new Knight(false,B[0][1]));
		B[0][2].setPiece(new Bishop(false,B[0][2]));
		B[0][3].setPiece(new Queen(false,B[0][3]));
		B[0][4].setPiece(new King(false,B[0][4]));
		B[0][5].setPiece(new Bishop(false,B[0][5]));
		B[0][6].setPiece(new Knight(false,B[0][6]));
		B[0][7].setPiece(new Rook(false,B[0][7]));
		for(int i=0; i<8; i++){
			B[1][i].setPiece(new Pawn(false,B[1][i]));
		}
		B[7][0].setPiece(new Rook(true,B[0][0]));
		B[7][1].setPiece(new Knight(true,B[0][1]));
		B[7][2].setPiece(new Bishop(true,B[0][2]));
		B[7][3].setPiece(new Queen(true,B[0][3]));
		B[7][4].setPiece(new King(true,B[0][4]));
		B[7][5].setPiece(new Bishop(true,B[0][5]));
		B[7][6].setPiece(new Knight(true,B[0][6]));
		B[7][7].setPiece(new Rook(true,B[0][7]));
		for(int i=0; i<8; i++){
			B[6][i].setPiece(new Pawn(true,B[6][i]));
		}
	}
	public Square getCell(int x,int y){
		return B[x][y];
	}
}