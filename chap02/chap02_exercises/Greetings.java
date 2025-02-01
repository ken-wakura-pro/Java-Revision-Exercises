import java.util.Scanner;

/**
 * This class implements a program that asks a user their name and greats them.
 *
 * Author: Ken Wakura
 */
public class Greetings {
	public static void main(String args[]) {
		Scanner stdin = new Scanner(System.in);
		String name;

		System.out.print("What is your name?		");
		name = stdin.next();

		System.out.printf("Hello, %s, nice to meet you!\n", name.toUpperCase());
	}
}
