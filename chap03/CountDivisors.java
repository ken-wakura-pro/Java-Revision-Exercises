import java.util.Scanner;

/**
 * This program reads a positive number from the user 
 * and computes how many divisors the number has.
 * Problem Description: Introduction to Programming Using Java,
 * Version 9, JavaFx Edition, Chapter 3, Section 3.4
 *
 * Author: Ken Wakura [https://github.com/ken-wakura-pro]
 */
public class CountDivisors {
	public static void main(String args[]) {
		// variables declaration
		Scanner stdin = new Scanner(System.in);	// for reading user input
		long n;		// number we are looking its divisor count
		int count;	// divisor count

		// Get N from user
		for(;;) {
			System.out.print("Enter a positive integer (N):	");
			n = stdin.nextLong();
			if (n > 0)
				break;
			else
				System.out.println("The number you entered is not positive. Try Again!");
		}

		// Compute divisor count
		count = getDivisorCount(n);
		
		// Print results
		System.out.printf("The number of divisors of %d is %d%n", n, count);
		stdin.close();
	}

	private static int getDivisorCount(long n) {
		int testDivisor;		// possible divisor of n
		int count = 0;			// number of divisors of n

		for (testDivisor = 1; testDivisor <= n; ++testDivisor) {
			if (n % testDivisor == 0)
				++count;
			if (count % 1000000 == 0)
				System.out.println(".");
		}
		return count;
	}
}
