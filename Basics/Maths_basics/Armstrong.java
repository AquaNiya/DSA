public class Armstrong {

    static int countDigits(int n) {
        if (n == 0) return 1;          // 0 mein ek digit hota hai
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        return count;
    }                                  // countDigits yahan band

    static long power(int base, int exp) {
        long result = 1;
        for (int i = 0; i < exp; i++) {
            result *= base;
        }
        return result;
    }

    static boolean isArmstrong(int n) {
        if (n < 0) return false;       // negative Armstrong nahi hota

        long sum = 0;
        int numOfDigits = countDigits(n);
        int original = n;              // copy, loop se PEHLE

        while (n != 0) {
            int digit = n % 10;
            sum += power(digit, numOfDigits);
            n = n / 10;
        }
        return sum == original;
    }

    public static void main(String[] args) {
        int[] tests = {153, 9474, 123, 0, 5, 10, -153, 370, 407, 1634};
        for (int t : tests) {
            System.out.println(t + " -> " + isArmstrong(t));
        }
    }
}