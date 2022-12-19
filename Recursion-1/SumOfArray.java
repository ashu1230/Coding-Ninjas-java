public class Solution {

	public static int sum(int input[]) {
		if(input.length==1)
		{
			return input[0]; 
		}
		
		int smallarray[] = new int[input.length-1];
		for(int i = 1;i<input.length;i++)
		{
			smallarray[i-1]=input[i];
		}
		
		
		int overallsum = sum(smallarray);
		return overallsum+input[0];
		
		
	}
		
	}
