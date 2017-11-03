package chess.ModelDir;
public class Piece{
	 boolean color;
	//0>>black && 1>>white
	 Square location;
	 boolean alive;

	public void moveTo(Square location){
		this.location.clear();
		this.location=location;
		location.setPiece(this);
	}
	public void dead(){
		alive =false;
	}
	public boolean getColor(){
		return color;
	}


}
