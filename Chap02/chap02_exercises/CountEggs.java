import java.util.Scanner;

/**
 * This class implements a program that asks the user how many eggs
 * they have and tells them the number of gross and dozen they have.
 *
 * Author: Ken Wakura
 */
public class CountEggs {
	public static void main(String args[]) {
		Scanner stdin = new Scanner(System.in);
		int eggs, dozen, gross;			// count of eggs, dozens and gross respectively
		int rem;				// number of eggs remaining

		System.out.print("How many eggs do you have in total?	");
		eggs = stdin.nextInt();

		gross = eggs / 144;
		rem = eggs % 144;
		dozen = rem / 12;
		rem %= 12;
		eggs = rem;

		System.out.printf("Your number of eggs is %d gross, %d dozen, and %d%n", gross, dozen, eggs);
	}
}

