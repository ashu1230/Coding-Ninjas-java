import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import QueueArray.QueueEmptyException;
import java.util.LinkedList;

public class ReverseFirstK {

	public static QueueUsingLL<Integer> reverseKElements(QueueUsingLL<Integer> input, int k) {
		
		QueueUsingLL<Integer> total = new QueueUsingLL<>();
		Stack<Integer> s1=new Stack<>();
		int a = 0;
		while(a<k)
		{
			a++;
			try {
				s1.push(input.dequeue());
			} catch (QueueEmptyException e) {
				System.out.println(e);
			}
		}
		while(!s1.isEmpty())
		{
			total.enqueue(s1.pop());
		}
		while(!input.isEmpty())
		{
			try {
				total.enqueue(input.dequeue());
			} catch (QueueEmptyException e) {
				System.out.println(e);
			}
		}
		return total;
		
	}

	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50,60,70,80,90};
		QueueUsingLL<Integer> inp = new QueueUsingLL<>();
		for(int i:arr)
		{
			
			inp.enqueue(i);
		}
		QueueUsingLL<Integer> ans = new QueueUsingLL<>();
		ans = reverseKElements(inp, 4);
		while(!ans.isEmpty())
		{
			try {
				System.out.print(ans.dequeue()+" ");
			} catch (QueueEmptyException e) {
				// TODO Auto-generated catch block
				
			}
		}
	}

}
