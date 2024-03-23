// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
// An input string is valid if:
// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.
// Every close bracket has a corresponding open bracket of the same type.
 
// Example 1:
// Input: s = "()"
// Output: true

// Example 2:
// Input: s = "()[]{}"
// Output: true

// Example 3:
// Input: s = "(]"
// Output: false

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s1 = "()";
        System.out.println(isValid(s1));
        String s2 = "()[]{}";
        System.out.println(isValid(s2));
        String s3 = "(]";
        System.out.println(isValid(s3));
    }

    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        if (n % 2 != 0) {
            return false;
        }
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                st.push(s.charAt(i));
            } else if (s.charAt(i) == ')') {
                if (st.size() == 0) {
                    return false;
                } else if (st.peek() == '(') {
                    st.pop();
                } else {
                    return false;
                }
            } else if (s.charAt(i) == '}') {
                if (st.size() == 0) {
                    return false;
                } else if (st.peek() == '{') {
                    st.pop();
                } else {
                    return false;
                }
            } else if (s.charAt(i) == ']') {
                if (st.size() == 0) {
                    return false;
                } else if (st.peek() == '[') {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        if (st.size() != 0) {
            return false;
        }
        return true;
    }
}
