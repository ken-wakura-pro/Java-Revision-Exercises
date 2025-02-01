import textio.TextIO;

/**
 * This class implements a simple program that will compute the amount of
 * interest that is earned on an interest over a period of 5 years.
 * The initial amount of the investment and the interest rate are input 
 * by the user. The value of the investment at the end of each year is outputi.
 *
 * Original Author: David J. Eck
 * Source: Introduction to Programming Using Java, Version 9, JavaFx Edition
 *	   Chapter 3, Section 3.1
 * Adapted by:	    Ken Wakura [https://github.com/ken-wakura-pro]
 *
 * Notes: Original code is taken from the textbook "Introduction to Programming
 *  Using Java, Version 9, JavaFx Edition"
 * Modification: Reduced the number of "System.out.println()" for more concise code
 */
public class Interest3 {
	public static void main(String args[]) {
		double principal;	// The value of the investment.
		double rate;		// The annual interest rate.

		// Get the inital investment and interest rate from the user
		System.out.print("Enter the initial investment: ");
		principal = TextIO.getlnDouble();

		System.out.printf("%nEnter the annual interest rate.%n"
			+ "Enter a decimal, not a percentage: ");
		rate = TextIO.getlnDouble();
		System.out.println();

		// Simulate the investment for 5 years.
		int years = 0;		// for counting the number of years that have passed.
		double interest;	// Tracking yearly interest

		while (years < 5) {
			interest = principal * rate;	// Interest for this year
			principal += interest;		// Add this years interest to the principal
			++years;			// Count the current year.

			System.out.printf("The value of the investment after %d years is $%1.2f%n", years, principal);
		}	// end of while loop
	} // end of main()
} // end of class Interest3
