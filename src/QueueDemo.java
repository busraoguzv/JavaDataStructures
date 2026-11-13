public class QueueDemo {
    public static void main(String[] args){
        Queue q=new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        System.out.println("Queue Front:"+q.getFront());
        System.out.println("Queue Rear:"+ q.getRear());
        q.dequeue();
        q.dequeue();
        q.enqueue(30);
        q.enqueue(40);
        System.out.println("Queue Front:"+q.getFront());
        System.out.println("Queue Rear:"+q.getRear());
        q.display();
    }
}
