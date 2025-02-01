import java.util.Scanner;

/**
 * This program will convert measurements expressed in inches,
 * feet, yards, or miles into each of the possible units of
 * measure. The user selects input of measure from the list of
 * menu option and enters the measurement.
 * The program will continue to read and convert measurements
 * until the user enters an input of 0.
 *
 * Source: "Introduction to Programming Using Java, Version 9, JavaFx Edition"
 * Author: David J. Eck
 *
 * Adapted by: Ken Wakura [https://github.com/ken-wakura-pro
 * Modification: Used java.util.Scanner for getting the user input instead
 * 	the non-standard textio.TextIO written by David J. Eck
 *	Added menus for user to select unit measure.
 */
public class LengthConverterMenuDriven {
	public static void main(String args[]){
		double measurement;			// Numerical measurement, input by the user.
		double inches, feet, yards, miles;	// Measurements expressed in
							// each possible unit of measure.
		int optionNumber;			// Option number from menu, selected by user;
		Scanner stdin = new Scanner(System.in);	// for gettin user input

								
		WHILE: while(true) {
			/*
			 * Definate assignment
			 * Although I can tell that inches, feet, yards, and miles will always have a value
			 * assigned in all valid cases, the compiler cannot do so, so I have to initialize
			 * their values or else the compiler will flag them as errors.
			 */
			inches = feet = yards = miles = 0;

			System.out.print("""
				What unit of measurement does your input use?
					1. inches
					2. feet
					3. yards
					4. miles
					0. Exit
				Enter the number of your choice:
			""");
			optionNumber = stdin.nextInt();

			// Read use'rs measurement and convert to inches
			switch (optionNumber) {
				case 1 -> {
					System.out.println("Enter the number of inches: ");
					measurement = stdin.nextDouble();
					inches = measurement;
				}
				case 2 -> {
					System.out.println("Enter the number of feet: ");
					measurement = stdin.nextDouble();
					inches = measurement * 12;
				}
				case 3 -> {
					System.out.println("Enter the number of yards: ");
					measurement = stdin.nextDouble();
					inches = measurement * 36;
				}
				case 4 -> {
					System.out.println("Enter the number of miles: ");
					measurement = stdin.nextDouble();
					inches = measurement * 12 * 5280;
				}
				case 0 -> {
					break WHILE;	// break out of the while loop
				}
				default -> {
					System.out.println("Error! Illegal option number! I quit!");
					System.exit(1);
				}
			}

			// convert the measurement in inches to the other units of measure
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
				%n""", inches, feet, yards, miles
			);
		}	// end while

		System.out.println();
		System.out.println("OK! Bye for now.");
	} // end main()
} // end class LengthConverterMenuDriven
