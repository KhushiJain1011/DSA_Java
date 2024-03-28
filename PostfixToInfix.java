// You are given a string that represents the postfix form of a valid mathematical expression. Convert it to its infix form.

// Example:
// Input:
// ab*c+ 
// Output: 
// ((a*b)+c)
// Explanation: 
// The above output is its valid infix form.

import java.util.Stack;

public class PostfixToInfix {
    public static void main(String[] args) {
        String s1 = "ab*c+";
        System.out.println(postToInfix(s1));
    }

    public static String postToInfix(String exp){
        Stack<String> val = new Stack<>();
        for(int i=0; i<exp.length(); i++){
            char ch = exp.charAt(i);
            int ascii = (int)ch;
            if(ascii>=65 && ascii<=90){
                val.push(ch+"");
            }else if(ascii>=97 && ascii<=122){
                val.push(ch+"");
            }else{
                String v2 = val.pop();
                String v1 = val.pop();
                char op = ch;
                String res = "("+v1+op+v2+")";
                val.push(res);
            }
        }
        return val.peek();
    }
}
