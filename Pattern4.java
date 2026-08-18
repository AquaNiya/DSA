class Solution {
    // Function to print the pattern
    public void pattern4(int N) {
        // Outer loop for rows
        for (int i = 1; i <= N; i++) {
            // Inner loop for columns
            // Print the row number 'i' in each column
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            // Move to the next row
            System.out.println();
        }
    }
}

public class Pattern4 {
    public static void main(String[] args) {
        // Create object of Solution class
        Solution sol = new Solution();

        // Define size of pattern
        int N = 5;

        // Call pattern function
        sol.pattern4(N);
    }
}
