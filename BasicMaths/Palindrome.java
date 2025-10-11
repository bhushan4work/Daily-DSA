package BasicMaths;

//LeetCode 9. Palindrome Number - Easy

public class Palindrome {
    public boolean isPalindrome(int x) {

        // Negative numbers or numbers ending with 0 (except 0 itself) are not palindromes
        if (x < 0 || (x % 10 == 0 && x != 0))
            return false;

        int reversed = 0;
        int original = x;

        while (x > 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }
        return original == reversed;
    }
}
