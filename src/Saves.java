import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Saves {
	
	public static void readMatchHistory() {
		
		String saveFile = "saves.txt";
		File saveFileCheck = new File(saveFile);
		
		Save firstSave = new Save(1, 'X');
		Save secondSave = new Save(2, 'O');
		
		if (saveFileCheck.exists()) {
			System.out.println("exists");
		} else {
			System.out.println("doesn't exist");
		}
	}
	
	public static void saveMatchHistory() {
		
	}
}
