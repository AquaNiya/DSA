//Given a digit d (0 to 9), find the sum of the first 50 positive integers (integers > 0) that end with digit d.
//A number ends with digit d if its last digit is d.

class Solution {
    public int whileLoop(int d) {
        int sum = 0, count = 0;
        int i = 0;

        while(count<50){
            if(i%10 == d){
                sum += i;
                count ++;
            }
            i++;
        }
        return sum;
    }   
}

public class While_loop2 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int d = 5;
        System.out.println("Sum of numbers ending with " + d + " is: " + solution.whileLoop(d));
    }
}