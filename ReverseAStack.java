// You are given a stack St. You have to reverse the stack using recursion.

// Example 1:
// Input:
// St = {3,2,1,7,6}
// Output:
// {6,7,1,2,3}
// Explanation:
// Input stack after reversing will look like the stack in the output.

// Example 2:
// Input:
// St = {4,3,9,6}
// Output:
// {6,9,3,4}
// Explanation:
// Input stack after reversing will look like the stack in the output.

import java.util.Stack;

public class ReverseAStack {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        s1.push(3);
        s1.push(2);
        s1.push(1);
        s1.push(7);
        s1.push(6);
        System.out.println("Original stack 1:");
        System.out.println(s1);
        System.out.println("reverse stack 1:");
        reverse(s1);
        System.out.println(s1);

        Stack<Integer> s2 = new Stack<>();
        s2.push(4);
        s2.push(3);
        s2.push(9);
        s2.push(6);
        System.out.println("Original stack 2:");
        System.out.println(s2);
        System.out.println("Reverse stack 2:");
        reverse(s2);
        System.out.println(s2);
    }

    public static void reverse(Stack<Integer> s)
    {
        // add your code here
        if(s.size() == 1) return;
        int top = s.pop();
        reverse(s);
        pushAtBottom(s, top);
    }
    
    public static void pushAtBottom(Stack<Integer> st, int val){
        Stack<Integer> rt = new Stack<>();
        while(st.size()>0){
            rt.push(st.pop());
        }
        st.push(val);
        while(rt.size()>0){
            st.push(rt.pop());
        }
    }
}
