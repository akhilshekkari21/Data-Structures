class Queue
{
	int size,cap;
	int arr[];

	//Queue Constructor for size initialization

	Queue(int c)      
	{
		cap = c;
		size = 0;
		arr = new int[cap];
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
		arr[size] = x;
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
		for(int i = 0; i < size - 1; i++)
			arr[i] = arr[i + 1];
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
			return 0;
	}

	// GETTING REAR ELEMENT

	 int getRear()
	{
		if(isEmpty())
		{
			System.out.println("Empty !!");
			return -1;
		}
		else
			return size - 1;
	}

	// TO DISPLAY ELEMENTS

	 void display()
	{
		for(int i = getFront() ; i<= getRear() ; i++)
			System.out.print(arr[i]+" ");

		System.out.println();
	}
}
class Queue_simple
{
	public static void main(String args[])
	{
		Queue queue = new Queue(3);
		
		queue.enque(10);
		queue.enque(20);
		queue.enque(30);

		queue.display();

		queue.deque();
		queue.deque();

		queue.display();

		queue.deque();
		queue.deque();

	}
}