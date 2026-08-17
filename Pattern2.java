class Solution {
    // Function to print Pattern 2
    public void pattern2(int N) {
        // Loop for rows
        for (int i = 0; i < N; i++) {
            // Loop for columns (stars in each row)
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            // Move to next line after each row
            System.out.println();
        }
    }
}

public class Pattern2 {
    public static void main(String[] args) {
        // Create solution object
        Solution sol = new Solution();
        // Define N
        int N = 5;
        // Call pattern function
        sol.pattern2(N);
    }
}
