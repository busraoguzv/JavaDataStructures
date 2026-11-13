public class Deque {
    DequeNode front,rear,current;
    public Deque(){
        front=null;
        rear=null;
        current=null;
    }
    boolean isEmpty(){
        return front==null && rear==null;
    }
    public void insertFront(int data){
        DequeNode new_Deque_node =new DequeNode(data);
        if(isEmpty()){
            front=rear= new_Deque_node;
        }else{
            //bu kısımda frontu kaybetmeden ilk yeni nodun nextine frontu atarız
            //sonra frontun previni new nodu yaparız
            //en sonda frontumuzu new node olarak güncelleriz
            new_Deque_node.next=front;
            front.prev= new_Deque_node;
            front= new_Deque_node;
        }
    }
    public void insertRear(int data){
        DequeNode new_Deque_node =new DequeNode(data);
        if(isEmpty()){
            front=rear= new_Deque_node;
        }else{
            rear.next= new_Deque_node;
            new_Deque_node.prev=rear;
            rear= new_Deque_node;
        }
    }
    public int deleteFront(){
        if(isEmpty()){
            System.out.println("Queue is empty.");
            return -1;
        }
        int removed=front.data;
        if(front==rear){
            //tek elemanlıysa diye
            front=rear=null;
        }else{
            front=front.next;
            front.prev=null;
        }
        return removed;
    }
    public int deleteRear(){
        if(isEmpty()){
            System.out.println("Queue is empty.");
            return -1;
        }
        int removed=rear.data;
        if(front==rear){
            //check if it has one
            rear=front=null;
        }else{
            rear=rear.prev;
            rear.next=null;
        }
        return removed;
    }
    public int getFront(){
        return front.data;
    }
    public int getRear(){
        return rear.data;
    }
    public void display(){
        System.out.print("Queue:");
        if(isEmpty()){
            System.out.println("Queue is empty.");
        }else{
            DequeNode current=front;
            while(current!=null){
                System.out.print(current.data+" ");
                current=current.next;
            }
            System.out.println();
        }

    }
}
