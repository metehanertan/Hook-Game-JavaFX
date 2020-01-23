import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.util.Duration;

//Metehan Ertan 150117051 Furkan KUSE 150117041
public class Disconnector extends Circle{

	Circle circle1 = new Circle();
	Line line1 = new Line();
	int angle = 0;
	int disconnectorCheck = 0;
	public Timeline animation1;

	public Disconnector () {//We create no arg constructor.
		this(10, 10, 10);

	}

	public Disconnector(double radius, double xValue, double yValue) {//We create 3 arg constructor.

		circle1.setRadius(radius);//We set our objects
		circle1.setCenterX(xValue);
		circle1.setCenterY(yValue);
		circle1.setStrokeWidth(3);
		circle1.setFill(Color.WHITE);
		circle1.setStroke(Color.BLACK);

		line1.setStartX(xValue);
		line1.setStartY(yValue - radius);
		line1.setEndX(xValue);
		line1.setEndY(yValue + radius);
		line1.setStrokeWidth(3);
		line1.setStroke(Color.DIMGRAY);

	}

	public void add(Pane pane) {//We create add method
		pane.getChildren().addAll(circle1 , line1);
		
		circle1.setOnMouseClicked(e -> {
			
			disconnectorCheck ++;
			animation1.play();
		});
		
		animation1 = new Timeline(new KeyFrame(Duration.millis(15), e -> {
			if((angle - 85) % 90 == 0) {
				animation1.stop();
			}
		
			rotate();
			line1.setRotate(angle);
		}));
		
		animation1.setCycleCount(Timeline.INDEFINITE);
		
		line1.setOnMouseClicked(e -> {
			disconnectorCheck ++;
			animation1.play();
		});
		
	}

	public void remove(Pane pane) {
		pane.getChildren().removeAll(circle1, line1);

	}

	public void rotate() {//We create rotate method for click event
		angle += 5;
		
	}
	
}
