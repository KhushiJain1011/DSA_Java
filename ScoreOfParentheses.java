// Given a balanced parentheses string s, return the score of the string.
// The score of a balanced parentheses string is based on the following rule:

// "()" has score 1.
// AB has score A + B, where A and B are balanced parentheses strings.
// (A) has score 2 * A, where A is a balanced parentheses string. 

// Example 1:
// Input: s = "()"
// Output: 1

// Example 2:
// Input: s = "(())"
// Output: 2

// Example 3:
// Input: s = "()()"
// Output: 2

import java.util.Stack;

public class ScoreOfParentheses {
    public static void main(String[] args) {
        String s1 = "()";
        System.out.println(scoreOfParentheses(s1));
        String s2 = "(())";
        System.out.println(scoreOfParentheses(s2));
        String s3 = "()()";
        System.out.println(scoreOfParentheses(s3));
    }   
    public static int scoreOfParentheses(final String s) {
        final Stack<Integer> stack = new Stack<>();
        int score = 0;

        for(int i = 0; i < s.length(); ++i) {
            if(s.charAt(i) == '(') {
                stack.push(score);
                score = 0;
            } else {
                score = stack.pop() + (score == 0 ? 1 : 2 * score);
            }
        }

        return score;
    } 
}
