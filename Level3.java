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
public class Level3 {

	Circle circle1 = new Circle();// We create bases of our level3
	Line line11 = new Line(410, 400, 935, 400);
	Line line12 = new Line(965, 385, 935, 385);
	Line line13 = new Line(950, 385, 950, 290);
	Line line14 = new Line(950, 230, 950, 130);
	Arc arc1 = new Arc(950, 260, 30, 30, -90, 180);
	Arc arc3 = new Arc(935, 385, 15, 15, 270, 90);
	Circle circle2 = new Circle();
	Line line21 = new Line(560, 450, 765, 450);
	Line line22 = new Line(800, 245, 800, 275);
	Line line23 = new Line(800, 260, 950, 260);
	Line line24 = new Line(780, 435, 780, 275);
	Arc arc4 = new Arc(765, 435, 15, 15, 270, 90);
	Arc arc5 = new Arc(795, 275, 15, 15, 90, 90);
	Circle circle3 = new Circle();
	Line line31 = new Line(680, 470, 680, 145);
	Line line32 = new Line(720, 115, 720, 145);
	Line line33 = new Line(720, 130, 920, 130);
	Line line34 = new Line(980, 130, 1080, 130);
	Line line35 = new Line(695, 130, 715, 130);
	Arc arc2 = new Arc(950, 130, 30, 30, 0, 180);
	Arc arc6 = new Arc(695, 145, 15, 15, 90, 90);
	Rectangle mainmenuButton = new Rectangle(400, 600, 280, 50);
	Text mainmenuButtonWriting = new Text("Main menu");
	Rectangle levelsButton = new Rectangle(720, 600, 280, 50);
	Text levelsButtonWriting = new Text("Levels");

	double x1 = 0;
	double y1 = 0;
	double a1 = 0;
	double x1t = 0;
	double x2 = 0;
	double y2 = 0;
	double x2t = 0;
	double x3 = 0;
	double y3 = 0;
	double a3 = 0;
	double x3t = 0;

	public Timeline animation1;
	public Timeline animation2;
	public Timeline animation3;
	
	Level4 lwl4 = new Level4();

	public Level3() {

	}

