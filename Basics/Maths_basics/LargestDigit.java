public class LargestDigit{
  static int largestDigit(int n){
    if (n < 0) n = -n; // Make n positive if it's negative
    int max = 0;
    while (n != 0){
      int digit = n % 10; // Get the last digit
      if (digit > max){ // Compare with current max
        max = digit; // Update max if current digit is larger
      }
      n = n / 10; // Remove the last digit
    }
    return max;
  }
  public static void main(String[] args){
    int[] testNumbers = {4721, 9, 0, -359, 1000};
    for (int t: testNumbers){
      System.out.println(t + " -> " + largestDigit(t));
    }
  }
}