package BasicMaths;

//LeetCode 7. Reverse Integer - Medium

public class ReverseNum {
    public int reverse(int x) {

        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;  // Get last digit
            x /= 10;             // Remove last digit

            // Check for overflow/underflow before multiplying by 10
            //int datatype has a specific range so we are checking that overflow
            if (reversed > Integer.MAX_VALUE / 10 || reversed < Integer.MIN_VALUE / 10) {
                return 0;
            }
            reversed = reversed * 10 + digit;
        }
        return reversed;
    }
}
