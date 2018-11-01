import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class item  {
	private String imagePath;
	private int position;
	private double itemWorth;

	public item() {
	}

	public static ArrayList<String> getImagePath() throws FileNotFoundException {
		ArrayList<String> itemArray = new ArrayList<String>();
		File myFile = new File("./src/ItemFile.txt");
		Scanner myFileScanner = new Scanner(myFile);
		while(myFileScanner.hasNextLine()) {
			String line = myFileScanner.nextLine();
			itemArray.add(line);
		}
		return itemArray;
	}

	public void setPosition(String imagePath ) {
		Random rand = new Random();
		int itemX = rand.nextInt(1150)+1;
		int itemY = rand.nextInt(750)+1;
		Image myImage = new Image(imagePath);
		ImageView myImageView = new ImageView(myImage);
		myImageView.setX(itemX);
		myImageView.setY(itemY);
		
	}

	public void setItemWorth(double itemWorth) {
		this.itemWorth = itemWorth;
	}
}
