public class Save {

	private int gameNumber;
	private WinningPlayer winningPlayer;
	
	public Save(int gameNumber, String input) throws WrongPlayerException {
		this.gameNumber = gameNumber;
		
		switch(input) {
		case "x": 
			this.winningPlayer = WinningPlayer.X;
			break;
		case "o":
			this.winningPlayer = WinningPlayer.O;
			break;
		default:
			throw new WrongPlayerException("invalid player");
		}
	}
	
	private enum WinningPlayer {
		X('x'), O('o');
		
		public final char player;
		
		WinningPlayer(char player) {
			this.player = player;
		}
	}
	
	public int getGameNumber() {
		return gameNumber;
	}

	public void setGameNumber(int gameNumber) {
		this.gameNumber = gameNumber;
	}

	public void setWinningPlayer(WinningPlayer winningPlayer) throws WrongPlayerException {
		this.winningPlayer = winningPlayer;
	}

	@Override
	public String toString() {
		return "Save [gameNumber=" + gameNumber + ", winningPlayer=" + winningPlayer + "]";
	}
}
