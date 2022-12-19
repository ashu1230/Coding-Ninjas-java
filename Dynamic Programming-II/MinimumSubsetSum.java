package dp_av;
import java.util.*;
public class MinimumSubsetDifference {

	public static int mindiff(int arr[])
	{
		ArrayList<Integer> out = new ArrayList<>();
		int range = 0;
		for(int i =0;i<arr.length;i++)
		{
			range=range+arr[i];
		}
		out = helper(arr,range);
		
//		for(int i=0;i<out.size();i++)
//		{
//			System.out.print(out.get(i)+" ");
//		}
//		System.out.println();
		
		int minimum = Integer.MAX_VALUE;
		for(int i =0;i<out.size();i++)
		{
			minimum= Math.min(minimum,range- 2*(out.get(i)));
			//System.out.print(minimum+" ");
		}
		//System.out.println();
		return minimum;
	}

	public static ArrayList<Integer> helper(int arr[],int range)
	{
		int n = arr.length;
		boolean dp[][]=new boolean[n+1][range+1];

		for(int i =0;i<dp.length;i++)
		{
			dp[i][0]=true;
		}

		for(int i =1;i<dp[0].length;i++)
		{
			dp[0][i]=false;
		}

		for(int i =1;i<dp.length;i++) 
		{
			for(int j=1;j<dp[0].length;j++)
			{
				if(arr[i-1]<=j)
				{
					dp[i][j]=dp[i-1][j-arr[i-1]] || dp[i-1][j];
				}
				else
				{
					dp[i][j]=dp[i-1][j];
				}
			}
		}
		
		ArrayList<Integer> val = new ArrayList<>();
		for(int i =0;i<=range/2;i++)
		{
			if(dp[n][i]==true)
			{
				val.add(i);
			}
		}
		return val;
	}

	public static void main(String[] args) {
		int arr[]= {1,6,5,11};
		System.out.println(mindiff(arr));

	}

}
