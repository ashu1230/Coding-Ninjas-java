/*
	Following is the structure of the node class for a Singly Linked List

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}

	}

*/

public class Queue {
	
	private Node front;
    private Node rear;
    private int size;


	public Queue() {
		front = null;
        rear=null;
        size=0;
	}
	


	/*----------------- Public Functions of Stack -----------------*/


	public int getSize() { 
		return size;
    }


    public boolean isEmpty() { 
    	return size==0;
    }


    public void enqueue(int data) {
        Node cn = new Node(data);
    	if(front==null)
        {
            front=cn;
            rear=cn;
        }
        else
        {
            rear.next=cn;
            rear=rear.next;
        }
        size++;
    }


    public int dequeue() {
    	if(front==null)
        {
            return -1;
        }
        int temp = front.data;
        front=front.next;
        size--;
        return temp;
    }


    public int front() {
        if(front==null)
        {
            return -1;
        }
    	return front.data;
    }
}
