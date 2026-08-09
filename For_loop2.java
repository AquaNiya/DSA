// Given two integers low and high, return the sum of all integers from low to high inclusive.

import java.util.Scanner;

class Solution {
  public int forLoop(int low, int high) {
    int sum = 0;
    for (int i = low; i <= high; i++) {
      sum += i;
    }
    return sum;
  }
}

public class For_loop2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter low value: ");
    int low = sc.nextInt();

    System.out.print("Enter high value: ");
    int high = sc.nextInt();

    Solution s = new Solution(); //create object of solution class
    int result = s.forLoop(low, high);

    System.out.println("The sum of all integers is: " + result);

    sc.close();
  }
}
