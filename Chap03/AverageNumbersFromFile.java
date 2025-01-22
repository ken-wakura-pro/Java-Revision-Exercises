import textio.TextIO;

/**
 * This program reads numbers from a file and computes their sum and average.
 * The file should contain nothing but numbers of type double; if this is not
 * the case, the output will be the sum and average of however many numbers
 * were successfully read from the file. The name of the file will be input by
 * the user. (The user can choose to end the program by typing Control-C.)
 *
 * Source: Introduction to Programming Using Java, Version 9, JavaFx Edition
 * Author: David J. Eck
 */
public class AverageNumbersFromFile {
	public static void main(String args[]) {
		while (true) {
			String fileName;	// The name of the file, to be input by the user

			System.out.print("Enter the name of the file: ");
			fileName = TextIO.getln();

			try {
				TextIO.readFile(fileName); // Try to open the file for input.
				break;	// If openning file succeeds, break out of loop
			}
			catch (IllegalArgumentException e) {
				System.out.println("Can't read from the file \"" + fileName + "\".");
				System.out.println("Please try again!\n");
			}
		}

		// at this point, TextIO is reading from the file
		double number;		// number read from the data file
		double sum;		// sum of all the numbers read so far
		int count;		// count of numbers read

		sum = count = 0;
		try {
			while (true) {
				number = TextIO.getDouble();
				count++;
				sum += number;
			}
		}
		catch (IllegalArgumentException e) {
			// this is expected to occur at the end-of-file
		}

		// we are at the end of the file
		System.out.println();
		System.out.println("Number of data values read: " + count);
		System.out.println("The sum of the data values : " + sum);

		if (count == 0)
			System.out.println("Can't compute an average of 0 values.");
		else
			System.out.println("The average of the values: " + (sum/count));
	}
}
