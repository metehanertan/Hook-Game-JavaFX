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
public class Level2 {

	double x1 = 0; // We define our variables
	double y1 = 0;
	double x1t = 0;
	double x2 = 0;
	double y2 = 0;
	double x2t = 0;
	double a1 = 0;
	double a2 = 0;
	double x3 = 0;
	double y3 = 0;
	double x3t = 0;
	double a3 = 0;
	double x4 = 0;
	double y4 = 0;
	double x4t = 0;

	public Timeline animation1;
	public Timeline animation2;
	public Timeline animation3;
	public Timeline animation4;

	Circle circle1 = new Circle();
	Line line11 = new Line(350, 470, 350, 185);
	Line line12 = new Line(365, 155, 365, 185);
	Line line13 = new Line(365, 170, 565, 170);
	Arc arc4 = new Arc(365, 185, 15, 15, 90, 90);

	Circle circle2 = new Circle();
	Line line21 = new Line(565, 470, 565, 436);
	Line line22 = new Line(550, 430, 580, 430);
	Line line23 = new Line(565, 430, 565, 360);
	Line line24 = new Line(565, 300, 565, 200);
	Line line25 = new Line(565, 140, 565, 100);
	Arc arc1 = new Arc(565, 170, 30, 30, -90, 180);
	Arc arc2 = new Arc(565, 330, 30, 30, 90, 180);

	Circle circle4 = new Circle();
	Line line41 = new Line(695, 470, 695, 436);
	Line line42 = new Line(680, 430, 710, 430);
	Line line43 = new Line(695, 430, 695, 330);

	Circle circle3 = new Circle();
	Line line31 = new Line(900, 470, 900, 345);
	Line line32 = new Line(885, 315, 885, 345);
	Line line33 = new Line(725, 330, 885, 330);
	Line line34 = new Line(665, 330, 565, 330);
	Arc arc3 = new Arc(695, 330, 30, 30, 180, -180);
	Arc arc5 = new Arc(885, 345, 15, 15, 0, 90);

	Rectangle mainmenuButton = new Rectangle(400, 600, 280, 50);
	Text mainmenuButtonWriting = new Text("Main menu");
	Rectangle levelsButton = new Rectangle(720, 600, 280, 50);
	Text levelsButtonWriting = new Text("Levels");
	Level3 lwl3 = new Level3();


	public Level2() {

	}

