public class Pattern8 {
    // Function to print Pattern 8
    public void pattern8(int N) {
        // Outer loop for rows
        for (int i = 0; i < N; i++) {

            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 0; j < 2 * N - (2 * i + 1); j++) {
                System.out.print("*");
            }

            // Print trailing spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Move to next row
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern8 sol = new Pattern8();
        int N = 5;
        sol.pattern8(N);
    }
}

