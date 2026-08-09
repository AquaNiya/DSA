
public class Switch_st3 {
    public static void main(String[] args) {
        // Define a char variable representing a grade
        char grade = 'B';

        // Evaluate grade using switch st.
        switch (grade) {
            case 'A': // If grade is 'A'
                System.out.println("Excellent!");
                break; // break exits switch after this case
            case 'B': // If grade is 'B'
                System.out.println("Good!");
                break; 
            default: // If no case matches
                System.out.println("Not specified.");
        }
    }
}
