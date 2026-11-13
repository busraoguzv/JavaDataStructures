public class DequeDemo {
    public static void main(String[] args){
        Deque dq=new Deque();
        //insert from rear
        dq.insertRear(80);
        dq.insertRear(90);
        //insert from front
        dq.insertFront(70);
        dq.insertFront(60);
        System.out.println("Front: "+dq.getFront());
        System.out.println("Rear: "+dq.getRear());
        dq.display();
        dq.deleteRear();
        dq.deleteFront();
        dq.display();
    }
}
