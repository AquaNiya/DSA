public class Factorial {

    static long factorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("n must be between 0 and 20");
        }

        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] tests = {5, 0, 1, 12, 20, 21, -3};
        for (int t : tests) {
            try {
                System.out.println(t + "! -> " + factorial(t));
            } catch (IllegalArgumentException e) {
                System.out.println(t + "! -> error: " + e.getMessage());
            }
        }
    }
}