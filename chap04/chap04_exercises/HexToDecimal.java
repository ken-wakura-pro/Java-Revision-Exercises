import java.util.Scanner;

/**
 * HexToDecimal - This class implements a program that converts
 * hexadecimal integers to decimal format
 *
 * <p>
 * 	This program is a solution to exercise 4.2 in the book
 *	<a href"https://math.hws.edu/javanotes/c4/exercises.html">Introduction to Programming Using Java</a>
 *	by <a href="https://math.hws.edu/eck/index.html">David J. Eck</a>
 * </p>
 *
 * @author <a href="https://github.com/ken-wakura-pro">Ken Wakura</a>
 */
public class HexToDecimal {

	/**
	 * hexValue - Computes the decimal value (base 10) of a hexadecimal digit
	 * @ch The hexadecimal digit whose value you are computing
 	 *
	 * @returns The decimal value of the hexadecimal digit ch if ch is
	 * a valid hexadecimal digit, otherwise it returns -1.
	 */
	private static int hexValue (char ch) {
		switch (ch) {
			case '0' -> { return 0; }
			case '1' -> { return 1; }
			case '2' -> { return 2; }
			case '3' -> { return 3; }
			case '4' -> { return 4; }
			case '5' -> { return 5; }
			case '6' -> { return 6; }
			case '7' -> { return 7; }
			case '8' -> { return 8; }
			case '9' -> { return 9; }

			case 'A', 'a' -> { return 10; }
			case 'B', 'b' -> { return 11; }
			case 'C', 'c' -> { return 12; }
			case 'D', 'd' -> { return 13; }
			case 'E', 'e' -> { return 14; }
			case 'F', 'f' -> { return 15; }
			
			default -> { return -1; }
		}
		
	}

	/**
	 * computeValue - Computes the decimal value of a hexadecimal number
	 * represented by the String str.
	 *
	 * @str The string representing the hexadecimal value.
	 *
	 * If str represents a valid hexadecimal number, return its decimal value.
	 * Otherwise, if str is an invalid hexadecimal number, return -1.
	 */
	private static int computeValue (String str) {
		int value = 0;		// decimal value of str

		for (int i = 0; i < str.length(); i++) {
			int hexValue = hexValue(str.charAt(i));

			if (hexValue == -1)	// not a valid hexadecimal digit, entire hex string is not valid
				return -1;
			value = value * 16 + hexValue;
		}

		return value;
	}

	/**
	 * main - Tests the functions hexValue() and computeValue()
	 * @args Command line arguments passed to the program.
	 */
	public static void main (String args[]) {
		Scanner stdIn = new Scanner(System.in);
		String hex;
		int decimal_value;

		System.out.println("""
				Hexadecimal to Decimal Number Conversion Program
				********************************************************
				""");

		System.out.print("Enter the hexadecimal number: ");
		hex = stdIn.next();
	
		System.out.println();
		decimal_value = computeValue(hex);

		if (decimal_value == -1)
			System.out.printf("%s is not a valid hexadecimal number.%n", hex);
		else	
			System.out.printf("The hexadecimal number %s converted to decimal is %d.%n", hex, computeValue(hex));
	}

}
