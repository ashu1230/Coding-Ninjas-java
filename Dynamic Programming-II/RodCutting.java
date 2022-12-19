package dp_av;

public class RodCutting {
	
	public static int crod(int price[],int size)
	{
		int n = price.length;
		int length[]=new int[n];
		for(int i=0;i<n;i++)
		{
			length[i]=i+1;
		}
		
		int dp[][]=new int[n+1][n+1];
		
		for(int i = 1;i<dp.length;i++)
		{
			for(int j=1;j<dp[0].length;j++)
			{
				if(length[i-1]<=j)
				{
					int a=price[i-1]+dp[i][j-length[i-1]];
					int b= dp[i-1][j];
					dp[i][j]=Math.max(a, b);
				}
				else
				{
					dp[i][j]=dp[i-1][j];
				}
			}
		}
		return dp[n][n];
		
	}

	public static void main(String[] args) {
		int price[] = {1,5,8,9,10,17,17,17};
		int size = price.length;
		int ans = crod(price,size);
		System.out.println(ans);

	}

}
