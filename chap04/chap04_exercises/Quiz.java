import java.util.Scanner;

/**
 * Quiz - This class implements a program a simple addition quiz to the user.
 *
 * <p>
 * 	This program is a solution to exercise 4.8 in the book
 *	<a href"https://math.hws.edu/javanotes/c4/exercises.html">Introduction to Programming Using Java</a>
 *	by <a href="https://math.hws.edu/eck/index.html">David J. Eck</a>
 * </p>
 *
 * @author <a href="https://github.com/ken-wakura-pro">Ken Wakura</a>
 */
public class Quiz {
	static int operand1[];
	static int operand2[];
	static int answers[];

	/**
	 * create_quiz - generates the operands to be used to build simple addition problems
	 */
	private static void create_quiz() {
		operand1 = new int[10];
		operand2 = new int[10];
		answers = new int[10];

		for (int i = 0; i < 10; i++) {
			operand1[i] = (int)(Math.random() * 1000);
			operand2[i] = (int)(Math.random() * 1000);		
		}
	}

	/**
	 * administer_quiz - let's the user attempt a simple addition quiz
	 */
	private static void administer_quiz() {
		Scanner stdin = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.printf("%d. %d + %d = ", i + 1, operand1[i], operand2[i]);
			answers[i] = stdin.nextInt();
			System.out.println();
		}
	}

	/**
	 * grade_quiz - checks if the user responses wer correct.
	 */
	private static void grade_quiz() {
		int score = 0;

		System.out.println("***** Grading Test *****\n");
		for (int i = 0; i < 10; i++) {
			System.out.printf("%d. %d + %d = %d%n", i + 1, operand1[i], operand2[i], (operand1[i] + operand2[i]));

			if ((operand1[i] + operand2[i]) == answers[i]) {
				System.out.println("You got it correct!");
				score += 10;
			}
			else {
				System.out.printf("You got it wrong.%nYour answer was: %d%n", answers[i]);
			}

		}
		System.out.printf("Your total score: %d%n", score);
	}

	/**
	 * main - tests the functions create_quiz(), administer_quiz(), and grade_quiz()
	 */
	public static void main(String args[]) {
		System.out.println("""
				       Simple Math Quiz.
				---------------------------
				    Attempt all questions.
				---------------------------
				""");

		create_quiz();
		administer_quiz();
		grade_quiz();
	}


}
