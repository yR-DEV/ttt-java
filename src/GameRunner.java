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
		
	}
	
}

