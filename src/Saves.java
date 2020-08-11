import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Saves {
	
	public static SaveList saves = new SaveList();
	
	public static void readMatchHistory() {
		System.out.println("In progress");
		
//		
//		String saveFile = "saves.csv";
//		File saveFileCheck = new File(saveFile);
//		
//		if (saveFileCheck.exists()) {
//			System.out.println("Recorded saves exist!");
//			try {
//				BufferedReader csvReader = new BufferedReader(new FileReader(saveFile));
//				String singleEntry;
//				try {
//					while ((singleEntry = csvReader.readLine()) != null) {
//						String[] csvSaveData = singleEntry.split(",");
//						try {
//							saves.addSave(new Save(Integer.parseInt(csvSaveData[0].trim()), csvSaveData[1].trim()));
//						} catch (NumberFormatException | WrongPlayerException e) {
//							// TODO Auto-generated catch block
//							e.printStackTrace();
//						}
//					} 
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//				
//			} catch (FileNotFoundException e) {
//				e.printStackTrace();
//			}
//		}
	}
	
	public static void saveMatchHistory() {
		
	}
}
