import java.util.Stack;
public class Solution {

	public static void reverseStack(Stack<Integer> input, Stack<Integer> extra) {
		if(input.size()<=1)
		{
			return;
		}
		int temp = input.pop();
		reverseStack(input, extra);
		while(!input.isEmpty())
		{
			int z = input.pop();
			extra.push(z);
		}
		input.push(temp);
		while(!extra.isEmpty())
		{
			int k = extra.pop();
			input.push(k);
		}
	}
}
