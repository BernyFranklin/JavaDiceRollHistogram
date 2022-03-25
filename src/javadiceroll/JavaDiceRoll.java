/*
 * JavaDiceRoll Version1.0
 * Frank Bernal
 * CIS 084 Java Programming
 * Input: Developer input for sides on die and total rolls
 * Output: Histogram of 1,000 Dice Rolls
 * Date
 */

package javadiceroll;

// Import Math library for Math.random
import java.lang.Math;

public class JavaDiceRoll {

    // Global Constants
    private static final int SIDES_ON_DIE = 6;    // Using a 6 sided die
    private static final int TOTAL_ROLLS = 1000;  // Project requires 1000 rolls
    
    // Start main
    public static void main(String[] args) {
        
        // Local variables
        int dieOne;
        int dieTwo;
        int sumOfDice;
        // Array to store results of 1,000 dice rolls
        int[] pointCount = new int[13];
        
        // Roll each die for TOTAL_ROLLS
        // Store the sum of every roll and update counter array
        for (int i = 0; i < TOTAL_ROLLS; i++) {
            // Using Math.random for random number
            // Multiplied by 6 (SIDES_ON_DIE) makes selection 0-5
            // Adding 1 makes the selection 1-6
            dieOne = (int)(Math.random()*SIDES_ON_DIE)+1;
            dieTwo = (int)(Math.random()*SIDES_ON_DIE)+1;
            // Store sum of two dice
            sumOfDice = dieOne + dieTwo;
            // Increment index of sum into pointCount[]
            pointCount[sumOfDice]++;
        }   // End of for loop
        
        // Program Display
        // Header
        System.out.println ("=========================================");
        System.out.printf ("This program rolls two dice %4d times\n", TOTAL_ROLLS);
        System.out.println ("and displays how many times each outcome");
        System.out.println ("is rolled.");
        System.out.println ("=========================================");
        System.out.printf ("Roll       Total in %d Rolls\n", TOTAL_ROLLS);
        System.out.println ("=========================================");
        
        // Loop to print all outcomes using i for counter and index count
        for (int i = 2; i <=12; i++) {
            System.out.printf ("%3d                  %3d\n", i, pointCount[i]);
        }   // End of loop
        
        // Line for formatting
        System.out.println ("=========================================");
        
    }   // End of PSV Main
    
}   // End of Class
