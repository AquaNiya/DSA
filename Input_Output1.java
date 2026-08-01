//WAP tht reads two integers from the user and prints their sum
import java.util.Scanner;
public class Input_Output1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int a = sc.nextInt();
        System.out.print("Enter second integer: ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum: " + sum);
        sc.close();
    }
}
