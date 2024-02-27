/*
* This program checks how long wood needs to be one board foot long
*
* @author  Cristiano Sellitto
* @version 1.0
* @since   2024-02-26
*/

import java.util.Scanner;

/**
* This is the program.
*/
final class BoardFoot {
    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this is ever called
    *
    * @throws IllegalStateException if this is ever called
    *
    */
    private BoardFoot() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * Finds the length of the wood for
    * the wood to be considered one board foot.
    *
    * @param width of the wood
    * @param height of the wood
    * @return length needed to be considered a board foot
    */
    static float checkBoardLength(float width, float height) {
        final float boardFoot = 144;
        final float length = boardFoot / (width * height);
        return length;
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        // Generate random integer
        final int randomInt = 1 + (int) (Math.random() * ((6 - 1) + 1));

        // Scanners
        final Scanner input = new Scanner(System.in);
        final Scanner input2 = new Scanner(System.in);

        // Check if input is valid
        try {
            System.out.print("Enter width (in): ");
            final float width = Float.parseFloat(input.nextLine());
            System.out.print("Enter height (in): ");
            final float height = Float.parseFloat(input2.nextLine());
            if (width > 0 && height > 0) {
                // Amounts are valid if positive
                final float length = checkBoardLength(width, height);
                System.out.println("To get one board foot,"
                                 + "the wood needs to be " + length
                                 + " inches long"
                );
            } else {
                // Input is invalid
                Integer.parseInt(null);
            }
        } catch (NumberFormatException nfe) {
            // Input is invalid
            System.out.println("Invalid input.");
        }

        // Close scanners
        input.close();
        input2.close();

        // Show the program as done
        System.out.println("\nDone.");
    }
}
