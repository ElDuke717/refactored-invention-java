// Import the Scanner class from the java.util package, which allows reading user input
import java.util.Scanner;

// Define the LCMCalculator class
public class LCMCalculator {

    // Define the main method
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        // Read the first number from user input
        int num1 = scanner.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        // Read the second number from user input
        int num2 = scanner.nextInt();

        // Calculate the LCM of the two numbers using the calculateLCM method
        int lcm = calculateLCM(num1, num2);

        // Display the calculated LCM to the user
        System.out.println("The least common multiple (LCM) of " + num1 + " and " + num2 + " is: " + lcm);

        // Close the Scanner object to release resources
        scanner.close();
    }

    // Define the calculateLCM method to calculate the LCM of two numbers
    public static int calculateLCM(int num1, int num2) {
        // Find the maximum of the two input numbers
        int max = Math.max(num1, num2);
        // Initialize the LCM with the maximum value
        int lcm = max;

        // Loop until the LCM is found
        while (true) {
            // Check if the current lcm is divisible by both input numbers
            if (lcm % num1 == 0 && lcm % num2 == 0) {
                // Break the loop if the LCM is found
                break;
            }
            // Increment the lcm by the maximum value to check the next multiple
            lcm += max;
        }

        // Return the calculated LCM
        return lcm;
    }
}
