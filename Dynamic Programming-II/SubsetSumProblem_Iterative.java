package dp_av;

public class SubsetSumProblem {
	
	public static boolean isPresent(int arr[],int sum)
	{
		int n = arr.length;
		boolean dp[][]=new boolean[n+1][sum+1];
		
		for(int i =0;i<dp.length;i++)
		{
			dp[i][0]=true;
		}
		
		for(int i=1;i<dp[0].length;i++)
		{
			dp[0][i]=false;
		}
		
		for(int i =1;i<dp.length;i++)
		{
			for(int j = 1;j<dp[0].length;j++)
			{
				if(arr[i-1]<=j)
				{
					dp[i][j]=(dp[i][j-arr[i-1]])||(dp[i-1][j]);
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
		int arr[]= {3,34,4,12,5,2};
		int sum = 9;
		boolean ans = isPresent(arr, sum);
		System.out.println(ans);

	}

}
