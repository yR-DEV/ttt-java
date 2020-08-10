import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Saves {
	
	public static void readMatchHistory() {
		
		String saveFile = "saves.csv";
		File saveFileCheck = new File(saveFile);
		
		if (saveFileCheck.exists()) {
			System.out.println("Recorded saves exist!");
		} else {
			System.out.println("doesn't exist");
			try {
				BufferedReader csvReader = new BufferedReader(new FileReader(saveFile));
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void saveMatchHistory() {
		
	}
}
