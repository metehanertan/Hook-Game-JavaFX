import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.util.Duration;

//Metehan Ertan 150117051 Furkan KUSE 150117041
public class MainMenu {

	double x = 0; // We define our variables
	double y = 0;
	private Timeline animation;

	Text name = new Text("The Game"); // We create bases of our main menu
	Text creators = new Text("Creators: Furkan KUSE - Metehan ERTAN");
	Circle circle1 = new Circle();
	Line line11 = new Line(770, 400, 735, 400);
	Line line12 = new Line(730, 385 - y, 730, 415 + y);
	Line line13 = new Line(730, 400, 430 + x, 400);

	Levels levelsMenu = new Levels();

	public MainMenu() {

	}

	public void add(Pane pane) {// We create our add method for Main Menu

		name.setFont(Font.font("Helvetica", FontWeight.BOLD, 150));
		name.setLayoutX(300);
		name.setLayoutY(200);

		creators.setFont(Font.font("Helvetica", 25));
		creators.setLayoutX(20);
		creators.setLayoutY(700);

		circle1.setCenterX(800);
		circle1.setCenterY(400);
		circle1.setRadius(30);
		circle1.setStroke(Color.BLACK);
		circle1.setFill(Color.BLACK);
		circle1.setOnMouseClicked(e -> {// We create our clicked event for
										// opening levels menu

			animation.play();
		});

		animation = new Timeline(new KeyFrame(Duration.millis(15), e -> {
			this.updater();
			line13.setEndX(430 + x);
			line12.setStartY(385 - y);
			line12.setEndY(415 + y);

			if (x == 300) {
				animation.stop();
				fade(pane);
				pane.getChildren().clear();
				unfade(pane);
				levelsMenu.add(pane);
				this.mainRestarter(pane);

			}

		}));
		animation.setCycleCount(Timeline.INDEFINITE);

		line11.setStrokeWidth(3);
		line11.setStroke(Color.DIMGRAY);

		line12.setStrokeWidth(6);
		line12.setStroke(Color.BLACK);

		line13.setStrokeWidth(7);
		line13.setStroke(Color.BLACK);

		circle1.setOnMouseEntered(e -> {
			circle1.setRadius(35);
		});
		circle1.setOnMouseExited(e -> {
			circle1.setRadius(30);
		});

		pane.getChildren().addAll(name, creators, line11, line12, line13, circle1);

	}

