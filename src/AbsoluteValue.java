import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = input.nextInt();
        if (n < 0) {
            n = -n;
        }
        System.out.println("Absolute = " + n);
    }
}