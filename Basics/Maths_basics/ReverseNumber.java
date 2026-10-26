public class ReverseNumber{
  static int reverseUnsafe(int n){
    int result = 0;
    while(n!=0){
      int digit = n%10;
      result = result *10 + digit;
      n = n/10;
    }
    return result;
  }
  static long reverseLong(int n){
    long result = 0;
    while(n!=0){
      int digit = n%10;
      result = result *10 + digit;
      n = n/10;
    }
    return result;
  }
  static int reverseSafe(int n){
    int result = 0;
    while(n!=0){
      int digit = n%10;
      if(result > Integer.MAX_VALUE/10 || result < Integer.MIN_VALUE/10) return 0;
      result = result *10 + digit;
      n = n/10;
    }
    return result;
  }
  public static void main(String[] args){
    int [] tests = { 1234, 100, 0, -123, 1534236469};
    for(int t: tests){
      System.out.println(t + " -> unsafe " + reverseUnsafe(t) + " | long " + reverseLong(t) + " | safe " + reverseSafe(t));
    }
  }
}