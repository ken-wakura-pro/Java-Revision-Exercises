 import textio.TextIO;

/**
 * This program reads a sequene of positive integers input
 * by the user, and prints out their average. The user is
 * prompted to enter one integer at a tim. The user must
 * enter a 0 tomark the end of the data. The program adds
 * both positive and negative values.
 *
 * Source: Introduction to Programming Using Java by 
 * 	   David J Eck, Chapter 3, Section 3.3.1
 * Author: David J Eck
 */
public class ComputeAverage {
	public static void main(String args[]) {
		int inputNumber;	// One of the integers input by the user.
		int sum;		// The sum of the integers.
		int count;		// The number of integers input.
		double average;		// Average of the integers

		// Initialize the summation and counting variables
		sum = 0;
		count = 0;

		// Read and process user's input.
		System.out.print("Enter your first integer: ");
		inputNumber = TextIO.getlnInt();

		while (inputNumber != 0) {
			sum += inputNumber;
			count++;
			System.out.print("Enter your next positive integer, or 0 to end: ");
			inputNumber = TextIO.getlnInt();
		}

		// Display the result
		if (count == 0)
			System.out.println("You did'nt enter any data!");
		else {
			average = ((double)sum) / count;
			System.out.println();
			System.out.println("You entered " + count + " positive integers.");
			System.out.printf("Their average is %1.3f.%n", average);
		}
	}
}
