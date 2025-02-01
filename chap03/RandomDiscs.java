import javafx.application.Application;
import javafx.scene.layout.BorderPane;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.canvas.Canvas;

/**
 * This program draws random discs colored differently on the canvas.
 * 
 * @source : The code was derived from  <a href="https://math.hws.edu/javanotes/source/chapter3/SimpleGraphicsStarter.java">Introduction to Programming Using Java</a>
 *	by <a href="https://math.hws.edu/eck/">David J. Eck</a> 
 *
 * @author <a href="https://github.com/ken-wakura-pro">Ken Wakura</a>
 */
public class RandomDiscs extends Application {

	/**
 	 * Draws random discs on drawing area.
	 */
	public void drawPicture(GraphicsContext g, int width, int height) {
		g.setFill(Color.WHITE);
		g.fillRect(0, 0, width, height); // First, fill the entire image with a background color.

		int centerX;		// the x-coord of the center of a disk.
		int centerY;		// the y-coord of the center of a disk.
		int colorChoice;	// Used to select a random color.
		int count;		// loop control variable for counting disks.

		for ( count = 0; count < 500; count++) {
			centerX = (int)(width * Math.random());
			centerY = (int)(height * Math.random());

			colorChoice = (int)(4 * Math.random());
			switch (colorChoice) {
				case 0 -> g.setFill(Color.RED);
				case 1 -> g.setFill(Color.GREEN);
				case 2 -> g.setFill(Color.BLUE);
				case 3 -> g.setFill(Color.YELLOW);
			}

			g.fillOval(centerX - 50, centerY - 50, 100, 100);
			g.setStroke(Color.BLACK);
			g.strokeOval(centerX - 50, centerY - 50, 100, 100);
		}
	}

	public void start(Stage stage) {
		int width = 800;	// The width of the image.
		int height = 600;	/// The height of the image.
		Canvas canvas = new Canvas(width, height);
		drawPicture(canvas.getGraphicsContext2D(), width, height);
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
