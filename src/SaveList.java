import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SaveList {
	
	private static List<Save> gameSave = new ArrayList<Save>();
	String input;

	public void addSave(char c) {
		try {
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please enter x or o");
			input = scanner.nextLine().trim().toLowerCase();
			gameSave.add(new Save(1, input));
			scanner.close();
			
		} catch (WrongPlayerException e) {
			
			System.out.println("Please enter X or O as the player");
			
		}
	}
	
	public void addSave(Save s) {
		gameSave.add(s);
	}
	
	public void displaySaves() {
		for (Save s : gameSave) {
			System.out.println(s);
		}
	}
}
