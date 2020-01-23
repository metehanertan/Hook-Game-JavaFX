import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.animation.*;

//Metehan Ertan 150117051 Furkan KUSE 150117041
public class Level4 {

	Disconnector disconnector1 = new Disconnector(30, 550, 350);// We create
																// bases of our
																// level 4
	Circle circle1 = new Circle();
	Line line11 = new Line(430, 350, 520, 350);
	Line line12 = new Line(580, 350, 780, 350);
	Arc arc1 = new Arc(780, 335, 15, 15, 270, 90);
	Line line13 = new Line(780, 335, 810, 335);
	Line line14 = new Line(795, 335, 795, 205);
	Circle circle2 = new Circle();
	Line line21 = new Line(550, 470, 550, 380);
	Line line22 = new Line(550, 320, 550, 220);
	Arc arc2 = new Arc(565, 220, 15, 15, 90, 90);
	Line line23 = new Line(565, 220, 565, 190);
	Line line24 = new Line(565, 205, 765, 205);
	Arc arc3 = new Arc(795, 205, 30, 30, 0, 180);
	Line line25 = new Line(825, 205, 925, 205);
	Rectangle mainmenuButton = new Rectangle(400, 600, 280, 50);
	Text mainmenuButtonWriting = new Text("Main menu");
	Rectangle levelsButton = new Rectangle(720, 600, 280, 50);
	Text levelsButtonWriting = new Text("Levels");

	double x1t = 0;
	double x2t = 0;
	
	Level5 lwl5 = new Level5();

	public Level4() {

	}

	public void add(Pane pane) {// We create add method for level 4

		circle1.setRadius(30);
		circle1.setCenterX(400);
		circle1.setCenterY(350);
		circle1.setFill(Color.BLACK);

		line11.setStrokeWidth(3);
		line11.setStroke(Color.DIMGRAY);

		line12.setStrokeWidth(3);
		line12.setStroke(Color.DIMGRAY);

		arc1.setFill(Color.TRANSPARENT);
		arc1.setStroke(Color.DIMGRAY);
		arc1.setType(ArcType.OPEN);
		arc1.setStrokeWidth(3);

		line13.setStrokeWidth(6);

		line14.setStrokeWidth(7);

		circle2.setRadius(30);
		circle2.setCenterX(550);
		circle2.setCenterY(500);
		circle2.setFill(Color.BLACK);

		line21.setStrokeWidth(3);
		line21.setStroke(Color.DIMGRAY);

		line22.setStrokeWidth(3);
		line22.setStroke(Color.DIMGRAY);

		arc2.setFill(Color.TRANSPARENT);
		arc2.setStroke(Color.DIMGRAY);
		arc2.setType(ArcType.OPEN);
		arc2.setStrokeWidth(3);

		line23.setStrokeWidth(6);

		line24.setStrokeWidth(7);

		arc3.setFill(Color.TRANSPARENT);
		arc3.setStroke(Color.BLACK);
		arc3.setType(ArcType.OPEN);
		arc3.setStrokeWidth(7);

		line25.setStrokeWidth(7);

		mainmenuButton.setStroke(Color.BLACK);
		mainmenuButton.setFill(Color.WHITE);

		mainmenuButtonWriting.setFont(Font.font("Helvetica", FontWeight.BOLD, 40));
		mainmenuButtonWriting.setLayoutX(440);
		mainmenuButtonWriting.setLayoutY(640);

		levelsButtonWriting.setFont(Font.font("Helvetica", FontWeight.BOLD, 40));
		levelsButton.setStroke(Color.BLACK);
		levelsButton.setFill(Color.WHITE);
		levelsButtonWriting.setLayoutX(800);
		levelsButtonWriting.setLayoutY(640);

		circle1.setOnMouseEntered(e -> {
			circle1.setRadius(35);
		});
		circle1.setOnMouseExited(e -> {
			circle1.setRadius(30);
		});

		circle2.setOnMouseEntered(e -> {
			circle2.setRadius(35);
		});
		circle2.setOnMouseExited(e -> {
			circle2.setRadius(30);
		});

		pane.getChildren().clear();

		disconnector1.add(pane);
		pane.getChildren().addAll(arc1, arc2, arc3, line11, line12, line13, line14, line21, line22, line23, line24,
				line25, mainmenuButton, mainmenuButtonWriting, levelsButton, levelsButtonWriting, circle1, circle2);
	}


	public double finished(){
		return x2t;
	}

}
