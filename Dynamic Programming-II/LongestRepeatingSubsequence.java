package dp_av;

public class LongestRepeatingSubsequence {
	
	public static int longss(String x)
	{
		String y = x;
		
		int n = x.length();
		int dp[][] = new int[n+1][n+1];
		
		for(int i =1;i<dp.length;i++)
		{
			for(int j = 1;j<dp[0].length;j++)
			{
				if(x.charAt(i-1)==y.charAt(j-1) && i!=j)
				{
					dp[i][j]= 1 + dp[i-1][j-1];
				}
				else
				{
					int a = dp[i-1][j];
					int b = dp[i][j-1];
					
					dp[i][j]=Math.max(a, b);
				}
			}
		}
		
		return dp[n][n];
	}

	public static void main(String[] args) {

		String x = "AABEBCDD";
		int ans = longss(x);
		System.out.println(ans);
	}

}
