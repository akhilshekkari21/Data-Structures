class Queue
{
	int size,cap,front,rear;  // Initialized front and rear additionally for getFront(),getRear() methods.
	int arr[];

	//Queue Constructor for size initialization

	Queue(int c)      
	{
		cap = c;
		size = 0;
		arr = new int[cap];

		// Additional from simple queue
		front = 0;
		rear = size - 1;
	}

	// ISFULL Function

	 boolean isFull()
	{
		return (size == cap);
	}

	//ISEMPTY Function

	 boolean isEmpty()
	{
		return (size == 0);
	}

	//ADDING ELEMENTS TO QUEUE

	 void enque(int x)
	{
		if(isFull())
		{
			System.out.println("Full !!");
			return ;
		}

		// Different from simple Queue
		int rear = getRear();
		rear = (rear + 1) % cap;
		arr[rear] = x;
		size++;
	}

	// DELETING ELEMENTS FROM QUEUE

	 void deque()
	{
		if(isEmpty())
		{
			System.out.println("Empty !!");
			return;
		}
		// Different from simple Queue
		front = (front + 1) % cap;
		size--;
	}

	// GETTING FRONT ELEMENT

	 int getFront()
	{
		if(isEmpty())
		{
			System.out.println("Empty !!");
			return -1;
		}
		else
			return front;   // This line different from simple queue, there you return 0
	}

	// GETTING REAR ELEMENT

	 int getRear()
	{
		if(isEmpty())
		{
			//System.out.println("Empty !!");
			return -1;
		}
		else
			return (front + size - 1) % cap;   // This line different from simple queue, there you return size - 1
	}

	// TO DISPLAY ELEMENTS

	 void display()
	{
		//very very Important change 
		int y = getFront();
		if(getFront() <= getRear())   // similar to simple Queue
		{
			for(int i = getFront() ; i<= getRear() ; i++) 
			System.out.print(arr[i]+" ");
		}
		else
		{
			while(getFront() <= size - 1)       // Here we print off elements till end of array starting from front
				{
					System.out.print(arr[getFront()]+" ");
					front++;
				}
				front = 0;                    // After that we come back to zero and Implement simple queue
				if(getFront() < y)
				{
					for(int i = getFront() ; i < y ; i++)
					System.out.print(arr[getFront()]+" ");
				}

		}
		System.out.println();
	}
}
class Queue_circular
{
	public static void main(String args[])
	{
		Queue queue = new Queue(3);
		
		queue.enque(10);
		queue.enque(20);
		queue.enque(30);

		queue.display();

		queue.deque();
		queue.enque(40);

		queue.display();

		//queue.deque();
		//queue.deque();

	}
}