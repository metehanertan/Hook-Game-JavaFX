import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

//Metehan Ertan 150117051 Furkan KUSE 150117041
public class Starter extends Application {

	public static void main(String[] args) { // We start our program from this class


		Application.launch(args);

	}

	@Override
	public void start(Stage primaryStage) {

		Pane pane = new Pane();

		MainMenu mainMenu = new MainMenu();
		mainMenu.add(pane);



		Scene scene = new Scene(pane, 1300, 720);
		primaryStage.setTitle("The game");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
