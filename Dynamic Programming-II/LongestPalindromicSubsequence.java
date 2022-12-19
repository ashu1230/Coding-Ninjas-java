package dp_av;

public class LongestPalindromicSubsequence {
	
	public static int longestpalindromess(String a)
	{
		int n = a.length();
		String b="";
		for(int i =n-1;i>=0;i--)
		{
			b+=a.charAt(i);
		}
		
		int m = b.length();
		
		int dp[][]=new int[n+1][m+1];
		
		for(int i =1;i<dp.length;i++)
		{
			for(int j =1;j<dp[0].length;j++)
			{
				if(a.charAt(i-1)==b.charAt(j-1))
				{
					dp[i][j]= 1 + dp[i-1][j-1];
				}
				else
				{
					int x = dp[i-1][j];
					int y = dp[i][j-1];
					
					dp[i][j]=Math.max(x, y);
				}
			}
		}
		
		return dp[n][m];
	}

	public static void main(String[] args) {
		String a = "GEEKSFORGEEKS";
		
		int ans = longestpalindromess(a);
		System.out.println(ans);

	}

}
