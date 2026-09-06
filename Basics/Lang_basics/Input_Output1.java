//WAP tht reads two integers from the user and prints their sum
import java.util.Scanner; //Scanner (in java.util) reads input from System.in
public class Input_Output1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int a = sc.nextInt(); //to input integer values
        System.out.print("Enter second integer: ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum: " + sum);
        sc.close(); //It's necessary to close scanner class
    }
}
