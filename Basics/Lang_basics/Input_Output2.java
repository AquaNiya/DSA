//Complete the function printNumber which takes an integer input from the user and prints it on the screen.
//Constraints: -1000 <= User Input <= 1000

import java.util.Scanner;

public class Input_Output2 {
    public static void printNumber(Scanner sc) {
        System.out.print("Enter Input: ");
        int a = sc.nextInt();
        System.out.println("Output: " + a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printNumber(sc);
        sc.close();
    }
}
