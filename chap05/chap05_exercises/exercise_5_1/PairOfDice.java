/**
 * The {@code PairOfDice} class represents a pair of dice with methods to roll them,
 * retrieve their values, and display them as a string.
 * <p>
 * 	This program is a solution to exercise 5.1 in the book
 *	<a href"https://math.hws.edu/javanotes/c5/exercises.html">Introduction to Programming Using Java</a>
 *	by <a href="https://math.hws.edu/eck/index.html">David J. Eck</a>
 * </p>
 *
 * @author <a href="https://github.com/ken-wakura-pro">Ken Wakura</a>
 * @version 3.0
 */
public class PairOfDice {
	private int die1;	// value of the first die
	private int die2;	// value of the second die

	/**
	 * creates a {@code PairOfDice} object with both dice assigned random values
	 */
	public PairOfDice() {
		roll();
	}

	/**
	 * Creates a {@code PairOfDice} object with specified values for die1 and die2
	 *
	 * @param die1 The value for the first die.
	 * @param die2 The value for the second die.
	 */
	public PairOfDice(int die1, int die2) {
		this.die1 = die1;
		this.die2 = die2;
	}

	/**
	 * Rolls both dice, assigning new random values between 1 and 6.
	 */
	public void roll() {
		java.util.Random rand = new java.util.Random();
		die1 = rand.nextInt(6) + 1;
		die2 = rand.nextInt(6) + 1;
	}

	/**
	 * Returns the value of the first die.
	 *
	 * @return The value of die1.
	 */
	public int getDie1() {
		return die1;
	}
	
	/**
	 * Returns the value of the second die.
	 *
	 * @return The value of die2.
	 */
	public int getDie2() {
		return die2;
	}

	/**
	 * Returns a string representation of the {@code PairOfDice}
	 *
	 * @return A string representation of the {@code PairOfDice}
	 */
	@Override
	public String toString() {
		if (die1 == die2)
			return "double" + die1;
		else
			return die1 + " and " + die2;
	}
} 
