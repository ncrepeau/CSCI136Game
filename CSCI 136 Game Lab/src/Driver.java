import java.io.FileNotFoundException;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Driver extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws FileNotFoundException {

		// Player image and position
		Player myPlayer = new Player();
		Image player = new Image(myPlayer.getPlayerImg());
		ImageView viewPlayer = new ImageView(player);
		int playerX = myPlayer.setPlayerXPosition();
		int playerY = myPlayer.setPlayerYPosition();
		viewPlayer.setLayoutX(playerX);
		viewPlayer.setLayoutY(playerY);

		// Enemy image and position
		Enemy myEnemy = new Enemy();
		Image enemy = new Image(myEnemy.getEnemyImg());
		ImageView viewEnemy = new ImageView(enemy);
		int enemyX = myEnemy.setEnemyXPosition();
		int enemyY = myEnemy.setEnemyYPosition();
		viewEnemy.setLayoutX(enemyX);
		viewEnemy.setLayoutY(enemyY);
		viewEnemy.setFitHeight(190);
		viewEnemy.setFitWidth(150);

		// Items and their positions
		item myItem = new item();
		ArrayList<String> itemArray = new ArrayList<String>();
		itemArray = item.getImagePath();
		Image item1 = new Image(itemArray.get(0));
		ImageView viewItem1 = new ImageView(item1);
		viewItem1.setLayoutX(myItem.setXPosition());
		viewItem1.setLayoutY(myItem.setYPosition());
		
		
		Image item2 = new Image(itemArray.get(1));
		ImageView viewItem2 = new ImageView(item2);
		viewItem2.setLayoutX(myItem.setXPosition());
		viewItem2.setLayoutY(myItem.setYPosition());
		
		Image item3 = new Image(itemArray.get(2));
		ImageView viewItem3 = new ImageView(item3);
		viewItem3.setLayoutX(myItem.setXPosition());
		viewItem3.setLayoutY(myItem.setYPosition());

		
		Image item4 = new Image(itemArray.get(3));
		ImageView viewItem4 = new ImageView(item4);
		viewItem4.setLayoutX(myItem.setXPosition());
		viewItem4.setLayoutY(myItem.setYPosition());
		
		Image item5 = new Image(itemArray.get(4));
		ImageView viewItem5 = new ImageView(item5);
		viewItem5.setLayoutX(myItem.setXPosition());
		viewItem5.setLayoutY(myItem.setYPosition());
		// Rest Button
		Button reset = new Button("Restart");
		reset.setLayoutX(740);
		reset.setLayoutY(15);

		// Button Action
		reset.setOnAction(e -> {
			viewPlayer.setLayoutX(myPlayer.setPlayerXPosition());
			viewPlayer.setLayoutY(myPlayer.setPlayerYPosition());

			viewEnemy.setLayoutX(myEnemy.setEnemyXPosition());
			viewEnemy.setLayoutY(myEnemy.setEnemyYPosition());

			viewItem1.setLayoutX(myItem.setXPosition());
			viewItem1.setLayoutY(myItem.setYPosition());
			
			viewItem2.setLayoutX(myItem.setXPosition());
			viewItem2.setLayoutY(myItem.setYPosition());

			viewItem3.setLayoutX(myItem.setXPosition());
			viewItem3.setLayoutY(myItem.setYPosition());

			viewItem4.setLayoutX(myItem.setXPosition());
			viewItem4.setLayoutY(myItem.setYPosition());
		});

		Group myGroup = new Group(viewPlayer, viewEnemy, viewItem1, viewItem2, viewItem3, viewItem4, reset); // the group of objects that will be added to the
																	// window
		Scene background = new Scene(myGroup, 800, 600, Color.WHITE);

		primaryStage.setTitle("Game"); // title of window in the window's bar
		primaryStage.setScene(background); // implements the "scene" (objects/background)
		primaryStage.show(); // shows the window (would probably not appear w/o it)
	}
}