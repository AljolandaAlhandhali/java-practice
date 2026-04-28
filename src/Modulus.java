import java.util.Scanner;

public class Modulus {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first numbers: ");
        int a = input.nextInt();

        System.out.print("Enter second numbers: ");
        int b = input.nextInt();

        if (b == 0) {
            System.out.println("Error");
        }
    }
}