import textio.TextIO;

/**
 * This class implements a program that evaluates simple arithmetic expressions.
 * This program is a solution to exercise 3.3 in the book
 * <a href="https://math.hws.edu/javanotes/c3/exercises.html">Introduction to Programming Using Java</a>
 * by <a href="https://math.hws.edu/eck/index.html">David J. Eck</a>
 *
 * @author <a href="https://github.com/ken-wakura-pro">Ken Wakura</a>
 */
public class SimpleCalculator {
	/**
	 * evaluate - computes the expression of teh format (op1 operator op2)
	 * @param op1 The first operand in the expression
	 * @param op2 The second operand in the expression
	 * @param operator The operator in the expression
	 * 
	 * @return The result of evaluating the expression (op1 operator op2)
	 */
	private static double evaluate(double op1, double op2, char operator) {
		switch (operator) {
			case '+' -> {
				 return (op1 + op2);
			}
			case '-' -> {
				return (op1 - op2);
			}
			case '*' -> {
				return (op1 * op2);
			}
			case '/' -> {
				return (op1 / op2);
			}
			default -> {
				return Double.NaN;
			}
		}
	}

	/**
	 * main - the program entry point. It evaluates simple arithmetic expressions
	 * @param args Command line arguments
	 */
	public static void main(String args[]) {
		double op1, op2, answer;
		char operator;

		while (true) {
			System.out.println("Enter expression to evaluate, (Enter first operand as 0 to exit).");
			//System.out.print("?");

			op1 = TextIO.getDouble();

			if (op1 == 0) {
				System.out.println("OK. Bye for now!");
				break;
			}

			operator = TextIO.getChar();
			op2 = TextIO.getDouble();

			answer = evaluate(op1, op2, operator);
			if (Double.isNaN(answer))
				System.out.printf("You entered an invalid expression that could not be evaluated%n.");
			else
				System.out.printf("%f %c %f = %f%n", op1, operator, op2, answer);

			System.out.println("==================================================================================");
		}
	}
}
