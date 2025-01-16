/*
 * Exercise 3.2:
 * Which integer between 1 and 10 000 has the largest number of divisors, and
 * how many divisors does it have? Write a program to find the answer and 
 * print out the results. It is possible that several integers in this range
 * have the same, maximum number of divisors. Your program only has to print
 * out one of them. An example in Subsection 3.4.2 discussed divisors. The
 * source code for that example is CountDivisors.java
 */
package divisorcount;

/**
 *
 * @author wakura
 */
import java.util.Scanner;
public class DivisorCount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("This program will determine which integer in the range"
                + "\n1 to 10 000 has the highest number of divisors");
        System.out.print("Press enter to continue...");
        new Scanner(System.in).nextLine();
        System.out.println("\n********************************************");
        int maxDivisors = -1;           //the largest number of divisors found so far
        int maxInt = -1;                //the integer with the highest divisor count
        for(int i = 1; i<=10000; i++){
            int divisorCount = getDivisorCount(i);      //the divisors for this integer
            if( divisorCount > maxDivisors){
                maxDivisors  = divisorCount;
                maxInt = i;
            }
        }
        System.out.printf("%d has the largest number of divisors. It has %d divisors. \n", maxInt, maxDivisors);
    }
    
    /**
     * this function calculates the number of divisors for the specified integer
     * @param i The integer which you want to find out the number of divisors it has
     * @return The number of divisors for the specified integer
     */
    private static int getDivisorCount(int i){
        int count = 0;           //the count of the divisors for the integer
        for(int j = 1; j <= (int)Math.sqrt(i); j++){
            if(i % j == 0)
                count++;
        }
        return count;
    }
    
    
    
}
