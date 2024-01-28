// Given the head of a singly linked list, reverse the list, and return the reversed list.

// Input: head = [1,2,3,4,5]
// Output: [5,4,3,2,1]

public class ReverseLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static void displayList(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node reverse(Node head){
        Node curr = head;
        Node prev = null;
        Node temp = null;

        while(curr!=null){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    public static void main(String[] args) {
        // List 1: 
        Node a = new Node(4);
        Node b = new Node(10);
        Node c = new Node(16);
        Node d = new Node(13);
        Node e = new Node(25);
        Node f = new Node(41);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = null;

        // List 2: 
        Node a1 = new Node(1);
        Node b1 = new Node(2);
        a1.next = b1;
        b1.next = null;

        System.out.println("Original list (1): ");
        displayList(a);
        // output: 4 10 16 13 25 41
        System.out.println("Reversed list (1): ");
        Node revHead = reverse(a);
        displayList(revHead);
        // output: 41 25 13 16 10 4

        System.out.println("Original list (2): ");
        displayList(a1);
        // output: 1 2 
        System.out.println("Reversed list (2): ");
        Node revHead1 = reverse(a1);
        displayList(revHead1);
        // output: 2 1
    }
}
