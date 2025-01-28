import java.util.Scanner;

/**
 * This class implements a program that reads a single line of input from the user
 * and breaks down the input into words. This program is a solution to exercise
 * 3.4 in the book <a href="https://math.hws.edu/javanotes/c3/exercises.html">
 * Introduction to Programming Using Java</a>
 * by <a href="https://math.hws.edu/eck/index.html">David J. Eck</a>
 *
 * @author <a href="https://github.com/ken-wakura-pro">Ken Wakura</a>
 */
public class Words {
	public static void main(String args[]) {
		String line;
		Scanner stdin = new Scanner(System.in);

		System.out.println("Enter your line of text.");
		System.out.print("?");

		line = stdin.nextLine().trim();

		System.out.println("Your input contains the words:");
		for (int i = 0; i < line.length(); i++) {
			char c, prev_c, next_c;

			c = line.charAt(i);
			if (Character.isLetterOrDigit(c))
				System.out.print(c);
			else if(c == ' ') {
				if (i - 1 >= 0) {
					prev_c = line.charAt(i - 1);
					if (prev_c == ' ')
						continue;
					else
						System.out.println();
				}
			}
			else {
				if ((i - 1) >= 0 && (i + 1) < line.length()) {
					prev_c = line.charAt(i - 1);
					next_c = line.charAt(i + 1);
					if(Character.isLetterOrDigit(prev_c) && Character.isLetterOrDigit(next_c))
						System.out.print(c);
				}
				else
					System.out.println();
			}
		}
		if(Character.isLetterOrDigit(line.charAt(line.length() - 1)))
			System.out.println();
	}
}
