import textio.TextIO;

/**
 * This class  implements a program to read information from a file testdata.txt.
 *
 * Author: Ken Wakura
 */
public class ReadFile {
	public static void main(String args[]) {
		String name;
		int score, total = 0;
		double average;

		TextIO.readFile("testdata.txt");

		name = TextIO.getln();
		score = TextIO.getlnInt();
		total += score;
		score = TextIO.getlnInt();
		total += score;
		score = TextIO.getlnInt();
		total += score;

		average = total / 3.0;

		System.out.printf("Student Name: %s%n", name);
		System.out.printf("Average Score: %1.2f%n", average);
	}
}
		
