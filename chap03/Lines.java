import javafx.application.Application;
import javafx.scene.layout.BorderPane;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.canvas.Canvas;

/**
 * This program draws 23 parallel lines on the drawing area equally spaced.
 * 
 * @source : The code was inspired by  <a href="https://math.hws.edu/javanotes/C3/s9.html">Introduction to Programming Using Java</a>
 *	by <a href="https://math.hws.edu/eck/">David J. Eck</a> 
 *
 * @author <a href="https://github.com/ken-wakura-pro">Ken Wakura</a>
 */
public class Lines extends Application {

	/**
 	 * Draws random discs on drawing area.
	 */
	public void drawPicture(GraphicsContext g) {
		int y;	// y-coordinate for the line
		int i;	// loop control variable
		
		y = 50;
		g.setStroke(Color.BLUE);
		for (i = 1; i <= 25; i++) {
			g.strokeLine(50, y, 750, y);
			y += 20;
		}
	}

	public void start(Stage stage) {
		int width = 800;	// The width of the image.
		int height = 600;	/// The height of the image.
		Canvas canvas = new Canvas(width, height);
		drawPicture(canvas.getGraphicsContext2D());
		BorderPane root = new BorderPane(canvas);
		root.setStyle("-fx-border-width: 4px; -fx-border-color: #444");
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Random Discs");
		stage.show();
		stage.setResizable(false);
	}

	public static void main(String args[]) {
		launch(args);
	}
}
