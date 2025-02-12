package exercise5_3;

import utils.PairOfDice;
import utils.StatCalc;

/**
 * This class implements a program that calculates mean, standard deviation, and maximum
 * values in an experiment to roll a pair of dice for a given total 10,000 times.
 * 
 * @source <a href="https://math.hws.edu/javanotes/c5/exercises.html">Exercise 5.3</a>
 * @author <a href="https://github.com/ken-wakura-pro">Ken Wakura</a>
 */
public class DiceRollStats {
    public static void main(String args[]){
        StatCalc calc;
        PairOfDice dice = new PairOfDice();

        System.out.printf("%10s %10s %10s %10s", "Die Total", "Average", "StanDev.", "Maximum");
        System.out.println();

        for (int i = 2; i <= 12; i++) {
            calc = new StatCalc();

            for (int j = 0; j < 10000; j++) {
                int count = 0;      // the number of times the pair of dice was rolled to get the total i
                int diceTotal;      // the total on the dice pair.

                while (true) {
                    dice.roll();
                    count++;
                    diceTotal = dice.getDie1() + dice.getDie2();
        
                    if (diceTotal == i)
                        break;
                }
                calc.enter(count);
            }
            System.out.printf("%9d | %9.2f | %9.2f | %9.0f", i, calc.getMean(), calc.getStandardDeviation(), calc.getMax());
            System.out.println();
        }
    }
}
