/**
 * This class implements a program that simulates the rolling of a piece of dice.
 *
 * Author: Ken Wakura
 */
public class DiceRoll {
	public static void main(String args[]){
		System.out.printf("Number on Dice: %d\n", (int)(6 * Math.random() + 1));
	}
}
