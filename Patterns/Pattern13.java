public class Pattern13{
    // Function to print the pattern of numbers
    public void pattern13(int N) {
        int num = 1;  // Starting number

        // Outer loop for the number of rows
        for (int i = 1; i <= N; i++) {

            // Inner loop to print numbers increasing by 1 in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");  // Print the current number followed by a space
                num = num + 1;  // Increment the number for the next print
            }

            // Move to the next line after printing the current row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern13 sol = new Pattern13();
        int N = 5;  // Set the size of the pattern (5 rows)
        sol.pattern13(N);  // Call the function to print the pattern
    }
}

