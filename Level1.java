import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
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
import javafx.util.Duration;
import javafx.animation.*;

//Metehan Ertan 150117051 Furkan KUSE 150117041
public class Level1 {

	Circle circle1 = new Circle();// We create bases of our level1
	Line line11 = new Line(750, 450, 750, 365);
	Line line12 = new Line(735, 365, 765, 365);
	Line line13 = new Line(750, 365, 750, 215);
	Circle circle2 = new Circle();
	Line line21 = new Line(870, 415, 550, 415);
	Line line22 = new Line(545, 200, 545, 230);
	Line line23 = new Line(550, 215, 720, 215);
	Line line24 = new Line(780, 215, 930, 215);
	Line line25 = new Line(535, 230, 535, 400);
	Arc arc1 = new Arc(750, 215, 30, 30, 0, 180);
	Arc arc2 = new Arc(550, 400, 15, 15, 180, 90);
	Arc arc3 = new Arc(550, 230, 15, 15, 90, 90);
	Rectangle mainmenuButton = new Rectangle(400, 600, 280, 50);
	Text mainmenuButtonWriting = new Text("Main menu");
	Rectangle levelsButton = new Rectangle(720, 600, 280, 50);
	Text levelsButtonWriting = new Text("Levels");

	double x1 = 0;
	double y1 = 0;
	double x1t = 0;
	double a1 = 0;
	public Timeline animation1;
	double x2 = 0;
	double y2 = 0;
	double x2t = 0;
	public Timeline animation2;
	Level2 lwl2 = new Level2();

	public Level1() {

	}

