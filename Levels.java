import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

//Metehan Ertan 150117051 Furkan KUSE 150117041
public class Levels {

	Rectangle level1 = new Rectangle(400, 100, 600, 70);// We create bases of
														// our levels menu
	Text level1Writing = new Text("Level 1");
	Rectangle level2 = new Rectangle(400, 180, 600, 70);
	Text level2Writing = new Text("Level 2");
	Rectangle level3 = new Rectangle(400, 260, 600, 70);
	Text level3Writing = new Text("Level 3");
	Rectangle level4 = new Rectangle(400, 340, 600, 70);
	Text level4Writing = new Text("Level 4");
	Rectangle level5 = new Rectangle(400, 420, 600, 70);
	Text level5Writing = new Text("Level 5");
	Rectangle mainmenuButton = new Rectangle(400, 600, 280, 50);
	Text mainmenuButtonWriting = new Text("Main menu");
	Rectangle level2obs = new Rectangle(400, 180, 600, 70);
	Rectangle level3obs = new Rectangle(400, 260, 600, 70);
	Rectangle level4obs = new Rectangle(400, 340, 600, 70);
	Rectangle level5obs = new Rectangle(400, 420, 600, 70);

	Level1 lwl1 = new Level1();
	Level2 lwl2 = new Level2();
	Level3 lwl3 = new Level3();
	Level4 lwl4 = new Level4();
	Level5 lwl5 = new Level5();

	boolean lwl1done=false;
	boolean lwl2done=false;
	boolean lwl3done=false;
	boolean lwl4done=false;

	public Levels() {

	}

	public void add(Pane pane) {// We create our add method for levels menu and
								// set clicked events on buttons in levels.

		level2obs.setFill(Color.GRAY);
		level2obs.setOpacity(0.7);
		level3obs.setFill(Color.GRAY);
		level3obs.setOpacity(0.7);
		level4obs.setFill(Color.GRAY);
		level4obs.setOpacity(0.7);
		level5obs.setFill(Color.GRAY);
		level5obs.setOpacity(0.7);

		level1.setStroke(Color.BLACK);
		level1.setFill(Color.WHITE);
		level1.setOnMouseClicked(e -> {
			lwl1.add(pane);
		});

		level1Writing.setFont(Font.font("Helvetica", FontWeight.BOLD, 50));
		level1Writing.setLayoutX(620);
		level1Writing.setLayoutY(160);
		level1Writing.setOnMouseClicked(e -> {
			lwl1.add(pane);
		});

		level2.setStroke(Color.BLACK);
		level2.setFill(Color.WHITE);
		level2.setOnMouseClicked(e -> {
			lwl2.add(pane);
		});

		level2Writing.setFont(Font.font("Helvetica", FontWeight.BOLD, 50));
		level2Writing.setLayoutX(620);
		level2Writing.setLayoutY(240);
		level2Writing.setOnMouseClicked(e -> {
			lwl2.add(pane);
		});

		level3.setStroke(Color.BLACK);
		level3.setFill(Color.WHITE);
		level3.setOnMouseClicked(e -> {
			lwl3.add(pane);
		});

		level3Writing.setFont(Font.font("Helvetica", FontWeight.BOLD, 50));
		level3Writing.setLayoutX(620);
		level3Writing.setLayoutY(320);
		level3Writing.setOnMouseClicked(e -> {
			lwl3.add(pane);
		});

		level4.setStroke(Color.BLACK);
		level4.setFill(Color.WHITE);
		level4.setOnMouseClicked(e -> {
			lwl4.add(pane);
		});

		level4Writing.setFont(Font.font("Helvetica", FontWeight.BOLD, 50));
		level4Writing.setLayoutX(620);
		level4Writing.setLayoutY(400);
		level4Writing.setOnMouseClicked(e -> {
			lwl4.add(pane);
		});

		level5.setStroke(Color.BLACK);
		level5.setFill(Color.WHITE);
		level5.setOnMouseClicked(e -> {
			lwl5.add(pane);
		});

		level5Writing.setFont(Font.font("Helvetica", FontWeight.BOLD, 50));
		level5Writing.setLayoutX(620);
		level5Writing.setLayoutY(480);
		level5Writing.setOnMouseClicked(e -> {
			lwl5.add(pane);
		});

		mainmenuButton.setStroke(Color.BLACK);
		mainmenuButton.setFill(Color.WHITE);
		mainmenuButton.setOnMouseClicked(e -> {

		});

		mainmenuButtonWriting.setFont(Font.font("Helvetica", FontWeight.BOLD, 40));
		mainmenuButtonWriting.setLayoutX(440);
		mainmenuButtonWriting.setLayoutY(640);
		mainmenuButtonWriting.setOnMouseClicked(e -> {

		});

		pane.getChildren().clear();
		pane.getChildren().addAll(level1, level2, level3, level4, level5, level1Writing, level2Writing, level3Writing,
				level4Writing, level5Writing, mainmenuButton, mainmenuButtonWriting, level2obs, level3obs, level4obs,
				level5obs);

		if(lwl1.finished()==1 || lwl1done==true){
			lwl1done=true;
			pane.getChildren().remove(level2obs);
		}

		if(lwl2.finished()==1 || lwl2done==true || lwl1.lwl2.finished() == 1){
			lwl2done=true;
			pane.getChildren().remove(level3obs);
		}

		if(lwl3.finished()==1 || lwl3done==true || lwl1.lwl2.lwl3.finished() == 1){
			lwl3done=true;
			pane.getChildren().remove(level4obs);
		}

		if(lwl4.finished()==1 || lwl4done==true|| lwl1.lwl2.lwl3.lwl4.finished() == 1){
			lwl4done=true;
			pane.getChildren().remove(level5obs);
		}


	}

}