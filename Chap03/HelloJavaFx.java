import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * This program illustrates a simple JavaFx application (Hello, JavaFx!).
 * 
 * @source : The code was derived from a response provided by <a href="https://chatgpt.com"> ChatGPT (OpenAI) </a>
 * 	on Jan 23, 2025, during an interactive session about JavaFx setup and usage on Ubuntu 
 * 	terminal-based environment.
 *
 * @author <a href="https://github.com/ken-wakura-pro">Ken Wakura</a>
 */
public class HelloJavaFx extends Application {
	@Override
	public void start(Stage stage) {
		Label label = new Label("Hello, JavaFx!");
		Scene scene = new Scene(label, 300, 100);

		stage.setScene(scene);
		stage.setTitle("JavaFx Example");
		stage.show();
	}

	public static void main(String args[]) {
		launch(args);
	}
}
