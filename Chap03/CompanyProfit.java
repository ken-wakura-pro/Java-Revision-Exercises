import java.util.Scanner;
import textio.TextIO;

public class CompanyProfit {
	/**
	 * printArray - Prints out all the elements in a 2D array of doubles
	 * @param arr : The array whose elements are to be printed
	 * @param row : Number of rows in the array, arr
	 * @param col : Number of columns in the array, col
	 */
	private static void printArray(double arr[][], int row, int col) {
		int i, j;

		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++)
				System.out.printf("%8.2f ", arr[i][j]);
			System.out.println();
		}
	}

	/**
	 * arraySum - Computes the sum of all elements in a 2D array of doubles.
	 * @param arr : The array whose elements are to be added
	 * @param row : Number of rows in the array, arr
	 * @param col : Number of columns in the array, arr
	 */
	private static double arraySum(double arr[][], int row, int col) {
		int i, j;
		double sum = 0;

		for (i = 0; i < row; i++)
			for (j = 0; j < col; j++)
				sum += arr[i][j];
		return sum;
	}

	/**
	 * sumArrayCol - Computes the sum of elements in a given 2D-array column
	 * @param arr : The array whose column is to be added
	 * @param row : Number of rows in the array, arr
	 * @param col : The index of the column whose elements are to be added
	 */
	private static double sumArrayCol(double arr[][], int row, int col) {
		double sum = 0;
		int i;

		for (i = 0; i < row; i++)
			sum += arr[i][col];
		return sum;
	}

	/**
	 * fillArray - Fill a 2D array with random values
	 * @param arr : array to be filled
	 * @param row : Number of rows in the array
	 * @param col : Number of columns in the array
	 * @param maxVal : Maximum value to be filled in the array
	 */
	private static void fillArray(double arr[][], int row, int col, double maxVal) {
		int i, j;

		for (i = 0; i < row; i++)
			for (j = 0; j < col; j++)
				arr[i][j] = Math.random() * maxVal;
	}

	/**
	 * readData - Reads numbers in a textfile and fills them in 2D array.
	 * @param arr : The array to be loaded with data loaded from the file
	 * @param row : Number of rows in the array, arr
	 * @param col : Number of columns in the array, arr
	 * @param filename: The file that contains the data to be read
	 */
	private static void readData(double arr[][], int row, int col, String filename) {
		int i, j;

		TextIO.readFile(filename);
		for(i = 0; i < row; i++)
			for (j = 0; j < col; j++)
				arr[i][j] = TextIO.getDouble();
	}

	/**
	 * main - Program entry point.
	 * @param args: Commandline arguments
	 */
	public static void main(String args[]) {

		System.out.println("Scenario 1: Using simulated values of Company Profit data");
		double profit[][] = new double[25][12];

		fillArray(profit, 25, 12, 56000.75);
		System.out.println("Profit Values Generated");
		printArray(profit, 25, 12);

		System.out.println();
		System.out.printf("Total Company profit: %9.2f%n", arraySum(profit, 25, 12));
		System.out.printf("Total Company Profit for December: %9.2f%n", sumArrayCol(profit, 25, 11));

		System.out.println();
		System.out.println("Scenario 2: Reading Company Data from a File");
		double profit1[][] = new double[25][12];

		readData(profit1, 25, 12, "CompanyProfit.txt");
		System.out.println("Profit Values Read from File");
		printArray(profit1, 25, 12);

		System.out.println();
		System.out.printf("Total Company profit: %9.2f%n", arraySum(profit1, 25, 12));
		System.out.printf("Total Company Profit for December: %9.2f%n", sumArrayCol(profit1, 25, 11));
	}
}
