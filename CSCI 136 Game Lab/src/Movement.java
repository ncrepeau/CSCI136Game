

import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Movement {
	private ImageView viewEnemy;
	private ImageView viewPlayer;
	private int x = 550, y = 600;
	private double enemyX;
	private double enemyY;
	public void setMovement(int x, int y, ImageView viewPlayer, ImageView viewEnemy){
		this.viewPlayer = viewPlayer;
		this.viewEnemy = viewEnemy;
		this.x = x;
		this.y = y;
	}
	
	public void playerMovement(Scene gameScreen) {
		gameScreen.setOnKeyPressed(this::listenUp);
	}
	
	public void listenUp(KeyEvent event)
	{
		KeyCode myCode = event.getCode();
		
		if(myCode == KeyCode.LEFT)
		{
			x-=10;
			enemyX+=10;
		}
		else if(myCode == KeyCode.RIGHT)
		{
			x+=10;
			enemyX-=10;
		}
		else if(myCode == KeyCode.DOWN)
		{
			y+=10;
			enemyY-=10;
		}
		else if(myCode == KeyCode.UP)
		{
			y-=10;
			enemyY+=10;
		}
		
		viewPlayer.setX(x);
		viewPlayer.setY(y);
		viewEnemy.setX(enemyX);
		viewEnemy.setY(enemyY);
		
	}
	
	public void enemyMovement(Scene gameScreen) {
		gameScreen.setOnKeyPressed(this::listenUp);
		enemyX = viewEnemy.getLayoutX();
		enemyY = viewEnemy.getLayoutY();
	}

	
	
		
	
}
