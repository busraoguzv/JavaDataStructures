/**
 * A Linked List-based implementation of a Queue (FIFO - First In, First Out).
 */
public class Queue {
    Node front,rear,current;
    Queue(){
        front=rear=current=null;
    }
    boolean isEmpty(){
        return front==null && rear==null;
    }
    void enqueue(int new_data){
        Node new_node=new Node(new_data);
        if(isEmpty()){
            front=rear=new_node;
            return;
        }
        rear.next=new_node;
        rear=new_node;
    }
    int dequeue(){
        if(isEmpty()){
            System.out.println("Queue Underflow");
            return -1;
        }
        int removed=front.data;
        front=front.next;
        //sildikten sonra frontta null olursa kuyrukta eleman kalmamış olur yani kuyruğu da null yaparız
        if(front==null){
            rear=null;
        }
        return removed;
    }
    int getFront(){
        if (isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return front.data;
    }
    int getRear(){
        if (isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return rear.data;
    }
    void display(){
        System.out.print("Queue:");
        Node current=front;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();
    }
}
