import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class item  {
	private String imagePath;
	private int position;
	private double itemWorth;
	Random rand = new Random();

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

	public int setXPosition() {
		int itemX = rand.nextInt(750)+1;
		return itemX;
		
	}
	public int setYPosition() {
		int itemY = rand.nextInt(550)+1;
		return itemY;
	}
	private boolean areRectsColliding(int r1TopLeftX, int r1BottomRightX,int r1TopLeftY, int r1BottomRightY, int r2TopLeftX,int r2BottomRightX, int r2TopLeftY, int r2BottomRightY)  { 
		 
		 if (r1TopLeftX < r2BottomRightX && r1BottomRightX > r2TopLeftX&& r1TopLeftY < r2BottomRightY && r1BottomRightY > r2TopLeftY)  
		{   return true;  }  else  {   return false;  } } 

}
