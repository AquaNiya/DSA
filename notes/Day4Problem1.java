//Two pointer approach - optimal solution
public class Day4Problem1 {
  static boolean hasPairwithSum(int arr[], int target){
    int left = 0;
    int right = arr.length -1;

    while(left<right){
      int sum = arr[left] + arr[right];
      if (sum == target) return true;
        else if (sum < target) left++;
        else right--;
    }
    return false;
 }

  public static void main(String[] args) {
    int[] arr = {1, 3, 5, 8, 12};
    int target = 13;
    boolean found = hasPairwithSum(arr, target);
    if (found) {
        System.out.println("Pair found!");
    } else {
        System.out.println("No pair found.");
      }
  }  
}
