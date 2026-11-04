public class PalindromeNumber {
  static boolean isPalindrome(int n){
    if (n<0) return false; //negative numbers are not palindrome

    int original = n; //copy of original number
    int reversed = 0; //variable to store reversed number

    while(n != 0){
      int digit = n % 10; //get last digit
      reversed = reversed * 10 + digit; //append digit to reversed number
      n = n/10; //remove last digit from original number
    }

    return original == reversed;
  }
  public static void main(String[] args){
    int[] testCases = {121, 123,  -121, 10, 0, 7};
    for(int t: testCases){
      System.out.println(t + " is palindrome? " + isPalindrome(t));
    }
  }
}
