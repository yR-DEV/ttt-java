import java.util.Scanner;

public class GameRunner {

	public static void startGame() {
		
		Scanner scanner = new Scanner(System.in);
		Game ttt = new Game();
		ttt.initializeGameBoard();
		do {
			
			System.out.println("CURRENT BOARD IN PLAY.");
			ttt.printBoardToConsole();
			int row;
			int column;

			do {
				System.out.println("It is " + ttt.getCurrentPlayer() + "'s turn!");
				System.out.println("Enter row number");
				System.out.println("Then enter column number");
				System.out.println("To place your move!");

				// Need to subtract 1 from each entry for matching the index
				row = scanner.nextInt()-1;
				column = scanner.nextInt()-1;
				
			} while (!ttt.placeTurn(row, column));
			ttt.changeCurrentPlayer();
			
		} while(!ttt.checkGameBoardForWin() && !ttt.checkGameBoardFull());
		
		// If there is no win condition AND gameboard is full sout TIE GAME!
		if (!ttt.checkGameBoardForWin() && ttt.checkGameBoardFull()) {
			System.out.println("Scratch game! Play again!");
		} else {
			
			char winner;
			
			System.out.println("The board looks like this :D");
			ttt.printBoardToConsole();
			ttt.changeCurrentPlayer();
			winner = Character.toUpperCase(ttt.getCurrentPlayer());
			System.out.println(winner + " IS THE WINNAR!");
			System.out.println("-------------");
			Main.main(null);
			
		}
		
	}
	
}

