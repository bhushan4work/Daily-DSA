import java.io.*;

//palindrome - which gives same output as of input on reversal

public class PalindromeString {

    //method1
    //Leetcode - 125. Valid Palindrome - Easy
    static boolean isPalindrome(String str) {
        int left = 0, right = str.length()-1;
        while(left<right){
            char l = str.charAt(left), r = str.charAt(right);
            if(!Character.isLetterOrDigit(l)) //if not letter or num then skip
                left++;
            else if(!Character.isLetterOrDigit(r)) //if not letter or num then skip
                right--;
            else if(Character.toLowerCase(l)!=Character.toLowerCase(r)) //lowercase both n compare,if not same then false
                return false;
            else {
                left++; //if char matches then move inward from both ends
                right--;
            }
        }
        return true;  //all checks passed so return true
        //if we finish loop without returning false then its palindrome
    }

    //method2 : by recursion
    static boolean palindrome(int i, String s){
        // Base Condition
        // If i exceeds half of the string, means all the elements
        // are compared, we return true.
        if(i>=s.length()/2) return true;

        // If start is not equal to end, not palindrome.
        if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;

        // If both characters are same, increment i and check start+1 and end-1.
        return palindrome(i+1,s);
    }

    public static void main(String[] args) {
        //for method1
        String str = "ABCDCBA";
        boolean ans = isPalindrome(str);

        if (ans == true){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }

        //for method2
        // Example string.
        String s = "madam";
        System.out.println(palindrome(0,s));
    }
}



