public class Pattern16 {
    // Function to print the pattern where each letter is repeated in the row
    public void pattern16(int N) {
        // Outer loop for the number of rows
        for (int i = 0; i < N; i++) {
            
            // Define the character for each row based on row index
            char ch = (char) ('A' + i);
            
            // Inner loop to print the character for i times in the row
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");  // Print the character followed by a space
            }

            // Move to the next line after printing the current row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern16 sol = new Pattern16();
        int N = 5;  // Set the size of the pattern (5 rows)
        sol.pattern16(N);  // Call the function to print the pattern
    }
}
