// Striver A2Z -> Basic Maths -> Count number of odd digits in a number
//
// 5 sawaal (loop chunne ke liye):
// 1. Baar-baar kya ho raha hai?  -> last digit pakadna (n % 10) aur kaatna (n / 10)
// 2. Kitni baar?                 -> pata nahi -> while
// 3. Kab rukna hai?              -> jab n == 0 (loop condition: n != 0)
// 4. Har round mein kya badalta? -> n = n / 10
// 5. Kya yaad rakhna hai?        -> count (0 se shuru), sirf odd digit pe badhega
//
// Time: O(log n)
// Space: O(1)

public class CountOddDigits {
  static int countOddDigits(int n) {
    if (n < 0)
      n = -n; // negative ko positive bana lo

    int count = 0;
    while (n != 0) {
      int digit = n % 10; // PEHLE digit pakdo
      if (digit % 2 != 0) { // odd hai?
        count++;
      }
      n = n / 10; // PHIR last digit kaato (order ulta hua toh digit kho jayega)
    }
    return count;
  }

  public static void main(String[] args) {
    System.out.println(countOddDigits(1234)); // 2 (1 aur 3)
    System.out.println(countOddDigits(2468)); // 0
    System.out.println(countOddDigits(0)); // 0
    System.out.println(countOddDigits(-135)); // 3
  }
}