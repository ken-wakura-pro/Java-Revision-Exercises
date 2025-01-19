import textio.TextIO;

/**
 * ThreeN - This class implements a program that prints a '3N + 1' sequence.
 * In the 3N + 1 sequence, a user specifies the starting N, a positive integer.
 * If N is an even number, N is divided by 2.
 * If N is an odd number, multiply N by 3 and add 1.
 * The programs the entire sequence and the count of terms in the squence
 * Source: The 3N + 1 problem was adapted from 'Introduction to Programming
 *	   Using Java, Version 9, JavaFX Edition', Chapter 3, Section 3.2
 *
 * Author: Ken Wakura [https://github.com/ken-wakura-pro
 */
public class ThreeN {
	public static void main(String args[]){
		int n, startN;
		int terms;	// count of terms in this 3N + 1 problem

		System.out.print("Enter the starting N.%n(N should be positive): ");
		startN = TextIO.getlnInt();

		while(startN < 0){
			System.out.println("N must be a positive integer. Try again!");
			System.out.print("Enter the starting N.%n(N should be positive): ");
			startN = TextIO.getlnInt();
		}

		n = startN;
		terms = 1;	// count the starting N

		// print this starting n and count it
		System.out.println("\nTerms in the sequence:");
		System.out.println();
		System.out.printf("%d, ", n);

		while(n != 1) {
			n = getNextN(n);		// get next N

			if (n == 1)
				System.out.println(n);	// Last term in the sequence
			else
				System.out.printf("%d, ", n);

			++terms;			// Count this term
		}

		System.out.printf("%n3N + 1 sequence starting with %d has %d terms%n", startN, terms);
	}

	/**
	 * getNextN - Gets the next integer (N) in a 3N + 1 problem.
	 * @param n The current N (integer) in a 3N + 1 problem.
	 *
	 * @return The next N in the sequence.
	 */
	private static int getNextN(int n){
		if (isEven(n))
			return n / 2;
		else
			return 3 * n + 1;
	}
	
	/**
	 * isEven - Checks if an integer is an even number.
	 *
	 * @param n The integer being checked.
	 * @return true if n is an even number otherwise returns false
	 */
	private static boolean isEven(int n){
		return (n % 2 == 0);
	}
}

