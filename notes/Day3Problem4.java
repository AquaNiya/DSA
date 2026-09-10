import java.util.HashMap;

public class Day3Problem4 {
  static void countElement(int[] arr){
    HashMap<Integer,Integer> freq = new HashMap<>();
    for(int num : arr){
      freq.put(num, freq.getOrDefault(num,0)+1);
    }
    System.out.println(freq);
  }
  public static void main(String[] args) {
    int[] arr = {2, 2, 3, 2, 4, 3};
    countElement(arr);
  }
}
