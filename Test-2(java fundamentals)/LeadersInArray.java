public class Solution {

		public static void leaders(int[] input) {
		
		int n = input.length;
		boolean flag = true;
		
		for(int i=0;i<n-1;i++)
		{
			for(int j = i+1;j<n;j++)
			{
				if(input[i]>=input[j])
				{
					flag =true;
				}
				else
				{
					flag = false;
					break;
				}
			}
			if(flag==true)
			{
				System.out.print(input[i]+" ");
			}
			else
			{
				continue;
			}
		}
		System.out.print(input[n-1]);
		
	}
}
