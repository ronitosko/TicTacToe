public class Player{
	
	
	//1 = O AND 0 = X
	private int symbol;
	
	public Player(){} //default const
	
	public Player(int symbol){
		this.symbol = symbol;
	}//end of Player
	
	public void setSymbol(int symbol){
		
		this.symbol = symbol;
		
	}//end of setSymbol
	
	public int getSymbol(){
		
		return symbol;
		
	}//end of getSymbol
	
}//end of Player