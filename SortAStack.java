// Given a stack, the task is to sort it such that the top of the stack has the greatest element.

// Example 1:
// Input:
// Stack: 3 2 1
// Output: 3 2 1

// Example 2:
// Input:
// Stack: 11 2 32 3 41
// Output: 41 32 11 3 2

import java.util.Stack;

public class SortAStack {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        Stack<Integer> res1 = sort(s1);
        System.out.println(res1);

        Stack<Integer> s2 = new Stack<>();
        s2.push(11);
        s2.push(2);
        s2.push(32);
        s2.push(3);
        s2.push(41);
        Stack<Integer> res2 = sort(s2);
        System.out.println(res2);
    }

    public static Stack<Integer> sort(Stack<Integer> s)
	{
		Stack<Integer> ans = new Stack<>();
		Stack<Integer> temp = new Stack<>();
		
		while(!s.isEmpty()){
		    int popEl = s.pop();
		    
		    while(!ans.isEmpty() && ans.peek() > popEl){
		        temp.add(ans.pop());
		    }
		    
		    ans.add(popEl);
		    
		    while(!temp.isEmpty()){
		        ans.add(temp.pop());
		    }
		}
		return ans;
	}
}
