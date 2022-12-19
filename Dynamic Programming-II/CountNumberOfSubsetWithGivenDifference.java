package dp_av;

public class CountNumSubsetsWithD {
	
	public static int count(int arr[],int diff)
	{
		int tsum = 0;
		for(int i:arr)
		{
			tsum+=i;
		}
		int a = (diff+tsum)/2;
		
		return countsub(arr,a);

	}
	
	public static int countsub(int arr[],int a)
	{
		int n = arr.length;
		int dp[][]=new int[n+1][a+1];
		
		
		for(int i =0;i<dp.length;i++)
		{
			dp[i][0]=1;
		}
		
		for(int i =1;i<dp.length;i++)
		{
			for(int j =1;j<dp[0].length;j++)
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
		return dp[n][a];
	}

	public static void main(String[] args) {
		int arr[] = {1,1,2,3};
		int diff = 1;
		
		System.out.println(count(arr,diff));

	}

}
