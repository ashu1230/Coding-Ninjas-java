import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution {

	public static void reverseQueue(Queue<Integer> input) {
	Queue<Integer> inp = input;
		Stack<Integer> s=new Stack<>();
		Queue<Integer> ans = new LinkedList<>();
		while(!inp.isEmpty())
		{
			s.push(inp.poll());
		}
		
		while(!s.isEmpty())
		{
			ans.add(s.pop());
		}
		
		while(!ans.isEmpty())
		{
			System.out.print(ans.poll()+" ");
		}
	}
}