	public void add(Pane pane) {// We create add method for level3

		x1 = 0;
		y1 = 0;
		a1 = 0;
		x1t = 0;
		x2 = 0;
		y2 = 0;
		x2t = 0;
		x3 = 0;
		y3 = 0;
		a3 = 0;
		x3t = 0;

		circle1.setCenterX(380);
		circle1.setCenterY(400);
		circle1.setRadius(30);
		circle1.setStroke(Color.BLACK);
		circle1.setFill(Color.BLACK);

		circle1.setOnMouseClicked(e -> {

			animation1.play();
		});

		animation1 = new Timeline(new KeyFrame(Duration.millis(15), e -> {
			this.updater1();
			x1t = 1;

			if (y1 < 30) {
				line12.setStartX(965 + x1);
				line12.setEndX(935 - x1);
				line13.setEndY(290 + y1);
				line14.setStartY(230 + y1);
				line14.setEndY(130 + y1);
				arc1.setCenterY(260 + y1);
			}

			else if (y1 > 30 && x2t != 1) {
				animation1.stop();
				animation2.stop();
				animation3.stop();
				add(pane);
			}

			else if (y1 < 95 && x2t != 0) {
				line12.setStartX(965 + x1);
				line12.setEndX(935 - x1);
				line13.setEndY(290 + y1);
				line14.setStartY(230 + y1);
				line14.setEndY(130 + y1);
				arc1.setCenterY(260 + y1);
			}

			else if (y1 > 95 && y1 < 153 && x2t != 0) {
				pane.getChildren().remove(line13);
				line12.setStartX(965 + x1);
				line12.setEndX(935 - x1);
				line14.setStartY(230 + y1);
				line14.setEndY(130 + y1);
				arc1.setCenterY(260 + y1);
				arc1.setLength(180 - a1);
				arc1.setStartAngle(a1 - 90);
			}

			else if (y1 > 153 && y1 < 250 && x2t != 0) {
				pane.getChildren().remove(arc1);
				line14.setEndY(130 + y1);
			}

			else if (y1 > 250 && x2t != 0) {
				animation1.stop();
				pane.getChildren().removeAll(line14, line11, line12, arc3, circle1);
			}

		}));
		animation1.setCycleCount(Timeline.INDEFINITE);

		line11.setStrokeWidth(3);
		line11.setStroke(Color.DIMGRAY);

		line12.setStrokeWidth(6);
		line12.setStroke(Color.BLACK);
		line12.setStartX(965);
		line12.setStartY(385);
		line12.setEndX(935);
		line12.setEndY(385);

		line13.setStrokeWidth(7);
		line13.setStroke(Color.BLACK);
		line13.setStartX(950);
		line13.setStartY(385);
		line13.setEndX(950);
		line13.setEndY(290);

		line14.setStrokeWidth(7);
		line14.setStroke(Color.BLACK);
		line14.setStartX(950);
		line14.setStartY(230);
		line14.setEndX(950);
		line14.setEndY(130);

		arc1.setFill(Color.TRANSPARENT);
		arc1.setType(ArcType.OPEN);
		arc1.setStroke(Color.BLACK);
		arc1.setStrokeWidth(7);

		arc3.setFill(Color.TRANSPARENT);
		arc3.setStroke(Color.DIMGRAY);
		arc3.setType(ArcType.OPEN);
		arc3.setStrokeWidth(3);

		circle2.setCenterX(530);
		circle2.setCenterY(450);
		circle2.setRadius(30);
		circle2.setStroke(Color.BLACK);
		circle2.setFill(Color.BLACK);

		circle2.setOnMouseClicked(e -> {

			animation2.play();
		});

		animation2 = new Timeline(new KeyFrame(Duration.millis(15), e -> {
			this.updater2();
			x2t = 1;

			line22.setStartY(245 - y2);
			line22.setEndY(275 + y2);
			line23.setEndX(950 - x2);

			if (x2 > 150) {
				animation2.stop();
				pane.getChildren().removeAll(circle2, line21, line22, line23, line24, arc4, arc5);

			}

		}));
		animation2.setCycleCount(Timeline.INDEFINITE);

		arc4.setFill(Color.TRANSPARENT);
		arc4.setStroke(Color.DIMGRAY);
		arc4.setType(ArcType.OPEN);
		arc4.setStrokeWidth(3);

		arc5.setFill(Color.TRANSPARENT);
		arc5.setStroke(Color.DIMGRAY);
		arc5.setType(ArcType.OPEN);
		arc5.setStrokeWidth(3);

		line21.setStrokeWidth(3);
		line21.setStroke(Color.DIMGRAY);

		line22.setStrokeWidth(6);
		line22.setStroke(Color.BLACK);
		line22.setStartX(800);
		line22.setStartY(245);
		line22.setEndX(800);
		line22.setEndY(275);

		line23.setStrokeWidth(7);
		line23.setStroke(Color.BLACK);
		line23.setStartX(800);
		line23.setStartY(260);
		line23.setEndX(950);
		line23.setEndY(260);

		line24.setStrokeWidth(3);
		line24.setStroke(Color.DIMGRAY);

		circle3.setCenterX(680);
		circle3.setCenterY(500);
		circle3.setRadius(30);
		circle3.setStroke(Color.BLACK);
		circle3.setFill(Color.BLACK);

		circle3.setOnMouseClicked(e -> {

			animation3.play();
		});

		animation3 = new Timeline(new KeyFrame(Duration.millis(15), e -> {
			this.updater3();
			x3t = 1;

			if (x3 < 30) {
				line32.setStartY(115 - y3);
				line32.setEndY(145 + y3);
				line33.setEndX(920 - x3);
				line34.setStartX(980 - x3);
				line34.setEndX(1080 - x3);
				arc2.setCenterX(950 - x3);
			}

			else if (x3 > 30 && x1t != 1) {
                FadeTransition fadeTransition1
                = new FadeTransition(Duration.millis(700), pane);
                fadeTransition1.setFromValue(1.0);
                fadeTransition1.setToValue(0.0);
                fadeTransition1.play();
				animation1.stop();
				animation2.stop();
				animation3.stop();
			    add(pane);
                FadeTransition fadeTransition2
                = new FadeTransition(Duration.millis(700), pane);
                fadeTransition2.setFromValue(0.0);
                fadeTransition2.setToValue(1.0);
                fadeTransition2.play();
			}

			else if (x3 > 30 && x3 < 200 && x1t != 0) {
				line32.setStartY(115 - y3);
				line32.setEndY(145 + y3);
				line33.setEndX(920 - x3);
				line34.setStartX(980 - x3);
				line34.setEndX(1080 - x3);
				arc2.setCenterX(950 - x3);
			}

			else if (x3 > 200 && x3 < 260 && x1t != 0) {
				pane.getChildren().remove(line33);
				line32.setStartY(115 - y3);
				line32.setEndY(145 + y3);
				line34.setStartX(980 - x3);
				line34.setEndX(1080 - x3);
				arc2.setCenterX(950 - x3);
				arc2.setLength(180 - a3);

			} else if (x3 > 260 && x3 < 360 && x1t != 0) {
				pane.getChildren().remove(arc2);
				line32.setStartY(115 - y3);
				line32.setEndY(145 + y3);
				line34.setEndX(1080 - x3);

			} else if (x3 > 360 && x1t != 0) {
				pane.getChildren().removeAll(line31, line32, line34, line35, arc6, circle3);
				x2t=1;
				lwl4.add(pane);
				animation3.stop();
			}

		}));

		animation3.setCycleCount(Timeline.INDEFINITE);

		line31.setStrokeWidth(3);
		line31.setStroke(Color.DIMGRAY);

		line32.setStrokeWidth(6);
		line32.setStroke(Color.BLACK);
		line32.setStartX(720);
		line32.setStartY(115);
		line32.setEndX(720);
		line32.setEndY(145);

		line33.setStrokeWidth(7);
		line33.setStroke(Color.BLACK);
		line33.setStartX(720);
		line33.setStartY(130);
		line33.setEndX(920);
		line33.setEndY(130);

		line34.setStrokeWidth(7);
		line34.setStroke(Color.BLACK);
		line34.setStartX(980);
		line34.setStartY(130);
		line34.setEndX(1080);
		line34.setEndY(130);

		line35.setStrokeWidth(3);
		line35.setStroke(Color.DIMGRAY);

		arc2.setFill(Color.TRANSPARENT);
		arc2.setType(ArcType.OPEN);
		arc2.setStroke(Color.BLACK);
		arc2.setStrokeWidth(7);
		arc2.setCenterX(950);
		arc2.setCenterY(130);
		arc2.setStartAngle(0);
		arc2.setLength(180);

		arc6.setFill(Color.TRANSPARENT);
		arc6.setStroke(Color.DIMGRAY);
		arc6.setType(ArcType.OPEN);
		arc6.setStrokeWidth(3);

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

		pane.getChildren().clear();
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

		circle3.setOnMouseEntered(e -> {
			circle3.setRadius(35);
		});
		circle3.setOnMouseExited(e -> {
			circle3.setRadius(30);
		});

		pane.getChildren().addAll(line11, arc3, line12, line13, line14, line21, line22, line23, line24, arc4, arc5,
				line31, line32, line33, line34, line35, arc6, arc1, arc2, mainmenuButton, mainmenuButtonWriting,
				levelsButton, levelsButtonWriting, circle1, circle2, circle3);
	}

	public void updater1() {
		x1 += 0.15;
		y1 += 3;

		if (y1 > 95 && y1 < 153)
			a1 += 9.5;
	}

	public void updater2() {
		x2 += 3;
		y2 += 0.15;
	}

	public void updater3() {
		x3 += 3;
		y3 += 0.15;

		if (x3 > 200 && x3 < 260)
			a3 += 9.5;

	}

	public double finished(){
		return x2t;
	}

}
