package dp_av;

public class SequencePatternMatching {
	
	public static boolean isPresent(String x,String y)
	{
		int n =x.length();
		int m = y.length();
		
		int dp[][]=new int[n+1][m+1];
		
		for(int i = 1;i<dp.length;i++)
		{
			for(int j=1;j<dp[0].length;j++)
			{
				if(x.charAt(i-1)==y.charAt(j-1))
				{
					dp[i][j]=1 + dp[i-1][j-1];
				}
				else
				{
					int a = dp[i-1][j];
					int b = dp[i][j-1];
					
					dp[i][j]=Math.max(a, b);
				}
			}
		}
		
		boolean ans;
		
		if(dp[n][m]==n)
		{
			ans=true;
		}
		else
		{
			ans = false;
		}
		
		return ans;
	}

	public static void main(String[] args) {
		String x = "AXY";
		String y = "ADXCPY";
		
		boolean ans = isPresent(x, y);
		System.out.println(ans);

	}

}
