// RUYA BOZCAN
// 200201044
// CS 210
// COMPUTER ENGINEERING





class QueueNode
{
    int data;
    QueueNode next;

    public QueueNode(int data)
    {
        this.data = data;
        this.next = null;
    }
}

public class Queue
{
    int capacity;
    int front;
    int rear;
    int size;
    QueueNode frontNode;
    QueueNode rearNode;


    public Queue(int capacity)
    {
        this.capacity = capacity;
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.frontNode = null;
        this.rearNode = null;
    }

    // MakeEmptyQueue
    public void makeEmptyQueue()
    {
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.frontNode = null;
        this.rearNode = null;
    }

    // IsEmptyQueue
    public boolean isEmptyQueue()
    {
        return this.size == 0;
    }

    // IsFullQueue
    public boolean isFullQueue()
    {
        return this.size == this.capacity;
    }

    // Enqueue
    public void enqueue(int data)
    {
        if (isFullQueue())
        {
            throw new RuntimeException("Queue overflow");
        }

        this.rear = (this.rear + 1) % this.capacity;

        QueueNode newNode = new QueueNode(data);

        if (this.frontNode == null)

        {
            this.frontNode = this.rearNode = newNode;
            this.size++;
            return;
        }
        this.rearNode.next = newNode;
        this.rearNode = newNode;
        this.size++;
    }

    // Dequeue
    public int dequeue()
    {

        if (isEmptyQueue())
        {
            throw new RuntimeException("Queue underflow");
        }
        int dequeuedItem = this.frontNode.data;
        this.frontNode = this.frontNode.next;

        if (this.frontNode == null)

        {
            this.rearNode = null;
        }

        this.size--;

        return dequeuedItem;
    }
}
// RUYA BOZCAN
// 200201044
// CS 210
// COMPUTER ENGINEERING



