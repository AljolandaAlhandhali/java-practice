import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base: ");
        int base = input.nextInt();
        System.out.print("Enter exponent: ");
        int exp = input.nextInt();
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= base;
        }
        System.out.println(base + " ^ " + exp + " = " + result);
    }
}