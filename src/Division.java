import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();
        if (b == 0) {
            System.out.println("Cannot divide by zero");
        }
        else {
            System.out.println(a + " ÷ " + b + " = " + ((double)a / b));
        }
    }
}