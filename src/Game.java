public class Game {

	private char[][] board;
	private char currentPlayer;
	
	public Game() {
		// 2-Dimensional Array that is 3 by 3 board of tic tac toe
//		System.out.println("WORKING GAME INIT!");
		board = new char[3][3];
		currentPlayer = 'x';
		initializeGameBoard();
	}
 	
	public char getCurrentPlayer() {
		return currentPlayer;
	}
	
	public void changeCurrentPlayer() {
		if (currentPlayer == 'o') {
			currentPlayer = 'x';
		} else {
			currentPlayer = 'o';
		}
	}
	
	// This method loops through the entire game board first by rows then columns
	// This method sets up each square on the game board as blank/not taken 
	// indicated by a dash '-'
	public void initializeGameBoard() {
		// Rows loop
		for (int i = 0; i < 3; i ++) {
			// Columns Loop
			for (int j = 0; j < 3; j++) {
				board[i][j] = '-';
			}
		}
	}
	
	// Printing the game board each time a play is made
	// updating the relevant squares played on inside of the board[][] 2d array
		// This gets called each time a play is made to udpate the board
	public void printBoardToConsole() {
		// Loop first prints a | character to start the row,
		// then for each column in the row the relevant square in the 2d array
		// will be printed with another | after it
		System.out.println("-------------");
		for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            // Adding blank println and line below to make it look good :)
            System.out.println();
            System.out.println("-------------");
        }
	}
	
	public boolean isGameBoardFull() {
		
		return false;
	}
	
	public boolean checkGameBoardForWin() {
		
		return false;
	}
	
	public boolean checkGameBoardRows() {
		
		return false;
	}
	
	public boolean checkGameBoardColumns() {
		
		return false;
	}
	
	public boolean checkGameBoardDiagonals() {
		
		return false;
	}
 }
