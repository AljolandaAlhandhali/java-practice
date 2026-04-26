import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        System.out.println("Absolute Value Calculator");
        System.out.println("========================");
        Scanner input = new Scanner(System.in);
        do {
        System.out.println("Enter number: ");
        if (!input.hasNextInt()) {
            System.out.println("Error: Please enter a valid integer.");
            return;
        }
        int n = input.nextInt();
        int result = Math.abs(n);
        System.out.println("Absolute = " + result);
        System.out.print("Calculate another? (y/n): ");
        } while (input.hasNext() && input.next().equalsIgnoreCase("y"));
    }
}