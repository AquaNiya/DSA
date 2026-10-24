// Striver A2Z -> Basic Maths -> Count all Digits of a Number
//
// 5 sawaal (loop chunne ke liye):
// 1. Baar-baar kya ho raha hai?  -> last digit kaatna (n = n / 10)
// 2. Kitni baar?                 -> pata nahi, wahi toh dhundhna hai -> while
// 3. Kab rukna hai?              -> jab n == 0 (loop condition: n != 0)
// 4. Har round mein kya badalta? -> n chhota hota hai (n = n / 10)
// 5. Kya yaad rakhna hai?        -> count (0 se shuru)
//
// Time: O(log n)  (har step mein n, 10 se divide hota hai)
// Space: O(1)

public class CountDigits {

  static int countDigits(int n) {
    if (n == 0)
      return 1; // edge case: 0 mein ek digit hota hai
    if (n < 0)
      n = -n; // edge case: negative ko positive bana lo
              // (trap: Integer.MIN_VALUE pe yeh fail hota hai)

    int count = 0;
    while (n != 0) {
      n = n / 10; // last digit kaato
      count++; // ek digit gina
    }
    return count;
  }

  public static void main(String[] args) {
    System.out.println(countDigits(1234)); // 4
    System.out.println(countDigits(7)); // 1
    System.out.println(countDigits(0)); // 1
    System.out.println(countDigits(-505)); // 3
  }
}