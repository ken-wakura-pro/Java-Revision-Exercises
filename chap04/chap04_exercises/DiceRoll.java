/**
 * DiceRoll - This class implements a program that simulates rolling a pair of dice until the
 * total outcome of the 2 dice is snake eyes (2). 
 *
 * <p>
 * 	This program is a solution to exercise 4.3 in the book
 *	<a href"https://math.hws.edu/javanotes/c4/exercises.html">Introduction to Programming Using Java</a>
 *	by <a href="https://math.hws.edu/eck/index.html">David J. Eck</a>
 * </p>
 *
 * @author <a href="https://github.com/ken-wakura-pro">Ken Wakura</a>
 */
public class DiceRoll {

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
	 * main - Tests the function rollDicePair()
	 * @args Command line arguments passed to the program.
	 */
	public static void main (String args[]) {
		System.out.println("""
				Dice Roll -> Snake Eyes
				***************************
				""");

		try {
			System.out.println("Rolling the Pair of Dice...");
			int roll_count = rollDicePair(2);
			System.out.printf("Attempts done to get snake eyes: %d.", roll_count);
		}
		catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		System.out.println();
	}
}
