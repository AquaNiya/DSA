public class Pattern11 {
    // Function to print the alternating pattern of 1's and 0's
    public void pattern11(int N) {
        int start;
        
        // Outer loop for the number of rows
        for (int i = 0; i < N; i++) {
            // If the row index is even, print 1 first
            if (i % 2 == 0) start = 1;
            else start = 0;

            // Inner loop to print alternating 1's and 0's in each row
            for (int j = 0; j <= i; j++) {
                System.out.print(start);
                // Alternate between 1 and 0
                start = 1 - start;
            }

            // Move to the next line after each row is printed
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern11 sol = new Pattern11();
        int N = 5;
        sol.pattern11(N); // Print the pattern
    }
}
