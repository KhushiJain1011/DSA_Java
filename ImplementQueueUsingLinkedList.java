// Implement queue using linkedlist:

class ImplementQueueUsingLinkedList {
    QueueNode front, rear;

    // Constructor to initialize empty queue
    ImplementQueueUsingLinkedList() {
        this.front = this.rear = null;
    }

    // Inner class representing a node in the linked list
    class QueueNode {
        int data;
        QueueNode next;

        // Constructor to create a new node
        QueueNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to check if the queue is empty
    boolean isEmpty() {
        return front == null;
    }

    // Function to push an element into the queue.
    void push(int a) {
        QueueNode newnode = new QueueNode(a);
        if (rear == null) {
            front = rear = newnode;
        } else {
            rear.next = newnode;
            rear = newnode;
        }
    }

    // Function to pop front element from the queue.
    int pop() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            int val = front.data;
            front = front.next;
            if (front == null) {
                rear = null;
            }
            return val;
        }
    }

    // Function to get the front element of the queue without removing it.
    int peek() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            return front.data;
        }
    }


    public static void main(String[] args) {
        // Creating a new queue
        ImplementQueueUsingLinkedList queue = new ImplementQueueUsingLinkedList();

        // Pushing elements into the queue
        queue.push(10);
        queue.push(20);
        queue.push(30);
        queue.push(40);

        // Displaying the front element of the queue
        System.out.println("Front element of the queue: " + queue.peek());

        // Popping elements from the queue
        System.out.println("Popped element: " + queue.pop());
        System.out.println("Popped element: " + queue.pop());

        // Displaying the front element of the queue after popping
        System.out.println("Front element of the queue: " + queue.peek());

        // Pushing another element into the queue
        queue.push(50);

        // Displaying the front element of the queue after pushing
        System.out.println("Front element of the queue: " + queue.peek());

        // Popping elements from the queue until it's empty
        while (!queue.isEmpty()) {
            System.out.println("Popped element: " + queue.pop());
        }

        // Attempting to pop from an empty queue
        System.out.println("Popped element: " + queue.pop());
    }
}
