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
		System.out.println("Please enter ONLY a number for the row and column.");
		return false;
	}
	
	// Uses nested for loops to go through each square of the game. 
	// start off with scratch game true, if any square has a - in it that indicated
	// a square that hasn't been played yet and changes boolean to false
	public boolean checkGameBoardFull() {
		boolean scratchGame = true;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(gameBoard[i][j] == '-') {
					scratchGame = false;
				}
			}
		}
		return scratchGame;
	}
	
	// Checks for the three types of win conditions possible on a tic tac toe board
	public boolean checkGameBoardForWin() {
		return (checkGameBoardDiagonals() || checkGameBoardRows() || checkGameBoardColumns());
	}
	
	// Using loop to cycle through each row to see if 3 in a row exist
	// calls on checkForThreeMatches by using loop iterator for row number
	// and hard coding in each column
	private boolean checkGameBoardRows() {
		for (int i = 0; i < 3; i++) {
			if (checkForThreeMatches(gameBoard[i][0], gameBoard[i][1], gameBoard[i][2]) ) {
				System.out.println("SOMEONE WON ROWS!");
				return true;
			}
		}
		return false;
	}
	
	// Does the same thing as the checking row method, just hard codes in each row 
	// and uses the iterator for the column
	private boolean checkGameBoardColumns() {
		for (int i = 0; i < 3; i++) {
            if (checkForThreeMatches(gameBoard[0][i], gameBoard[1][i], gameBoard[2][i]) == true) {
                System.out.println("SOMEONE WON COLUMS");
            	return true;
            }
        }
		return false;
	}
	
	// Hard codes in matches for the two separate diagonal win conditions. 
	// The first one starts top left and goes to the bottom right
	// the second conditional checks for top right diagonal win that goes bottom left
	private boolean checkGameBoardDiagonals() {
		if ((checkForThreeMatches(gameBoard[0][0], gameBoard[1][1], gameBoard[2][2]) == true) 
				|| checkForThreeMatches(gameBoard[0][2], gameBoard[1][1], gameBoard[2][0]) == true) {
			System.out.println("DIAGONAL WIN!");
			return true;
		} else {
			return false;
		}
	}
	
	// Returns true or false making sure that 1 is not a dash
	// and that sq1 is equal to sq2 which is equal to sq3
	private boolean checkForThreeMatches(char square1, char square2, char square3) {
		return ((square1 != '-') && (square1 == square2) && (square2 == square3));
	}
 }
