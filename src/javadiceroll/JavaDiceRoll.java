/*
 * JavaDiceRoll Version1.0
 * Frank Bernal
 * CIS 084 Java Programming
 * Input: None
 * Output: Histogram of 1,000 Dice Rolls
 * Date
 */

package javadiceroll;

// Import Math library for Math.random
import java.lang.Math;

public class JavaDiceRoll {

    // Global stuff
    private static final int SIDES_ON_DIE = 6;
    private static final int TOTAL_ROLLS = 1000;
    public static void main(String[] args) {
        
        // Local variables
        int dieOne;
        int dieTwo;
        int sumOfDice;
        // Array to store results of 1,000 dice rolls
        int[] pointCount = new int[13];
        
        for (int i = 0; i < TOTAL_ROLLS; i++) {
            // Using Math.random for random number
            // Multiplied by 6 (SIDES_ON_DIE) makes selection 0-5
            // Adding 1 makes the selection 1-6
            dieOne = (int)(Math.random()*SIDES_ON_DIE)+1;
            dieTwo = (int)(Math.random()*SIDES_ON_DIE)+1;
            // Store sum of two dice
            sumOfDice = dieOne + dieTwo;
            pointCount[sumOfDice]++;
        }
        
        // Test Print
        System.out.println ("Roll       Total Rolls");
        for (int i = 2; i <=12; i++) {
            System.out.printf ("%3d           %3d\n", i, pointCount[i]);
        }
        
    }   // End of PSV Main
    
}   // End of Class