	public void mainRestarter(Pane pane) {// We create restarter for coming back
											// to main menu
		this.levelsMainBt(pane);

		levelsMenu.lwl1.mainmenuButton.setOnMouseClicked(e -> {
			x = 0;
			y = 0;
			line13.setEndX(430 + x);
			line12.setStartY(385 - y);
			line12.setEndY(415 + y);
			fade(pane);
			pane.getChildren().clear();
			this.add(pane);
			unfade(pane);

		});
		levelsMenu.lwl1.mainmenuButtonWriting.setOnMouseClicked(e -> {
			x = 0;
			y = 0;
			line13.setEndX(430 + x);
			line12.setStartY(385 - y);
			line12.setEndY(415 + y);
			fade(pane);
			pane.getChildren().clear();
			this.add(pane);
			unfade(pane);
		});

		levelsMenu.lwl1.lwl2.mainmenuButton.setOnMouseClicked(e -> {
			x = 0;
			y = 0;
			line13.setEndX(430 + x);
			line12.setStartY(385 - y);
			line12.setEndY(415 + y);
			pane.getChildren().clear();
			this.add(pane);

		});

		levelsMenu.lwl1.lwl2.mainmenuButtonWriting.setOnMouseClicked(e -> {
			x = 0;
			y = 0;
			line13.setEndX(430 + x);
			line12.setStartY(385 - y);
			line12.setEndY(415 + y);
			pane.getChildren().clear();
			this.add(pane);
		});

		levelsMenu.lwl1.lwl2.lwl3.mainmenuButton.setOnMouseClicked(e -> {
			x = 0;
			y = 0;
			line13.setEndX(430 + x);
			line12.setStartY(385 - y);
			line12.setEndY(415 + y);
			pane.getChildren().clear();
			this.add(pane);

		});

		levelsMenu.lwl1.lwl2.lwl3.mainmenuButtonWriting.setOnMouseClicked(e -> {
			x = 0;
			y = 0;
			line13.setEndX(430 + x);
			line12.setStartY(385 - y);
			line12.setEndY(415 + y);
			pane.getChildren().clear();
			this.add(pane);
		});

		levelsMenu.lwl1.lwl2.lwl3.lwl4.mainmenuButton.setOnMouseClicked(e -> {
			x = 0;
			y = 0;
			line13.setEndX(430 + x);
			line12.setStartY(385 - y);
			line12.setEndY(415 + y);
			pane.getChildren().clear();
			this.add(pane);

		});

		levelsMenu.lwl1.lwl2.lwl3.lwl4.mainmenuButtonWriting.setOnMouseClicked(e -> {
			x = 0;
			y = 0;
			line13.setEndX(430 + x);
			line12.setStartY(385 - y);
			line12.setEndY(415 + y);
			pane.getChildren().clear();
			this.add(pane);
		});

		levelsMenu.lwl1.lwl2.lwl3.lwl4.lwl5.mainmenuButton.setOnMouseClicked(e -> {
			x = 0;
			y = 0;
			line13.setEndX(430 + x);
			line12.setStartY(385 - y);
			line12.setEndY(415 + y);
			pane.getChildren().clear();
			this.add(pane);

		});

		levelsMenu.lwl1.lwl2.lwl3.lwl4.lwl5.mainmenuButtonWriting.setOnMouseClicked(e -> {
			x = 0;
			y = 0;
			line13.setEndX(430 + x);
			line12.setStartY(385 - y);
			line12.setEndY(415 + y);
			pane.getChildren().clear();
			this.add(pane);
		});

		levelsMenu.lwl2.mainmenuButton.setOnMouseClicked(e -> {
			x = 0;
			y = 0;
			line13.setEndX(430 + x);
			line12.setStartY(385 - y);
			line12.setEndY(415 + y);
			fade(pane);
			pane.getChildren().clear();
			this.add(pane);
			unfade(pane);
		});
		levelsMenu.lwl2.mainmenuButtonWriting.setOnMouseClicked(e -> {
			x = 0;
			y = 0;
			line13.setEndX(430 + x);
			line12.setStartY(385 - y);
			line12.setEndY(415 + y);
			fade(pane);
			pane.getChildren().clear();
			this.add(pane);
			unfade(pane);
		});

		levelsMenu.lwl2.lwl3.mainmenuButton.setOnMouseClicked(e -> {
			x = 0;
			y = 0;
			line13.setEndX(430 + x);
			line12.setStartY(385 - y);
			line12.setEndY(415 + y);
			fade(pane);
			pane.getChildren().clear();
			this.add(pane);
			unfade(pane);
		});
		levelsMenu.lwl2.lwl3.mainmenuButtonWriting.setOnMouseClicked(e -> {
			x = 0;
			y = 0;
			line13.setEndX(430 + x);
			line12.setStartY(385 - y);
			line12.setEndY(415 + y);
			fade(pane);
			pane.getChildren().clear();
			this.add(pane);
			unfade(pane);
		});

		levelsMenu.lwl2.lwl3.lwl4.mainmenuButton.setOnMouseClicked(e -> {
			x = 0;
			y = 0;
			line13.setEndX(430 + x);
			line12.setStartY(385 - y);
			line12.setEndY(415 + y);
			fade(pane);
			pane.getChildren().clear();
			this.add(pane);
			unfade(pane);
		});
		levelsMenu.lwl2.lwl3.lwl4.mainmenuButtonWriting.setOnMouseClicked(e -> {
			x = 0;
			y = 0;
			line13.setEndX(430 + x);
			line12.setStartY(385 - y);
			line12.setEndY(415 + y);
			fade(pane);
			pane.getChildren().clear();
			this.add(pane);
			unfade(pane);
		});

		levelsMenu.lwl2.lwl3.lwl4.lwl5.mainmenuButton.setOnMouseClicked(e -> {
			x = 0;
			y = 0;
			line13.setEndX(430 + x);
			line12.setStartY(385 - y);
			line12.setEndY(415 + y);
			fade(pane);
			pane.getChildren().clear();
			this.add(pane);
			unfade(pane);
		});
		levelsMenu.lwl2.lwl3.lwl4.lwl5.mainmenuButtonWriting.setOnMouseClicked(e -> {
			x = 0;
			y = 0;
			line13.setEndX(430 + x);
			line12.setStartY(385 - y);
			line12.setEndY(415 + y);
			fade(pane);
			pane.getChildren().clear();
			this.add(pane);
			unfade(pane);
		});

		levelsMenu.lwl3.mainmenuButton.setOnMouseClicked(e -> {
			x = 0;
			y = 0;
			line13.setEndX(430 + x);
			line12.setStartY(385 - y);
			line12.setEndY(415 + y);
			fade(pane);
			pane.getChildren().clear();
			this.add(pane);
			unfade(pane);
		});
		levelsMenu.lwl3.mainmenuButtonWriting.setOnMouseClicked(e -> {
			x = 0;
			y = 0;
			line13.setEndX(430 + x);
			line12.setStartY(385 - y);
			line12.setEndY(415 + y);
			fade(pane);
			pane.getChildren().clear();
			this.add(pane);
			unfade(pane);
		});

		levelsMenu.lwl3.lwl4.mainmenuButton.setOnMouseClicked(e -> {
			x = 0;
			y = 0;
			line13.setEndX(430 + x);
			line12.setStartY(385 - y);
			line12.setEndY(415 + y);
			fade(pane);
			pane.getChildren().clear();
			this.add(pane);
			unfade(pane);
		});
		levelsMenu.lwl3.lwl4.mainmenuButtonWriting.setOnMouseClicked(e -> {
			x = 0;
			y = 0;
			line13.setEndX(430 + x);
			line12.setStartY(385 - y);
			line12.setEndY(415 + y);
			fade(pane);
			pane.getChildren().clear();
			this.add(pane);
			unfade(pane);
		});

		levelsMenu.lwl3.lwl4.lwl5.mainmenuButton.setOnMouseClicked(e -> {
			x = 0;
			y = 0;
			line13.setEndX(430 + x);
			line12.setStartY(385 - y);
			line12.setEndY(415 + y);
			fade(pane);
			pane.getChildren().clear();
			this.add(pane);
			unfade(pane);
		});
		levelsMenu.lwl3.lwl4.lwl5.mainmenuButtonWriting.setOnMouseClicked(e -> {
			x = 0;
			y = 0;
			line13.setEndX(430 + x);
			line12.setStartY(385 - y);
			line12.setEndY(415 + y);
			fade(pane);
			pane.getChildren().clear();
			this.add(pane);
			unfade(pane);
		});


		levelsMenu.lwl4.mainmenuButton.setOnMouseClicked(e -> {
			x = 0;
			y = 0;
			line13.setEndX(430 + x);
			line12.setStartY(385 - y);
			line12.setEndY(415 + y);
			fade(pane);
			pane.getChildren().clear();
			this.add(pane);
			unfade(pane);
		});
		levelsMenu.lwl4.mainmenuButtonWriting.setOnMouseClicked(e -> {
			x = 0;
			y = 0;
			line13.setEndX(430 + x);
			line12.setStartY(385 - y);
			line12.setEndY(415 + y);
			fade(pane);
			pane.getChildren().clear();
			this.add(pane);
			unfade(pane);
		});

		levelsMenu.lwl4.lwl5.mainmenuButton.setOnMouseClicked(e -> {
			x = 0;
			y = 0;
			line13.setEndX(430 + x);
			line12.setStartY(385 - y);
			line12.setEndY(415 + y);
			fade(pane);
			pane.getChildren().clear();
			this.add(pane);
			unfade(pane);
		});
		levelsMenu.lwl4.lwl5.mainmenuButtonWriting.setOnMouseClicked(e -> {
			x = 0;
			y = 0;
			line13.setEndX(430 + x);
			line12.setStartY(385 - y);
			line12.setEndY(415 + y);
			fade(pane);
			pane.getChildren().clear();
			this.add(pane);
			unfade(pane);
		});

		levelsMenu.lwl5.mainmenuButton.setOnMouseClicked(e -> {
			x = 0;
			y = 0;
			line13.setEndX(430 + x);
			line12.setStartY(385 - y);
			line12.setEndY(415 + y);
			fade(pane);
			pane.getChildren().clear();
			this.add(pane);
			unfade(pane);
		});
		levelsMenu.lwl5.mainmenuButtonWriting.setOnMouseClicked(e -> {
			x = 0;
			y = 0;
			line13.setEndX(430 + x);
			line12.setStartY(385 - y);
			line12.setEndY(415 + y);
			fade(pane);
			pane.getChildren().clear();
			this.add(pane);
			unfade(pane);
		});

		levelsMenu.lwl1.levelsButton.setOnMouseClicked(e -> {
			fade(pane);
			pane.getChildren().clear();
			levelsMenu.add(pane);
			this.levelsMainBt(pane);
			unfade(pane);
		});

		levelsMenu.lwl1.levelsButtonWriting.setOnMouseClicked(e -> {
			fade(pane);
			pane.getChildren().clear();
			levelsMenu.lwl1.animation1.stop();
			levelsMenu.lwl1.animation2.stop();
			levelsMenu.add(pane);
			this.levelsMainBt(pane);
			unfade(pane);
		});

		levelsMenu.lwl1.lwl2.levelsButton.setOnMouseClicked(e -> {
			fade(pane);
			pane.getChildren().clear();
			levelsMenu.add(pane);
			this.levelsMainBt(pane);
			unfade(pane);
		});

		levelsMenu.lwl1.lwl2.levelsButtonWriting.setOnMouseClicked(e -> {
			fade(pane);
			pane.getChildren().clear();
			levelsMenu.lwl1.animation1.stop();
			levelsMenu.lwl1.animation2.stop();
			levelsMenu.add(pane);
			this.levelsMainBt(pane);
			unfade(pane);
		});

		levelsMenu.lwl1.lwl2.lwl3.levelsButton.setOnMouseClicked(e -> {
			fade(pane);
			pane.getChildren().clear();
			levelsMenu.add(pane);
			this.levelsMainBt(pane);
			unfade(pane);
		});

		levelsMenu.lwl1.lwl2.lwl3.levelsButtonWriting.setOnMouseClicked(e -> {
			fade(pane);
			pane.getChildren().clear();
			levelsMenu.lwl1.animation1.stop();
			levelsMenu.lwl1.animation2.stop();
			levelsMenu.add(pane);
			this.levelsMainBt(pane);
			unfade(pane);
		});

		levelsMenu.lwl1.lwl2.lwl3.lwl4.levelsButton.setOnMouseClicked(e -> {
			fade(pane);
			pane.getChildren().clear();
			levelsMenu.add(pane);
			this.levelsMainBt(pane);
			unfade(pane);
		});

		levelsMenu.lwl1.lwl2.lwl3.lwl4.levelsButtonWriting.setOnMouseClicked(e -> {
			fade(pane);
			pane.getChildren().clear();
			levelsMenu.lwl1.animation1.stop();
			levelsMenu.lwl1.animation2.stop();
			levelsMenu.add(pane);
			this.levelsMainBt(pane);
			unfade(pane);
		});

		levelsMenu.lwl1.lwl2.lwl3.lwl4.lwl5.levelsButton.setOnMouseClicked(e -> {
			fade(pane);
			pane.getChildren().clear();
			levelsMenu.add(pane);
			this.levelsMainBt(pane);
			unfade(pane);
		});

		levelsMenu.lwl1.lwl2.lwl3.lwl4.lwl5.levelsButtonWriting.setOnMouseClicked(e -> {
			fade(pane);
			pane.getChildren().clear();
			levelsMenu.lwl1.animation1.stop();
			levelsMenu.lwl1.animation2.stop();
			levelsMenu.add(pane);
			this.levelsMainBt(pane);
			unfade(pane);
		});

		levelsMenu.lwl2.levelsButton.setOnMouseClicked(e -> {
			fade(pane);
			pane.getChildren().clear();
			levelsMenu.lwl2.animation1.stop();
			levelsMenu.lwl2.animation2.stop();
			levelsMenu.lwl2.animation3.stop();
			levelsMenu.lwl2.animation4.stop();
			levelsMenu.add(pane);
			this.levelsMainBt(pane);
			unfade(pane);
		});

		levelsMenu.lwl2.levelsButtonWriting.setOnMouseClicked(e -> {
			fade(pane);
			pane.getChildren().clear();
			levelsMenu.lwl2.animation1.stop();
			levelsMenu.lwl2.animation2.stop();
			levelsMenu.lwl2.animation3.stop();
			levelsMenu.lwl2.animation4.stop();
			levelsMenu.add(pane);
			this.levelsMainBt(pane);
			unfade(pane);
		});

		levelsMenu.lwl2.lwl3.levelsButton.setOnMouseClicked(e -> {
			fade(pane);
			pane.getChildren().clear();
			levelsMenu.lwl2.animation1.stop();
			levelsMenu.lwl2.animation2.stop();
			levelsMenu.lwl2.animation3.stop();
			levelsMenu.lwl2.animation4.stop();
			levelsMenu.add(pane);
			this.levelsMainBt(pane);
			unfade(pane);
		});

		levelsMenu.lwl2.lwl3.levelsButtonWriting.setOnMouseClicked(e -> {
			fade(pane);
			pane.getChildren().clear();
			levelsMenu.lwl2.animation1.stop();
			levelsMenu.lwl2.animation2.stop();
			levelsMenu.lwl2.animation3.stop();
			levelsMenu.lwl2.animation4.stop();
			levelsMenu.add(pane);
			this.levelsMainBt(pane);
			unfade(pane);
		});

		levelsMenu.lwl2.lwl3.lwl4.levelsButton.setOnMouseClicked(e -> {
			fade(pane);
			pane.getChildren().clear();
			levelsMenu.lwl2.animation1.stop();
			levelsMenu.lwl2.animation2.stop();
			levelsMenu.lwl2.animation3.stop();
			levelsMenu.lwl2.animation4.stop();
			levelsMenu.add(pane);
			this.levelsMainBt(pane);
			unfade(pane);
		});

		levelsMenu.lwl2.lwl3.lwl4.levelsButtonWriting.setOnMouseClicked(e -> {
			fade(pane);
			pane.getChildren().clear();
			levelsMenu.lwl2.animation1.stop();
			levelsMenu.lwl2.animation2.stop();
			levelsMenu.lwl2.animation3.stop();
			levelsMenu.lwl2.animation4.stop();
			levelsMenu.add(pane);
			this.levelsMainBt(pane);
			unfade(pane);
		});

		levelsMenu.lwl2.lwl3.lwl4.lwl5.levelsButton.setOnMouseClicked(e -> {
			fade(pane);
			pane.getChildren().clear();
			levelsMenu.lwl2.animation1.stop();
			levelsMenu.lwl2.animation2.stop();
			levelsMenu.lwl2.animation3.stop();
			levelsMenu.lwl2.animation4.stop();
			levelsMenu.add(pane);
			this.levelsMainBt(pane);
			unfade(pane);
		});

		levelsMenu.lwl2.lwl3.lwl4.lwl5.levelsButtonWriting.setOnMouseClicked(e -> {
			fade(pane);
			pane.getChildren().clear();
			levelsMenu.lwl2.animation1.stop();
			levelsMenu.lwl2.animation2.stop();
			levelsMenu.lwl2.animation3.stop();
			levelsMenu.lwl2.animation4.stop();
			levelsMenu.add(pane);
			this.levelsMainBt(pane);
			unfade(pane);
		});

		levelsMenu.lwl3.levelsButton.setOnMouseClicked(e -> {
			fade(pane);
			pane.getChildren().clear();
			levelsMenu.add(pane);
			this.levelsMainBt(pane);
			unfade(pane);
		});

		levelsMenu.lwl3.levelsButtonWriting.setOnMouseClicked(e -> {
			fade(pane);
			pane.getChildren().clear();
			levelsMenu.add(pane);
			this.levelsMainBt(pane);
			unfade(pane);
		});

		levelsMenu.lwl3.lwl4.levelsButton.setOnMouseClicked(e -> {
			fade(pane);
			pane.getChildren().clear();
			levelsMenu.add(pane);
			this.levelsMainBt(pane);
			unfade(pane);
		});

		levelsMenu.lwl3.lwl4.levelsButtonWriting.setOnMouseClicked(e -> {
			fade(pane);
			pane.getChildren().clear();
			levelsMenu.add(pane);
			this.levelsMainBt(pane);
			unfade(pane);
		});

		levelsMenu.lwl3.lwl4.lwl5.levelsButton.setOnMouseClicked(e -> {
			fade(pane);
			pane.getChildren().clear();
			levelsMenu.add(pane);
			this.levelsMainBt(pane);
			unfade(pane);
		});

		levelsMenu.lwl3.lwl4.lwl5.levelsButtonWriting.setOnMouseClicked(e -> {
			fade(pane);
			pane.getChildren().clear();
			levelsMenu.add(pane);
			this.levelsMainBt(pane);
			unfade(pane);
		});

		levelsMenu.lwl4.levelsButton.setOnMouseClicked(e -> {
			fade(pane);
			pane.getChildren().clear();
			levelsMenu.add(pane);
			this.levelsMainBt(pane);
			unfade(pane);
		});

		levelsMenu.lwl4.levelsButtonWriting.setOnMouseClicked(e -> {
			fade(pane);
			pane.getChildren().clear();
			levelsMenu.add(pane);
			this.levelsMainBt(pane);
			unfade(pane);
		});

		levelsMenu.lwl4.lwl5.levelsButton.setOnMouseClicked(e -> {
			fade(pane);
			pane.getChildren().clear();
			levelsMenu.add(pane);
			this.levelsMainBt(pane);
			unfade(pane);
		});

		levelsMenu.lwl4.lwl5.levelsButtonWriting.setOnMouseClicked(e -> {
			fade(pane);
			pane.getChildren().clear();
			levelsMenu.add(pane);
			this.levelsMainBt(pane);
			unfade(pane);
		});

		levelsMenu.lwl5.levelsButton.setOnMouseClicked(e -> {
			fade(pane);
			pane.getChildren().clear();
			levelsMenu.add(pane);
			this.levelsMainBt(pane);
			unfade(pane);
		});

		levelsMenu.lwl5.levelsButtonWriting.setOnMouseClicked(e -> {
			fade(pane);
			pane.getChildren().clear();
			levelsMenu.add(pane);
			this.levelsMainBt(pane);
			unfade(pane);
		});

	}

