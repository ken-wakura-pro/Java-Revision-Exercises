import java.util.Scanner;

/**
 * This class implements a program that plays a number guessing game with the user.
 * <p>
 * 	This program was inspired by discussion on Subroutines in Java Program in the book
 *	<a href"https://math.hws.edu/javanotes/c4/s2.html">Introduction to Programming Using Java</a>
 *	by <a href="https://math.hws.edu/eck/index.html">David J. Eck</a>
 * </p>
 
 */
public class NumberGuessingGame {

	static int gamesPlayed;
	static int gamesWon;
	/**
	 * playGame - plays a single number guessing game with the user
	 */
	private static void playGame() {
		int guessNum, guessCount, compNum;
		Scanner stdin = new Scanner(System.in);
		
		compNum = (int)(Math.random() * 100) + 1;
		gamesPlayed++;
		guessCount = 0;

		while (true) {
			System.out.print("Enter your guess: ");
			guessNum = stdin.nextInt();
			guessCount++;

			if (guessNum == compNum) {
				System.out.printf("YOU WIN!!%n The computers number was %d%n", compNum);
				gamesWon++;
				break;
			}

			if (guessCount == 6) {
				System.out.printf("You loose!%n The computer's number was %d%n", compNum);
				break;
			}

			if (guessNum  < compNum)
				System.out.println("Your guess was low. Try again");
			else if (guessNum > compNum)
				System.out.println("Your guess was high. Try again");
		}
	}

	/**
	 * main - tests the function playGame()
	 */
	public static void main(String args[]) {
		Scanner stdin = new Scanner(System.in);

		System.out.println("""
			Welcome to the Number Guessing Game.
			The computer will pic a number between
			1 and 100, and you try guessing it in 6 tries maximum.
			""");
		boolean playAgain;
		do {
			playGame();
			System.out.print("Would you like to play again? (Enter either \"true\" or \"false\"): ");
			playAgain = stdin.nextBoolean();
		} while(playAgain);
		System.out.println("OK! Thank you for trying out the number guessing game!");
		System.out.printf("""
			Number of games played: %d
			Number of games won:	%d%n
		""", gamesPlayed, gamesWon);
	}

}
