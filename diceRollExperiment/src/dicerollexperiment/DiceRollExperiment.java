/*
* Exercise 3.1:
* 
*/
package dicerollexperiment;

/**
 * How many times do you have to roll a pair of dice before they come 
 * up snake eyes? You could do the experiment by rolling the dice by hand.
 * Write a computer program that simulates the experiment. The program should 
 * report the number of rolls that it makes before the dice come up snake eyes.
 * (Note: "Snake eyes" means that both dice show a value of 1.
 * @author wakura
 */
public class DiceRollExperiment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Dice dice = new Dice();
      int total = dice.getTotal();
      int count = 1;            //the dice is rolled once its created
      while (total != 2){
          total = dice.getTotal();
          count++;
      }
      System.out.printf("The pair of dice was rolled %d  times to get snake eyes", count);
    }
    
    /**
     * This is a nested class that represents a pair of dice
     */
    private static class Dice{
        private static int die1;        //The value on die 1
        private static int die2;        //the value on die 2
        
        /**
         * Constructor for the nested class. 
         * The constructor creates a pair of dice and rolls the dice
         */
        Dice(){
            roll();
        }
        
        /**
         * This method rolls the pair of dice
         * The pair of dice is rolled by assigning each die a random number 
         * between 1 and 6
         */
        private void roll(){
            die1 = (int)(Math.random()*6) + 1;
            die2 = (int)(Math.random()*6) + 1;
        }
        
        /**
         * This is a getter method
         * @return the total of die1 and die2
         */
        int getTotal(){
            return die1+die2;
        }
    }
    
}
