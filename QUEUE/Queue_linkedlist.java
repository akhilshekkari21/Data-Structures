class Node  
{
	int data;
	Node next;
	Node(int x)
	{
		data = x;
		next = null;
	}
}
class Queue
{
	Node front,rear;
	int size;
	Queue()
	{
		front = rear = null;
		size = 0;
	}

	void enque(int x)
	{
		Node temp = new Node(x);
		size++;
		if(front == null)          // This case is for first insertion , where we increment both front and rear.
		{
			front = rear = temp;
			return;
		}
			rear.next = temp;  // general enque
			rear = temp;
	}

	void deque()
	{
		if(front == null)      //corner case where queue is Empty
			return;             
		front = front.next;
		size--;

		if(front == null)     // corner case where we delete last element
			rear = null;
	}

	void display()
	{
			Node temp = front;
			while(temp != null)
			{
				System.out.print(temp.data+" ");
				temp = temp.next;
			}
		System.out.println();
	}

	int getSize()
	{
		return size;
	}
	Node getFront()
	{
		return front;
	}
	Node getRear()
	{
		return rear;
	}
}

class Queue_linkedlist
{
	public static void main(String args[])
	{
		//Node node = new Node();
		Queue queue = new Queue();

		queue.enque(10);
		queue.enque(20);
		queue.enque(30);
		queue.enque(40);

		queue.display();

		queue.deque();
		queue.deque();

		queue.display();

	}
}
