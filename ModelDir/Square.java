package chess.ModelDir;
public class Square{
	private Piece T;
	private boolean empty;

/*
	public Square(Piece T){
		this.T=T;
		empty=false;
	}
	*/
	public Square(){
		empty=true;
		
	}
	public void setPiece(Piece T){
		if(empty==false){
			this.T.dead();
		}
		empty=false;
		this.T=T;
	}
	public void clear(){
		empty=true;
	}
	public Piece getPiece(){
		return T;
	}
	public boolean isEmpty(){
		return empty;
	}
}