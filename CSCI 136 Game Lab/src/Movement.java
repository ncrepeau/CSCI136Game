
import javafx.geometry.Bounds;
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
	public boolean isColliding;
	public void setMovement(int x, int y, ImageView viewPlayer, ImageView viewEnemy) {
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
		
		Bounds playerBounds = viewPlayer.getBoundsInParent();
		int playerTopLeftX = (int) (x - (playerBounds.getWidth())/2);
		int playerBottomRightX = (int) (x + (playerBounds.getWidth()/2));
		int playerTopLeftY = (int) (y + (playerBounds.getHeight()/2));
		int playerBottomRightY = (int) (y - (playerBounds.getHeight()/2));
		
		Bounds enemyBounds = viewEnemy.getBoundsInParent();
		int enemyTopLeftX = (int) (x - (enemyBounds.getWidth()/2));
		int enemyBottomRightX = (int) (x + (enemyBounds.getWidth()/2));
		int enemyTopLeftY = (int) (y + (enemyBounds.getHeight()/2));
		int enemyBottomRightY = (int) (y - (enemyBounds.getHeight()/2));
		if (areRectsColliding(playerTopLeftX, playerBottomRightX, playerTopLeftY, playerBottomRightY, enemyTopLeftX, enemyBottomRightX, enemyTopLeftY, enemyBottomRightY) == true) {
			isColliding = true;
		}else
		{
			isColliding = false;
		}
		viewPlayer.setX(x);
		viewPlayer.setY(y);
		viewEnemy.setX(enemyX);
		viewEnemy.setY(enemyY);
		
	}

	public void enemyMovement(Scene gameScreen) {
		gameScreen.setOnKeyPressed(this::listenUp);
	}

	private boolean areRectsColliding(int r1TopLeftX, int r1BottomRightX, int r1TopLeftY, int r1BottomRightY,
			int r2TopLeftX, int r2BottomRightX, int r2TopLeftY, int r2BottomRightY) {

		if (r1TopLeftX < r2BottomRightX && r1BottomRightX > r2TopLeftX && r1TopLeftY < r2BottomRightY
				&& r1BottomRightY > r2TopLeftY) {
			return true;
		} else {
			return false;
		}
	}

}
