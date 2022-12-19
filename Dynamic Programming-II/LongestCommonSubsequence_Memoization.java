package dp_av;

public class LCS_Memoization {
	
	public static int lcsm(String x,String y,int n,int m,int dp[][])
	{
		if(n==0 || m==0)
		{
			return 0;
		}
		
		if(dp[n][m]!=-1)
		{
			return dp[n][m];
		}
		
		if(x.charAt(n-1)==y.charAt(m-1))
		{
			dp[n][m]=1+lcsm(x, y, n-1, m-1, dp);
			
		}
		else
		{
			int a = lcsm(x, y, n-1, m, dp);
			int b = lcsm(x, y, n, m-1, dp);
			dp[n][m]=Math.max(a, b);
			
			
		}
		
		return dp[n][m];
		
	}

	public static void main(String[] args) {
		String x = "abcdgh";
		String y = "abedfha";

		int n = x.length();
		int m = y.length();
		
		int dp[][]=new int[n+1][m+1];
		for(int i =0;i<dp.length;i++)
		{
			for(int j=0;j<dp[0].length;j++)
			{
				dp[i][j]=-1;
			}
		}
		int ans = lcsm(x, y, n, m,dp);
		System.out.println(ans);
	}

}