	public void add(Pane pane) {// We create add method for level2

		x1 = 0;
		y1 = 0;
		x1t = 0;
		line13.setEndX(565);
		line12.setStartY(155);
		line12.setEndY(185);

		x2 = 0;
		y2 = 0;
		x2t = 0;
		a1 = 0;
		a2 = 0;
		line23.setEndY(360);
		line22.setStartX(550);
		line22.setEndX(580);
		arc1.setCenterY(170);
		arc1.setStartAngle(-90);
		arc1.setLength(180);
		line24.setStartY(300);
		line24.setEndY(200);
		arc2.setCenterY(330);
		arc2.setStartAngle(90);
		arc2.setLength(180);
		line25.setStartY(140);
		line25.setEndY(100);

		x3 = 0;
		y3 = 0;
		x3t = 0;
		a3 = 0;
		line33.setStartX(725);
		line32.setStartY(315);
		line32.setEndY(345);
		line34.setStartX(665);
		line34.setEndX(565);
		arc3.setCenterX(695);
		arc3.setLength(-180);
		arc3.setStartAngle(180);

		x4 = 0;
		y4 = 0;
		x4t = 0;
		line43.setEndY(330);
		line42.setStartX(680);
		line42.setEndX(710);

		circle1.setCenterX(350);
		circle1.setCenterY(500);
		circle1.setRadius(30);
		circle1.setStroke(Color.BLACK);
		circle1.setFill(Color.BLACK);

		line11.setStrokeWidth(3);
		line11.setStroke(Color.DIMGRAY);

		line12.setStrokeWidth(6);
		line12.setStroke(Color.BLACK);

		line13.setStrokeWidth(7);
		line13.setStroke(Color.BLACK);

		arc4.setFill(Color.TRANSPARENT);
		arc4.setType(ArcType.OPEN);
		arc4.setStroke(Color.DIMGRAY);
		arc4.setStrokeWidth(3);

		circle2.setCenterX(565);
		circle2.setCenterY(500);
		circle2.setRadius(30);
		circle2.setStroke(Color.BLACK);
		circle2.setFill(Color.BLACK);

		line21.setStrokeWidth(3);
		line21.setStroke(Color.DIMGRAY);

		line22.setStrokeWidth(6);
		line22.setStroke(Color.BLACK);

		line23.setStrokeWidth(7);
		line23.setStroke(Color.BLACK);

		line24.setStrokeWidth(7);
		line24.setStroke(Color.BLACK);

		line25.setStrokeWidth(7);
		line25.setStroke(Color.BLACK);

		arc1.setFill(Color.TRANSPARENT);
		arc1.setType(ArcType.OPEN);
		arc1.setStroke(Color.BLACK);
		arc1.setStrokeWidth(7);

		arc2.setFill(Color.TRANSPARENT);
		arc2.setType(ArcType.OPEN);
		arc2.setStroke(Color.BLACK);
		arc2.setStrokeWidth(7);

		circle4.setCenterX(695);
		circle4.setCenterY(500);
		circle4.setRadius(30);
		circle4.setStroke(Color.BLACK);
		circle4.setFill(Color.BLACK);

		line41.setStrokeWidth(3);
		line41.setStroke(Color.DIMGRAY);

		line42.setStrokeWidth(6);
		line42.setStroke(Color.BLACK);

		line43.setStrokeWidth(7);
		line43.setStroke(Color.BLACK);

		circle3.setCenterX(900);
		circle3.setCenterY(500);
		circle3.setRadius(30);
		circle3.setStroke(Color.BLACK);
		circle3.setFill(Color.BLACK);

		line31.setStrokeWidth(3);
		line31.setStroke(Color.DIMGRAY);

		line32.setStrokeWidth(6);
		line32.setStroke(Color.BLACK);

		line33.setStrokeWidth(7);
		line33.setStroke(Color.BLACK);

		line34.setStrokeWidth(7);
		line34.setStroke(Color.BLACK);

		arc3.setFill(Color.TRANSPARENT);
		arc3.setType(ArcType.OPEN);
		arc3.setStroke(Color.BLACK);
		arc3.setStrokeWidth(7);

		arc5.setFill(Color.TRANSPARENT);
		arc5.setType(ArcType.OPEN);
		arc5.setStroke(Color.DIMGRAY);
		arc5.setStrokeWidth(3);

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

		circle1.setOnMouseClicked(e -> {// We create our clicked event for
										// circle1
			animation1.play();
		});

		animation1 = new Timeline(new KeyFrame(Duration.millis(15), e -> {
			this.updater1();
			x1t = 1;
			line13.setEndX(565 - x1);
			line12.setStartY(155 - y1);
			line12.setEndY(185 + y1);

			if (x1 > 200) {
				animation1.stop();
				pane.getChildren().removeAll(circle1, line11, line12, line13, arc4);

			}

		}));
		animation1.setCycleCount(Timeline.INDEFINITE);

		circle2.setOnMouseClicked(e -> {// We create our clicked event for
										// circle2

			animation2.play();
		});

		animation2 = new Timeline(new KeyFrame(Duration.millis(15), e -> {
			this.updater2();

			if (x2 < 30	) {
				line23.setEndY(360 + x2);
				line22.setStartX(550 - y2);
				line22.setEndX(580 + y2);
				arc2.setCenterY(330 + x2);
				arc2.setLength(180 - a2);
				line24.setStartY(300 + x2);
				line24.setEndY(200 + x2);
				arc1.setCenterY(170 + x2);
				line25.setStartY(140 + x2);
				line25.setEndY(100 + x2);
			}

			else if (x2 > 30 && (x1t != 1 || x3t != 1)) {
				System.out.println("colusion lwl2 circle 2");
                FadeTransition fadeTransition1
                = new FadeTransition(Duration.millis(700), pane);
                fadeTransition1.setFromValue(1.0);
                fadeTransition1.setToValue(0.0);
                fadeTransition1.play();
				animation1.stop();
				animation2.stop();
				animation3.stop();
				animation4.stop();
			    add(pane);
                FadeTransition fadeTransition2
                = new FadeTransition(Duration.millis(700), pane);
                fadeTransition2.setFromValue(0.0);
                fadeTransition2.setToValue(1.0);
                fadeTransition2.play();
			}

			else if (x2 < 70 && x1t == 1 && x3t == 1) {
				line23.setEndY(360 + x2);
				line22.setStartX(550 - y2);
				line22.setEndX(580 + y2);
				arc1.setCenterY(170 + x2);
				line24.setStartY(300 + x2);
				line24.setEndY(200 + x2);
				arc2.setCenterY(330 + x2);
				line25.setStartY(140 + x2);
				line25.setEndY(100 + x2);

			}

			else if (x2 > 70 && x2 < 130 && x1t == 1 && x3t == 1) {
				pane.getChildren().remove(line23);
				arc2.setCenterY(330 + x2);
				arc2.setLength(180 - a2);
				line24.setStartY(300 + x2);
				line24.setEndY(200 + x2);
				arc1.setCenterY(170 + x2);
				line25.setStartY(140 + x2);
				line25.setEndY(100 + x2);
			}

			else if (x2 > 130 && x2 < 230 && x1t == 1 && x3t == 1) {
				pane.getChildren().remove(arc2);
				line24.setEndY(200 + x2);
				arc1.setCenterY(170 + x2);
				line25.setStartY(140 + x2);
				line25.setEndY(100 + x2);
			}

			else if (x2 > 230 && x2 < 290 && x1t == 1 && x3t == 1) {
				pane.getChildren().remove(line24);
				arc1.setCenterY(170 + x2);
				arc1.setLength(180 - a1);
				arc1.setStartAngle(a1 - 90);
				line25.setStartY(140 + x2);
				line25.setEndY(100 + x2);
			}

			else if (x2 > 290 && x2 < 330 && x1t == 1 && x3t == 1) {
				pane.getChildren().remove(arc1);
				line25.setEndY(100 + x2);
			}

			else if (x2 > 330 && x1t == 1) {
				x2t=1;
				animation2.stop();
				pane.getChildren().removeAll(circle2, line21, line22, line23, line24, line25, arc1, arc2,
						mainmenuButton, mainmenuButtonWriting, levelsButton, levelsButtonWriting);
				lwl3.add(pane);

			}

		}));
		animation2.setCycleCount(Timeline.INDEFINITE);

		circle3.setOnMouseClicked(e -> {// We create our clicked event for
										// circle3

			animation3.play();
		});

		animation3 = new Timeline(new KeyFrame(Duration.millis(15), e -> {
			this.updater3();
			x3t = 1;

			if (x3 < 30 && x4t != 1) {
				line33.setStartX(725 + x3);
				line32.setStartY(315 - y3);
				line32.setEndY(345 + y3);
				line34.setStartX(665 + x3);
				line34.setEndX(565 + x3);
				arc3.setCenterX(695 + x3);
			}

			if (x3 > 30 && x4t != 1) {
				animation1.stop();
				animation2.stop();
				animation3.stop();
				animation4.stop();
				System.out.println("colusion lwl2 circle 3");
				add(pane);
			}

			if (x3 < 150) {
				line33.setStartX(725 + x3);
				line32.setStartY(315 - y3);
				line32.setEndY(345 + y3);
				line34.setStartX(665 + x3);
				line34.setEndX(565 + x3);
				arc3.setCenterX(695 + x3);
			}

			if (x3 > 160 && x3 < 220) {
				pane.getChildren().remove(line33);
				line34.setStartX(665 + x3);
				line34.setEndX(565 + x3);
				arc3.setCenterX(695 + x3);
				arc3.setLength(-180 + a3);
			}

			if (x3 > 220 && x3 < 320) {
				line34.setStartX(885);
				line34.setEndX(565 + x3);

			}
			if (x3 > 310) {
				animation3.stop();
				pane.getChildren().removeAll(circle3, line31, line32, line33, line34, arc5, arc3);
			}

		}));
		animation3.setCycleCount(Timeline.INDEFINITE);

		circle4.setOnMouseClicked(e -> {// We create our clicked event for
										// circle4

			animation4.play();
		});

		animation4 = new Timeline(new KeyFrame(Duration.millis(15), e -> {
			this.updater4();
			x4t = 1;
			line43.setEndY(330 + x4);
			line42.setStartX(680 - y4);
			line42.setEndX(710 + y4);

			if (x4 > 100) {
				animation4.stop();
				pane.getChildren().removeAll(circle4, line41, line42, line43);

			}

		}));
		animation4.setCycleCount(Timeline.INDEFINITE);

		circle1.setOnMouseEntered(e ->{
			circle1.setRadius(35);
		});
		circle1.setOnMouseExited(e ->{
			circle1.setRadius(30);
		});

		circle2.setOnMouseEntered(e ->{
			circle2.setRadius(35);
		});
		circle2.setOnMouseExited(e ->{
			circle2.setRadius(30);
		});

		circle3.setOnMouseEntered(e ->{
			circle3.setRadius(35);
		});
		circle3.setOnMouseExited(e ->{
			circle3.setRadius(30);
		});

		circle4.setOnMouseEntered(e ->{
			circle4.setRadius(35);
		});
		circle4.setOnMouseExited(e ->{
			circle4.setRadius(30);
		});

		pane.getChildren().clear();
		pane.getChildren().addAll(arc4, line11, line12, line13, line41, line42, line43,
				line21, line22, line23, line24, line25, line31, arc5, line32, line33, line34, arc1, arc2, arc3,
				mainmenuButton, mainmenuButtonWriting, levelsButton, levelsButtonWriting,circle1, circle4, circle2, circle3);

	}

	private void updater1() {// We create updater for our animation
		x1 += 3;
		y1 += 0.15;
	}

	private void updater2() {// We create updater for our animation
		x2 += 3;
		y2 += 0.15;
		if (x2 > 70 && x2 < 130) {
			a2 += 9.5;
		}
		if (x2 > 230 && x2 < 290) {
			a1 += 9.5;
		}
	}

	private void updater3() {// We create updater for our animation
		x3 += 3;
		y3 += 0.15;
		if (x3 > 160 && x3 < 220) {
			a3 += 9.5;
		}

	}

	private void updater4() {// We create updater for our animation
		x4 += 3;
		y4 += 0.15;
	}

	public double finished(){
		return x2t;
	}


}