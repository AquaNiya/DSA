//Given a digit d (0 to 9), find the sum of the first 50 positive integers (integers > 0) that end with digit d.
//A number ends with digit d if its last digit is d.

import java.util.Scanner;

class Solution {
    public int whileLoop(int d) {
        int sum = 0, count = 0;
        int i = 1; // start from 1 because we need positive integers only

        while (count < 50) {
            if (i % 10 == d) {
                sum += i;
                count++;
            }
            i++;
        }
        return sum;
    }
}

public class While_loop2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d;

        while (true) {
            System.out.print("Enter a digit (0 to 9): ");
            d = sc.nextInt();

            if (d >= 0 && d <= 9) {
                break;
            }

            System.out.println("Invalid input. Please enter a digit between 0 and 9.");
        }

        Solution solution = new Solution();
        int result = solution.whileLoop(d);

        System.out.println("The sum of the first 50 positive integers ending with " + d + " is: " + result);

        sc.close();
    }
}