public class Pattern15 {
    // Function to print the pattern of alphabets in a decreasing order
    public void pattern15(int N) {
        // Outer loop for the number of rows
        for (int i = 0; i < N; i++) {
            
            // Inner loop to print alphabets from A to A + (N-i-1)
            for (char ch = 'A'; ch <= 'A' + (N - i - 1); ch++) {
                System.out.print(ch + " ");  // Print the current character followed by a space
            }

            // Move to the next line after printing the current row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern15 sol = new Pattern15();
        int N = 5;  // Set the size of the pattern (5 rows)
        sol.pattern15(N);  // Call the function to print the pattern
    }
}
