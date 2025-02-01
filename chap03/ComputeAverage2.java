import java.util.Scanner;

/**
 * This program computes the average of values entered by the user
 * on the terminal. End of input in marked by a blank line.
 *
 * Source: "Introduction to Programming Using Java, Version 9, JavaFx Edition
 * 	Chapter 3, Section 3.7 - Introduction to Exceptions and try..catch
 * Author: David J. Eck
 *
 * Adapted by: Ken Wakura [https://github.com/ken-wakura-pro]
 * Modification: Reads input using the standard java.util.Scanner instead of
 *	David's textio.TextIO
 */
public class ComputeAverage2 {
	public static void main(String args[]) {
		String str;		// the user's input.
		double number;		// str converted into number
		double total;		// total of all numbers entered
		double avg;		// average of the numbers
		int count;		// The number of numbers entered.
		Scanner stdin = new Scanner(System.in);	// for getting user input

		total = count = 0;
		System.out.println("Enter your numbers, press return to end.");

		while(true) {
			System.out.print("? ");
			str = stdin.nextLine();

			if (str.equals(""))
				break;	// exit the loop, since input line was blank

			try {
				number = Double.parseDouble(str);
				total += number;
				count++;
			}
			catch (NumberFormatException e) {
				System.out.println("Not a valid number! Try again!");
			}
		}

		stdin.close();
		avg = total/count;
		System.out.printf("The average of %d numbers is %1.6g%n", count, avg);

	}
}

