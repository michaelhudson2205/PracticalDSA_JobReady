package ds.queue;

public class Queue
{
	private int maxSize; // initialises the set number of slots
	private long[] queArray; // slots to maintain the data
	private int front; // index position for the front of the line element
	private int rear; // index position for the back of the line element
	private int nItems; // counter to maintain the number of items in the queue
	
	public Queue(int size)
	{
		this.maxSize = size;
		this.queArray = new long[size];
		front = 0; // index position of first slot
		rear = -1; // no item in array yet to be considered as last item
		nItems = 0; // no elements in array yet
	}
	
	public void insert(long j)
	{
		if (rear == maxSize - 1)
		{
			rear = -1;
		}
		rear++;
		queArray[rear] = j;
		nItems++;
	}
	
	public long remove() // remove item from the front of the queue
	{
		long temp = queArray[front];
		front++;
		if (front == maxSize)
		{
			front = 0; // set front back to index 0 so that entire array can be used again
		}
		nItems--;
		return temp;
	}
	
	public long peekFront()
	{
		return queArray[front];
	}
	
	public boolean isEmpty()
	{
		return (nItems == 0);
	}
	
	public boolean isFull()
	{
		return (nItems == maxSize);
	}
	
	public void view()
	{
		System.out.print("[ ");
		for (int i = 0; i < queArray.length; i++)
		{
			System.out.print(queArray[i] + " ");
		}
		System.out.println("]");
		System.out.println("The next in line is: " + queArray[rear + 1] + ", at index position: " + (rear + 1));
	}
}
