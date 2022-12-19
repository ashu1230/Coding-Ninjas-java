package dp_av;

public class CoinChangeMinCoins {
	
	public static int mincoins(int coins[],int value)
	{
		int n =coins.length;
		int dp[][]=new int[n+1][value+1];
		
		for(int i =0;i<dp.length;i++)
		{
			dp[0][i]=Integer.MAX_VALUE-1;
		}
		
		
		for(int i =0;i<dp[0].length;i++)
		{
			if(i%coins[0]==0)
			{
				dp[1][i]=i/coins[0];
			}
			else
			{
				dp[1][i]=Integer.MAX_VALUE-1;
			}
		}
		
		
		for(int i =2;i<dp.length;i++)
		{
			for(int j =1;j<dp[0].length;j++)
			{
				if(coins[i-1]<=j)
				{
					int a = 1+ dp[i][j-coins[i-1]];
					int b = dp[i-1][j];
					dp[i][j]=Math.min(a, b);
				}
				else
				{
					dp[i][j]=dp[i-1][j];
				}
			}
		}
		return dp[n][value];
	}

	public static void main(String[] args) {
		int coins[]= {25,10,5};
		int value = 30;
		
		System.out.println(mincoins(coins,value));

	}

}
