// RUYA BOZCAN
// 200201044
// CS 210
// COMPUTER ENGINEERING





import java.util.LinkedList;
import java.util.Queue;

public class QueueOperations
{

    public static void main(String[] args)

    {
        Queue<Integer> myQueue = new LinkedList<>();
        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        System.out.println("Before Iteratively: " + myQueue);

        while (myQueue.size() > 0)

        {
            myQueue.dequeue();
        }

        System.out.println("After Iteratively: " + myQueue);
    }

    public static void recursivelyEmpty(Queue queue)
    {
        if (queue.isEmpty())

        {
            return;
        }

        else

        {
            queue.remove();
            recursivelyEmpty(queue);
        }

        Queue<Integer> myQueue = new LinkedList<>();
        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        System.out.println("Before recursivelyEmpty: " + myQueue);

        QueueOperations.recursivelyEmpty(myQueue);
        System.out.println("After recursivelyEmpty: " + myQueue);
    }
}
// RUYA BOZCAN
// 200201044
// CS 210
// COMPUTER ENGINEERING



