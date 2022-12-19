public class Solution {
	
	public static boolean checkNumber(int input[], int x) {
	
		if(input[0]==x)
			{
				return true;
			}
		if(input.length==1 && input[0]!=x)
			{
				return false;
			}
		
		int smallarray[] = new int[input.length-1];
		for(int i = 1;i<input.length;i++)
		{
			smallarray[i-1]=input[i];
		}
		
		boolean isPresent = checkNumber(smallarray,x);
		return isPresent;
		
	}
	}
