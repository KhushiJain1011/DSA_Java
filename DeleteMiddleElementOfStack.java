// Given a stack, delete the middle element of the stack without using any additional data structure.
// Middle element:- floor((size_of_stack+1)/2) (1-based indexing) from bottom of the stack.
// Note: The output shown by the compiler is the stack from top to bottom. (reverse followed about the givenn condition).
 
// Example 1:
// Input: 
// Stack = {10, 20, 30, 40, 50}
// Output:
// ModifiedStack = {10, 20, 40, 50}
// Explanation:
// If you print the stack the bottom-most element will be 10 and the top-most element will be 50. Middle element will be element at index 3 from bottom, which is 30. Deleting 30, stack will look like {10 20 40 50}.

// Example 2:
// Input: 
// Stack = {10 20 30 40}
// Output:
// ModifiedStack = {10 30 40}
// Explanation:
// If you print the stack the bottom-most element will be 10 and the top-most element will be 40. Middle element will be element at index 2 from bottom, which is 20. Deleting 20, stack will look like {10 30 40}.

import java.util.Stack;

public class DeleteMiddleElementOfStack {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        s1.push(50);
        s1.push(40);
        s1.push(30);
        s1.push(20);
        s1.push(10);
        deleteMid(s1, 5);
        System.out.println(s1);

        Stack<Integer> s2 = new Stack<>();
        s2.push(40);
        s2.push(30);
        s2.push(20);
        s2.push(10);
        deleteMid(s2, 4);
        System.out.println(s2);
    }

     public static void deleteMid(Stack<Integer>s,int sizeOfStack){
        int mid = sizeOfStack/2;
        Stack<Integer> st = new Stack<>();
        for(int i=1; i<mid+1; i++){
            st.push(s.pop());
        }
        s.pop();
        while(!st.isEmpty()){
            s.push(st.pop());
        }
    } 
}
