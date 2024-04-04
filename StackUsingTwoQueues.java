// Implement stack using two queues:

import java.util.*;
import java.util.Queue;

class StackUsingTwoQueues {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    // Function to push an element onto stack
    void push(int a) {
        // Move all elements from q1 to q2
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }

        // Add the new element to q1
        q1.add(a);

        // Move all elements back from q2 to q1
        while (!q2.isEmpty()) {
            q1.add(q2.remove());
        }
    }

    // Function to pop an element from stack
    int pop() {
        // If q1 is empty, stack is empty
        if (q1.isEmpty())
            return -1;

        // Remove and return the top element from q1
        return q1.remove();
    }

    public static void main(String[] args) {
        StackUsingTwoQueues stack = new StackUsingTwoQueues();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop()); // Output: 3
        System.out.println(stack.pop()); // Output: 2
        stack.push(4);
        System.out.println(stack.pop()); // Output: 4
        System.out.println(stack.pop()); // Output: 1
        System.out.println(stack.pop()); // Output: -1 (empty stack)
    }
}
