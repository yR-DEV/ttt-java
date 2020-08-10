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

		
		userInput = scanner.nextLine().trim().toLowerCase();
		switch (userInput) {
			case "game":
				GameRunner.startGame();
				break;
			case "play":
				GameRunner.startGame();
				break;
			case "highscores":
				Saves.readMatchHistory();
				break;
			case "hs":
				Saves.readMatchHistory();
				break;
			case "exit":
				System.out.println("THANKS COME AGAIN!");
				break;
			case "quit":
				System.out.println("THANKS COME AGAIN!");
				break;
		}
		scanner.close();
	}
}
	

