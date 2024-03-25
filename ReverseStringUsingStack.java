// You are given a string S, the task is to reverse the string using stack.

// Example 1:
// Input: S="GeeksforGeeks"
// Output: skeeGrofskeeG

import java.util.Stack;

public class ReverseStringUsingStack {
    public static void main(String[] args) {
        String s1 = "GeeksforGeeks";
        System.out.println(reverse(s1));
    }

    public static String reverse(String S){
        Stack<Character> st = new Stack<>();
        for(int i=0; i<S.length(); i++){
            st.push(S.charAt(i));
        }
        String res = "";
        while(!st.isEmpty()){
            res+=st.pop();
        }
        return res;
    }
}
