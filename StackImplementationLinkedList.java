public class StackImplementationLinkedList {
    public static void main(String[] args) {
        stackImp s = new stackImp();
        s.displayList();
        s.pop();
        s.push(10);
        s.push(20);
        s.push(30);
        s.displayList();
        s.push(80);
        s.push(100);
        s.displayList();
        s.pop();
        s.displayList();
    }

    public static class stackImp {
        public static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
            }
        }

        static Node top;

        public static void displayList() {
            if (top == null) {
            System.out.printf("\nStack Underflow\n");
        }
        else {
            Node temp = top;
            while (temp != null) {
                // print node data
                System.out.print(temp.data);
                // assign temp link to temp
                temp = temp.next;
                if(temp != null)
                    System.out.print(" -> ");
                }
                System.out.println();
            }
        }

        public static void push(int a){
            Node newnode = new Node(a);
            if(top == null){
                top = newnode;
                return;
            }else{
                newnode.next = top;
                top = newnode;
            }
        }

        public static int pop(){
            if(top == null) return -1;
            else{
                int val = top.data;
                top = top.next;
                return val;
            }
        }
    }
}