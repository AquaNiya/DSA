class Solution {
    // Function to print a square pattern of stars
    public void pattern1(int N) {
        // Outer loop to handle rows
        for (int i = 0; i < N; i++) {
            // Inner loop to handle columns for each row
            for (int j = 0; j < N; j++) {
                // Print a star followed by a space
                System.out.print("* ");
            }
            // After printing stars in a row, move to the next line
            System.out.println();
        }
    }
}    
public class Pattern1{
  public static void main(String[] args) {
    Solution sol = new Solution();
    int N = 5; // Set the size of the square (5x5)
    sol.pattern1(N); // Call the function to print the pattern
  }
}
    

//Time Complexity: O(N²), since we print N stars for each of the N rows.

//Space Complexity: O(1), no additional space is used apart from loop variables.