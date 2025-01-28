import java.util.Scanner;

/**
 * This program reads numbers entered by the user and prints out the list in reverse order.
 * End of input is marked by a number less than or equal to zero. 
 * No more than 100 numbers to be read/input.
 *
 * Author: Ken Wakura [https://github.com/ken-wakura-pro]
 */
public class ReadNumbers {
	public static void main(String args[]) {
		int nums[] = new int[100];	// stores numbers read from user input
		int count = 0; 			// number of valid elements in nums
		int n;				// input from the user

		// read user input
		do {
			n = getN();				if (n <= 0)
				break;		// end do..while loop
			nums[count++] = n;
		} while (count <= 100);

		// print array
		if (count == 0)
			System.out.println("No numbers read from the input.");
		else
			System.out.println("\nHere are the numbers entered in reverse");
			printArray(nums, count);
	}

	/**
	 * printArray - Prints elements of a 1D array in reverse
	 * @param nums :The array whose elements are to be printed
	 * @param n : The number of valid elements in nums
	 */
	private static void printArray(int nums[], int count) {
		int i;
		for (i = count -1; i >= 0; i--)
		System.out.printf("%d ", nums[i]);
		System.out.println();	
	}

	/**
	 * getN - reads an integer from the standard input
	 * @return An integer read from the standard input
	 */
	private static int getN() {
		int n;
		Scanner stdin = new Scanner(System.in);
		System.out.println("""
			Enter an integer N, greater than zero.
			To exit, enter N less than or equal to zero
		""");
		System.out.print("? ");
		n = stdin.nextInt();
		return n;
	}
}

