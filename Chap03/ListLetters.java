import java.util.Scanner;

/**
 * This program reports how many different letters were found
 * in a line of text entered by the user.
 * 
 * Author: Ken Wakura [https://github.com/ken-wakura-pro]
 */
public class ListLetters {
	public static void main(String args[]) {
		// declare variables
		int count;		// count of letters in the input
		String line;		// line of input from the user
		Scanner stdin;		// for reading input

		count = 0;
		stdin = new Scanner(System.in);

		// read line of input
		System.out.print("Enter your input\n?");
		line = stdin.nextLine();

		// convert input to same case (we use uppercase)
		line = line.toUpperCase();

		// Iterate through the alphabet checking if letter is in input
		System.out.println();
		for (char c = 'A'; c <= 'Z'; ++c) {
			for (int i = 0; i < line.length(); ++i){
				if (c == line.charAt(i)) {
					++count;
					System.out.print(c);
					break;	// Move on to the next character
				}
			}
		}

		// report count
		System.out.println("%n");
		if (count == 0) {
			System.out.println("No letters in the input");
		}
		else {
			System.out.printf("Input has %d different letters%n", count);
		}

	}
}
