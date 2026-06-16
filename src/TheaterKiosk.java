import java.util.Scanner;

public class TheaterKiosk {
    public static void main(String[] args) {
        // Set up scanner to read user input
        Scanner in = new Scanner(System.in);

        //Declare variables
        int age = 0;
        String trash = ""; // For storing bad input

        // Ask user for their age
        System.out.print("Please enter your age: ");

        // Check that user actually typed a number
        if (in.hasNextInt()) {
            age = in.nextInt();
            in.nextLine(); // Clear the newline out of the buffer

            // Verify if they are 21 or older. Do nothing if not
            if (age >= 21) {
                System.out.println("You get a paper wrist band.");
            }
        } else {
            // If they type letters instead of a number
            trash = in.nextLine();
            System.out.println("Error: '" + trash + "' is not a valid age.");
            System.out.println("Please run the program again and enter a number");
        }
    }
}