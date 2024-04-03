// Queue using two stacks: 

import java.util.Stack;

public class QueueUsingTwoStacks<T> {
    private Stack<T> enqueueStack;
    private Stack<T> dequeueStack;

    public QueueUsingTwoStacks() {
        enqueueStack = new Stack<>();
        dequeueStack = new Stack<>();
    }

    public void enqueue(T item) {
        enqueueStack.push(item);
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        if (dequeueStack.isEmpty()) {
            while (!enqueueStack.isEmpty()) {
                dequeueStack.push(enqueueStack.pop());
            }
        }
        return dequeueStack.pop();
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        if (dequeueStack.isEmpty()) {
            while (!enqueueStack.isEmpty()) {
                dequeueStack.push(enqueueStack.pop());
            }
        }
        return dequeueStack.peek();
    }

    public boolean isEmpty() {
        return enqueueStack.isEmpty() && dequeueStack.isEmpty();
    }

    public int size() {
        return enqueueStack.size() + dequeueStack.size();
    }

    public static void main(String[] args) {
        QueueUsingTwoStacks<Integer> queue = new QueueUsingTwoStacks<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Dequeue: " + queue.dequeue()); // 1
        System.out.println("Dequeue: " + queue.dequeue()); // 2
        System.out.println("Peek: " + queue.peek()); // 3
    }
}