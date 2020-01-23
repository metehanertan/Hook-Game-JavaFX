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

//Metehan Ertan 150117051 Furkan KUSE 150117041
public class Level5 {

	double x1 = 0;
	double y1 = 0;
	double x1t = 0;
	double a1 = 0;
	double x2 = 0;
	double y2 = 0;
	double x2t = 0;
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

	Disconnector disconnector1 = new Disconnector(30, 580, 300);// We create
																// bases of our
																// level 5
	Disconnector disconnector2 = new Disconnector(30, 580, 400);
	Line linedis = new Line(580, 330, 580, 370);
	Circle circle1 = new Circle();
	Line line11 = new Line(710, 285, 740, 285);
	Line line12 = new Line(725, 285, 725, 185);
	Line line13 = new Line(725, 125, 725, 75);
	Arc arc5 = new Arc(725, 155, 30, 30, 90, 180);
	Line line14 = new Line(480, 300, 550, 300);
	Line line15 = new Line(610, 300, 710, 300);
	Arc arc1 = new Arc(710, 285, 15, 15, 270, 90);
	Circle circle2 = new Circle();
	Line line24 = new Line(480, 400, 550, 400);
	Line line21 = new Line(890, 385, 920, 385);
	Line line22 = new Line(905, 105, 905, 385);
	Arc arc7 = new Arc(905, 75, 30, 30, -90, 180);
	Line line23 = new Line(905, 45, 905, 25);
	Line line25 = new Line(610, 400, 895, 400);
	Arc arc2 = new Arc(890, 385, 15, 15, 270, 90);
	Circle circle3 = new Circle();
	Line line31 = new Line(595, 60, 595, 90);
	Line line32 = new Line(595, 75, 695, 75);
	Line line33 = new Line(755, 75, 905, 75);
	Arc arc6 = new Arc(725, 75, 30, 30, 0, 180);
	Line line34 = new Line(580, 500, 580, 430);
	Line line35 = new Line(580, 270, 580, 90);
	Arc arc3 = new Arc(595, 90, 15, 15, 90, 90);
	Circle circle4 = new Circle();
	Line line41 = new Line(840, 500, 840, 170);
	Line line42 = new Line(825, 140, 825, 170);
	Line line43 = new Line(725, 155, 825, 155);
	Arc arc4 = new Arc(825, 170, 15, 15, 00, 90);
	Rectangle mainmenuButton = new Rectangle(400, 600, 280, 50);
	Text mainmenuButtonWriting = new Text("Main menu");
	Rectangle levelsButton = new Rectangle(720, 600, 280, 50);
	Text levelsButtonWriting = new Text("Levels");

	public Level5() {

	}

