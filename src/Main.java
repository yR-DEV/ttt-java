import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String userInput;
		
		System.out.println("WELCOME TO TIC TAC TOE CLI!");
		System.out.println("WHAT WOULD YOU LIKE TO DO: ");
		System.out.println("Your selections fine person:");
		System.out.println("   - game/play - to play TTT!");
		System.out.println("   - hs/scores to see scores!");
		System.out.println("   - exit/quit to leave application!");
//		System.out.println("LETS PLAY SOME TIC TAC TOE!");
		
		userInput = scanner.nextLine().trim().toLowerCase();
		switch (userInput) {
			case "game":
				Game ttt = new Game();
				ttt.initializeGameBoard();
				scanner.close();
				break;
			case "play":
				Game ttt1 = new Game();
				ttt1.initializeGameBoard();
				scanner.close();
				break;
			case "highscores":
				Saves.readMatchHistory();
				scanner.close();
				break;
			case "hs":
				Saves.readMatchHistory();
				scanner.close();
				break;
			case "exit":
				System.out.println("THANKS COME AGAIN!");
				scanner.close();
				break;
			case "quit":
				System.out.println("THANKS COME AGAIN!");
				scanner.close();
				break;
		}
	}
}
	

