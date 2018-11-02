import java.util.Random;

import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class movement{
	Random rand = new Random();
	private Scene myScene;
	ImageView viewEnemy;
	ImageView viewPlayer;
	int x;
	int y;
	public movement(ImageView viewEnemy, ImageView viewPlayer){
	this.myScene = myScene;
	this.viewEnemy = viewEnemy;
	this.viewPlayer = viewPlayer;
	}
	
	public void playerMovement() {
	myScene.setOnKeyPressed(this::keyPress);
	
	}
	public void keyPress(KeyEvent event) {
	KeyCode myCode = event.getCode();
	if(myCode == KeyCode.A) {
		int x =- 10;
	}
	else if(myCode== KeyCode.D) {
		int x =+ 10;
	}
	else if(myCode == KeyCode.S) {
		int y =+ 10;
	}
	else if(myCode == KeyCode.W) {
		int y =- 10;
	}
	int n = rand.nextInt(10)+1;
	viewPlayer.setLayoutX(x);
	viewPlayer.setLayoutY(y);
	viewEnemy.setLayoutX(x-n);
	viewEnemy.setLayoutY(y-n);
	}
	
	private boolean areRectsColliding(int r1TopLeftX, int r1BottomRightX,int r1TopLeftY, int r1BottomRightY, int r2TopLeftX,int r2BottomRightX, int r2TopLeftY, int r2BottomRightY)  { 
		 
		 if (r1TopLeftX < r2BottomRightX && r1BottomRightX > r2TopLeftX&& r1TopLeftY < r2BottomRightY && r1BottomRightY > r2TopLeftY)  
		{   return true;  }  else  {   return false;  } } 
	
	

	
	
		
	
}
