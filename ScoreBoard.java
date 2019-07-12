public class ScoreBoard{
	
	private int player1Score;
	private int player2Score;
	
	public ScoreBoard(){
		this.player1Score = 0;
		this.player2Score = 0;
	}//default constr
	
	public ScoreBoard(int player1Score, int player2Score){
		this.player1Score = player1Score;
		this.player2Score = player2Score;
	}
	
	public void setPlayer1Score(int player1Score){
		this.player1Score = player1Score;
	}//end of setPlayer1Score
	
	public void setPlayer2Score(int player2Score){
		this.player2Score = player2Score;
	}//end of setPlayer2Score
	
	public int getPlayer1Score(){
		return player1Score;
	}//end of getPlayer1Score
	
	public int getPlayer2Score(){
		return player2Score;
	}//end of getPlayer2Score
	
	public void increasePlayer1(){
		this.player1Score++;
	}//end of increasePlayer1
	
	public void increasePlayer2(){
		this.player2Score++;
	}//end of increasePlayer2
	
}//end of class