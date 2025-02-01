import java.util.Scanner;

/**
 * This program will convert measurements expressed in inches,
 * feet, yards, or miles into each of the possible units of
 * measure. The measurement is input by the user, followed by
 * the unit of measure. For example: "17 feet", "1 inch", or 
 * "2.73 mi". Abbreviations in, ft, yd, and mi are accepted.
 * The program will continue to read and convert measurements
 * until the user enters an input of 0.
 *
 * Source: "Introduction to Programming Using Java, Version 9, JavaFx Edition"
 * Author: David J. Eck
 *
 * Adapted by: Ken Wakura [https://github.com/ken-wakura-pro
 * Modification: Used java.util.Scanner for getting the user input instead
 * 	the non-standard textio.TextIO written by David J. Eck
 */
public class LengthConverter {
	public static void main(String args[]){
		double measurement;		// Numerical measurement, input by the user.
		String units;			// The unit of measure for the input, also specified by the user.
		double inches, feet, yards, miles;	// Measurements expressed in
							// each possible unit of measure.
		Scanner stdin = new Scanner(System.in);	// for gettin user input

		System.out.println("""
			Enter measurements in inches, feet, yards, or miles.
			For example: 1 inch 17 feet 2.73 miles
			You can use abbreviations: in ft yd mi
			I will convert your input into the other units of measure.
		""");

		while(true) {
			// Get the user's input, and convert units to lower case.
			System.out.print("Enter your measurement, or 0 to end: ");
			measurement = stdin.nextDouble();
			if (measurement == 0)
				break;		// Terminate the while loop
			units = stdin.next();
			units = units.toLowerCase().trim();	// Convert units to lower case

			// convert input measurement to inches
			if (units.equals("inch") || units.equals("inches") || units.equals("in")) 
			inches = measurement;
			else if (units.equals("foot") || units.equals("feet") || units.equals("ft"))
				inches = measurement * 12;
			else if (units.equals("yard") || units.equals("yards") || units.equals("yd"))
				inches = measurement  * 36;
			else if (units.equals("mile") || units.equals("miles") || units.equals("mi"))
				inches = measurement * 12 * 5280;
			else {
				System.out.println("Sorry, but I don't understand \"" + units + "\".");
				continue;	// back to start of while loop
			}

			// convert measurement in inches to feet, yards, and miles
			feet = inches / 12;
			yards = inches / 36;
			miles = inches / (12 * 5280);

			// output measurement in terms of each unit of measure.
			System.out.printf("""
				That's equivalent to:
				%14.5g inches
				%14.5g feet
				%14.5g yards
				%14.5g miles
				""", inches, feet, yards, miles
			);
		}	// end while

		System.out.println();
		System.out.println("OK! Bye for now.");
	}
}
