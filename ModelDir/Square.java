package chess.ModelDir;
public class Square{
	private Piece T;
	private boolean empty;
	int X;
	int Y;


	public Square(int X,int Y){
		empty=true;
		this.X=X;
		this.Y=Y;

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
	public int getX(){
		return X;
	}
	public int getY(){
		return Y;
	}
}