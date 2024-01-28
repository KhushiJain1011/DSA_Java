// implementation of stack using stack: 

public class StackImplementationArray {
    public static void main(String[] args) {
        stackImp s = new stackImp();
        System.out.println(s.isEmpty());        // true
        s.display();        // Empty
        s.pop();            // STACK UNDERFLOW
        s.push(10);
        s.display();        // 10
        s.push(25);
        s.push(100);
        s.display();        // 100 25 10
        s.pop();        // removes 100
        s.display();        // 25 10
        s.push(81);     // stack: 81 25 10 
        s.push(101);    
        s.display();        // stack: 101 81 25 10 
        s.peek();       // 101 
        System.out.println(s.isEmpty());        // false
        s.push(400);        
        s.display();        // // stack: 400 101 81 25 10 
        s.push(80);     // STACK OVERFLOW
    }

    public static class stackImp {
        int size = 5;
        int top = -1;
        int st[] = new int[size];

        void push(int data){
            if(top == size-1){
                System.out.println("STACK OVERFLOW");
            }else{
                top = top+1;
                st[top] = data;
            }
        }

        void pop(){
            if(top == -1){
                System.out.println("STACK UNDERFLOW");
            }else{
                int del = st[top];
                top = top-1;
            }
        }

        void display(){
            if(top == -1){
                System.out.println("Empty");
            }else{
                for(int i=top; i>=0; i--){
                    System.out.print(st[i]+"  ");
                }
                System.out.println();
            }
        }

        void peek(){
            System.out.println(st[top]);
        }

        boolean isEmpty(){
            if(top == -1){
                return true;
            }
            else return false;
        }
    }   
}
