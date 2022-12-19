import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution {

	public static Queue<Integer> reverseKElements(Queue<Integer> input, int k) {
		Stack<Integer> rev = new Stack<>();
        Queue<Integer> total = new LinkedList<>();
        
        int a=0;
        while(a<k)
        {
            a++;
            rev.push(input.poll());
        }
        while(!rev.isEmpty())
        {
            total.add(rev.pop());
        }
        while(!input.isEmpty())
        {
            total.add(input.poll());
        }
        return total;
	}

}
