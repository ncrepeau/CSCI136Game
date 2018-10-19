
public class game {

	private double score;
	private double highScore;
	private double highScore2;
	private double highScore3;
	private String playerName;

	public game(double score, double highScore, double highScore2, double highScore3, String playerName) {
		this.score = score;
		this.highScore = highScore;
		this.highScore2 = highScore2;
		this.highScore3 = highScore3;
		this.playerName = playerName;
	}

	public double getScore() {
		return score;
	}

	public double getHighScore() {
		return highScore;
	}

	public double getHighScore2() {
		return highScore2;
	}

	public double getHighScore3() {
		return highScore3;
	}

	public String getPlayerName() {
		return playerName;
	}

}
