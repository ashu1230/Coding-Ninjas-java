package dp_av;

public class ShortestCommonSuperSequence {
	
	public static int length(String x,String y)
	{
		int n =x.length();
		int m = y.length();
		
		int dp[][]=new int[n+1][m+1];
		
		for(int i = 1;i<dp.length;i++)
		{
			for(int j = 1;j<dp[0].length;j++)
			{
				if(x.charAt(i-1)==y.charAt(j-1))
				{
					dp[i][j]=1+ dp[i-1][j-1];
				}
				else
				{
					int a = dp[i-1][j];
					int b = dp[i][j-1];
					dp[i][j]=Math.max(a, b);
				}
			}
		}
		
		int tcount = m+n - dp[n][m];
		return tcount;
	}

	public static void main(String[] args) {
		String x = "geek";
		String y = "eke";
		
		int ans = length(x, y);
		System.out.println(ans);

	}

}
