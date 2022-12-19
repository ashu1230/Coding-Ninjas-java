package dp_av;

public class CoinChangeMax {
	
	public static int maxchange(int coin[],int target)
	{
		int n = coin.length;
		int dp[][]=new int[n+1][target+1];
		
		for(int i =1;i<dp.length;i++)
		{
			dp[i][0]=1;
		}
		
		for(int i =1;i<dp.length;i++)
		{
			for(int j= 1;j<dp[0].length;j++)
			{
				if(coin[i-1]<=j)
				{
					dp[i][j]=dp[i-1][j]+dp[i][j-coin[i-1]];
				}
				else
				{
					dp[i][j]=dp[i-1][j];
				}
			}
		}
		
		return dp[n][target];
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3};
		int target = 4;
		int ans = maxchange(arr,target);
		System.out.println(ans);

	}

}
