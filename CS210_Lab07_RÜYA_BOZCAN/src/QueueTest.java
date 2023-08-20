// RUYA BOZCAN
// 200201044
// CS 210
// COMPUTER ENGINEERING




public class QueueTest
{

    public static void main(String[] args)
    {

        Queue myQueue = new Queue(5);
        System.out.println("Is the queue empty? " + myQueue.isEmptyQueue()); //true

        myQueue.enqueue(10);
        myQueue.enqueue(20);
        myQueue.enqueue(30);

        System.out.println("Is the queue empty? " + myQueue.isEmptyQueue()); //false
        System.out.println("Is the queue full? " + myQueue.isFullQueue()); //false

        System.out.println("Dequeued item: " + myQueue.dequeue()); //10
        System.out.println("Dequeued item: " + myQueue.dequeue()); //20
        System.out.println("Dequeued item: " + myQueue.dequeue()); //30

        System.out.println("Is the queue empty? " + myQueue.isEmptyQueue()); //true

        myQueue.enqueue(40);
        myQueue.enqueue(50);
        myQueue.enqueue(60);

        System.out.println("Is the queue full? " + myQueue.isFullQueue()); //true

        try

        {
            myQueue.enqueue(70); // Throws an exception: Queue overflow
        }

        catch (RuntimeException e)

        {
            System.out.println(e.getMessage());
        }

        myQueue.makeEmptyQueue();
        System.out.println(myQueue.isEmptyQueue()); // true

    }

}
// RUYA BOZCAN
// 200201044
// CS 210
// COMPUTER ENGINEERING



