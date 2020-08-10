import java.util.Date;

public class Save {

	private int gameNumber;
	private char gameWinner;
	private Date dateSaved;
	
	public Save(int gameNumber, char gameWinner, Date dateSaved) {
		this.gameNumber = gameNumber;
		this.gameWinner = gameWinner;
		this.dateSaved = dateSaved;
	}
	
	private enum WinningPlayer {
		X('x'), O('o');
		
		public final char player;
		
		WinningPlayer(char player) {
			this.player = player;
		}
	}
	
}
