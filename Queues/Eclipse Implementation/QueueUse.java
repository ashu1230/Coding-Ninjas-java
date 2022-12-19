package QueueLL;

import QueueArray.QueueEmptyException;

public class QueueUse {

	public static void main(String[] args) {
		QueueUsingLL<Integer> queue = new QueueUsingLL<>();
		int arr[] = {10,20,30,40,50};
		for(int i:arr)
		{
			queue.enqueue(i);
		}
		
		while(!queue.isEmpty())
		{
			try {
				System.out.print(queue.dequeue()+" ");
			} catch (QueueEmptyException e) {
				System.out.print(e);
			}
		}

	}

}