	public void levelsMainBt(Pane pane) {// We create our mouse clickes button
											// setter for levels menu
		levelsMenu.mainmenuButton.setOnMouseClicked(e -> {
			x = 0;
			y = 0;
			line13.setEndX(430 + x);
			line12.setStartY(385 - y);
			line12.setEndY(415 + y);
			pane.getChildren().clear();
			this.add(pane);
		});
		levelsMenu.mainmenuButtonWriting.setOnMouseClicked(e -> {
			x = 0;
			y = 0;
			line13.setEndX(430 + x);
			line12.setStartY(385 - y);
			line12.setEndY(415 + y);
			pane.getChildren().clear();
			this.add(pane);
		});
	}

	private void updater() {// We create updater for our animation
		x += 3;
		y += 0.1;
	}

	private void fade(Pane pane) {
		FadeTransition fadeTransition1 = new FadeTransition(Duration.millis(900), pane);
		fadeTransition1.setFromValue(1.0);
		fadeTransition1.setToValue(0.0);
		fadeTransition1.play();
	}

	private void unfade(Pane pane) {
		FadeTransition fadeTransition1 = new FadeTransition(Duration.millis(900), pane);
		fadeTransition1.setFromValue(0.0);
		fadeTransition1.setToValue(1.0);
		fadeTransition1.play();
	}
}