	public void add(Pane pane) {// We create add method for level 5

		disconnector2.line1.setRotate(90);
		disconnector2.angle = 90;

		x1 = 0;
		y1 = 0;
		x1t = 0;
		a1 = 0;
		x2 = 0;
		y2 = 0;
		x2t = 0;
		a2 = 0;
		x3 = 0;
		y3 = 0;
		x3t = 0;
		a3 = 0;
		x4 = 0;
		y4 = 0;
		x4t = 0;

		linedis.setStrokeWidth(3);
		linedis.setStroke(Color.DIMGRAY);

		circle1.setCenterX(450);
		circle1.setCenterY(300);
		circle1.setRadius(30);
		circle1.setStroke(Color.BLACK);
		circle1.setFill(Color.BLACK);

		circle1.setOnMouseClicked(e -> {

			animation1.play();
		});

		animation1 = new Timeline(new KeyFrame(Duration.millis(15), e -> {

			if (disconnector1.disconnectorCheck % 2 == 1) {
				x1t = 1;
				this.updater1();

				if (y1 < 30) {
					line11.setStartX(710 - x1);
					line11.setEndX(740 + x1);
					line12.setEndY(185 + y1);
					line13.setStartY(125 + y1);
					line13.setEndY(75 + y1);
					arc5.setCenterY(155 + y1);
				}

				else if (y1 > 30 && x4t != 1) {
					animation1.stop();
					animation2.stop();
					animation3.stop();
					animation4.stop();
					disconnector1.animation1.stop();
					disconnector2.animation1.stop();
					add(pane);
				}

				else if (y1 > 30 && y1 < 100 && x4t != 0) {
					line12.setEndY(185 + y1);
					line11.setStartX(710 - x1);
					line11.setEndX(740 + x1);
					line13.setStartY(125 + y1);
					line13.setEndY(75 + y1);
					arc5.setCenterY(155 + y1);
				}

				else if (y1 > 100 && y1 < 160 && x4t != 0) {
					pane.getChildren().remove(line12);
					line13.setStartY(125 + y1);
					line13.setEndY(75 + y1);
					arc5.setCenterY(155 + y1);
					arc5.setLength(180 - a1);

				}

				else if (y1 > 160 && y1 < 200 && x4t != 0) {
					pane.getChildren().remove(arc5);
					line13.setEndY(75 + y1);
				}

				else if (y1 > 200 && x4t != 0) {
					animation1.stop();
					pane.getChildren().removeAll(line11, line13, line14, line15, arc1, arc5, circle1);
				}

			}
		}));

		animation1.setCycleCount(Timeline.INDEFINITE);

		line11.setStrokeWidth(6);
		line11.setStroke(Color.BLACK);
		line11.setStartX(710);
		line11.setStartY(285);
		line11.setEndX(740);
		line11.setEndY(285);

		line12.setStrokeWidth(7);
		line12.setStroke(Color.BLACK);
		line12.setStartX(725);
		line12.setStartY(285);
		line12.setEndX(725);
		line12.setEndY(185);

		line13.setStrokeWidth(7);
		line13.setStroke(Color.BLACK);
		line13.setStartX(725);
		line13.setStartY(125);
		line13.setEndX(725);
		line13.setEndY(75);

		arc5.setFill(Color.TRANSPARENT);
		arc5.setType(ArcType.OPEN);
		arc5.setStroke(Color.BLACK);
		arc5.setStrokeWidth(7);
		arc5.setCenterX(725);
		arc5.setCenterY(155);
		arc5.setStartAngle(90);
		arc5.setLength(180);

		line14.setStrokeWidth(3);
		line14.setStroke(Color.DIMGRAY);

		line15.setStrokeWidth(3);
		line15.setStroke(Color.DIMGRAY);

		arc1.setFill(Color.TRANSPARENT);
		arc1.setStroke(Color.DIMGRAY);
		arc1.setType(ArcType.OPEN);
		arc1.setStrokeWidth(3);

		circle2.setCenterX(450);
		circle2.setCenterY(400);
		circle2.setRadius(30);
		circle2.setStroke(Color.BLACK);
		circle2.setFill(Color.BLACK);

		circle2.setOnMouseClicked(e -> {

			animation2.play();
		});

		animation2 = new Timeline(new KeyFrame(Duration.millis(15), e -> {

			if (disconnector2.disconnectorCheck % 2 == 1) {
				x2t = 1;
				this.updater2();

				if (y2 < 30) {
					line21.setStartX(890 - x2);
					line21.setEndX(920 + x2);
					line22.setStartY(105 + y2);
					arc7.setCenterY(75 + y2);
					line23.setStartY(45 + y2);
					line23.setEndY(25 + y2);
				}

				else if (y2 > 30 && x3t != 1) {
					animation1.stop();
					animation2.stop();
					animation3.stop();
					animation4.stop();
					disconnector1.animation1.stop();
					disconnector2.animation1.stop();
					add(pane);
				}

				else if (y2 > 30 && y2 < 280 && x3t != 0) {
					line21.setStartX(890 - x2);
					line21.setEndX(920 + x2);
					line22.setStartY(105 + y2);
					arc7.setCenterY(75 + y2);
					line23.setStartY(45 + y2);
					line23.setEndY(25 + y2);
				}

				else if (y2 > 280 && y2 < 340 && x3t != 0) {
					pane.getChildren().remove(line22);
					line21.setStartX(890 - x2);
					line21.setEndX(920 + x2);
					arc7.setCenterY(75 + y2);
					arc7.setLength(a2 - 180);
					line23.setStartY(45 + y2);
					line23.setEndY(25 + y2);
				}

				else if (y2 > 340 && y2 < 360 && x3t != 0) {
					pane.getChildren().remove(arc7);
					line21.setStartX(890 - x2);
					line21.setEndX(920 + x2);
					line23.setEndY(25 + y2);
				}

				else if (y2 > 360 && x3t != 0) {
					pane.getChildren().removeAll(line21, line23, line24, line25, arc2, circle2);
					disconnector2.remove(pane);
					animation2.stop();
				}
			}
		}));

		animation2.setCycleCount(Timeline.INDEFINITE);

		line24.setStrokeWidth(3);
		line24.setStroke(Color.DIMGRAY);
		line24.setStartX(480);
		line24.setStartY(400);
		line24.setEndX(550);
		line24.setEndY(400);

		line21.setStrokeWidth(6);
		line21.setStroke(Color.BLACK);
		line21.setStartX(890);
		line21.setStartY(385);
		line21.setEndX(920);
		line21.setEndY(385);

		line22.setStrokeWidth(7);
		line22.setStroke(Color.BLACK);
		line22.setStartX(905);
		line22.setStartY(105);
		line22.setEndX(905);
		line22.setEndY(385);

		arc7.setFill(Color.TRANSPARENT);
		arc7.setType(ArcType.OPEN);
		arc7.setStroke(Color.BLACK);
		arc7.setStrokeWidth(7);
		arc7.setCenterX(905);
		arc7.setCenterY(75);
		arc7.setStartAngle(-90);
		arc7.setLength(180);

		line23.setStrokeWidth(7);
		line23.setStroke(Color.BLACK);
		line23.setStartX(905);
		line23.setStartY(45);
		line23.setEndX(905);
		line23.setEndY(25);

		line25.setStrokeWidth(3);
		line25.setStroke(Color.DIMGRAY);
		line25.setStartX(610);
		line25.setStartY(400);
		line25.setEndX(895);
		line25.setEndY(400);

		arc2.setFill(Color.TRANSPARENT);
		arc2.setStroke(Color.DIMGRAY);
		arc2.setType(ArcType.OPEN);
		arc2.setStrokeWidth(3);

		circle3.setCenterX(580);
		circle3.setCenterY(530);
		circle3.setRadius(30);
		circle3.setStroke(Color.BLACK);
		circle3.setFill(Color.BLACK);

		circle3.setOnMouseClicked(e -> {

			animation3.play();
		});

		animation3 = new Timeline(new KeyFrame(Duration.millis(15), e -> {

			if ((disconnector1.disconnectorCheck % 2) == 0 && (disconnector2.disconnectorCheck % 2) == 0) {
				x3t = 1;
				this.updater3();

				if (x3 < 30) {
					line31.setStartY(60 - y3);
					line31.setEndY(90 + y3);
					line32.setEndX(695 - x3);
					line33.setStartX(755 - x3);
					line33.setEndX(905 - x3);
					arc6.setCenterX(725 - x3);
				}

				else if (x3 > 30 && x1t != 1) {
					animation1.stop();
					animation2.stop();
					animation3.stop();
					animation4.stop();
					disconnector1.animation1.stop();
					disconnector2.animation1.stop();
					add(pane);
				}

				else if (x3 > 30 && x3 < 100 && x3t != 0) {
					line31.setStartY(60 - y3);
					line31.setEndY(90 + y3);
					line32.setEndX(695 - x3);
					line33.setStartX(755 - x3);
					line33.setEndX(905 - x3);
					arc6.setCenterX(725 - x3);
				}

				else if (x3 > 100 && x3 < 160 && x3t != 0) {// Arc dönüþü ekle
					pane.getChildren().remove(line32);
					line31.setStartY(60 - y3);
					line31.setEndY(90 + y3);
					line33.setStartX(755 - x3);
					line33.setEndX(905 - x3);
					arc6.setCenterX(725 - x3);
					arc6.setLength(180 - a3);
				}

				else if (x3 > 160 && x3 < 310 && x3t != 0) {
					pane.getChildren().remove(arc6);
					line31.setStartY(60 - y3);
					line31.setEndY(90 + y3);
					line33.setEndX(905 - x3);
				}

				else if (x3 > 310 && x3t != 0) {
					animation3.stop();
					pane.getChildren().removeAll(line31, line33, line34, line35, arc3, circle3, linedis);
					disconnector1.remove(pane);
				}

			}
		}));

		animation3.setCycleCount(Timeline.INDEFINITE);

		line31.setStrokeWidth(6);
		line31.setStroke(Color.BLACK);
		line31.setStartX(595);
		line31.setStartY(60);
		line31.setEndX(595);
		line31.setEndY(90);

		line32.setStrokeWidth(7);
		line32.setStroke(Color.BLACK);
		line32.setStartX(595);
		line32.setStartY(75);
		line32.setEndX(695);
		line32.setEndY(75);

		line33.setStrokeWidth(7);
		line33.setStroke(Color.BLACK);
		line33.setStartX(755);
		line33.setStartY(75);
		line33.setEndX(905);
		line33.setEndY(75);

		arc6.setFill(Color.TRANSPARENT);
		arc6.setType(ArcType.OPEN);
		arc6.setStroke(Color.BLACK);
		arc6.setStrokeWidth(7);
		arc6.setCenterX(725);
		arc6.setCenterY(75);
		arc6.setStartAngle(0);
		arc6.setLength(180);

		line34.setStrokeWidth(3);
		line34.setStroke(Color.DIMGRAY);

		line35.setStrokeWidth(3);
		line35.setStroke(Color.DIMGRAY);

		arc3.setFill(Color.TRANSPARENT);
		arc3.setStroke(Color.DIMGRAY);
		arc3.setType(ArcType.OPEN);
		arc3.setStrokeWidth(3);

		circle4.setCenterX(840);
		circle4.setCenterY(530);
		circle4.setRadius(30);
		circle4.setStroke(Color.BLACK);
		circle4.setFill(Color.BLACK);

		circle4.setOnMouseClicked(e -> {

			animation4.play();
		});

		animation4 = new Timeline(new KeyFrame(Duration.millis(15), e -> {
			x4t = 1;
			this.updater4();
			line42.setStartY(140 - y4);
			line42.setEndY(170 + y4);
			line43.setStartX(725 + x4);

			if (x4 > 100) {
				pane.getChildren().removeAll(line41, line42, line43, arc4, circle4);
				animation4.stop();
			}
		}));

		animation4.setCycleCount(Timeline.INDEFINITE);

		line41.setStrokeWidth(3);
		line41.setStroke(Color.DIMGRAY);

		line42.setStrokeWidth(6);
		line42.setStroke(Color.BLACK);
		line42.setStartX(825);
		line42.setStartY(140);
		line42.setEndX(825);
		line42.setEndY(170);

		line43.setStrokeWidth(7);
		line43.setStroke(Color.BLACK);
		line43.setStartX(725);
		line43.setStartY(155);
		line43.setEndX(825);
		line43.setEndY(155);

		arc4.setFill(Color.TRANSPARENT);
		arc4.setStroke(Color.DIMGRAY);
		arc4.setType(ArcType.OPEN);
		arc4.setStrokeWidth(3);

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

		circle3.setOnMouseEntered(e -> {
			circle3.setRadius(35);
		});
		circle3.setOnMouseExited(e -> {
			circle3.setRadius(30);
		});

		circle4.setOnMouseEntered(e -> {
			circle4.setRadius(35);
		});
		circle4.setOnMouseExited(e -> {
			circle4.setRadius(30);
		});

		pane.getChildren().clear();
		disconnector1.add(pane);
		disconnector2.add(pane);
		pane.getChildren().addAll(arc1, arc2, arc3, arc4, linedis, line11, line12, line13, line14, line15, line21,
				line22, line23, line24, line25, line31, line32, line33, line34, line35, line41, line42, line43, arc5,
				arc6, arc7, mainmenuButton, mainmenuButtonWriting, levelsButton, levelsButtonWriting, circle1, circle2,
				circle3, circle4);
	}

	public void updater1() {
		y1 += 3;
		x1 += 0.15;

		if (y1 > 100 && y1 < 160)
			a1 += 9.5;

	}

	public void updater2() {
		y2 += 3;
		x2 += 0.1;

		if (y2 > 280 && y2 < 340)
			a2 += 9.5;

	}

	public void updater3() {
		x3 += 3;
		y3 += 0.1;

		if (x3 > 100 && x3 < 160)
			a3 += 9.5;
	}

	public void updater4() {
		x4 += 3;
		y4 += 0.15;
	}

}
