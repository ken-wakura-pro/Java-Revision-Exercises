import java.util.Scanner;

/**
 * This class implements a program that gets input from the user
 * using Scanner class from the standard package java.util.
 *
 * Author: David J. Eck
 */
public class Interest2WithScanner {
	public static void main(String args[]) {
		Scanner stdin = new Scanner (System.in);	// Create the Scanner

		double principal;		// The value of the investment.
		double rate;			// The annual interest rate.
		double interest;		// The interest earned during the year

		System.out.print("Enter the initial investment: ");
		principal = stdin.nextDouble();

		System.out.print("Enter the annual interest rate (as a decimal): ");
		rate = stdin.nextDouble();

		interest = principal * rate;		// Compute this year's interest.
		principal = principal + interest;	// Add it to principal.

		System.out.printf("The amount of interest is $%1.2f%n", interest);
		System.out.printf("The value after one year is $%1.2f%n", principal);
	}
}
