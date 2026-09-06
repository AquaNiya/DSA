public class Pattern18 {
    // Function to print Pattern 18
    public void pattern18(int N) {
        // Loop for each row
        for (int i = 0; i < N; i++) {
            // Print characters from ('A' + N - 1 - i) to ('A' + N - 1)
            for (char ch = (char) ('A' + N - 1 - i); ch <= (char) ('A' + N - 1); ch++) {
                System.out.print(ch + " ");
            }
            // Move to next line after each row
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // Create solution object
        Pattern18 sol = new Pattern18();
        // Define N
        int N = 5;
        // Call pattern function
        sol.pattern18(N);
    }
}
