public class Pattern6 {
    // Function to print Pattern 6
    public void pattern6(int N) {
        // Outer loop for rows
        for (int i = 0; i < N; i++) {
            // Inner loop for columns
            // Prints numbers from 1 up to (N - i)
            for (int j = N; j > i; j--) {
                System.out.print((N - j + 1) + " ");
            }
            // Move to next line
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // Create object of Solution class
        Pattern6 sol = new Pattern6();
        // Define size of pattern
        int N = 5;
        // Call pattern function
        sol.pattern6(N);
    }
}

