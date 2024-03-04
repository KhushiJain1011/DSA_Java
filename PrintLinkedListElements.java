// Given a linked list. Print all the elements of the linked list.

// Example 1:
// Input:
// LinkedList : 1 -> 2
// Output:
// 1 2
// Explanation:
// The linked list contains two elements 1 and 2.The elements are printed in a single line.

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}

public class PrintLinkedListElements {
    Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public static void displayList(Node head){
        Node temp = head;
        // solution using recursion: 
        if(head == null){
            return;
        }
        System.out.print(temp.data+" ");
        displayList(head.next);
    }
    public static void main(String[] args) {
        PrintLinkedListElements list1 = new PrintLinkedListElements();
        list1.insert(01);
        list1.insert(50);
        list1.insert(99);
        list1.insert(34);
        list1.insert(80);
        displayList(list1.head);
        System.out.println();

        PrintLinkedListElements list2 = new PrintLinkedListElements();
        list2.insert(1);
        list2.insert(2);
        displayList(list2.head);
        System.out.println();
    }
}
