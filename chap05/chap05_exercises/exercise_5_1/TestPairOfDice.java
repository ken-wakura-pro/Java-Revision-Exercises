/**
 * This class is used to test {@code PairOfDice} class implementation.
 * <p>
 * 	This program is a solution to exercise 5.1 in the book
 *	<a href"https://math.hws.edu/javanotes/c5/exercises.html">Introduction to Programming Using Java</a>
 *	by <a href="https://math.hws.edu/eck/index.html">David J. Eck</a>
 * </p>
 *
 * @author <a href="https://github.com/ken-wakura-pro">Ken Wakura</a>
 */
public class TestPairOfDice {
	public static void main(String args[]){
		PairOfDice dice = new PairOfDice();
		int die1, die2;
		int count = 0;

		do {
			dice.roll();
			die1 = dice.getDie1();
			die2 = dice.getDie2();
			count++;
		} while(die1 + die2 != 2);

		System.out.println("The pair of dice was rolled " + count + " times to before the total of the two dice was equal to two.");
	}
}
