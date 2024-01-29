// Insertion in linkedlist: 

public class LinkedListInsertion {
    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static class linkedlist{
        Node head = null;
        int size = 0;
        // inserting a node at head: 
        Node insertAtHead(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
            }
            else{
                newNode.next = head;
                head = newNode;
            }
            size++;
            return head;
        }

        // inserting a node at end: 
        Node insertAtTail(int data){
            Node newNode = new Node(data);
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = newNode;
            size++;
            return head;
        }

        // insert at index:
        Node insertAtIndex(int data, int index){
            Node newnNode = new Node(data);
            Node temp = head;
            if(index == 0){
                insertAtHead(data);
                return head;
            }
            if(index == size){
                insertAtTail(data);
                return head;
            }
            for(int i=1; i<index; i++){
                temp = temp.next;
            }
            newnNode.next = temp.next;
            temp.next = newnNode;
            size++;
            return head;
        }

        // display list: 
        public void display(){
            Node temp =  head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        linkedlist list = new linkedlist();
        list.insertAtHead(10);
        list.display();
        list.insertAtTail(100);
        list.insertAtTail(40);
        list.insertAtTail(501);
        list.insertAtTail(99);
        list.display();
        // 10 100 40 501 99
        
        list.insertAtIndex(80, 4);
        list.display();
        // 10 100 40 501 80 99

        list.insertAtIndex(5, 0);
        list.display();
        // 5 10 100 40 501 80 99

        list.insertAtIndex(107, 7);
        list.display();
        System.out.println(list.size);
    }
}
