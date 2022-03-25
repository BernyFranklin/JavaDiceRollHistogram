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
    public static void main(String[] args) {
        
        // Local variables
        // Using Math.random for random number
        // Multiplied by 6 (SIDES_ON_DIE) makes selection 0-5
        // Adding 1 makes the selection 1-6
        int dieOne = (int)(Math.random()*SIDES_ON_DIE)+1;
        int dieTwo = (int)(Math.random()*SIDES_ON_DIE)+1;
        int sumOfDice = dieOne + dieTwo;
        
        // Test Print
        System.out.printf ("Die one rolled: %2d\n", dieOne);
        System.out.printf ("Die two rolled: %2d\n", dieTwo);
        System.out.printf ("Sum of dice:    %2d\n", sumOfDice); 
    }   // End of PSV Main
    
}   // End of Class
