import java.util.Scanner;

/**
 * This class implements a program to help a user count the change they
 * have expressed in dollars.
 *
 * Author: Ken Wakura
 */
public class CountChange {
	public static void main(String args[]) {
		Scanner stdin = new Scanner(System.in);
		double pennies, dimes, nickels, quarters, dollars;

		System.out.print("How many quarters do you have?	");
		quarters = stdin.nextDouble();

		System.out.print("How many dimes do you have?		");
		dimes = stdin.nextDouble();

		System.out.print("How many nickels do you have?		");
		nickels = stdin.nextDouble();

		System.out.print("How many pennies do you have?		");
		pennies = stdin.nextDouble();

		dollars = (quarters * .25) + (dimes * .10) + (nickels * .05) + (pennies * .01);
		System.out.printf("Your change is $%1.4f%n", dollars);
	}
}
