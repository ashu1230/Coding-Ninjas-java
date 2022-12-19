package dp_av;

public class CountOfSubsets {
	
	public static int count(int arr[],int sum)
	{
		int n = arr.length;
		int dp[][]=new int[n+1][sum+1];
		
		for(int i=0;i<dp.length;i++)
		{
			dp[i][0]=1;
		}
		for(int i =1;i<dp[0].length;i++)
		{
			dp[0][i]=0;
		}
		
		for(int i =1;i<dp.length;i++)
		{
			for(int j = 1;j<dp[0].length;j++)
			{
				if(arr[i-1]<=j)
				{
					dp[i][j]=dp[i-1][j]+dp[i-1][j-arr[i-1]];
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
		int arr[] = {2,3,5,6,8,10};
		int sum = 10;
		int ans = count(arr,sum);
		System.out.println(ans);

	}

}
