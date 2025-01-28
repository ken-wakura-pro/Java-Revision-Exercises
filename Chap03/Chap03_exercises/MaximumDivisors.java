/**
 * This class implements a program that computes the number with the highest count of divisors
 * for numbers in the range 1 to 10000. Only one of such numbers is computed.
 * This program is a solution to exercise 3.6 in the book
 * <a href="https://math.hws.edu/javanotes/c3/exercises.html">Introduction to Programming Using Java</a>
 * by <a href="https://math.hws.edu/eck/index.html">David J. Eck</a>
 *
 * @author <a href="https://github.com/ken-wakura-pro">Ken Wakura</a>
 */
public class MaximumDivisors {
	public static void main(String args[]) {
		int divisors[];	// store number of divisors for each integer between 0 and 10001
		int i;		// loop control variable
		int max;	// number of maximum divisors
		int maxN;	// number with maximum divisors

		divisors = new int[10001];
		for(i = 1; i < 10001; i++){
			divisors[i] = getDivisors(i);
		}

		max = maxDivisors(divisors);
		maxN = -1;

		for (i =1; i < 10001; i++){
			if (divisors[i] == max){
				maxN = i;	
				break;
			}
		}	

		System.out.printf(
			"""
			%d is one of the integers between 1 and 10000 with the
			most divisors. It has %d divisors
			""", maxN, max);

	}

	/**
	 * getDivisors - Calculates the number of divisors of a given integer
	 * @param num The integer whose divisors are being computed
	 * @return The number of divisors of integer num
	 */
	private static int getDivisors(int num) {
		int divisorCount;
		int i;

		divisorCount = 0;
		for (i = 1; i <= num; i++)
			if (num % i == 0)
				divisorCount++;
		return divisorCount;
	}

	/**
	 * maxDivisors - Computes index of one of the elements with the highest value in the array
	 * @param arr The array being checked
	 * @return Index of one of the elements with the highest value
	 */
	private static int maxDivisors(int arr[]) {
		int max;
		int i;

		max = 0;
		for (i = 1; i < arr.length; i++)
			if (arr[i] > max)
				max = arr[i];
		return max;
	}
}
