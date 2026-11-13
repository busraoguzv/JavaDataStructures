public class BankSimulation {
    public static void main(String[] args){
        //create bank customer line
        Queue bankQueue=new Queue();
        System.out.println("--------Bank Queue---------");
        bankQueue.enqueue(1001);
        bankQueue.enqueue(1002);
        bankQueue.enqueue(1003);
        bankQueue.display();
        System.out.println("Customer at the front (Being served): "+bankQueue.getFront());
        System.out.println("Customer "+bankQueue.dequeue()+" has left the queue.");
        bankQueue.display();
        System.out.println("New customers arriving...");
        bankQueue.enqueue(1004);
        bankQueue.enqueue(1005);
        bankQueue.display();
        System.out.println("Next customer at the front: "+bankQueue.getFront());



    }
}
