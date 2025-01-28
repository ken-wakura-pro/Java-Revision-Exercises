/**
 * This program simulates rolling of a pair of dice until snake eyes
 * (both dice show 1) is revealed.
 */
public class SnakeEyes {
	public static void main(String args[]) {
		int dice1, dice2;
		int count;

		count = 0;
		while(true) {
			dice1 = (int)(Math.random() * 6) + 1;
			dice2 = (int)(Math.random() * 6) + 1;
			count++;

			if ((dice1 + dice2) == 2)
				break;
		}

		System.out.printf("To get snake eyes, the pair of dice were rolled %d times.%n", count);
	}
}
