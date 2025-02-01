import java.util.Scanner;

/**
 * CapitalizeLine - This class implements a program that capitalizes a line
 * of input.
 *
 * <p>
 * 	This program is a solution to exercise 4.1 in the book
 *	<a href"https://math.hws.edu/javanotes/c4/exercises.html">Introduction to Programming Using Java</a>
 *	by <a href="https://math.hws.edu/eck/index.html">David J. Eck</a>
 * </p>
 *
 * @author <a href="https://github.com/ken-wakura-pro">Ken Wakura</a>
 */
public class CapitalizeLine {

	/**
	 * printCapitalized - Capitalize each word in line.
	 * Prints the line of text passed to it to the standard out
	 * with each first letter of each word in the line printed in
	 * upper case.
	 *
	 * @line The line of text whose words are to be capitalized.
	 */
	private static void printCapitalized (String line) {
		for (int i = 0; i < line.length(); i++){
			char c = line.charAt(i);

			if (Character.isLetter(c)) {
				if (i == 0) // First letter in the line
					System.out.print(Character.toUpperCase(c));
				else {
					if(Character.isLetter(line.charAt(i - 1)))
						System.out.print(Character.toLowerCase(c));
					else
						System.out.print(Character.toUpperCase(c));
				}
			}
			else
				System.out.print(c);

		}
		System.out.println();
	}

	/**
	 * main - Tests the function printCapitalized()
	 * @args Command line arguments passed to the program.
	 */
	public static void main (String args[]) {
		Scanner stdIn = new Scanner(System.in);
		String inputLine;

		System.out.println("""
				Line Capitalization Program
				***************************
				""");

		System.out.println("Enter your line of text");
		System.out.print("?");

		inputLine = stdIn.nextLine();
		printCapitalized(inputLine);
	}

}
