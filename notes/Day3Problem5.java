// Array: {2, 2, 2, 3, 3, 4, 4, 4, 4, 5} — top 2 most frequent numbers dhundho.

import java.util.HashMap;

public class Day3Problem5 {
  static void topTwoFrequent(int[] arr){
  HashMap<Integer , Integer> freq = new HashMap<>();
  for(int num : arr){
    freq.put(num, freq.getOrDefault(num, 0) +1);
  }

  //Round1: Find most frequent number
  int maxCount = 0;
  int firstMax = arr[0];
  for(int key: freq.keySet()){
    if(freq.get(key) > maxCount){
      maxCount = freq.get(key);
      firstMax = key;
    }
  }

  //Round2: Find second most frequent number
  int maxCount2 = 0;
  int secondMax = -1; //koi valid element nahi hai to -1 return karenge
  for (int key: freq.keySet()){
    if(key == firstMax) continue; //skip the first max element
    if(freq.get(key) > maxCount2){
      maxCount2 = freq.get(key);
      secondMax = key;
    }
  }
  System.out.println("First: " + firstMax + ", Second: " + secondMax);
  }

  public static void main(String[] args) {
    int[] arr = {2, 2, 2, 3, 3, 4, 4, 4, 4, 5};
    topTwoFrequent(arr);
  }
}

