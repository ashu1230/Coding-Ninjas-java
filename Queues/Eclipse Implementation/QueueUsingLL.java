

import QueueArray.QueueEmptyException;

public class QueueUsingLL<T> {
	
	Node<T> front;
	Node<T> rear;
	int size;
	
	public QueueUsingLL() {
		front=null;
		rear=null;
		size=0;
	}
	
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		return size==0;
	}
	public void enqueue(T elem)
	{	
		Node<T> cn = new Node<>(elem);
		if(front==null)
		{
			front = cn;
			rear=cn;
		}
		else
		{
			rear.next=cn;
			rear=rear.next;
		}
		size++;
	}
	public T front() throws QueueEmptyException {
		if(front==null)
		{
			throw new QueueEmptyException();
		}
		return front.data;
	}
	public T dequeue() throws QueueEmptyException{
		if(size==0)
		{
			throw new QueueEmptyException();
		}
		T temp = front.data;
		front=front.next;
		if(front==null)
		{
			rear=null;
		}
		size--;
		return temp;
	}
	
	

}
