import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        System.out.println("Absolute Value Calculator");
        System.out.println("========================");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        if (!input.hasNextInt()) {
            System.out.println("Error: Please enter a valid integer.");
            return;
        }
        int n = input.nextInt();
        n = Math.abs(n);
        System.out.println("Absolute = " + n);
    }
}