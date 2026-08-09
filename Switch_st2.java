public class Switch_st2{
    public static void main(String[] args) {
        // Define two constant integers
        final int x = 10;
        final int y = 5;

        // Evaluate the sum of x and y using a switch statement
        switch (x + y) {
            case 15: // If the sum equals 15
                System.out.println("Result is 15.");
                break; // Exit the switch block
            case 20: // If the sum equals 20
                System.out.println("Result is 20.");
                break; // Exit the switch block
            default: // If no case matches
                System.out.println("No match found.");
        }
    }
}

