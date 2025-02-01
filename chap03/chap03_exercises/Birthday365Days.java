/**
 * This class implements a program that simulates checking how people it takes to find birthdays on all 365 days of a year. 
 * <p>
 * 	This program is a solution to exercise 3.7 in the book
 *	<a href"https://math.hws.edu/javanotes/c3/exercises.html">Introduction to Programming Using Java</a>
 *	by <a href="https://math.hws.edu/eck/index.html">David J. Eck</a>
 * </p>
 *
 * @author <a href="https://github.com/ken-wakura-pro">Ken Wakura</a>
*/
public class Birthday365Days {
	public static void main(String args[]){
		boolean birthdays[];	
		int count;		// number people asked
		int day, i;
	
		birthdays = new boolean[365];
		count = 0;
		for(i = 0; i < 365; i++) {
			while((int)(Math.random() * 365) != i){
				count++;
			}
			birthdays[i] = true;
		}

	System.out.printf("To find birthdasy on all 365 days of the year, %d people were asked.%n", count);
	}
}
