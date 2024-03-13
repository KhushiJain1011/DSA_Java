// Given a string S, check if it is palindrome or not.

// Example 1:
// Input: S = "abba"
// Output: 1
// Explanation: S is a palindrome

// Example 2:
// Input: S = "abc" 
// Output: 0
// Explanation: S is not a palindrome

public class PalindromeString {
    public static void main(String[] args) {
        String s1 = "abba";
        System.out.println(isPalindrome(s1));

        String s2 = "abc";
        System.out.println(isPalindrome(s2));
    }   

    public static int isPalindrome(String S) {
        int st = 0;                 // pointer initialized from start
        int end = S.length()-1;     // pointer initialized from end
        int ans = 1;            // considering the string is palindrome, if it is not, ans will be updated to 0
        while(st<end){
            if(S.charAt(st)!=S.charAt(end)){
                ans = 0;
                break;
            }
            st++;
            end--;
        }
        return ans;
    }
}
