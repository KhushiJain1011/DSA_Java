// You are given an array of strings tokens that represents an arithmetic expression in a Reverse Polish Notation.
// Evaluate the expression. Return an integer that represents the value of the expression.

// Note that:
// The valid operators are '+', '-', '*', and '/'.
// Each operand may be an integer or another expression.
// The division between two integers always truncates toward zero.
// There will not be any division by zero.
// The input represents a valid arithmetic expression in a reverse polish notation.
// The answer and all the intermediate calculations can be represented in a 32-bit integer.
 
// Example 1:
// Input: tokens = ["2","1","+","3","*"]
// Output: 9
// Explanation: ((2 + 1) * 3) = 9

// Example 2:
// Input: tokens = ["4","13","5","/","+"]
// Output: 6
// Explanation: (4 + (13 / 5)) = 6

import java.util.Stack;

public class EvaluateReversePolishNotation {
    public static void main(String[] args) {
        String tokens1[] = {"2","1","+","3","*"};
        System.out.println(evalRPN(tokens1));
        String tokens2[] = {"4","13","5","/","+"};
        System.out.println(evalRPN(tokens2));
    }

    public static int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+")||tokens[i].equals("-")||tokens[i].equals("*")||tokens[i].equals("/")){
                int y = st.pop();
                int x = st.pop();
                if(tokens[i].equals("+"))
                    st.push(x+y);
                else if(tokens[i].equals("-"))
                    st.push(x-y);
                else if(tokens[i].equals("*"))
                    st.push(x*y);
                else if(tokens[i].equals("/"))
                    st.push(x/y);
            }
            else{
                st.push(Integer.valueOf(tokens[i]));
            }
        }
        return st.peek();
    }
}
