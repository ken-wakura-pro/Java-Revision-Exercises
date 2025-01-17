/**
 * This class computes the interest earned on $17, 000
 * at an interest rate of 0.027 for one year. The program
 * should print the interest and the value of the investment
 * on standard output.
 */
public class CalculateInterest {
	public static void main(String args[]) {
		// Declare the variables to be used
		double interest, principal, totalAmount;
		double interestRate;
		int period;

		// Assign values to the variables
		principal = 17000;
		interestRate = 0.027;
		period = 1;

		// compute interest and investment value
		interest = principal * interestRate * 1;
		totalAmount = principal + interest;

		// Display the results to standard output
		System.out.printf("Interest earned over %d years: $%1.4f\n", period, interest);
		System.out.printf("Value of investment: %1.4f\n", totalAmount);
	}
}

