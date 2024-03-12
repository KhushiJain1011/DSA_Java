// Given a string S, the task is to create a string with the first letter of every word in the string.

// Example 1:
// Input: 
// S = "geeks for geeks"
// Output: gfg

// Example 2:
// Input: 
// S = "bad is good"
// Output: big

public class PrintFirstLetter {
    public static void main(String[] args) {
        String s1 = "geeks for geeks";
        System.out.println(firstAlphabet(s1));

        String s2 = "bad is good";
        System.out.println(firstAlphabet(s2));
    }

    public static String firstAlphabet(String S) {
        String ans = ""+S.charAt(0);
        for(int i=1; i<S.length(); i++){
            if(S.charAt(i) == ' '){
                ans += S.charAt(i+1);
            }
        }
        return ans;
    }
}
