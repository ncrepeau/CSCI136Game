import java.util.Random;

import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;

public class movement{
	Random rand = new Random();
	public movement(){
	
		
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
	
	

	
	
		
	
}
