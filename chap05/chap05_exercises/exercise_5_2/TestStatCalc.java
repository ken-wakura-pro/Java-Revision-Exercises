/**
 * This class implements a program to test the StatCalc class.
 * This program is a solution to <a href="https://math.hws.edu/javanotes/c5/exercises.html">Exercise 5.2</a> 
 * in the textbook <a href="https://math.hws.edu/javanotes/index.html">Introduction to Programming Using Java</a>
 * by <a href="https://math.hws.edu/eck/">David J. Eck</a>
 * @author <a href="https://github.com/ken-wakura-pro">Ken Wakura</a>
 */
public class TestStatCalc {
    public static void main(String args[]) {
        java.util.Scanner stdin = new java.util.Scanner(System.in);
        StatCalc calc = new StatCalc();
        double num;
        
        System.out.println("***Stats Calculator***\n");

        while(true) {
            System.out.print("Enter number (Enter 0 to stop)? ");
            num = stdin.nextDouble();
            
            if (num == 0)
                break;

            calc.enter(num);
        }

        System.out.println();
        System.out.println("***STATISTICS***");
        if (calc.getCount() == 0)
            System.out.println("No numbers entered.");
        else {
            System.out.println("Count: " + calc.getCount());
            System.out.println("Sum: " + calc.getSum());
            System.out.println("Average: " + calc.getMean());
            System.out.println("Standard Deviation: " + calc.getStandardDeviation());
            System.out.println("Maximum number: " + calc.getMax());
            System.out.println("Minimum number: " + calc.getMin());
        }
    }

}
