/**
 * RollDice10k - This class implements a program that simulates rolling a pair of dice until
 * a given total outcome is found. The program computes the average number of rolls it takes
 * to get all the possible total outcome 10000 times. 
 *
 * <p>
 * 	This program is a solution to exercise 4.4 in the book
 *	<a href"https://math.hws.edu/javanotes/c4/exercises.html">Introduction to Programming Using Java</a>
 *	by <a href="https://math.hws.edu/eck/index.html">David J. Eck</a>
 * </p>
 *
 * @author <a href="https://github.com/ken-wakura-pro">Ken Wakura</a>
 */
public class RollDice10k {

	/**
	 * rollDicePair - Simulates rolling of a pair of dice until the 
	 * total outcome of the pair is equal to outcome_total.
	 *
	 * @outcome_total The total outcome that should be displayed on the dice pair
	 *
	 * @return The number of times the pair of dice was rolled.
	 */
	private static int rollDicePair (int outcome_total) {
		switch(outcome_total) {
			case 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 -> {
				int dice1, dice2;
				int roll_count = 0;

				do {
					dice1 = (int)(Math.random() * 6 ) + 1;
					dice2 = (int)(Math.random() * 6) + 1;
					roll_count++;

				} while ((dice1 + dice2) != outcome_total);
				return roll_count;
			}
			default -> {
				throw new IllegalArgumentException ("Invalid outcome total " + outcome_total);
			}
		}
	}

	/**
	 * rollCountAverage - Gets the average number of rolls for getting a given total 10,000 times
	 *
	 * @outcome_total The total on the pair of dice when rolled together.
	 *
	 * @returns Average number of rolls for needed to get a given total when a pair of dice is rolled simultaneously
	 */
	private static double rollCountAverage(int outcome_total) {
		int counts = 0;		// number of times it takes to get a given outcome

		for (int i = 0; i < 10000; i++)
			counts += rollDicePair(outcome_total);
	
		return (counts/10000.0);
	}

	/**
	 * main - Tests the function rollDicePair() and rollCountAverage()
	 * @args Command line arguments passed to the program.
	 */
	public static void main (String args[]) {
		System.out.println("""
				Dice Roll Total Outcome Averages
				********************************

				Total On Dice	Average Number of Rolls
				-------------	-----------------------""");
		for (int i = 2; i <= 12; i++) {
			double avg_rolls = rollCountAverage(i);
			System.out.printf("%6d\t\t\t%6.4f%n", i, avg_rolls);
		}
	}
}
