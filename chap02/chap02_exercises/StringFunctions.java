import textio.TextIO;

/**
 * This class implements a program to illustrate the use of String functions.
 *
 * Author: Ken Wakura
 */
public class StringFunctions {
	public static void main(String args[]) {
		String fullName, firstName, lastName;

		System.out.print("Please enter your first name and last name, separated by a space:	");
		fullName = TextIO.getln();

		firstName = fullName.substring(0, fullName.indexOf(' '));
		lastName = fullName.substring(fullName.indexOf(' '), fullName.length());

		System.out.printf("Your first name is %s, which has %d characters%n", firstName.trim(), firstName.trim().length());
		System.out.printf("Your last name is %s, which has %d characters%n", lastName.trim(), lastName.trim().length());
		System.out.printf("Your initials are %c%c%n", firstName.trim().charAt(0), lastName.trim().charAt(0));
	}
}
