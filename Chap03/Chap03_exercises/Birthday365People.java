/**
 * This class implements a program that simulates selecting 365 people checking how many differnt birthdays you get. 
 * <p>
 * 	This program is a solution to exercise 3.7 in the book
 *	<a href"https://math.hws.edu/javanotes/c3/exercises.html">Introduction to Programming Using Java</a>
 *	by <a href="https://math.hws.edu/eck/index.html">David J. Eck</a>
 * </p>
 *
 * @author <a href="https://github.com/ken-wakura-pro">Ken Wakura</a>
*/
public class Birthday365People {
	public static void main(String args[]){
		boolean birthdays[];	
		int count;		// number people asked
		int day, i;
	
		birthdays = new boolean[365];
		count = 0;
		for(i = 0; i < 365; i++) {
			day = (int)(Math.random() * 365); // simulate birthday
			birthdays[day] = true;
		}

		for (i = 0; i < 365; i++)
			if(birthdays[i])
				count++;

		System.out.printf("Selecting 365 people at random, you will have %d different birthdays.%n", count);
	}
}
