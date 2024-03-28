// You are given a string that represents the postfix form of a valid mathematical expression. Convert it to its prefix form.

// Example:
// Input: 
// ABC/-AK/L-*
// Output: 
// *-A/BC-/AKL
// Explanation: 
// The above output is its valid prefix form.

import java.util.Stack;

public class PostfixToPrefix {
    public static void main(String[] args) {
        String s1 = "ABC/-AK/L-*";
        System.out.println(postToPre(s1));
    }

    static String postToPre(String post_exp){
        Stack<String> val = new Stack<>();
        for(int i=0; i<post_exp.length(); i++){
            char ch = post_exp.charAt(i);
            int ascii = (int)ch;
            if(ascii>=65 && ascii<=90){
                val.push(ch+"");
            }else if(ascii>=97 && ascii<=122){
                val.push(ch+"");
            }else{
                String v2 = val.pop();
                String v1 = val.pop();
                char op = ch;
                String s = op+v1+v2;
                val.push(s);
            }
        }
        return val.peek();
    }
}
