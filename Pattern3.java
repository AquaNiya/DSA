class Solution {
    // Function to print the number pattern
    public void pattern3(int N) {
        // Outer loop for rows
        for (int i = 1; i <= N; i++) {
            // Inner loop for columns
            // Print numbers from 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // Move to the next row
            System.out.println();
        }
    }
}

public class Pattern3{
    public static void main(String[] args) {
        // Create object of Solution class
        Solution sol = new Solution();

        // Define size of pattern
        int N = 5;

        // Call pattern function
        sol.pattern3(N);
    }
}