	public void add(Pane pane) {// We create our add method for level 1
		x1 = 0;
		y1 = 0;
		x1t = 0;
		a1 = 0;
		x2 = 0;
		y2 = 0;
		x2t = 0;

		circle1.setCenterX(750);
		circle1.setCenterY(480);
		circle1.setRadius(30);
		circle1.setStroke(Color.BLACK);
		circle1.setFill(Color.BLACK);

		circle1.setOnMouseClicked(e -> {

			animation1.play();
		});

		animation1 = new Timeline(new KeyFrame(Duration.millis(15), e -> {
			this.updater1();
			x1t = 1;
			line13.setEndY(215 + y1);
			line12.setStartX(735 - x1);
			line12.setEndX(765 + x1);

			if (y1 == 150) {
				animation1.stop();
				pane.getChildren().removeAll(circle1, line11, line12, line13);

			}

		}));
		animation1.setCycleCount(Timeline.INDEFINITE);

		line11.setStrokeWidth(3);
		line11.setStroke(Color.DIMGRAY);

		line12.setStrokeWidth(6);
		line12.setStroke(Color.BLACK);
		line12.setStartX(735);
		line12.setStartY(365);
		line12.setEndX(765);
		line12.setEndY(365);

		line13.setStrokeWidth(7);
		line13.setStroke(Color.BLACK);
		line13.setStartX(750);
		line13.setStartY(365);
		line13.setEndX(750);
		line13.setEndY(215);

		circle2.setCenterX(900);
		circle2.setCenterY(415);
		circle2.setRadius(30);
		circle2.setStroke(Color.BLACK);
		circle2.setFill(Color.BLACK);

		circle2.setOnMouseClicked(e -> {

			animation2.play();
		});

		animation2 = new Timeline(new KeyFrame(Duration.millis(15), e -> {
			this.updater2();

			if (x2 < 30) {
				line22.setEndY(230 + y2);
				line22.setStartY(200 - y2);
				line23.setEndX(720 - x2);
				line24.setStartX(780 - x2);
				line24.setEndX(930 - x2);
				arc1.setCenterX(750 - x2);
			}

			else if (x2 > 30 && x1t != 1) {
                FadeTransition fadeTransition1
                = new FadeTransition(Duration.millis(700), pane);
                fadeTransition1.setFromValue(1.0);
                fadeTransition1.setToValue(0.0);
                fadeTransition1.play();
				animation1.stop();
				animation2.stop();
			    add(pane);
                FadeTransition fadeTransition2
                = new FadeTransition(Duration.millis(700), pane);
                fadeTransition2.setFromValue(0.0);
                fadeTransition2.setToValue(1.0);
                fadeTransition2.play();
			}

			else if (x2 < 170) {
				line22.setEndY(230 + y2);
				line22.setStartY(200 - y2);
				line23.setEndX(720 - x2);
				line24.setStartX(780 - x2);
				line24.setEndX(930 - x2);
				arc1.setCenterX(750 - x2);

			}

			else if (x2 > 170 && x2 < 230) {
				pane.getChildren().remove(line23);
				line22.setEndY(230 + y2);
				line22.setStartY(200 - y2);
				line24.setStartX(780 - x2);
				line24.setEndX(930 - x2);
				arc1.setCenterX(750 - x2);
				arc1.setLength(180 - a1);
			}

			else if (x2 > 230 && x2 < 390) {
				pane.getChildren().remove(arc1);
				line22.setEndY(230 + y2);
				line22.setStartY(200 - y2);
				line24.setEndX(930 - x2);
			}

			else if (x2 > 390) {
				pane.getChildren().removeAll(line24, line21, line25, line22, arc2, arc3, circle2,
						mainmenuButton, mainmenuButtonWriting, levelsButton, levelsButtonWriting);
				lwl2.add(pane);
				x2t=1;
				animation2.stop();
			}

		}));
		animation2.setCycleCount(Timeline.INDEFINITE);

		line21.setStrokeWidth(3);
		line21.setStroke(Color.DIMGRAY);

		line22.setStrokeWidth(6);
		line22.setStroke(Color.BLACK);
		line22.setStartX(545);
		line22.setStartY(200);
		line22.setEndX(545);
		line22.setEndY(230);

		line23.setStrokeWidth(7);
		line23.setStroke(Color.BLACK);
		line23.setStartX(550);
		line23.setStartY(215);
		line23.setEndX(720);
		line23.setEndY(215);

		line24.setStrokeWidth(7);
		line24.setStroke(Color.BLACK);
		line24.setStartX(780);
		line24.setStartY(215);
		line24.setEndX(930);
		line24.setEndY(215);

		line25.setStrokeWidth(3);
		line25.setStroke(Color.DIMGRAY);

		arc1.setFill(Color.TRANSPARENT);
		arc1.setType(ArcType.OPEN);
		arc1.setStroke(Color.BLACK);
		arc1.setStrokeWidth(7);
		arc1.setCenterX(750);
		arc1.setCenterY(215);
		arc1.setLength(180);

		arc2.setFill(Color.TRANSPARENT);
		arc2.setType(ArcType.OPEN);
		arc2.setStroke(Color.DIMGRAY);
		arc2.setStrokeWidth(3);

		arc3.setFill(Color.TRANSPARENT);
		arc3.setType(ArcType.OPEN);
		arc3.setStroke(Color.DIMGRAY);
		arc3.setStrokeWidth(3);

		mainmenuButton.setStroke(Color.BLACK);
		mainmenuButton.setFill(Color.TRANSPARENT);

		mainmenuButtonWriting.setFont(Font.font("Helvetica", FontWeight.BOLD, 40));
		mainmenuButtonWriting.setLayoutX(440);
		mainmenuButtonWriting.setLayoutY(640);

		levelsButtonWriting.setFont(Font.font("Helvetica", FontWeight.BOLD, 40));
		levelsButton.setStroke(Color.BLACK);
		levelsButton.setFill(Color.TRANSPARENT);
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
		pane.getChildren().addAll(line11, arc3, line12, line13, line21, line25, line22, line23, line24, arc1, arc2,
				mainmenuButton, mainmenuButtonWriting, levelsButton, levelsButtonWriting, circle1, circle2);

	}

	public void updater1() {
		y1 += 3;
		x1 += 0.15;
	}

	public void updater2() {
		x2 += 3;
		y2 += 0.15;
		if (170 < x2 && x2 < 225)
			a1 += 9.5;
	}

	public double finished(){
		return x2t;
	}

}
