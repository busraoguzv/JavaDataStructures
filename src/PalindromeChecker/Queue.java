package PalindromeChecker;

public class Queue {
    CharNode front;
    CharNode rear;
    public Queue(){
        front=rear=null;
    }
    public boolean isEmpty(){
        return front==null&&rear==null;
    }
    public void enqueue(char value){
        CharNode newNode=new CharNode(value);
        if(isEmpty()){
            front=rear=newNode;
        }else{
            rear.next=newNode;
            rear=newNode;
        }
    }
    public char dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return '\0';
        }else{
            char removed=front.data;
            front=front.next;
            if(front==null){
                rear=null;
            }
            return removed;
        }
    }
}
