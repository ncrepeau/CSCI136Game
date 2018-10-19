
public class item {
	private String imagePath;
	private int position;
	private double itemWorth;

	public item(String imagePath, int position, double itemWorth) {
		this.imagePath = imagePath;
		this.position = position;
		this.itemWorth = itemWorth;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public void setItemWorth(double itemWorth) {
		this.itemWorth = itemWorth;
	}
}
