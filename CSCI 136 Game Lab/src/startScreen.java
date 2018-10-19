
public class startScreen {
	private boolean arrowKeys;
	private boolean WASD;

	public startScreen(boolean arrowKeys, boolean wASD) {
		this.arrowKeys = arrowKeys;
		WASD = wASD;
	}

	public boolean chooseControl() {
		return true;
	}

	public void startButton() {

	}

	public int chooseLevel() {
		return 0;
	}
}
