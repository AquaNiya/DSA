public class Pattern17 {
    // Function to print the alphabet pyramid pattern
    public static void pattern17(int N) {
        // Loop for each row
        for (int i = 0; i < N; i++) {

            // Print leading spaces
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }

            // Initialize character to start from 'A'
            char ch = 'A';
            int breakpoint = (2 * i + 1) / 2;

            // Print characters in row
            for (int j = 1; j <= 2 * i + 1; j++) {
                System.out.print(ch);

                // Increment or decrement character
                if (j <= breakpoint) ch++;
                else ch--;
            }

            // Print trailing spaces
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }

            // Newline after each row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int N = 5;
        pattern17(N);
    }
}
