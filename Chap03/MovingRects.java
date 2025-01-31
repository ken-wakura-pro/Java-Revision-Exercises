import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.layout.BorderPane;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * When run as a program, this class opens a window on the screen that
 * shows a set of nested rectangles that seems to be moving infinitely
 * inwards towards the center. The animation continues until the user
 * closes the window.
 *
 * @author <a href="https://math.hws.edu/eck/index.html">David J. Eck</a>
 */
public class MovingRects extends Application {
	/**
	 * drawFrame - Draws a set of nested rectangles. This subroutine is called 60 times per
	 * second and is responsible for redrawing the entire drawing area. The
	 * parameter g is used for drawing. The frameNumber starts at zero and
	 * and increases by 1 each time this subroutine is called. The parameters width and height give the size of the drawing areas, in pixels.
	 * The sizes and positions of the rectangles that are drawn depend on
	 * the frame number, giving the illusion of motion.
	 */
	public void drawFrame(GraphicsContext g, int frameNumber, double elabpsedSeconds, int width, int height) {
		g.setFill(Color.WHITE);
		g.setStroke(Color.BLACK);
		g.fillRect(0, 0, width, height);

		double inset;	// Gap between edges of drawing area and the outer rectangle.

		double rectWidth, rectHeight;	// The size of one of the rectangles.

		inset = frameNumber % 15 + 0.5;	// The "+ 0.5" is a technicality to produce a sharper image.

		rectWidth = width - 2 * inset;
		rectHeight = height - 2 * inset;

		while (rectWidth >= 0 && rectHeight >= 0) {
			g.strokeRect(inset, inset, rectWidth, rectHeight);
			inset += 15;	// rectangles are 15 pixels apart.
			rectWidth -= 30;
			rectHeight -= 30;
		}
	}

	public void start(Stage stage) {
		int width = 800;
		int height = 600;
		Canvas canvas = new Canvas(width, height);
		drawFrame(canvas.getGraphicsContext2D(), 0, 0, width, height);
		BorderPane root = new BorderPane(canvas);
		root.setStyle("-fx-border-width: 4px; -fx-border-color: #444");
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Infinite Moving Rects");
		stage.show();
		stage.setResizable(false);

		AnimationTimer anim = new AnimationTimer() {
			private int frameNum;
			private long startTime = -1;
			private long previousTime;

			public void handle(long now) {
				if (startTime < 0) {
					startTime = previousTime = now;
					drawFrame(canvas.getGraphicsContext2D(), 0, 0, width, height);
				}
				else if (now - previousTime > 0.95e9/60) {
					/*
					 * The test in the else-if is to make sure that drawFrame() is
					 * is called about once every 1/60 second. It is required since
					 * handle() can be called by the system more often than that.
					 */
					frameNum++;
					drawFrame(canvas.getGraphicsContext2D(), frameNum, (now - startTime)/1e9, width, height);
					previousTime = now;
				}
			}
		};
		anim.start();
	}

	public static void main(String args[]) {
		launch();
	}
}
