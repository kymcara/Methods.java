package java_methods;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter three numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();

        // Call the method to find and display the results
        displayResults(num1, num2, num3);

        // Close the scanner to avoid resource leaks
        scanner.close();
    }

    // Method to determine the largest and smallest numbers using if statements
    private static void displayResults(double num1, double num2, double num3) {
        double smallest, largest;

        // Determine the smallest number
        if (num1 <= num2 && num1 <= num3) {
            smallest = num1;
        } else if (num2 <= num1 && num2 <= num3) {
            smallest = num2;
        } else {
            smallest = num3;
        }

        // Determine the largest number
        if (num1 >= num2 && num1 >= num3) {
            largest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            largest = num2;
        } else {
            largest = num3;
        }

        System.out.println("The smallest number: " + smallest);
        System.out.println("The largest number: " + largest);
        System.out.printf("%.2f is your largest and %.2f is your smallest number.%n", largest, smallest);
    }
}
