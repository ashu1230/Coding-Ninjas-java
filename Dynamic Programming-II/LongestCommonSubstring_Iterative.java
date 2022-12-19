package dp_av;

public class LongestCommonSubstring {
	
	public static int lcsub(String x,String y)
	{
		int n = x.length();
		int m = y.length();
		int dp[][]=new int[n+1][m+1];
		
		for(int i =1;i<dp.length;i++)
		{
			for(int j = 1;j<dp[0].length;j++)
			{
				if(x.charAt(i-1)==y.charAt(j-1))
				{
					dp[i][j]= 1+ dp[i-1][j-1];
				}
			}
		}
		int max = Integer.MIN_VALUE;
		
		for(int i =0;i<dp.length;i++)
		{
			for(int j = 0;j<dp[0].length;j++)
			{
				if(dp[i][j]>max)
				{
					max=dp[i][j];
				}
			}
		}
		
		return max;
	}

	public static void main(String[] args) {
		
		String x = "GeeksForGeeks";
		String y = "GeeksQuiz";
		
		int ans = lcsub(x, y);
		System.out.println(ans);
		
	}

}
