public class Pattern5 {
    // Function to print Pattern 5
    public void pattern5(int N) {
        // Outer loop for rows
        for (int i = 0; i < N; i++) {
            // Inner loop for columns
            // Number of stars decreases with each row
            for (int j = N; j > i; j--) {
                System.out.print("* ");
            }
            // Move to next line
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // Create object of Solution class
        Pattern5 sol = new Pattern5();

        // Define size of pattern
        int N = 5;

        // Call pattern function
        sol.pattern5(N);
    }
}

