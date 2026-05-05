import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");

        int n = Math.abs(input.nextInt());

        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

    }
}