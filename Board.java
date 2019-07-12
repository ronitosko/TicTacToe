public class Board{
	
	private int player1_points;
	private int player2_points;
	private Player player1;
	private Player player2;
	private int[][] board = new int[3][3];
	
	
	
	
	public Board(){} //default constr
	
	public Board(Player player1, Player player2){
		this.player1 = player1;
		this.player2 = player2;
		
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++)
				board[i][j] = -1;
		}//end for
		
	}//end of contr1
	
	public Board(Player player1, Player player2, int player1_points, int player2_points){
		this.player1 = player1;
		this.player2 = player2;
		this.player1_points = player1_points;
		this.player2_points = player2_points;
	}//end of contr1
	
	public void setPlayer1(Player player1){
		
		this.player1 = player1;
		
	}//end of setPlayer1
	
	public void setPlayer2(Player player2){
		
		this.player2 = player2;
		
	}//end of setPlayer2
	
	public Player getPlayer1(){
		return player1;
	}//end of getPlayer1
	
	public Player getPlayer2(){
		return player2;
	}//end of getPlayer2
	
	
	public int getPlayer1Points(){
		return player1_points;
	}//end of getPlayer1Points
	
	public int getPlayer2Points(){
		return player2_points;
	}//end of getPlayer2Points
	
	public void setPlayer1Points(int player1_points){
		this.player1_points = player1_points;
	}//end of setPlayer1Points
	
	public void setPlayer2Points(int player2_points){
		this.player2_points = player2_points;
	}//end of setPlayer2Points
	
	public void setBoard(int[][] board){
		this.board = board;
	}//end of setBoard
	
	public int[][] getBoard(){
		return board;
	}//end of getBoard
	
	public void makeMove(int x, int y, Player player){
		board[x][y] = player.getSymbol();
	}//end of makeMove
	
}//end of Board