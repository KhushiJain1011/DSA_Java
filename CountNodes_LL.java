// Given a singly linked list. The task is to find the length of the linked list, where length is defined as the number of nodes in the linked list.

// Example 1:
// Input:
// LinkedList: 1->2->3->4->5
// Output: 5
// Explanation: Count of nodes in the 
// linked list is 5, which is its length.

// Example 2:
// Input:
// LinkedList: 2->4->6->7->5->1->0
// Output: 7
// Explanation: Count of nodes in the
// linked list is 7. Hence, the output
// is 7.

// class Node{
//     int data;
//     Node next;
//     Node(int data){
//         this.data = data;
//     }
// }

public class CountNodes_LL {
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

    public static int getCount(Node head)
    {
        Node temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static void main(String[] args) {
        PrintLinkedListElements list1 = new PrintLinkedListElements();
        list1.insert(1);
        list1.insert(2);
        list1.insert(3);
        list1.insert(4);
        list1.insert(5);
        System.out.println(getCount(list1.head));

        PrintLinkedListElements list2 = new PrintLinkedListElements();
        list2.insert(2);
        list2.insert(4);
        list2.insert(6);
        list2.insert(7);
        list2.insert(5);
        list2.insert(1);
        list2.insert(0);
        System.out.println(getCount(list2.head));
    }
}
