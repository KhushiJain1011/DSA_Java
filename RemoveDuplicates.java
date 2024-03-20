// Given a string without spaces, the task is to remove duplicates from it.
// Note: The original order of characters must be kept the same. 

// Example 1:
// Input: S = "zvvo"
// Output: "zvo"
// Explanation: Only keep the first
// occurrence

// Example 2:
// Input: S = "gfg"
// Output: gf
// Explanation: Only keep the first
// occurrence

import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String s1 = "zvvo";
        System.out.println(removeDups(s1));

        String s2 = "gfg";
        System.out.println(removeDups(s2));
    }

    public static String removeDups(String S) {
        String ans = "";
        HashSet<Character> set = new HashSet<>();
        for(int i=0; i<S.length(); i++){
            char ch = S.charAt(i);
            if(set.contains(ch)){
                continue;
            }
            else{
                set.add(ch);
                ans += ch;
            }
        }
        return ans;
    }
}
