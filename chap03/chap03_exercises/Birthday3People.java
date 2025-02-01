/**
 * This program simulates attempts it takes to get 3 people sharing the same birthday.
 *
 * </p>This program is a solution to exercise 3.7 in the book
 * <a href="https://math.hws.edu/javanotes/c3/exercises.html">Introduction to Programming Using Java</a>
 * by <a href="https://math.hws.edu/eck/index.html">David J. Eck</a>
 * </p>
 *
 * @author <a href="https://github.com/ken-wakura-pro">Ken Wakura</a> 
 */
public class Birthday3Problem {
	public static void main(String args[]){
		int birthdays[];	
		int count;		// number people asked
		int day;		// a day of the year
	
		birthdays = new int[365];
		count = 0;
		while(true) {
			day = (int)(Math.random() * 365); // simulate birthday
			count++;

			birthdays[day]++;
			if(birthdays[day] == 3)
				break;
		}

		System.out.printf("Found a birthday shared by 3 people after %d attempts.%n", count);
	}
}
