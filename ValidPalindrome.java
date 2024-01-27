// A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
// Given a string s, return true if it is a palindrome, or false otherwise.

import java.util.Scanner;
public class ValidPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String st = sc.nextLine();
        // System.out.println(isPalindrome(st));
        boolean result = isPalindrome(st);
        System.out.println(result);
    }

    // method to check palindrome: 
    public static boolean isPalindrome(String st){
        boolean res = true;
        String stLower = st.toLowerCase();
        int begin = 0;
        int end = stLower.length()-1;

        char cb = stLower.charAt(begin);
        char ce = stLower.charAt(end); 

        while(begin < end){
            if(!Character.isLetterOrDigit(cb)){
                begin++;
            }
            if(!Character.isLetterOrDigit(ce)){
                end--;
            }
            if(cb == ce){
                begin++;
                end--;
            }
            else{
                res = false;
                break;
            }
        }
        return res;
    }
}
