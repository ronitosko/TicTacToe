import java.util.Scanner;

public class Game{
	
	private static Scanner input = new Scanner(System.in);
	private static ScoreBoard scores = new ScoreBoard();

	
	public static void main(String[] args){
		
		while(true){
			
			System.out.print("Welcome to Tic-Tac-Toe Game\n ------------------------------------\n\n");
			System.out.println("Player 1 score: " + scores.getPlayer1Score());
			System.out.println("Player 2 score: " + scores.getPlayer2Score());
			int player1 = -1;
			int player2 = -1;
			int totalMoves = 9;
			boolean done = false;
			String ans = "";
		
			//player selects his 'symbol' 
			while(true){
			
				System.out.println("Please enter 1 to get O or 0 to get X");
				player1 = input.nextInt();
				if(player1 != 1 || player1 != 0) break;
			}//end of while
		

			//setting player2 symbol
			if(player1 == 1)
				player2 = 0;
			else if(player1 == 0)
				player2 = 1;
			else
				System.exit(-1);
		
			//creating the board of the game
			Board board = new Board(new Player(player1), new Player(player2));
		
		
		
			//Game starts here
			while(true){
			
				//Player1
				System.out.println("Player with symbol " + player1 + " turn.");
				playerMove(1, board);
				totalMoves--;
				done = endCheck(board.getBoard(), totalMoves);
				if(done){
					
					if(totalMoves != 0){
						
						scores.increasePlayer1();
						
					}//end if
					
					System.out.println("Thanks for playing!");
					break;
				}

				//Player2
				System.out.println("Player with symbol " + player2 + " turn.");
				playerMove(0, board);
				totalMoves--;
				done = endCheck(board.getBoard(), totalMoves);
				if(done){
					
					if(totalMoves != 0){
						
						
						scores.increasePlayer1();
						
					}//end if
					
					System.out.println("Thanks for playing!");
					break;
				}//end if
			//ONE game ends here.
			
			}//end of while
			
		
			ans = input.nextLine();
			while(true){
				
				if(ans.equals("N") || ans.equals("n") || ans.equals("Y") || ans.equals("y"))
					break;
				
				System.out.print("Would you like to play one more game?(Enter Y or N) -> ");
				ans = input.nextLine();
				System.out.println();
				
				
			}//end of while
			
			if(ans.equals("N") || ans.equals("n"))
				break;
			else
				continue;
			
		}//end of Game and Program
		
		
	}//end of Game
	
	
	//this method takes a board's current state and checks if the game is done
	public static boolean endCheck(int[][] board_scores, int totalMoves){
		
		
		if(board_scores[0][0] >= 0 && (board_scores[0][0] == board_scores[1][1] && board_scores[1][1] == board_scores[2][2]) ){
			System.out.println("Player " + board_scores[1][1] + " is the winner!");
			return true;
		}
		
		if(board_scores[0][0] >= 0 && (board_scores[0][0] == board_scores[1][0] && board_scores[1][0] == board_scores[2][0]) ){
			System.out.println("Player " + board_scores[0][0] + " is the winner!");
			return true;
		}
		
		if(board_scores[0][0] >= 0 && (board_scores[0][0] == board_scores[0][1] && board_scores[0][1] == board_scores[0][2]) ){
			System.out.println("Player " + board_scores[0][0] + " is the winner!");
			return true;
		}
		
		if(board_scores[0][1] >= 0 && (board_scores[0][1] == board_scores[1][1] && board_scores[1][1] == board_scores[2][1]) ){
			System.out.println("Player " + board_scores[0][1] + " is the winner!");
			return true;
		}
		
		if(board_scores[1][0] >= 0 && (board_scores[1][0] == board_scores[1][1] && board_scores[1][1] == board_scores[1][2]) ){
			System.out.println("Player " + board_scores[1][1] + " is the winner!");
			return true;
		}
		
		if(board_scores[2][0] >= 0 && (board_scores[2][0] == board_scores[2][1] && board_scores[2][1] == board_scores[2][2]) ){
			System.out.println("Player " + board_scores[2][1] + " is the winner!");
			return true;
		}
		
		if(board_scores[0][2] >= 0 && (board_scores[0][2] == board_scores[1][2] && board_scores[1][2] == board_scores[2][2]) ){
			System.out.println("Player " + board_scores[2][1] + " is the winner!");
			return true;
		}
		
		if(board_scores[0][2] >= 0 && (board_scores[0][2] == board_scores[1][1] && board_scores[1][1] == board_scores[2][0]) ){
			System.out.println("Player " + board_scores[2][1] + " is the winner!");
			return true;
		}
		
			
		

		if(totalMoves == 0){
			System.out.println("Draw!");
			return true;
		}
		
		return false;
		
	}
	
	public static void playerMove(int player, Board board){
		
		
			//checking if player1's move is valid
			while(true){
				//player1 makes his move
				System.out.println("Please make a move of the following");
				for(int i = 0; i < 3; i++)
					for(int j = 0; j < 3; j++)
						if(board.getBoard()[i][j] == -1)
							System.out.println("You can do these moves of (x, y): " + "(" + i + ", " + j + ")");
				
				System.out.print("Enter x: ");
				int x = input.nextInt();
			
				System.out.print("\nEnter y: ");
				int y = input.nextInt();
				
				if(x > 3 || y > 3 || x < 0 || y < 0 ){
					System.out.println("Cant do that move :(");
					continue;
				}
				
				if(board.getBoard()[x][y] != -1 || (x > 2 || x < 0)  || (y > 2 || y < 0) ){
					System.out.println("Cant do that move :(");
				}else{
					
					if(player == 1){
						System.out.println(board.getPlayer1().getSymbol());
						board.makeMove(x, y, board.getPlayer1());
						
					}else if(player == 0){
						System.out.println(board.getPlayer2().getSymbol());
						board.makeMove(x, y, board.getPlayer2());
						
					}//end if
					
					break;
				}//end of if
				
			}//end while
			
			
			
	}//end of playerMove
	
}//end of Game