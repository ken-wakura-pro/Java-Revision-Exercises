/**
 * This program simulate asking people randomly the day of the year
 * they were born. The program reports after how many trials do you
 * get people sharing a birthday.
 *
 * Source: Introduction to Programming Using Java, Version 9, JavaFx Edition
 * Author: David J. Eck
 *
 * Adapted by: Ken Wakura [ken-wakura-pro]
 * Modification: I simplified the code to only focus show working with arrays 
 */
public class BirthdayProblem {
	public static void main(String args[]){
		boolean birthdays[];	
		int count;		// number people asked
		int day;		// a day of the year
	
		birthdays = new boolean[365];
		count = 0;
		while(true) {
			day = (int)(Math.random() * 365); // simulate birthday
			count++;

			if(birthdays[day])
				break;
			else
				birthdays[day] = true;
		}

		System.out.printf("Found a duplicate birthday people after %d attempts.%n", count);
	}
}
