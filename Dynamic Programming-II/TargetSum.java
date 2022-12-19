package dp_av;

public class TargetSum {
	
	public static int targetsum(int arr[],int diff)
	{
		
		int tsum=0;
		for(int i:arr)
		{
			tsum+=i;
		}
		
		int s1 = (diff+tsum)/2;
		
		return subsetsum(arr,s1);
	}
	
	public static int subsetsum(int arr[],int sum)
	{
		int n  =arr.length;
		int dp[][]=new int[n+1][sum+1];
		
		for(int i=0;i<dp.length;i++)
		{
			dp[i][0]=1;
		}
		
		for(int i =1;i<dp.length;i++)
		{
			for(int j=1;j<dp[0].length;j++)
			{
				if(arr[i-1]<=j)
				{
					dp[i][j]=dp[i-1][j-arr[i-1]] + dp[i-1][j];
				}
				else
				{
					dp[i][j]=dp[i-1][j];
				}
			}
		}
		return dp[n][sum];
	}

	public static void main(String[] args) {
		int arr[]= {1,1,2,3};
		int diff= 1;
		System.out.println(targetsum(arr,diff));

	}

}
