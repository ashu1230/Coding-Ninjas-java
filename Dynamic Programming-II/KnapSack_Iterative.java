package dp_av;

public class Knapsack_Iterative {
	
	public static int knapsacki(int weight[],int value[],int W,int n)
	{
		int dp[][]=new int[n+1][W+1];
		
		
		for(int i =1;i<n+1;i++)
		{
			for(int j=1;j<W+1;j++)
			{
				if(weight[i-1]<=j)
				{
					int a = value[i-1]+dp[i-1][j-weight[i-1]];
					int b = dp[i-1][j];
					dp[i][j]=Math.max(a, b);
				}
				else
				{
					dp[i][j]=dp[i-1][j];
				}
			}
		}
		return dp[n][W];
	}

	public static void main(String[] args) {
		int weight[] = {1,3,4,5};
		int value[] = {1,4,5,7};
		int W = 7;
		int n = weight.length;
		int ans = knapsacki(weight, value, W,n);
		System.out.println(ans);

	}

}
