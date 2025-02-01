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
public class Checkerboard extends Application {

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

		for ( count = 0; count < 500; count++){
			Color black = Color.BLACK;
			Color brown = Color.PERU;
			g.setStroke(black);

			for (int row = 0; row < 8; row++) {
				for (int col = 0; col < 8; col++){
					if (isEven(row + col))
						g.setFill(black);
					else
						g.setFill(brown);

					g.fillRect(row * 50, col * 50, 50, 50);
					g.strokeRect(row * 50, col * 50, 50, 50);
				}
			}
		}
	}

	public void start(Stage stage) {
		int width = 400;	// The width of the image.
		int height = 400;	/// The height of the image.
		Canvas canvas = new Canvas(width, height);
		drawPicture(canvas.getGraphicsContext2D(), width, height);
		BorderPane root = new BorderPane(canvas);
		root.setStyle("-fx-border-width: 4px; -fx-border-color: #444");
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Checkerboard");
		stage.show();
		stage.setResizable(false);
	}

	private static boolean isEven(int n) {
		return n % 2 == 0;
	}
	public static void main(String args[]) {
		launch(args);
	}
}
