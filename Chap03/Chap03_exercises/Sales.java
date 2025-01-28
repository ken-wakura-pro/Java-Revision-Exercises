import textio.TextIO;

/**
 * This class implements a program that reads company sales data
 * from a file and reports total sales and number of cities with
 * missing sales data.
 *
 * This program is a solution to exercise 3.5 in the book
 * <a href="https://math.hws.edu/javanotes/c3/exercises.html">Introduction to Programming Using Java</a>
 * by <a href="https://math.hws.edu/eck/index.html">David J. Eck</a>
 *
 * @author <a href="https://github.com/ken-wakura-pro">Ken Wakura</a>
 */
public class Sales {
	public static void main(String args[]) {
		double totalSales = 0 ;		// total sales by the company
		String saleStr;
		int missing = 0;		// Number of cities with missing sales data
			
		System.out.println("Reading sales.dat...\n");
		TextIO.readFile("sales.dat");

		try {
			TextIO.readFile("sales.dat");
		}
		catch (IllegalArgumentException e) {
			System.out.println(e);
		}

		while(TextIO.eof() == false){

			while (TextIO.getChar() != ':');
				;
			saleStr = TextIO.getln();
			System.out.print(saleStr);
			try {
				double sales = Double.parseDouble(saleStr);
				totalSales += sales;
				System.out.println("==>" + sales);
			}
			catch (NumberFormatException e) {
				missing++;
				System.out.println();
			}
		}
		System.out.printf("Total sales by the company: %1.4f%n", totalSales);
		System.out.printf("Number of cities with missing data: %d%n", missing);

	}
}
