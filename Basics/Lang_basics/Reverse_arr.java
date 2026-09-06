import java.util.Arrays;
import java.util.Scanner;

class Solution {
  public int[] reverse(int[] arr) {
    int left = 0;
    int right = arr.length - 1;
    while (left < right) {
      int temp = arr[left];
      arr[left] = arr[right];
      arr[right] = temp;
      left++;
      right--;
    }
    return arr;
  }
}

public class Reverse_arr {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter number of elements: ");
    int n = scanner.nextInt();

    int[] numbers = new int[n];
    System.out.println("Enter " + n + " numbers separated by spaces:");
    for (int i = 0; i < n; i++) {
      numbers[i] = scanner.nextInt();
    }

    Solution solution = new Solution();
    int[] reversed = solution.reverse(numbers);

    System.out.println("Reversed array: " + Arrays.toString(reversed));
    scanner.close();
  }
}
