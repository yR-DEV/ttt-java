public class Game {

	private char[][] gameBoard;
	private char currentPlayer;
	
	public Game() {
		// 2-Dimensional Array that is 3 by 3 board of tic tac toe
		gameBoard = new char[3][3];
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
				gameBoard[i][j] = '-';
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
                System.out.print(gameBoard[i][j] + " | ");
            }
            // Adding blank println and line below to make it look good :)
            System.out.println();
            System.out.println("-------------");
        }
	}
	
	public boolean checkGameBoardFull() {
		
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
	
	// Placing a mark at the square by the row and column entered by user
	public boolean placeTurn(int row, int column) {
		// Making sure that the entered row and column are within
			// the boards parameters.
		if ((row < 3) && (row >= 0)) {
			// Checking the column entered to make sure it is between 0 and 2
			if ((column < 3) && (column >= 0)) {
				// Checking whether or not the square is played in yet
					// By default unplayed squares have a - in them
				if(gameBoard[row][column] == '-') {
					// If the square hasn't been played in change the - to the current player (X or O)
					gameBoard[row][column] = currentPlayer;
					return true;
				}
			}
		}
		
		return false;
	}
 }
