package dp_av;

public class LCS_Iterative {
	
	public static int lcsi(String x,String y,int n,int m)
	{
		int dp[][]=new int[n+1][m+1];
		
		for(int i =1;i<dp.length;i++)
		{
			for(int j=1;j<dp[0].length;j++)
			{
				if(x.charAt(i-1)==y.charAt(j-1))
				{
					dp[i][j]=dp[i-1][j-1]+1;
				}
				else
				{
					int a = dp[i-1][j];
					int b= dp[i][j-1];
					dp[i][j]=Math.max(a, b);
				}
			}
		}
		
		return dp[n][m];
	}

	public static void main(String[] args) {
		String x = "abcdgh";
		String y = "abedfha";

		int n = x.length();
		int m = y.length();
		
		int ans = lcsi(x, y, n, m);
		System.out.println(ans);
		
		

	}

}
