import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        // Create Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Ask user to enter a number
        System.out.print("Enter number: ");

        // Read integer input from user
        int n = sc.nextInt();

        // Check if number is even
        if (n % 2 == 0) {
            System.out.println(n + " is Even"); // If condition is true, number is even
        }

        else {
            System.out.println(n + " is Odd"); // If condition is false, number is odd
        }

        }
}