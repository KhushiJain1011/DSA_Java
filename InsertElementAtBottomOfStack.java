// You are given a stack st of n integers and an element x. You have to insert x at the bottom of the given stack. 
// Note: Everywhere in this problem, the bottommost element of the stack is shown first while priniting the stack.

// Example 1:
// Input:
// n = 5
// x = 2
// st = {4,3,2,1,8}
// Output:
// {2,4,3,2,1,8}
// Explanation:
// After insertion of 2, the final stack will be {2,4,3,2,1,8}.

// Example 2:
// Input:
// n = 3
// x = 4
// st = {5,3,1}
// Output:
// {4,5,3,1}
// Explanation:
// After insertion of 4, the final stack will be {4,5,3,1}.

import java.util.Stack;

public class InsertElementAtBottomOfStack {
    public static void main(String[] args) {
        Stack<Integer> st1 = new Stack<>();
        st1.push(4);
        st1.push(3);
        st1.push(2);
        st1.push(1);
        st1.push(8);
        Stack<Integer> res1 = insertAtBottom(st1, 2);
        System.out.println(res1);

        Stack<Integer> st2 = new Stack<>();
        st2.push(5);
        st2.push(3);
        st2.push(1);
        Stack<Integer> res2 = insertAtBottom(st2, 4);
        System.out.println(res2);
    }

    public static Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        Stack<Integer> temp = new Stack<>();
        while(!st.isEmpty()){
            temp.add(st.pop());
        }
        st.add(x);
        while(!temp.isEmpty()){
            st.add(temp.pop());
        }
        return st;
    }
}
