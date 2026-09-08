//array {7, 3, 3, 9, 7, 7, 3} diya hai. HashMap use karke print kar ki kaunsa number sabse zyada baar (maximum frequency) aaya hai.

import java.util.LinkedHashMap;
public class Day3Problem1 {
  static int maxFreqElement(int[] arr) {
    LinkedHashMap<Integer, Integer> freq = new LinkedHashMap<>();
    for (int num : arr) {
      freq.put(num, freq.getOrDefault(num, 0) + 1);
    }
    int maxCount = 0;
    int result = arr[0];
    for (int key : freq.keySet()) {
      if (freq.get(key) > maxCount) {
        maxCount = freq.get(key);
        result = key;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    int[] arr = {7, 3, 3, 9, 7, 7, 3};
    System.out.println("Most frequent number: " + maxFreqElement(arr));
  }
}
